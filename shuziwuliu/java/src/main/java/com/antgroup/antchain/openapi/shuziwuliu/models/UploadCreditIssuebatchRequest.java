// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadCreditIssuebatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次id
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 回调地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 凭证发行方did
    @NameInMap("create_did")
    @Validation(required = true)
    public String createDid;

    // 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
    @NameInMap("easy_finance")
    public Boolean easyFinance;

    // 凭证到期时间
    @NameInMap("expire_date")
    @Validation(required = true)
    public String expireDate;

    // 支付单运费总额，运费最多精确到小数点后2位
    @NameInMap("freight")
    @Validation(required = true)
    public String freight;

    // 集团平台did
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 全局业务唯一编号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 支付订单号
    @NameInMap("pay_order")
    @Validation(required = true)
    public String payOrder;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 凭证接收方did
    @NameInMap("receive_did")
    @Validation(required = true)
    public String receiveDid;

    // 运单合并列表
    @NameInMap("waybill_ids")
    @Validation(required = true)
    public java.util.List<String> waybillIds;

    public static UploadCreditIssuebatchRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCreditIssuebatchRequest self = new UploadCreditIssuebatchRequest();
        return TeaModel.build(map, self);
    }

    public UploadCreditIssuebatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadCreditIssuebatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadCreditIssuebatchRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public UploadCreditIssuebatchRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UploadCreditIssuebatchRequest setCreateDid(String createDid) {
        this.createDid = createDid;
        return this;
    }
    public String getCreateDid() {
        return this.createDid;
    }

    public UploadCreditIssuebatchRequest setEasyFinance(Boolean easyFinance) {
        this.easyFinance = easyFinance;
        return this;
    }
    public Boolean getEasyFinance() {
        return this.easyFinance;
    }

    public UploadCreditIssuebatchRequest setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public UploadCreditIssuebatchRequest setFreight(String freight) {
        this.freight = freight;
        return this;
    }
    public String getFreight() {
        return this.freight;
    }

    public UploadCreditIssuebatchRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public UploadCreditIssuebatchRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public UploadCreditIssuebatchRequest setPayOrder(String payOrder) {
        this.payOrder = payOrder;
        return this;
    }
    public String getPayOrder() {
        return this.payOrder;
    }

    public UploadCreditIssuebatchRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UploadCreditIssuebatchRequest setReceiveDid(String receiveDid) {
        this.receiveDid = receiveDid;
        return this;
    }
    public String getReceiveDid() {
        return this.receiveDid;
    }

    public UploadCreditIssuebatchRequest setWaybillIds(java.util.List<String> waybillIds) {
        this.waybillIds = waybillIds;
        return this;
    }
    public java.util.List<String> getWaybillIds() {
        return this.waybillIds;
    }

}
