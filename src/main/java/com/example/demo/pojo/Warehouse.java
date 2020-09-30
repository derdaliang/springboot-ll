package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:10:51
 * @describe 实体类
 */
@TableName("warehouse")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="Warehouse对象", description="")
public class Warehouse implements Serializable {

private static final long serialVersionUID = 1L;

        @ApiModelProperty(value = "仓库编码")
                    @TableId(value = "ma_no")
                private String maNo;

        @ApiModelProperty(value = "仓库名称")
    @TableField("ma_name")
        private String maName;

        @ApiModelProperty(value = "操作人代号")
    @TableField("user_no")
        private Integer userNo;

        @ApiModelProperty(value = "操作日期")
    @TableField("operate_date")
        private String operateDate;

        @ApiModelProperty(value = "操作时间")
    @TableField("operate_time")
        private String operateTime;

        @ApiModelProperty(value = "仓库是否启用")
    @TableField("lock_yn")
        private String lockYn;


    public String getMaNo() {
            return maNo;
            }

        public Warehouse setMaNo(String maNo) {
            this.maNo = maNo;
                return this;
            }

    public String getMaName() {
            return maName;
            }

        public Warehouse setMaName(String maName) {
            this.maName = maName;
                return this;
            }

    public Integer getUserNo() {
            return userNo;
            }

        public Warehouse setUserNo(Integer userNo) {
            this.userNo = userNo;
                return this;
            }

    public String getOperateDate() {
            return operateDate;
            }

        public Warehouse setOperateDate(String operateDate) {
            this.operateDate = operateDate;
                return this;
            }

    public String getOperateTime() {
            return operateTime;
            }

        public Warehouse setOperateTime(String operateTime) {
            this.operateTime = operateTime;
                return this;
            }

    public String getLockYn() {
            return lockYn;
            }

        public Warehouse setLockYn(String lockYn) {
            this.lockYn = lockYn;
                return this;
            }

@Override
public String toString() {
        return "Warehouse{" +
                "maNo=" + maNo +
                ", maName=" + maName +
                ", userNo=" + userNo +
                ", operateDate=" + operateDate +
                ", operateTime=" + operateTime +
                ", lockYn=" + lockYn +
        "}";
        }
        }
