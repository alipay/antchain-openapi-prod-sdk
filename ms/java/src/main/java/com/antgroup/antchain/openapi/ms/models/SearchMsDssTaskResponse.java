// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SearchMsDssTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("data")
    public java.util.List<Task> data;

    // 请求执行是否成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    public static SearchMsDssTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMsDssTaskResponse self = new SearchMsDssTaskResponse();
        return TeaModel.build(map, self);
    }

    public SearchMsDssTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SearchMsDssTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SearchMsDssTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SearchMsDssTaskResponse setData(java.util.List<Task> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Task> getData() {
        return this.data;
    }

    public SearchMsDssTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
