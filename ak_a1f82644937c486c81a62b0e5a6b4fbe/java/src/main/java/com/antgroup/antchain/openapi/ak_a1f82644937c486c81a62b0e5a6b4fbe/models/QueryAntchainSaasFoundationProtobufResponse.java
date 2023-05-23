// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class QueryAntchainSaasFoundationProtobufResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // api probuf信息
    @NameInMap("api_info_list")
    public java.util.List<ApiInfo> apiInfoList;

    public static QueryAntchainSaasFoundationProtobufResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSaasFoundationProtobufResponse self = new QueryAntchainSaasFoundationProtobufResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSaasFoundationProtobufResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainSaasFoundationProtobufResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainSaasFoundationProtobufResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainSaasFoundationProtobufResponse setApiInfoList(java.util.List<ApiInfo> apiInfoList) {
        this.apiInfoList = apiInfoList;
        return this;
    }
    public java.util.List<ApiInfo> getApiInfoList() {
        return this.apiInfoList;
    }

}
