// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class QueryIntlconfigUserinfoResponse extends TeaModel {
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

    public static QueryIntlconfigUserinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntlconfigUserinfoResponse self = new QueryIntlconfigUserinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntlconfigUserinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIntlconfigUserinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIntlconfigUserinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIntlconfigUserinfoResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryIntlconfigUserinfoResponse setTaxPayerQualification(String taxPayerQualification) {
        this.taxPayerQualification = taxPayerQualification;
        return this;
    }
    public String getTaxPayerQualification() {
        return this.taxPayerQualification;
    }

    public QueryIntlconfigUserinfoResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryIntlconfigUserinfoResponse setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public QueryIntlconfigUserinfoResponse setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public QueryIntlconfigUserinfoResponse setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public QueryIntlconfigUserinfoResponse setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public QueryIntlconfigUserinfoResponse setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public QueryIntlconfigUserinfoResponse setContactTel(String contactTel) {
        this.contactTel = contactTel;
        return this;
    }
    public String getContactTel() {
        return this.contactTel;
    }

}
