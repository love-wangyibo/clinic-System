package cn.bdqn.masterdata.service;

import cn.bdqn.masterdata.entity.DoctorAdvice;

import java.util.List;
public interface DoctorAdviceService {
    List<DoctorAdvice> findAll();
    List<DoctorAdvice> findAllBy(String adviceName);
}