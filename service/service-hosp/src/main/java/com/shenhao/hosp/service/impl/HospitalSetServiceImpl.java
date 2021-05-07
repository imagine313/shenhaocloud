package com.shenhao.hosp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shenhao.framework.trade.model.hosp.HospitalSetDO;
import com.shenhao.hosp.mapper.HospitalSetMapper;
import com.shenhao.hosp.service.HospitalSetService;
import org.springframework.stereotype.Service;

/**
 * 医院设置服务类接口实现类
 *
 * @author: wumk
 * @since: 2021-05-06 21:21
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSetDO> implements HospitalSetService {
}
