// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class AuthAction extends TeaModel {
    // 权限点编码
    @NameInMap("action_code")
    @Validation(required = true)
    public String actionCode;

    // 权限点名称
    @NameInMap("action_name")
    @Validation(required = true)
    public String actionName;

    // 归属产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 权限点级别
    @NameInMap("action_level")
    @Validation(required = true)
    public Long actionLevel;

    // 是否展示
    @NameInMap("is_show")
    @Validation(required = true)
    public Boolean isShow;

    // 权限点描述信息
    @NameInMap("action_description")
    public String actionDescription;

    // 父权限点编码
    @NameInMap("parent_action_code")
    public String parentActionCode;

    public static AuthAction build(java.util.Map<String, ?> map) throws Exception {
        AuthAction self = new AuthAction();
        return TeaModel.build(map, self);
    }

    public AuthAction setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public AuthAction setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public AuthAction setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AuthAction setActionLevel(Long actionLevel) {
        this.actionLevel = actionLevel;
        return this;
    }
    public Long getActionLevel() {
        return this.actionLevel;
    }

    public AuthAction setIsShow(Boolean isShow) {
        this.isShow = isShow;
        return this;
    }
    public Boolean getIsShow() {
        return this.isShow;
    }

    public AuthAction setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
        return this;
    }
    public String getActionDescription() {
        return this.actionDescription;
    }

    public AuthAction setParentActionCode(String parentActionCode) {
        this.parentActionCode = parentActionCode;
        return this;
    }
    public String getParentActionCode() {
        return this.parentActionCode;
    }

}
