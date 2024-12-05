// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerCustomerserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 公司社会统一信息代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 公司名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 处理类型:
    // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
    // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
    @NameInMap("process_type")
    public String processType;

    // 服务商名称
    @NameInMap("service_provider_name")
    public String serviceProviderName;

    // 客诉处理员支付宝绑定手机号
    @NameInMap("alipay_bind_mobile")
    public String alipayBindMobile;

    // 客诉处理员支付宝账号
    @NameInMap("alipay_logon_id")
    public String alipayLogonId;

    // 客服电话
    @NameInMap("customer_service_phone")
    public String customerServicePhone;

    // 客服人员名称
    @NameInMap("customer_service_name")
    public String customerServiceName;

    // 在线客服网址
    @NameInMap("online_support_site_url")
    public String onlineSupportSiteUrl;

    // 投诉问题
    @NameInMap("customer_complaint_issues")
    public String customerComplaintIssues;

    public static DetailInnerCustomerserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerCustomerserviceResponse self = new DetailInnerCustomerserviceResponse();
        return TeaModel.build(map, self);
    }

    public DetailInnerCustomerserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailInnerCustomerserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailInnerCustomerserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailInnerCustomerserviceResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public DetailInnerCustomerserviceResponse setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public DetailInnerCustomerserviceResponse setProcessType(String processType) {
        this.processType = processType;
        return this;
    }
    public String getProcessType() {
        return this.processType;
    }

    public DetailInnerCustomerserviceResponse setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
        return this;
    }
    public String getServiceProviderName() {
        return this.serviceProviderName;
    }

    public DetailInnerCustomerserviceResponse setAlipayBindMobile(String alipayBindMobile) {
        this.alipayBindMobile = alipayBindMobile;
        return this;
    }
    public String getAlipayBindMobile() {
        return this.alipayBindMobile;
    }

    public DetailInnerCustomerserviceResponse setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
        return this;
    }
    public String getAlipayLogonId() {
        return this.alipayLogonId;
    }

    public DetailInnerCustomerserviceResponse setCustomerServicePhone(String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
        return this;
    }
    public String getCustomerServicePhone() {
        return this.customerServicePhone;
    }

    public DetailInnerCustomerserviceResponse setCustomerServiceName(String customerServiceName) {
        this.customerServiceName = customerServiceName;
        return this;
    }
    public String getCustomerServiceName() {
        return this.customerServiceName;
    }

    public DetailInnerCustomerserviceResponse setOnlineSupportSiteUrl(String onlineSupportSiteUrl) {
        this.onlineSupportSiteUrl = onlineSupportSiteUrl;
        return this;
    }
    public String getOnlineSupportSiteUrl() {
        return this.onlineSupportSiteUrl;
    }

    public DetailInnerCustomerserviceResponse setCustomerComplaintIssues(String customerComplaintIssues) {
        this.customerComplaintIssues = customerComplaintIssues;
        return this;
    }
    public String getCustomerComplaintIssues() {
        return this.customerComplaintIssues;
    }

}
