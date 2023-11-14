package com.gouyan.system.service;

import com.gouyan.system.domin.SysMovieAge;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xianxian
 * @Create: 2020-11-14 22:57
 */
public interface SysMovieAgeService {

    List<SysMovieAge> findAll();

    SysMovieAge findById(Long id);

    int add(SysMovieAge sysMovieAge);

    int update(SysMovieAge sysMovieAge);

    int delete(Long[] ids);

}
