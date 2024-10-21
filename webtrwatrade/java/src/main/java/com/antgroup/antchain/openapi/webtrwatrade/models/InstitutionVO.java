// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class InstitutionVO extends TeaModel {
    // 机构id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 机构名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 简介
    @NameInMap("about")
    public String about;

    // 主页
    @NameInMap("home_page")
    public String homePage;

    // 联系人信息
    @NameInMap("contacts")
    public java.util.List<InstitutionContactInfo> contacts;

    // 机构类型
    @NameInMap("types")
    @Validation(required = true)
    public java.util.List<InstitutionType> types;

    // 机构用户信息
    @NameInMap("users")
    public java.util.List<UserInfo> users;

    // 是否支持删除
    @NameInMap("delete_enable")
    public Boolean deleteEnable;

    public static InstitutionVO build(java.util.Map<String, ?> map) throws Exception {
        InstitutionVO self = new InstitutionVO();
        return TeaModel.build(map, self);
    }

    public InstitutionVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public InstitutionVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InstitutionVO setAbout(String about) {
        this.about = about;
        return this;
    }
    public String getAbout() {
        return this.about;
    }

    public InstitutionVO setHomePage(String homePage) {
        this.homePage = homePage;
        return this;
    }
    public String getHomePage() {
        return this.homePage;
    }

    public InstitutionVO setContacts(java.util.List<InstitutionContactInfo> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<InstitutionContactInfo> getContacts() {
        return this.contacts;
    }

    public InstitutionVO setTypes(java.util.List<InstitutionType> types) {
        this.types = types;
        return this;
    }
    public java.util.List<InstitutionType> getTypes() {
        return this.types;
    }

    public InstitutionVO setUsers(java.util.List<UserInfo> users) {
        this.users = users;
        return this;
    }
    public java.util.List<UserInfo> getUsers() {
        return this.users;
    }

    public InstitutionVO setDeleteEnable(Boolean deleteEnable) {
        this.deleteEnable = deleteEnable;
        return this;
    }
    public Boolean getDeleteEnable() {
        return this.deleteEnable;
    }

}
