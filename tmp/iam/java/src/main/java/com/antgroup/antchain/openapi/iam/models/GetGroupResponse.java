// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetGroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 成员组ID
    @NameInMap("id")
    public String id;

    // 名称
    @NameInMap("name")
    public String name;

    // 描述
    @NameInMap("description")
    public String description;

    public static GetGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupResponse self = new GetGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetGroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetGroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetGroupResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetGroupResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetGroupResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
