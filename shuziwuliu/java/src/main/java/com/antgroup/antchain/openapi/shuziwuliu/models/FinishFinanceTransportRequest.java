// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class FinishFinanceTransportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 运费
    @NameInMap("all_freight")
    public String allFreight;

    // 回单押金
    @NameInMap("back_fee")
    public String backFee;

    // 货主支付运费金额
    @NameInMap("consignor_freight_amount")
    @Validation(required = true)
    public String consignorFreightAmount;

    // 到达门点时间
    @NameInMap("dest_doors_end_time")
    public Long destDoorsEndTime;

    // 终结时间
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 运费增项
    @NameInMap("freight_incr")
    public String freightIncr;

    // 运费扣减
    @NameInMap("loss_fee")
    public String lossFee;

    // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 运单id
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    public static FinishFinanceTransportRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishFinanceTransportRequest self = new FinishFinanceTransportRequest();
        return TeaModel.build(map, self);
    }

    public FinishFinanceTransportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishFinanceTransportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishFinanceTransportRequest setAllFreight(String allFreight) {
        this.allFreight = allFreight;
        return this;
    }
    public String getAllFreight() {
        return this.allFreight;
    }

    public FinishFinanceTransportRequest setBackFee(String backFee) {
        this.backFee = backFee;
        return this;
    }
    public String getBackFee() {
        return this.backFee;
    }

    public FinishFinanceTransportRequest setConsignorFreightAmount(String consignorFreightAmount) {
        this.consignorFreightAmount = consignorFreightAmount;
        return this;
    }
    public String getConsignorFreightAmount() {
        return this.consignorFreightAmount;
    }

    public FinishFinanceTransportRequest setDestDoorsEndTime(Long destDoorsEndTime) {
        this.destDoorsEndTime = destDoorsEndTime;
        return this;
    }
    public Long getDestDoorsEndTime() {
        return this.destDoorsEndTime;
    }

    public FinishFinanceTransportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public FinishFinanceTransportRequest setFreightIncr(String freightIncr) {
        this.freightIncr = freightIncr;
        return this;
    }
    public String getFreightIncr() {
        return this.freightIncr;
    }

    public FinishFinanceTransportRequest setLossFee(String lossFee) {
        this.lossFee = lossFee;
        return this;
    }
    public String getLossFee() {
        return this.lossFee;
    }

    public FinishFinanceTransportRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public FinishFinanceTransportRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

}
