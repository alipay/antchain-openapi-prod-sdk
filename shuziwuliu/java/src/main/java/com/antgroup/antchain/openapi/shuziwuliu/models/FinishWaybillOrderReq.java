// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class FinishWaybillOrderReq extends TeaModel {
    // 运费
    /**
     * <strong>example:</strong>
     * <p>all_freight</p>
     */
    @NameInMap("all_freight")
    public String allFreight;

    // 回单押金
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("back_fee")
    public String backFee;

    // 货主支付运费金额
    /**
     * <strong>example:</strong>
     * <p>consignor_freight_amount</p>
     */
    @NameInMap("consignor_freight_amount")
    public String consignorFreightAmount;

    // 运费增项
    /**
     * <strong>example:</strong>
     * <p>freight_incr</p>
     */
    @NameInMap("freight_incr")
    public String freightIncr;

    // 运费扣减
    /**
     * <strong>example:</strong>
     * <p>loss_fee</p>
     */
    @NameInMap("loss_fee")
    public String lossFee;

    // 平台did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:b6db2d812b1dac07a8c2a6201db3fff529f1ce7d78f58888fd791aec84dc8a8e</p>
     */
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 运单id
    /**
     * <strong>example:</strong>
     * <p>运单id</p>
     */
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
