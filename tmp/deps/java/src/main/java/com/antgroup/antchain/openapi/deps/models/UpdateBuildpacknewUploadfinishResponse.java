// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateBuildpacknewUploadfinishResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    public static UpdateBuildpacknewUploadfinishResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBuildpacknewUploadfinishResponse self = new UpdateBuildpacknewUploadfinishResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBuildpacknewUploadfinishResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBuildpacknewUploadfinishResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBuildpacknewUploadfinishResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
