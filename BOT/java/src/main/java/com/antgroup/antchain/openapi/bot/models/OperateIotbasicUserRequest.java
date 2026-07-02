// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作用户集合
    @NameInMap("user_list")
    @Validation(required = true)
    public java.util.List<IotBasicUserRequest> userList;

    // 要开通的角色
    @NameInMap("iot_role")
    public String iotRole;

    // 操作类型
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 操作人
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 参数签名校验
    @NameInMap("param_sign")
    public String paramSign;

    public static OperateIotbasicUserRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicUserRequest self = new OperateIotbasicUserRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicUserRequest setUserList(java.util.List<IotBasicUserRequest> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<IotBasicUserRequest> getUserList() {
        return this.userList;
    }

    public OperateIotbasicUserRequest setIotRole(String iotRole) {
        this.iotRole = iotRole;
        return this;
    }
    public String getIotRole() {
        return this.iotRole;
    }

    public OperateIotbasicUserRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OperateIotbasicUserRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public OperateIotbasicUserRequest setParamSign(String paramSign) {
        this.paramSign = paramSign;
        return this;
    }
    public String getParamSign() {
        return this.paramSign;
    }

}
