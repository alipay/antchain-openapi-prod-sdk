// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecDidAccesscontrolCheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起鉴权请求的did
    @NameInMap("fromdid")
    @Validation(required = true)
    public String fromdid;

    // 发起者用私钥对请求其他字段的签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 被鉴定权限的did
    @NameInMap("todid")
    @Validation(required = true)
    public String todid;

    // 鉴定的权限类别
    @NameInMap("type")
    @Validation(required = true)
    public java.util.List<String> type;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static ExecDidAccesscontrolCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDidAccesscontrolCheckRequest self = new ExecDidAccesscontrolCheckRequest();
        return TeaModel.build(map, self);
    }

    public ExecDidAccesscontrolCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecDidAccesscontrolCheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecDidAccesscontrolCheckRequest setFromdid(String fromdid) {
        this.fromdid = fromdid;
        return this;
    }
    public String getFromdid() {
        return this.fromdid;
    }

    public ExecDidAccesscontrolCheckRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public ExecDidAccesscontrolCheckRequest setTodid(String todid) {
        this.todid = todid;
        return this;
    }
    public String getTodid() {
        return this.todid;
    }

    public ExecDidAccesscontrolCheckRequest setType(java.util.List<String> type) {
        this.type = type;
        return this;
    }
    public java.util.List<String> getType() {
        return this.type;
    }

    public ExecDidAccesscontrolCheckRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
