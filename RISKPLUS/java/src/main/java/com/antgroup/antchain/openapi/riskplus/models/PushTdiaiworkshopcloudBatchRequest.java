// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushTdiaiworkshopcloudBatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品码（事件码）
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    // 产品码
    @NameInMap("disp_model_code")
    @Validation(required = true)
    public String dispModelCode;

    // 业务码
    @NameInMap("business_type")
    @Validation(required = true)
    public String businessType;

    // 加密方式
    @NameInMap("hash_type")
    @Validation(required = true)
    public String hashType;

    // 请求唯一id，幂等设计
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 样本结构体
    @NameInMap("sample_list")
    @Validation(required = true)
    public java.util.List<Item> sampleList;

    // 回溯日期
    @NameInMap("back_date")
    public String backDate;

    // 回调地址
    @NameInMap("callback_url")
    public String callbackUrl;

    public static PushTdiaiworkshopcloudBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        PushTdiaiworkshopcloudBatchRequest self = new PushTdiaiworkshopcloudBatchRequest();
        return TeaModel.build(map, self);
    }

    public PushTdiaiworkshopcloudBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushTdiaiworkshopcloudBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushTdiaiworkshopcloudBatchRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public PushTdiaiworkshopcloudBatchRequest setDispModelCode(String dispModelCode) {
        this.dispModelCode = dispModelCode;
        return this;
    }
    public String getDispModelCode() {
        return this.dispModelCode;
    }

    public PushTdiaiworkshopcloudBatchRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public PushTdiaiworkshopcloudBatchRequest setHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }
    public String getHashType() {
        return this.hashType;
    }

    public PushTdiaiworkshopcloudBatchRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushTdiaiworkshopcloudBatchRequest setSampleList(java.util.List<Item> sampleList) {
        this.sampleList = sampleList;
        return this;
    }
    public java.util.List<Item> getSampleList() {
        return this.sampleList;
    }

    public PushTdiaiworkshopcloudBatchRequest setBackDate(String backDate) {
        this.backDate = backDate;
        return this;
    }
    public String getBackDate() {
        return this.backDate;
    }

    public PushTdiaiworkshopcloudBatchRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

}
