// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateAppGroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 创建的应用分组名称
    @NameInMap("data")
    public String data;

    public static CreateAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupResponse self = new CreateAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAppGroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAppGroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAppGroupResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
