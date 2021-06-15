// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class ExecWithdrawCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // project_id，合约对应的项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 兑现Token个数
    @NameInMap("withdraw_token")
    @Validation(required = true)
    public String withdrawToken;

    // 兑现总额 单位：分
    @NameInMap("withdraw_amount_cent")
    @Validation(required = true)
    public Long withdrawAmountCent;

    // Token单价 单位：分
    @NameInMap("withdraw_token_price_cent")
    @Validation(required = true)
    public Long withdrawTokenPriceCent;

    // 业务单号，同一调用方全局唯一
    @NameInMap("withdraw_request_id")
    @Validation(required = true)
    public String withdrawRequestId;

    // 用户账号类型：PHONE / ALIPAY_LOGON_ID / ALIPAY_UID
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // 回跳地址（签约税优使用，使用小程序页面地址）
    @NameInMap("back_url")
    @Validation(required = true)
    public String backUrl;

    // 支付宝用户唯一标识
    @NameInMap("user_id_no")
    @Validation(required = true)
    public String userIdNo;

    public static ExecWithdrawCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecWithdrawCreateRequest self = new ExecWithdrawCreateRequest();
        return TeaModel.build(map, self);
    }

    public ExecWithdrawCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecWithdrawCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecWithdrawCreateRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecWithdrawCreateRequest setWithdrawToken(String withdrawToken) {
        this.withdrawToken = withdrawToken;
        return this;
    }
    public String getWithdrawToken() {
        return this.withdrawToken;
    }

    public ExecWithdrawCreateRequest setWithdrawAmountCent(Long withdrawAmountCent) {
        this.withdrawAmountCent = withdrawAmountCent;
        return this;
    }
    public Long getWithdrawAmountCent() {
        return this.withdrawAmountCent;
    }

    public ExecWithdrawCreateRequest setWithdrawTokenPriceCent(Long withdrawTokenPriceCent) {
        this.withdrawTokenPriceCent = withdrawTokenPriceCent;
        return this;
    }
    public Long getWithdrawTokenPriceCent() {
        return this.withdrawTokenPriceCent;
    }

    public ExecWithdrawCreateRequest setWithdrawRequestId(String withdrawRequestId) {
        this.withdrawRequestId = withdrawRequestId;
        return this;
    }
    public String getWithdrawRequestId() {
        return this.withdrawRequestId;
    }

    public ExecWithdrawCreateRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public ExecWithdrawCreateRequest setBackUrl(String backUrl) {
        this.backUrl = backUrl;
        return this;
    }
    public String getBackUrl() {
        return this.backUrl;
    }

    public ExecWithdrawCreateRequest setUserIdNo(String userIdNo) {
        this.userIdNo = userIdNo;
        return this;
    }
    public String getUserIdNo() {
        return this.userIdNo;
    }

}
