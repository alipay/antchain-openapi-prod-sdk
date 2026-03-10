// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCertificateLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回码
    // 0：成功
    // 1：失败
    // 2：处理中
    // 99：系统异常
    @NameInMap("status")
    public String status;

    // 申请结果描述，失败原因，失败时必传
    @NameInMap("msg")
    public String msg;

    // 文件路径
    // 实时返回文件路径给到乐信，乐信去对应sftp路径上取，路径命名规则：download/2602/loanReqNo_文件类型.pdf
    // 若失败则返回失败原因到msg字段
    @NameInMap("file_path")
    public String filePath;

    public static QueryDubbridgeCertificateLxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCertificateLxResponse self = new QueryDubbridgeCertificateLxResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCertificateLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeCertificateLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeCertificateLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeCertificateLxResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDubbridgeCertificateLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeCertificateLxResponse setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
