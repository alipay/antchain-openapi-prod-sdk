// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class FinishFinanceWaybillRequest extends TeaModel {
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

    public static FinishFinanceWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishFinanceWaybillRequest self = new FinishFinanceWaybillRequest();
        return TeaModel.build(map, self);
    }

    public FinishFinanceWaybillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishFinanceWaybillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishFinanceWaybillRequest setAllFreight(String allFreight) {
        this.allFreight = allFreight;
        return this;
    }
    public String getAllFreight() {
        return this.allFreight;
    }

    public FinishFinanceWaybillRequest setBackFee(String backFee) {
        this.backFee = backFee;
        return this;
    }
    public String getBackFee() {
        return this.backFee;
    }

    public FinishFinanceWaybillRequest setConsignorFreightAmount(String consignorFreightAmount) {
        this.consignorFreightAmount = consignorFreightAmount;
        return this;
    }
    public String getConsignorFreightAmount() {
        return this.consignorFreightAmount;
    }

    public FinishFinanceWaybillRequest setFreightIncr(String freightIncr) {
        this.freightIncr = freightIncr;
        return this;
    }
    public String getFreightIncr() {
        return this.freightIncr;
    }

    public FinishFinanceWaybillRequest setLossFee(String lossFee) {
        this.lossFee = lossFee;
        return this;
    }
    public String getLossFee() {
        return this.lossFee;
    }

    public FinishFinanceWaybillRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public FinishFinanceWaybillRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

}
