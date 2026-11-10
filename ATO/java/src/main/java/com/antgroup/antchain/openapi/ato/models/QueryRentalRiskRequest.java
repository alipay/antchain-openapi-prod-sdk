// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRentalRiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 身份证号，RSA 加密
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 手机号，RSA 加密
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 姓名，RSA 加密
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 单次请求流水号，需要保证唯一
    // 长度大于6， 小于50
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 押金金额（分）
    @NameInMap("deposit_amount")
    @Validation(required = true)
    public Long depositAmount;

    public static QueryRentalRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRentalRiskRequest self = new QueryRentalRiskRequest();
        return TeaModel.build(map, self);
    }

    public QueryRentalRiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRentalRiskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRentalRiskRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryRentalRiskRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryRentalRiskRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryRentalRiskRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryRentalRiskRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public QueryRentalRiskRequest setDepositAmount(Long depositAmount) {
        this.depositAmount = depositAmount;
        return this;
    }
    public Long getDepositAmount() {
        return this.depositAmount;
    }

}
