// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryBankLivenessplusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 银行活跃度详情，可解析为JSONArray。
    @NameInMap("liveness_info")
    public String livenessInfo;

    // 扩展信息，预留字段
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryBankLivenessplusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBankLivenessplusResponse self = new QueryBankLivenessplusResponse();
        return TeaModel.build(map, self);
    }

    public QueryBankLivenessplusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBankLivenessplusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBankLivenessplusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBankLivenessplusResponse setLivenessInfo(String livenessInfo) {
        this.livenessInfo = livenessInfo;
        return this;
    }
    public String getLivenessInfo() {
        return this.livenessInfo;
    }

    public QueryBankLivenessplusResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
