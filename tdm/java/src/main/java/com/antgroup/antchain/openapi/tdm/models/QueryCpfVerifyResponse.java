// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class QueryCpfVerifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核身结果
    @NameInMap("verify_vo")
    public TdmVerifyLogVO verifyVo;

    public static QueryCpfVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCpfVerifyResponse self = new QueryCpfVerifyResponse();
        return TeaModel.build(map, self);
    }

    public QueryCpfVerifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCpfVerifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCpfVerifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCpfVerifyResponse setVerifyVo(TdmVerifyLogVO verifyVo) {
        this.verifyVo = verifyVo;
        return this;
    }
    public TdmVerifyLogVO getVerifyVo() {
        return this.verifyVo;
    }

}
