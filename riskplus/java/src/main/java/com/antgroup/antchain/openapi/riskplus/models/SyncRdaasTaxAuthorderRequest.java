// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SyncRdaasTaxAuthorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户号
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 税号
    @NameInMap("identity_id")
    public String identityId;

    // 授权因子
    @NameInMap("factor_value")
    public String factorValue;

    // 第二授权因子
    @NameInMap("second_factor_value")
    public String secondFactorValue;

    // 授权订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 内容
    @NameInMap("content")
    public String content;

    // 过期时间
    @NameInMap("expire_time")
    public String expireTime;

    // 授权场景
    @NameInMap("auth_scene")
    public String authScene;

    // 授权状态
    @NameInMap("auth_status")
    public String authStatus;

    // 授权成功时间,格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("auth_start_time")
    public String authStartTime;

    // 授权创建时间,格式: yyyy-MM-dd HH:mm:ss
    @NameInMap("auth_create_time")
    public String authCreateTime;

    // 名称
    @NameInMap("identity_name")
    public String identityName;

    // 企业实际所属税局地区编码
    @NameInMap("tax_zone_code")
    public String taxZoneCode;

    // 失败原因
    @NameInMap("fail_reason")
    public String failReason;

    public static SyncRdaasTaxAuthorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRdaasTaxAuthorderRequest self = new SyncRdaasTaxAuthorderRequest();
        return TeaModel.build(map, self);
    }

    public SyncRdaasTaxAuthorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncRdaasTaxAuthorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncRdaasTaxAuthorderRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public SyncRdaasTaxAuthorderRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public SyncRdaasTaxAuthorderRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public SyncRdaasTaxAuthorderRequest setFactorValue(String factorValue) {
        this.factorValue = factorValue;
        return this;
    }
    public String getFactorValue() {
        return this.factorValue;
    }

    public SyncRdaasTaxAuthorderRequest setSecondFactorValue(String secondFactorValue) {
        this.secondFactorValue = secondFactorValue;
        return this;
    }
    public String getSecondFactorValue() {
        return this.secondFactorValue;
    }

    public SyncRdaasTaxAuthorderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SyncRdaasTaxAuthorderRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SyncRdaasTaxAuthorderRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public SyncRdaasTaxAuthorderRequest setAuthScene(String authScene) {
        this.authScene = authScene;
        return this;
    }
    public String getAuthScene() {
        return this.authScene;
    }

    public SyncRdaasTaxAuthorderRequest setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public SyncRdaasTaxAuthorderRequest setAuthStartTime(String authStartTime) {
        this.authStartTime = authStartTime;
        return this;
    }
    public String getAuthStartTime() {
        return this.authStartTime;
    }

    public SyncRdaasTaxAuthorderRequest setAuthCreateTime(String authCreateTime) {
        this.authCreateTime = authCreateTime;
        return this;
    }
    public String getAuthCreateTime() {
        return this.authCreateTime;
    }

    public SyncRdaasTaxAuthorderRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public SyncRdaasTaxAuthorderRequest setTaxZoneCode(String taxZoneCode) {
        this.taxZoneCode = taxZoneCode;
        return this;
    }
    public String getTaxZoneCode() {
        return this.taxZoneCode;
    }

    public SyncRdaasTaxAuthorderRequest setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
