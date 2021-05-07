package com.shenhao.framework.trade.model.hosp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.shenhao.framework.trade.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 医院设置实体类
 *
 * @author: wumk
 * @since: 2021-05-06 21:33
 */
@Data
@ApiModel(description = "医院设置")
@TableName("doc_hospital_set")
public class HospitalSetDO extends BaseEntity {

    @ApiModelProperty(value = "医院名称")
    @TableField("hos_name")
    private String hosName;

    @ApiModelProperty(value = "医院编号")
    @TableField("hos_code")
    private String hosCode;

    @ApiModelProperty(value = "api基础路径")
    @TableField("api_url")
    private String apiUrl;

    @ApiModelProperty(value = "签名钥匙")
    @TableField("sign_key")
    private String signKey;

    @ApiModelProperty(value = "联系人姓名")
    @TableField("contacts_name")
    private String contactsName;

    @ApiModelProperty(value = "联系人手机")
    @TableField("contacts_phone")
    private String contactsPhone;

    @ApiModelProperty(value = "状态")
    @TableField("status")
    private Integer status;
}
