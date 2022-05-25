// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class QueryFaceauthMeteringRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务流水号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 截止时间（整小时）
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 初始化接口传入的二级商户id
    @NameInMap("merchant_id")
    public String merchantId;

    // 需要查询的计量类型
    // 实名新用户:realNameNewUser
    // 实名老用户:realNameOldUser
    // 匿名注册:anonymousEnroll
    // 匿名比对:anonymousAuth
    // 
    @NameInMap("metering_type")
    public String meteringType;

    // 起始时间（整小时）
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    public static QueryFaceauthMeteringRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceauthMeteringRequest self = new QueryFaceauthMeteringRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceauthMeteringRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFaceauthMeteringRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFaceauthMeteringRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryFaceauthMeteringRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryFaceauthMeteringRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryFaceauthMeteringRequest setMeteringType(String meteringType) {
        this.meteringType = meteringType;
        return this;
    }
    public String getMeteringType() {
        return this.meteringType;
    }

    public QueryFaceauthMeteringRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
