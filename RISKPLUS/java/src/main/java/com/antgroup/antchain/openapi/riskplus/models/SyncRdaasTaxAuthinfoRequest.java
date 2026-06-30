// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SyncRdaasTaxAuthinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 税号
    @NameInMap("nsrsbh")
    @Validation(required = true)
    public String nsrsbh;

    // 应用key
    @NameInMap("app_key")
    public String appKey;

    // 授权状态：Y-有效，N-无效
    @NameInMap("auth_status")
    public String authStatus;

    // 省份编码
    @NameInMap("pro_code")
    public String proCode;

    // 城市编码
    @NameInMap("city_code")
    public String cityCode;

    // 授权回调地址
    @NameInMap("auth_callback_url")
    public String authCallbackUrl;

    // 过期时间，格式: yyyy-MM-dd HH:mm:ss
    @NameInMap("expire_date")
    public String expireDate;

    // 最近一次授权成功的订单号
    @NameInMap("order_no")
    public String orderNo;

    // 授权场景
    @NameInMap("auth_scene")
    public String authScene;

    // 授权成功时间,格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("auth_start_time")
    public String authStartTime;

    // 授权创建时间,格式: yyyy-MM-dd HH:mm:ss
    @NameInMap("auth_create_time")
    public String authCreateTime;

    // 企业名称
    @NameInMap("corp_name")
    public String corpName;

    public static SyncRdaasTaxAuthinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRdaasTaxAuthinfoRequest self = new SyncRdaasTaxAuthinfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncRdaasTaxAuthinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncRdaasTaxAuthinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncRdaasTaxAuthinfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SyncRdaasTaxAuthinfoRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public SyncRdaasTaxAuthinfoRequest setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
        return this;
    }
    public String getNsrsbh() {
        return this.nsrsbh;
    }

    public SyncRdaasTaxAuthinfoRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public SyncRdaasTaxAuthinfoRequest setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public SyncRdaasTaxAuthinfoRequest setProCode(String proCode) {
        this.proCode = proCode;
        return this;
    }
    public String getProCode() {
        return this.proCode;
    }

    public SyncRdaasTaxAuthinfoRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public SyncRdaasTaxAuthinfoRequest setAuthCallbackUrl(String authCallbackUrl) {
        this.authCallbackUrl = authCallbackUrl;
        return this;
    }
    public String getAuthCallbackUrl() {
        return this.authCallbackUrl;
    }

    public SyncRdaasTaxAuthinfoRequest setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public SyncRdaasTaxAuthinfoRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SyncRdaasTaxAuthinfoRequest setAuthScene(String authScene) {
        this.authScene = authScene;
        return this;
    }
    public String getAuthScene() {
        return this.authScene;
    }

    public SyncRdaasTaxAuthinfoRequest setAuthStartTime(String authStartTime) {
        this.authStartTime = authStartTime;
        return this;
    }
    public String getAuthStartTime() {
        return this.authStartTime;
    }

    public SyncRdaasTaxAuthinfoRequest setAuthCreateTime(String authCreateTime) {
        this.authCreateTime = authCreateTime;
        return this;
    }
    public String getAuthCreateTime() {
        return this.authCreateTime;
    }

    public SyncRdaasTaxAuthinfoRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
