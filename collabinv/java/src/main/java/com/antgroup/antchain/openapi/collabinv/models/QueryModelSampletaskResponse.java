// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryModelSampletaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务进度
    @NameInMap("progress")
    public String progress;

    // 有输出的时候会有值
    @NameInMap("files")
    public java.util.List<String> files;

    public static QueryModelSampletaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModelSampletaskResponse self = new QueryModelSampletaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryModelSampletaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryModelSampletaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryModelSampletaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryModelSampletaskResponse setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

    public QueryModelSampletaskResponse setFiles(java.util.List<String> files) {
        this.files = files;
        return this;
    }
    public java.util.List<String> getFiles() {
        return this.files;
    }

}
