package cn.bdqn.masterdata.mapper;
import hospital.masterdata.entity.PrescriptionModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface PrescriptionModelMapper {
    List<PrescriptionModel> findAll();
    List<PrescriptionModel> findAllBy(@Param("modelName") String modelName, @Param("modelPower") String modelPower, @Param("prescriptionType") String prescriptionType);
}