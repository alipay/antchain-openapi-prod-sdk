// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetInterestUrlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 权益申请编号，重新提交需要不一样
    @NameInMap("right_apply_no")
    @Validation(required = true)
    public String rightApplyNo;

    // 	
    // 申请额度，最多保留小数点后两位，单位元
    @NameInMap("apply_limit_amount")
    @Validation(required = true)
    public String applyLimitAmount;

    // 	
    // 数据授权方名称
    @NameInMap("data_licensor")
    @Validation(required = true)
    public String dataLicensor;

    // 回调场景方地址
    @NameInMap("callback_url")
    public String callbackUrl;

    // 权益产品编码，暂时固定
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 用户姓名 明文
    @NameInMap("tbr_name")
    @Validation(required = true)
    public String tbrName;

    // 用户手机号，明文
    @NameInMap("tbr_phone")
    @Validation(required = true)
    public String tbrPhone;

    // 用户身份证，明文
    @NameInMap("tbr_id_card")
    @Validation(required = true)
    public String tbrIdCard;

    public static GetInterestUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInterestUrlRequest self = new GetInterestUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetInterestUrlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetInterestUrlRequest setRightApplyNo(String rightApplyNo) {
        this.rightApplyNo = rightApplyNo;
        return this;
    }
    public String getRightApplyNo() {
        return this.rightApplyNo;
    }

    public GetInterestUrlRequest setApplyLimitAmount(String applyLimitAmount) {
        this.applyLimitAmount = applyLimitAmount;
        return this;
    }
    public String getApplyLimitAmount() {
        return this.applyLimitAmount;
    }

    public GetInterestUrlRequest setDataLicensor(String dataLicensor) {
        this.dataLicensor = dataLicensor;
        return this;
    }
    public String getDataLicensor() {
        return this.dataLicensor;
    }

    public GetInterestUrlRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public GetInterestUrlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetInterestUrlRequest setTbrName(String tbrName) {
        this.tbrName = tbrName;
        return this;
    }
    public String getTbrName() {
        return this.tbrName;
    }

    public GetInterestUrlRequest setTbrPhone(String tbrPhone) {
        this.tbrPhone = tbrPhone;
        return this;
    }
    public String getTbrPhone() {
        return this.tbrPhone;
    }

    public GetInterestUrlRequest setTbrIdCard(String tbrIdCard) {
        this.tbrIdCard = tbrIdCard;
        return this;
    }
    public String getTbrIdCard() {
        return this.tbrIdCard;
    }

}
