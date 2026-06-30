// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class UpdateRightplatformApplyinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 申请权益编号
    @NameInMap("right_apply_no")
    @Validation(required = true)
    public String rightApplyNo;

    // 申请额度
    @NameInMap("apply_limit_amount")
    @Validation(required = true)
    public String applyLimitAmount;

    // 申请额度状态
    @NameInMap("apply_status")
    @Validation(required = true)
    public String applyStatus;

    // 投保信息，json字符串
    @NameInMap("apply_info")
    @Validation(required = true)
    public String applyInfo;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static UpdateRightplatformApplyinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRightplatformApplyinfoRequest self = new UpdateRightplatformApplyinfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRightplatformApplyinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateRightplatformApplyinfoRequest setRightApplyNo(String rightApplyNo) {
        this.rightApplyNo = rightApplyNo;
        return this;
    }
    public String getRightApplyNo() {
        return this.rightApplyNo;
    }

    public UpdateRightplatformApplyinfoRequest setApplyLimitAmount(String applyLimitAmount) {
        this.applyLimitAmount = applyLimitAmount;
        return this;
    }
    public String getApplyLimitAmount() {
        return this.applyLimitAmount;
    }

    public UpdateRightplatformApplyinfoRequest setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public UpdateRightplatformApplyinfoRequest setApplyInfo(String applyInfo) {
        this.applyInfo = applyInfo;
        return this;
    }
    public String getApplyInfo() {
        return this.applyInfo;
    }

    public UpdateRightplatformApplyinfoRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
