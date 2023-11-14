package com.gouyan.system.domin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @Author: xianxian
 * @Create: 2020-11-24 15:08
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SysSessionVo implements Serializable {

    private Long cinemaId;

    private Long hallId;

    private Long movieId;

    private Long movieRuntimeId;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private LocalDate sessionDate;

}
