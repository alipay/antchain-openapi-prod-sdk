// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetInnerCustomerservicetemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

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

    public static GetInnerCustomerservicetemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInnerCustomerservicetemplateResponse self = new GetInnerCustomerservicetemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetInnerCustomerservicetemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetInnerCustomerservicetemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetInnerCustomerservicetemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetInnerCustomerservicetemplateResponse setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
        return this;
    }
    public String getServiceProviderName() {
        return this.serviceProviderName;
    }

    public GetInnerCustomerservicetemplateResponse setAlipayBindMobile(String alipayBindMobile) {
        this.alipayBindMobile = alipayBindMobile;
        return this;
    }
    public String getAlipayBindMobile() {
        return this.alipayBindMobile;
    }

    public GetInnerCustomerservicetemplateResponse setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
        return this;
    }
    public String getAlipayLogonId() {
        return this.alipayLogonId;
    }

    public GetInnerCustomerservicetemplateResponse setCustomerServicePhone(String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
        return this;
    }
    public String getCustomerServicePhone() {
        return this.customerServicePhone;
    }

    public GetInnerCustomerservicetemplateResponse setCustomerServiceName(String customerServiceName) {
        this.customerServiceName = customerServiceName;
        return this;
    }
    public String getCustomerServiceName() {
        return this.customerServiceName;
    }

    public GetInnerCustomerservicetemplateResponse setOnlineSupportSiteUrl(String onlineSupportSiteUrl) {
        this.onlineSupportSiteUrl = onlineSupportSiteUrl;
        return this;
    }
    public String getOnlineSupportSiteUrl() {
        return this.onlineSupportSiteUrl;
    }

    public GetInnerCustomerservicetemplateResponse setCustomerComplaintIssues(String customerComplaintIssues) {
        this.customerComplaintIssues = customerComplaintIssues;
        return this;
    }
    public String getCustomerComplaintIssues() {
        return this.customerComplaintIssues;
    }

}
