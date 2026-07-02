// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicPermissionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作人
    // 
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 角色
    @NameInMap("iot_role")
    public String iotRole;

    // 待添加的权限集合
    @NameInMap("permission_list")
    public java.util.List<IotBasicPermissionData> permissionList;

    // 操作类型
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 绑定权限集合
    @NameInMap("bind_permision")
    public java.util.List<String> bindPermision;

    // 参数签名校验
    @NameInMap("param_sign")
    public String paramSign;

    public static OperateIotbasicPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicPermissionRequest self = new OperateIotbasicPermissionRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicPermissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicPermissionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicPermissionRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public OperateIotbasicPermissionRequest setIotRole(String iotRole) {
        this.iotRole = iotRole;
        return this;
    }
    public String getIotRole() {
        return this.iotRole;
    }

    public OperateIotbasicPermissionRequest setPermissionList(java.util.List<IotBasicPermissionData> permissionList) {
        this.permissionList = permissionList;
        return this;
    }
    public java.util.List<IotBasicPermissionData> getPermissionList() {
        return this.permissionList;
    }

    public OperateIotbasicPermissionRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OperateIotbasicPermissionRequest setBindPermision(java.util.List<String> bindPermision) {
        this.bindPermision = bindPermision;
        return this;
    }
    public java.util.List<String> getBindPermision() {
        return this.bindPermision;
    }

    public OperateIotbasicPermissionRequest setParamSign(String paramSign) {
        this.paramSign = paramSign;
        return this;
    }
    public String getParamSign() {
        return this.paramSign;
    }

}
