// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GetDubbridgeJumpurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求唯一id
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 授信流水号
    @NameInMap("credit_no")
    public String creditNo;

    // 支用流水号
    @NameInMap("loan_no")
    public String loanNo;

    // 跳端申请流水号
    @NameInMap("jump_no")
    @Validation(required = true)
    public String jumpNo;

    // 借款确认信息
    @NameInMap("loan_confirm_info")
    @Validation(required = true)
    public LoanConfirmInfo loanConfirmInfo;

    // 回跳平台方地址
    @NameInMap("plat_jump_url")
    @Validation(required = true)
    public PlatJumpUrl platJumpUrl;

    // 合作方渠道标示，用于区分产品
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    // 拓展信息，json格式字符串
    @NameInMap("ext_info")
    public String extInfo;

    public static GetDubbridgeJumpurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDubbridgeJumpurlRequest self = new GetDubbridgeJumpurlRequest();
        return TeaModel.build(map, self);
    }

    public GetDubbridgeJumpurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDubbridgeJumpurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDubbridgeJumpurlRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public GetDubbridgeJumpurlRequest setCreditNo(String creditNo) {
        this.creditNo = creditNo;
        return this;
    }
    public String getCreditNo() {
        return this.creditNo;
    }

    public GetDubbridgeJumpurlRequest setLoanNo(String loanNo) {
        this.loanNo = loanNo;
        return this;
    }
    public String getLoanNo() {
        return this.loanNo;
    }

    public GetDubbridgeJumpurlRequest setJumpNo(String jumpNo) {
        this.jumpNo = jumpNo;
        return this;
    }
    public String getJumpNo() {
        return this.jumpNo;
    }

    public GetDubbridgeJumpurlRequest setLoanConfirmInfo(LoanConfirmInfo loanConfirmInfo) {
        this.loanConfirmInfo = loanConfirmInfo;
        return this;
    }
    public LoanConfirmInfo getLoanConfirmInfo() {
        return this.loanConfirmInfo;
    }

    public GetDubbridgeJumpurlRequest setPlatJumpUrl(PlatJumpUrl platJumpUrl) {
        this.platJumpUrl = platJumpUrl;
        return this;
    }
    public PlatJumpUrl getPlatJumpUrl() {
        return this.platJumpUrl;
    }

    public GetDubbridgeJumpurlRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public GetDubbridgeJumpurlRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
