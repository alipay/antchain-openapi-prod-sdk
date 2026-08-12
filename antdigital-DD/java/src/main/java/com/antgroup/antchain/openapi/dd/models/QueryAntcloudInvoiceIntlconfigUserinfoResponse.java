// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudInvoiceIntlconfigUserinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 纳税人类型，国际商户为03
    @NameInMap("tax_payer_qualification")
    public String taxPayerQualification;

    // 公司名称
    @NameInMap("name")
    public String name;

    // 国家地区
    @NameInMap("country")
    public String country;

    // 国家地区编号，如CN
    @NameInMap("country_code")
    public String countryCode;

    // 公司地址
    @NameInMap("address")
    public String address;

    // 联系人姓名
    @NameInMap("contact_name")
    public String contactName;

    // 联系人邮箱
    @NameInMap("contact_email")
    public String contactEmail;

    // 联系人电话
    @NameInMap("contact_tel")
    public String contactTel;

    public static QueryAntcloudInvoiceIntlconfigUserinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudInvoiceIntlconfigUserinfoResponse self = new QueryAntcloudInvoiceIntlconfigUserinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setTaxPayerQualification(String taxPayerQualification) {
        this.taxPayerQualification = taxPayerQualification;
        return this;
    }
    public String getTaxPayerQualification() {
        return this.taxPayerQualification;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public QueryAntcloudInvoiceIntlconfigUserinfoResponse setContactTel(String contactTel) {
        this.contactTel = contactTel;
        return this;
    }
    public String getContactTel() {
        return this.contactTel;
    }

}
