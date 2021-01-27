// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class CreateServiceaccountResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 服务账号AK
    @NameInMap("access_key")
    public String accessKey;

    // 服务账号SK
    @NameInMap("access_secret")
    public String accessSecret;

    // 服务账号别名
    @NameInMap("alias")
    public String alias;

    // 服务账号描述
    @NameInMap("description")
    public String description;

    // 服务账号ID
    @NameInMap("id")
    public String id;

    // 服务账号名称
    @NameInMap("name")
    public String name;

    // 服务账号所属租户
    @NameInMap("tenant")
    public String tenant;

    public static CreateServiceaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceaccountResponse self = new CreateServiceaccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateServiceaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateServiceaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateServiceaccountResponse setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public CreateServiceaccountResponse setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public CreateServiceaccountResponse setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateServiceaccountResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateServiceaccountResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateServiceaccountResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateServiceaccountResponse setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
