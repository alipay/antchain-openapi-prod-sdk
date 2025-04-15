// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class QueryDrrdataRiafdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 业务流水号 需唯一， 格式：日期_客户标识_序列号
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 请求来源  国泰-GT
    @NameInMap("biz_source")
    @Validation(required = true)
    public String bizSource;

    // 逆向物流单号
    @NameInMap("reverse_mail_no")
    @Validation(required = true)
    public String reverseMailNo;

    // 逆向物流快递公司代码
    @NameInMap("reverse_cp_code")
    public String reverseCpCode;

    // 逆向物流关联的电商平台
    @NameInMap("reverse_relate_platform")
    public String reverseRelatePlatform;

    // 逆向收件人电话后四位
    @NameInMap("reverse_receiver_phone")
    public String reverseReceiverPhone;

    // 逆向寄件人电话后四位
    @NameInMap("reverse_sender_phone")
    public String reverseSenderPhone;

    // 申请退货时间 格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("apply_return_time")
    public String applyReturnTime;

    // 申请理赔时间 格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("claim_processing_time")
    public String claimProcessingTime;

    // 正向物流单号
    @NameInMap("forward_mail_no")
    public String forwardMailNo;

    // 正向物流快递公司代码
    @NameInMap("forward_cp_code")
    public String forwardCpCode;

    // 正向物流关联的电商平台
    @NameInMap("forward_relate_platform")
    public String forwardRelatePlatform;

    // 正向收件人电话后四位
    @NameInMap("forward_receiver_phone")
    public String forwardReceiverPhone;

    // 正向寄件人电话后四位
    @NameInMap("forward_sender_phone")
    public String forwardSenderPhone;

    public static QueryDrrdataRiafdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDrrdataRiafdRequest self = new QueryDrrdataRiafdRequest();
        return TeaModel.build(map, self);
    }

    public QueryDrrdataRiafdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDrrdataRiafdRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryDrrdataRiafdRequest setBizSource(String bizSource) {
        this.bizSource = bizSource;
        return this;
    }
    public String getBizSource() {
        return this.bizSource;
    }

    public QueryDrrdataRiafdRequest setReverseMailNo(String reverseMailNo) {
        this.reverseMailNo = reverseMailNo;
        return this;
    }
    public String getReverseMailNo() {
        return this.reverseMailNo;
    }

    public QueryDrrdataRiafdRequest setReverseCpCode(String reverseCpCode) {
        this.reverseCpCode = reverseCpCode;
        return this;
    }
    public String getReverseCpCode() {
        return this.reverseCpCode;
    }

    public QueryDrrdataRiafdRequest setReverseRelatePlatform(String reverseRelatePlatform) {
        this.reverseRelatePlatform = reverseRelatePlatform;
        return this;
    }
    public String getReverseRelatePlatform() {
        return this.reverseRelatePlatform;
    }

    public QueryDrrdataRiafdRequest setReverseReceiverPhone(String reverseReceiverPhone) {
        this.reverseReceiverPhone = reverseReceiverPhone;
        return this;
    }
    public String getReverseReceiverPhone() {
        return this.reverseReceiverPhone;
    }

    public QueryDrrdataRiafdRequest setReverseSenderPhone(String reverseSenderPhone) {
        this.reverseSenderPhone = reverseSenderPhone;
        return this;
    }
    public String getReverseSenderPhone() {
        return this.reverseSenderPhone;
    }

    public QueryDrrdataRiafdRequest setApplyReturnTime(String applyReturnTime) {
        this.applyReturnTime = applyReturnTime;
        return this;
    }
    public String getApplyReturnTime() {
        return this.applyReturnTime;
    }

    public QueryDrrdataRiafdRequest setClaimProcessingTime(String claimProcessingTime) {
        this.claimProcessingTime = claimProcessingTime;
        return this;
    }
    public String getClaimProcessingTime() {
        return this.claimProcessingTime;
    }

    public QueryDrrdataRiafdRequest setForwardMailNo(String forwardMailNo) {
        this.forwardMailNo = forwardMailNo;
        return this;
    }
    public String getForwardMailNo() {
        return this.forwardMailNo;
    }

    public QueryDrrdataRiafdRequest setForwardCpCode(String forwardCpCode) {
        this.forwardCpCode = forwardCpCode;
        return this;
    }
    public String getForwardCpCode() {
        return this.forwardCpCode;
    }

    public QueryDrrdataRiafdRequest setForwardRelatePlatform(String forwardRelatePlatform) {
        this.forwardRelatePlatform = forwardRelatePlatform;
        return this;
    }
    public String getForwardRelatePlatform() {
        return this.forwardRelatePlatform;
    }

    public QueryDrrdataRiafdRequest setForwardReceiverPhone(String forwardReceiverPhone) {
        this.forwardReceiverPhone = forwardReceiverPhone;
        return this;
    }
    public String getForwardReceiverPhone() {
        return this.forwardReceiverPhone;
    }

    public QueryDrrdataRiafdRequest setForwardSenderPhone(String forwardSenderPhone) {
        this.forwardSenderPhone = forwardSenderPhone;
        return this;
    }
    public String getForwardSenderPhone() {
        return this.forwardSenderPhone;
    }

}
