// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecDidAccesscontrolUpdateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起请求的did
    @NameInMap("fromdid")
    @Validation(required = true)
    public String fromdid;

    // 发起者私钥对其他字段的签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 被更新权限的did
    @NameInMap("todid")
    @Validation(required = true)
    public String todid;

    // 更新后的权限
    @NameInMap("type")
    @Validation(required = true)
    public java.util.List<String> type;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static ExecDidAccesscontrolUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDidAccesscontrolUpdateRequest self = new ExecDidAccesscontrolUpdateRequest();
        return TeaModel.build(map, self);
    }

    public ExecDidAccesscontrolUpdateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecDidAccesscontrolUpdateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecDidAccesscontrolUpdateRequest setFromdid(String fromdid) {
        this.fromdid = fromdid;
        return this;
    }
    public String getFromdid() {
        return this.fromdid;
    }

    public ExecDidAccesscontrolUpdateRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public ExecDidAccesscontrolUpdateRequest setTodid(String todid) {
        this.todid = todid;
        return this;
    }
    public String getTodid() {
        return this.todid;
    }

    public ExecDidAccesscontrolUpdateRequest setType(java.util.List<String> type) {
        this.type = type;
        return this;
    }
    public java.util.List<String> getType() {
        return this.type;
    }

    public ExecDidAccesscontrolUpdateRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
