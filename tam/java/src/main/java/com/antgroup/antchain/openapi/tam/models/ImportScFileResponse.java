// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class ImportScFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    //  
    @NameInMap("data")
    public Upload data;

    public static ImportScFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportScFileResponse self = new ImportScFileResponse();
        return TeaModel.build(map, self);
    }

    public ImportScFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportScFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportScFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportScFileResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportScFileResponse setData(Upload data) {
        this.data = data;
        return this;
    }
    public Upload getData() {
        return this.data;
    }

}
