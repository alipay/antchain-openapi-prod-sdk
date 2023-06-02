// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class CreateDepartmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部门唯一码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 部门名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 部门描述信息
    @NameInMap("description")
    public String description;

    // 父部门 code，如果需要创建根部门，需填：ROOT
    @NameInMap("parent_code")
    @Validation(required = true)
    public String parentCode;

    public static CreateDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDepartmentRequest self = new CreateDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateDepartmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDepartmentRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDepartmentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDepartmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDepartmentRequest setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }
    public String getParentCode() {
        return this.parentCode;
    }

}
