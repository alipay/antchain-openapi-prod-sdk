// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class UpdateDepartmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部门唯一码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 部门名称
    @NameInMap("name")
    public String name;

    // 部门描述信息
    @NameInMap("description")
    public String description;

    // 父部们唯一码
    @NameInMap("parent_code")
    public String parentCode;

    public static UpdateDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDepartmentRequest self = new UpdateDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDepartmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDepartmentRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDepartmentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDepartmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDepartmentRequest setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }
    public String getParentCode() {
        return this.parentCode;
    }

}
