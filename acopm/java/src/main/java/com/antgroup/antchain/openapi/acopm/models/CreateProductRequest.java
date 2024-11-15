// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 英文名
    @NameInMap("name_en")
    @Validation(required = true)
    public String nameEn;

    // 中文名
    @NameInMap("name_cn")
    @Validation(required = true)
    public String nameCn;

    // 描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // zoujili.zjl
    @NameInMap("owner_id")
    @Validation(required = true)
    public String ownerId;

    // 成员域账号，用于同步权限
    @NameInMap("member_list")
    public java.util.List<String> memberList;

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateProductRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateProductRequest setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }
    public String getNameEn() {
        return this.nameEn;
    }

    public CreateProductRequest setNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }
    public String getNameCn() {
        return this.nameCn;
    }

    public CreateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateProductRequest setMemberList(java.util.List<String> memberList) {
        this.memberList = memberList;
        return this;
    }
    public java.util.List<String> getMemberList() {
        return this.memberList;
    }

}
