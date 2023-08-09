// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryFoundationProtobufResponse extends TeaModel {
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

    public static QueryFoundationProtobufResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFoundationProtobufResponse self = new QueryFoundationProtobufResponse();
        return TeaModel.build(map, self);
    }

    public QueryFoundationProtobufResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFoundationProtobufResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFoundationProtobufResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFoundationProtobufResponse setApiInfoList(java.util.List<ApiInfo> apiInfoList) {
        this.apiInfoList = apiInfoList;
        return this;
    }
    public java.util.List<ApiInfo> getApiInfoList() {
        return this.apiInfoList;
    }

}
