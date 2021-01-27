// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetStsActorResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 虚拟身份受信关系集合，通常只包含一个
    @NameInMap("bindings")
    public java.util.List<StsActorBinding> bindings;

    // 针对虚拟身份的描述
    @NameInMap("description")
    public String description;

    // 虚拟身份ID
    @NameInMap("id")
    public String id;

    // 虚拟身份名称，租户内唯一
    @NameInMap("name")
    public String name;

    // 虚拟身份所在租户
    @NameInMap("tenant")
    public String tenant;

    public static GetStsActorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStsActorResponse self = new GetStsActorResponse();
        return TeaModel.build(map, self);
    }

    public GetStsActorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetStsActorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetStsActorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetStsActorResponse setBindings(java.util.List<StsActorBinding> bindings) {
        this.bindings = bindings;
        return this;
    }
    public java.util.List<StsActorBinding> getBindings() {
        return this.bindings;
    }

    public GetStsActorResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetStsActorResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetStsActorResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetStsActorResponse setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
