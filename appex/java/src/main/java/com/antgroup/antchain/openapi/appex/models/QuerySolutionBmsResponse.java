// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QuerySolutionBmsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 合约oss存储url
    @NameInMap("temp_contract_url")
    public String tempContractUrl;

    public static QuerySolutionBmsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionBmsResponse self = new QuerySolutionBmsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySolutionBmsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySolutionBmsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySolutionBmsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySolutionBmsResponse setTempContractUrl(String tempContractUrl) {
        this.tempContractUrl = tempContractUrl;
        return this;
    }
    public String getTempContractUrl() {
        return this.tempContractUrl;
    }

}
