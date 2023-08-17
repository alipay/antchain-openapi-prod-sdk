// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class QueryItagAntitagTaskDownloadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // requestid
    @NameInMap("requestid")
    public String requestid;

    // code
    @NameInMap("code")
    public String code;

    // msg
    @NameInMap("msg")
    public String msg;

    // succ
    @NameInMap("succ")
    public String succ;

    // errinfo
    @NameInMap("errinfo")
    public String errinfo;

    // runret
    @NameInMap("runret")
    public RunRet runret;

    public static QueryItagAntitagTaskDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItagAntitagTaskDownloadResponse self = new QueryItagAntitagTaskDownloadResponse();
        return TeaModel.build(map, self);
    }

    public QueryItagAntitagTaskDownloadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryItagAntitagTaskDownloadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryItagAntitagTaskDownloadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryItagAntitagTaskDownloadResponse setRequestid(String requestid) {
        this.requestid = requestid;
        return this;
    }
    public String getRequestid() {
        return this.requestid;
    }

    public QueryItagAntitagTaskDownloadResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItagAntitagTaskDownloadResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryItagAntitagTaskDownloadResponse setSucc(String succ) {
        this.succ = succ;
        return this;
    }
    public String getSucc() {
        return this.succ;
    }

    public QueryItagAntitagTaskDownloadResponse setErrinfo(String errinfo) {
        this.errinfo = errinfo;
        return this;
    }
    public String getErrinfo() {
        return this.errinfo;
    }

    public QueryItagAntitagTaskDownloadResponse setRunret(RunRet runret) {
        this.runret = runret;
        return this;
    }
    public RunRet getRunret() {
        return this.runret;
    }

}
