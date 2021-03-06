package cn.bdqn.masterdata.controller;
import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.bdqn.masterdata.service.DoctorAdviceService;
import cn.bdqn.masterdata.entity.DoctorAdvice;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@Api
@RestController
@RequestMapping("/api/doctorAdvice")
public class DoctorAdviceController {
    @Autowired
    private DoctorAdviceService doctorAdviceService;
    @GetMapping("")
    public Response findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<DoctorAdvice> list = doctorAdviceService.findAll();
        PageInfo<DoctorAdvice> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
    @RequestMapping(value = "/findBy",method = {RequestMethod.GET,RequestMethod.POST})
    public Response findBy(Integer pageNum, Integer pageSize, String adviceName) {
        PageHelper.startPage(pageNum,pageSize);
        List<DoctorAdvice> list = doctorAdviceService.findAllBy(adviceName);
        PageInfo<DoctorAdvice> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
}
