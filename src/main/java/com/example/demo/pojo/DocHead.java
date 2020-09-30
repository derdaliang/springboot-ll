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
 * @create 2020-09-26 20:14:13
 * @describe 实体类
 */
@TableName("doc_head")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="DocHead对象", description="")
public class DocHead implements Serializable {

private static final long serialVersionUID = 1L;

        @ApiModelProperty(value = "单据编号")
                    @TableId(value = "id", type = IdType.UUID)
                private String id;

    @TableField("user_no")
        private Integer userNo;

        @ApiModelProperty(value = "出入类型")
    @TableField("in_or_out")
        private String inOrOut;

    @TableField("date")
        private String date;

    @TableField("time")
        private String time;


    public String getId() {
            return id;
            }

        public DocHead setId(String id) {
            this.id = id;
                return this;
            }

    public Integer getUserNo() {
            return userNo;
            }

        public DocHead setUserNo(Integer userNo) {
            this.userNo = userNo;
                return this;
            }

    public String getInOrOut() {
            return inOrOut;
            }

        public DocHead setInOrOut(String inOrOut) {
            this.inOrOut = inOrOut;
                return this;
            }

    public String getDate() {
            return date;
            }

        public DocHead setDate(String date) {
            this.date = date;
                return this;
            }

    public String getTime() {
            return time;
            }

        public DocHead setTime(String time) {
            this.time = time;
                return this;
            }

@Override
public String toString() {
        return "DocHead{" +
                "id=" + id +
                ", userNo=" + userNo +
                ", inOrOut=" + inOrOut +
                ", date=" + date +
                ", time=" + time +
        "}";
        }
        }
