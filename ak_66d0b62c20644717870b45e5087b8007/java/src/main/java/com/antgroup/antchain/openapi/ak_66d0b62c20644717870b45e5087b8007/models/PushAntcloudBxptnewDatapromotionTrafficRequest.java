// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_66d0b62c20644717870b45e5087b8007.models;

import com.aliyun.tea.*;

public class PushAntcloudBxptnewDatapromotionTrafficRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 保险险种
    @NameInMap("insurer_code")
    @Validation(required = true)
    public String insurerCode;

    // 保险险种
    @NameInMap("insurance_type")
    @Validation(required = true)
    public String insuranceType;

    // 业务参数内容JSON字符串
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 协议签署：USER_SIGN;；
    // 车辆信息上报：CAR_INFO_REPORTED；
    @NameInMap("push_data_type")
    @Validation(required = true)
    public String pushDataType;

    public static PushAntcloudBxptnewDatapromotionTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAntcloudBxptnewDatapromotionTrafficRequest self = new PushAntcloudBxptnewDatapromotionTrafficRequest();
        return TeaModel.build(map, self);
    }

    public PushAntcloudBxptnewDatapromotionTrafficRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAntcloudBxptnewDatapromotionTrafficRequest setInsurerCode(String insurerCode) {
        this.insurerCode = insurerCode;
        return this;
    }
    public String getInsurerCode() {
        return this.insurerCode;
    }

    public PushAntcloudBxptnewDatapromotionTrafficRequest setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }
    public String getInsuranceType() {
        return this.insuranceType;
    }

    public PushAntcloudBxptnewDatapromotionTrafficRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public PushAntcloudBxptnewDatapromotionTrafficRequest setPushDataType(String pushDataType) {
        this.pushDataType = pushDataType;
        return this;
    }
    public String getPushDataType() {
        return this.pushDataType;
    }

}
