// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class PushDatapromotionTrafficRequest extends TeaModel {
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

    // 协议签署：USER_SIGN_INFO;；
    // 车辆信息上报：CAR_INFO；
    @NameInMap("push_data_type")
    @Validation(required = true)
    public String pushDataType;

    public static PushDatapromotionTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDatapromotionTrafficRequest self = new PushDatapromotionTrafficRequest();
        return TeaModel.build(map, self);
    }

    public PushDatapromotionTrafficRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushDatapromotionTrafficRequest setInsurerCode(String insurerCode) {
        this.insurerCode = insurerCode;
        return this;
    }
    public String getInsurerCode() {
        return this.insurerCode;
    }

    public PushDatapromotionTrafficRequest setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }
    public String getInsuranceType() {
        return this.insuranceType;
    }

    public PushDatapromotionTrafficRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public PushDatapromotionTrafficRequest setPushDataType(String pushDataType) {
        this.pushDataType = pushDataType;
        return this;
    }
    public String getPushDataType() {
        return this.pushDataType;
    }

}
