// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryPbcNameResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询到的支行信息列表
    @NameInMap("pbc_infos")
    public java.util.List<PbcInfo> pbcInfos;

    // 错误描述
    @NameInMap("error_message")
    public String errorMessage;

    // 结果码
    @NameInMap("code")
    public String code;

    public static QueryPbcNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPbcNameResponse self = new QueryPbcNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryPbcNameResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPbcNameResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPbcNameResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPbcNameResponse setPbcInfos(java.util.List<PbcInfo> pbcInfos) {
        this.pbcInfos = pbcInfos;
        return this;
    }
    public java.util.List<PbcInfo> getPbcInfos() {
        return this.pbcInfos;
    }

    public QueryPbcNameResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPbcNameResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
