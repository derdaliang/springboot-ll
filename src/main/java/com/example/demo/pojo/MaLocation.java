package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:09:39
 * @describe 实体类
 */
@TableName("ma_location")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="MaLocation对象", description="")
@Data
public class MaLocation implements Serializable {

private static final long serialVersionUID = 1L;

        @ApiModelProperty(value = "库位编号")
                    @TableId(value = "mt_area")
                private String mtArea;
    @ApiModelProperty(value = "仓库编号")
    @TableField(value = "ma_no")
    private String maNo;
        @ApiModelProperty(value = "库位名称")
    @TableField("mt_areaName")
        private String mtAreaname;

        @ApiModelProperty(value = "操作人代号")
    @TableField("user_no")
        private Integer userNo;

        @ApiModelProperty(value = "操作日期")
    @TableField("operate_date")
        private String operateDate;

        @ApiModelProperty(value = "操作时间")
    @TableField("operate_time")
        private String operateTime;

        @ApiModelProperty(value = "是否可用")
    @TableField("lock_yn")
        private String lockYn;


@Override
public String toString() {
        return "MaLocation{" +
                "mtArea=" + mtArea +
                ", mtAreaname=" + mtAreaname +
                ", userNo=" + userNo +
                ", operateDate=" + operateDate +
                ", operateTime=" + operateTime +
                ", lockYn=" + lockYn +
        "}";
        }
        }
