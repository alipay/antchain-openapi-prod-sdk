// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class PushRightsprodGrantrightsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 手机号
    @NameInMap("phone_number")
    public String phoneNumber;

    // 商户编码
    @NameInMap("merchant_no")
    public String merchantNo;

    // 权益编码
    @NameInMap("supply_rights_code")
    @Validation(required = true)
    public String supplyRightsCode;

    // 发放数量，可根据权益信息grantMulti判断是否可发多张
    @NameInMap("grant_num")
    public Long grantNum;

    // 外部发放订单号
    @NameInMap("out_grant_order_no")
    @Validation(required = true)
    public String outGrantOrderNo;

    // 发放扩展信息，如活动ID等信息，暂时可以不传
    @NameInMap("grant_info")
    public String grantInfo;

    // 208898234892XXX01
    @NameInMap("open_id")
    public String openId;

    // 应用ID
    @NameInMap("app_id")
    public String appId;

    public static PushRightsprodGrantrightsRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRightsprodGrantrightsRequest self = new PushRightsprodGrantrightsRequest();
        return TeaModel.build(map, self);
    }

    public PushRightsprodGrantrightsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRightsprodGrantrightsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRightsprodGrantrightsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PushRightsprodGrantrightsRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PushRightsprodGrantrightsRequest setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
        return this;
    }
    public String getMerchantNo() {
        return this.merchantNo;
    }

    public PushRightsprodGrantrightsRequest setSupplyRightsCode(String supplyRightsCode) {
        this.supplyRightsCode = supplyRightsCode;
        return this;
    }
    public String getSupplyRightsCode() {
        return this.supplyRightsCode;
    }

    public PushRightsprodGrantrightsRequest setGrantNum(Long grantNum) {
        this.grantNum = grantNum;
        return this;
    }
    public Long getGrantNum() {
        return this.grantNum;
    }

    public PushRightsprodGrantrightsRequest setOutGrantOrderNo(String outGrantOrderNo) {
        this.outGrantOrderNo = outGrantOrderNo;
        return this;
    }
    public String getOutGrantOrderNo() {
        return this.outGrantOrderNo;
    }

    public PushRightsprodGrantrightsRequest setGrantInfo(String grantInfo) {
        this.grantInfo = grantInfo;
        return this;
    }
    public String getGrantInfo() {
        return this.grantInfo;
    }

    public PushRightsprodGrantrightsRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public PushRightsprodGrantrightsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
