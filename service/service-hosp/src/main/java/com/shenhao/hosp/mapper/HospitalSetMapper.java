package com.shenhao.hosp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shenhao.framework.trade.model.hosp.HospitalSetDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 医院设置mapper类
 *
 * @author: wumk
 * @since: 2021-05-06 21:40
 */
@Mapper
public interface HospitalSetMapper extends BaseMapper<HospitalSetDO> {
}
