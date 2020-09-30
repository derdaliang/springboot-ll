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
 * @create 2020-09-26 20:14:12
 * @describe 实体类
 */
@TableName("goods_stock")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="GoodsStock对象", description="")
public class GoodsStock implements Serializable {

private static final long serialVersionUID = 1L;

        @ApiModelProperty(value = "物料编码")
                    @TableId(value = "goods_id", type = IdType.UUID)
                private String goodsId;

        @ApiModelProperty(value = "仓库编码")
    @TableField("ma_no")
        private String maNo;

        @ApiModelProperty(value = "库位编码")
    @TableField("mt_area")
        private String mtArea;

        @ApiModelProperty(value = "库存批次")
    @TableField("lot_no")
        private String lotNo;

        @ApiModelProperty(value = "在库数量")
    @TableField("mt_qty")
        private Integer mtQty;

        @ApiModelProperty(value = "锁定数量")
    @TableField("lock_qty")
        private Integer lockQty;

        @ApiModelProperty(value = "单位")
    @TableField("mt_unit")
        private String mtUnit;


    public String getGoodsId() {
            return goodsId;
            }

        public GoodsStock setGoodsId(String goodsId) {
            this.goodsId = goodsId;
                return this;
            }

    public String getMaNo() {
            return maNo;
            }

        public GoodsStock setMaNo(String maNo) {
            this.maNo = maNo;
                return this;
            }

    public String getMtArea() {
            return mtArea;
            }

        public GoodsStock setMtArea(String mtArea) {
            this.mtArea = mtArea;
                return this;
            }

    public String getLotNo() {
            return lotNo;
            }

        public GoodsStock setLotNo(String lotNo) {
            this.lotNo = lotNo;
                return this;
            }

    public Integer getMtQty() {
            return mtQty;
            }

        public GoodsStock setMtQty(Integer mtQty) {
            this.mtQty = mtQty;
                return this;
            }

    public Integer getLockQty() {
            return lockQty;
            }

        public GoodsStock setLockQty(Integer lockQty) {
            this.lockQty = lockQty;
                return this;
            }

    public String getMtUnit() {
            return mtUnit;
            }

        public GoodsStock setMtUnit(String mtUnit) {
            this.mtUnit = mtUnit;
                return this;
            }

@Override
public String toString() {
        return "GoodsStock{" +
                "goodsId=" + goodsId +
                ", maNo=" + maNo +
                ", mtArea=" + mtArea +
                ", lotNo=" + lotNo +
                ", mtQty=" + mtQty +
                ", lockQty=" + lockQty +
                ", mtUnit=" + mtUnit +
        "}";
        }
        }
