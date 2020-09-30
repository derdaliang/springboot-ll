package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * @auther CodeGenerator
 * @create 2020-09-26 20:14:13
 * @describe 实体类
 */
@TableName("doc_line")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="DocLine对象", description="")
public class DocLine implements Serializable {

private static final long serialVersionUID = 1L;

                    @TableId(value = "id", type = IdType.UUID)
                private String id;

    @TableField("goods_id")
        private String goodsId;

    @TableField("ma_no")
        private String maNo;

    @TableField("mt_area")
        private String mtArea;

    @TableField("lot_no")
        private String lotNo;

    @TableField("mt_qty")
        private Integer mtQty;

    @TableField("date")
        private String date;

    @TableField("time")
        private String time;

    @TableField("user_no")
        private Integer userNo;


    public String getId() {
            return id;
            }

        public DocLine setId(String id) {
            this.id = id;
                return this;
            }

    public String getGoodsId() {
            return goodsId;
            }

        public DocLine setGoodsId(String goodsId) {
            this.goodsId = goodsId;
                return this;
            }

    public String getMaNo() {
            return maNo;
            }

        public DocLine setMaNo(String maNo) {
            this.maNo = maNo;
                return this;
            }

    public String getMtArea() {
            return mtArea;
            }

        public DocLine setMtArea(String mtArea) {
            this.mtArea = mtArea;
                return this;
            }

    public String getLotNo() {
            return lotNo;
            }

        public DocLine setLotNo(String lotNo) {
            this.lotNo = lotNo;
                return this;
            }

    public Integer getMtQty() {
            return mtQty;
            }

        public DocLine setMtQty(Integer mtQty) {
            this.mtQty = mtQty;
                return this;
            }

    public String getDate() {
            return date;
            }

        public DocLine setDate(String date) {
            this.date = date;
                return this;
            }

    public String getTime() {
            return time;
            }

        public DocLine setTime(String time) {
            this.time = time;
                return this;
            }

    public Integer getUserNo() {
            return userNo;
            }

        public DocLine setUserNo(Integer userNo) {
            this.userNo = userNo;
                return this;
            }

@Override
public String toString() {
        return "DocLine{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", maNo=" + maNo +
                ", mtArea=" + mtArea +
                ", lotNo=" + lotNo +
                ", mtQty=" + mtQty +
                ", date=" + date +
                ", time=" + time +
                ", userNo=" + userNo +
        "}";
        }
        }
