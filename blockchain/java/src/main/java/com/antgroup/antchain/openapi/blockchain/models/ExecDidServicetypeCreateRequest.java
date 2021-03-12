// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecDidServicetypeCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起该交易的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 创建服务类型
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 新增服务类型的定义Json 字符串
    // {
    //   "@context": {
    //     "version": 1,
    //     "id": "{ServiceTypeName}", //<- 50 Byte
    //     "type": "ServiceType", //<- 固定值
    //     "serviceInput": "", //<- 入参描述
    //     "serviceOutput": "", //<- 出参描述
    //     "accessMode": "", //<- 访问模式
    //     "description": "" //<- 服务描述
    //   },
    //    "controller": "{Creator`s did}" // <- 创建者did，只有该创建者才能修改服务类型定义
    // }
    @NameInMap("payload")
    @Validation(required = true)
    public String payload;

    // 使用私钥对消息中其他字段进行签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static ExecDidServicetypeCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDidServicetypeCreateRequest self = new ExecDidServicetypeCreateRequest();
        return TeaModel.build(map, self);
    }

    public ExecDidServicetypeCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecDidServicetypeCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecDidServicetypeCreateRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public ExecDidServicetypeCreateRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ExecDidServicetypeCreateRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public ExecDidServicetypeCreateRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public ExecDidServicetypeCreateRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
