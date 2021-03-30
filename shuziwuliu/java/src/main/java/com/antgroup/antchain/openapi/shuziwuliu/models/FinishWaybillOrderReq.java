// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class FinishWaybillOrderReq extends TeaModel {
    // 运费
    @NameInMap("all_freight")
    public String allFreight;

    // 回单押金
    @NameInMap("back_fee")
    public String backFee;

    // 货主支付运费金额
    @NameInMap("consignor_freight_amount")
    public String consignorFreightAmount;

    // 运费增项
    @NameInMap("freight_incr")
    public String freightIncr;

    // 运费扣减
    @NameInMap("loss_fee")
    public String lossFee;

    // 平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 运单id
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    public static FinishWaybillOrderReq build(java.util.Map<String, ?> map) throws Exception {
        FinishWaybillOrderReq self = new FinishWaybillOrderReq();
        return TeaModel.build(map, self);
    }

    public FinishWaybillOrderReq setAllFreight(String allFreight) {
        this.allFreight = allFreight;
        return this;
    }
    public String getAllFreight() {
        return this.allFreight;
    }

    public FinishWaybillOrderReq setBackFee(String backFee) {
        this.backFee = backFee;
        return this;
    }
    public String getBackFee() {
        return this.backFee;
    }

    public FinishWaybillOrderReq setConsignorFreightAmount(String consignorFreightAmount) {
        this.consignorFreightAmount = consignorFreightAmount;
        return this;
    }
    public String getConsignorFreightAmount() {
        return this.consignorFreightAmount;
    }

    public FinishWaybillOrderReq setFreightIncr(String freightIncr) {
        this.freightIncr = freightIncr;
        return this;
    }
    public String getFreightIncr() {
        return this.freightIncr;
    }

    public FinishWaybillOrderReq setLossFee(String lossFee) {
        this.lossFee = lossFee;
        return this;
    }
    public String getLossFee() {
        return this.lossFee;
    }

    public FinishWaybillOrderReq setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public FinishWaybillOrderReq setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

}
