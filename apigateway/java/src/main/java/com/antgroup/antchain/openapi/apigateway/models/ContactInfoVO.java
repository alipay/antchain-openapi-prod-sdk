// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ContactInfoVO extends TeaModel {
    // 授权App标识
    @NameInMap("auth_app_info_id")
    public String authAppInfoId;

    // 公司名称
    @NameInMap("company")
    public String company;

    // 联系方式标识
    @NameInMap("contact_id")
    public String contactId;

    // 电子邮箱
    @NameInMap("mail")
    public String mail;

    // 联系人姓名
    @NameInMap("name")
    public String name;

    // 电话号码
    @NameInMap("tel")
    public String tel;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static ContactInfoVO build(java.util.Map<String, ?> map) throws Exception {
        ContactInfoVO self = new ContactInfoVO();
        return TeaModel.build(map, self);
    }

    public ContactInfoVO setAuthAppInfoId(String authAppInfoId) {
        this.authAppInfoId = authAppInfoId;
        return this;
    }
    public String getAuthAppInfoId() {
        return this.authAppInfoId;
    }

    public ContactInfoVO setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public ContactInfoVO setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ContactInfoVO setMail(String mail) {
        this.mail = mail;
        return this;
    }
    public String getMail() {
        return this.mail;
    }

    public ContactInfoVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContactInfoVO setTel(String tel) {
        this.tel = tel;
        return this;
    }
    public String getTel() {
        return this.tel;
    }

    public ContactInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ContactInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ContactInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ContactInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
