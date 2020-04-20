package cn.bdqn.masterdata.mapper;
import cn.bdqn.masterdata.entity.DoctorAdvice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface DoctorAdviceMapper {
    List<DoctorAdvice> findAll();
    List<DoctorAdvice> findAllBy(@Param("adviceName") String adviceName);
}