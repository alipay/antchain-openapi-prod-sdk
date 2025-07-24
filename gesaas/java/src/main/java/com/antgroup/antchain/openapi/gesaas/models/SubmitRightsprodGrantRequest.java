// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class SubmitRightsprodGrantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 2088xxxx123
    @NameInMap("user_id")
    public String userId;

    // 用户手机号
    @NameInMap("phone_number")
    public String phoneNumber;

    // 商户编号
    @NameInMap("merchant_no")
    public String merchantNo;

    // 权益编码
    @NameInMap("rights_code")
    @Validation(required = true)
    public String rightsCode;

    // 发放数量
    @NameInMap("grant_num")
    @Validation(required = true)
    public Long grantNum;

    // 面额，动态面额类型必传
    @NameInMap("face_value")
    public String faceValue;

    // 外部发放订单号
    @NameInMap("out_grant_order_no")
    @Validation(required = true)
    public String outGrantOrderNo;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    // 发放信息,如活动ID等信息
    @NameInMap("grant_info")
    public String grantInfo;

    public static SubmitRightsprodGrantRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRightsprodGrantRequest self = new SubmitRightsprodGrantRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRightsprodGrantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitRightsprodGrantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitRightsprodGrantRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SubmitRightsprodGrantRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public SubmitRightsprodGrantRequest setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
        return this;
    }
    public String getMerchantNo() {
        return this.merchantNo;
    }

    public SubmitRightsprodGrantRequest setRightsCode(String rightsCode) {
        this.rightsCode = rightsCode;
        return this;
    }
    public String getRightsCode() {
        return this.rightsCode;
    }

    public SubmitRightsprodGrantRequest setGrantNum(Long grantNum) {
        this.grantNum = grantNum;
        return this;
    }
    public Long getGrantNum() {
        return this.grantNum;
    }

    public SubmitRightsprodGrantRequest setFaceValue(String faceValue) {
        this.faceValue = faceValue;
        return this;
    }
    public String getFaceValue() {
        return this.faceValue;
    }

    public SubmitRightsprodGrantRequest setOutGrantOrderNo(String outGrantOrderNo) {
        this.outGrantOrderNo = outGrantOrderNo;
        return this;
    }
    public String getOutGrantOrderNo() {
        return this.outGrantOrderNo;
    }

    public SubmitRightsprodGrantRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public SubmitRightsprodGrantRequest setGrantInfo(String grantInfo) {
        this.grantInfo = grantInfo;
        return this;
    }
    public String getGrantInfo() {
        return this.grantInfo;
    }

}
