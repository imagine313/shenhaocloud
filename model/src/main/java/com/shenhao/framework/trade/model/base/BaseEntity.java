package com.shenhao.framework.trade.model.base;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体的抽象父类
 *
 * @author: wumk
 * @since: 2021-05-06 20:06
 */
@Data
public abstract class BaseEntity implements Serializable {

    /**
     * 主键id 采用雪花算法
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    @TableField(value = "create_id", fill = FieldFill.INSERT)
    private Long createId;

    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    @TableField(value = "update_id", fill = FieldFill.INSERT_UPDATE)
    private Long updateId;

    /**
     * 乐观锁
     */
    @Version
    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version;

    /**
     * 是否删除
     */
    @ApiModelProperty(value = "逻辑删除（1：已删除，0：未删除）")
    @TableField(select = false, value = "deleted")
    @JsonIgnore
    private Integer deleted;
}
