// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class ExportItagAntitagTaskDownloadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // RequestId
    @NameInMap("requestid")
    public String requestid;

    // Succ
    @NameInMap("succ")
    public String succ;

    // Code
    @NameInMap("code")
    public String code;

    // Msg
    @NameInMap("msg")
    public String msg;

    // errinfo
    @NameInMap("errinfo")
    public String errinfo;

    // result
    @NameInMap("result")
    public DownloadMarkResult result;

    public static ExportItagAntitagTaskDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportItagAntitagTaskDownloadResponse self = new ExportItagAntitagTaskDownloadResponse();
        return TeaModel.build(map, self);
    }

    public ExportItagAntitagTaskDownloadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExportItagAntitagTaskDownloadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExportItagAntitagTaskDownloadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExportItagAntitagTaskDownloadResponse setRequestid(String requestid) {
        this.requestid = requestid;
        return this;
    }
    public String getRequestid() {
        return this.requestid;
    }

    public ExportItagAntitagTaskDownloadResponse setSucc(String succ) {
        this.succ = succ;
        return this;
    }
    public String getSucc() {
        return this.succ;
    }

    public ExportItagAntitagTaskDownloadResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportItagAntitagTaskDownloadResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ExportItagAntitagTaskDownloadResponse setErrinfo(String errinfo) {
        this.errinfo = errinfo;
        return this;
    }
    public String getErrinfo() {
        return this.errinfo;
    }

    public ExportItagAntitagTaskDownloadResponse setResult(DownloadMarkResult result) {
        this.result = result;
        return this;
    }
    public DownloadMarkResult getResult() {
        return this.result;
    }

}
