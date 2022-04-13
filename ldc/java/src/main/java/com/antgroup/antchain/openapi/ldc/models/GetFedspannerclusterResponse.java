// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetFedspannerclusterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 获取单个联邦 spanner集群详细信息，包含所含的本地集群信息
    @NameInMap("data")
    public GetSpannerClusterDetail data;

    public static GetFedspannerclusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFedspannerclusterResponse self = new GetFedspannerclusterResponse();
        return TeaModel.build(map, self);
    }

    public GetFedspannerclusterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetFedspannerclusterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetFedspannerclusterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetFedspannerclusterResponse setData(GetSpannerClusterDetail data) {
        this.data = data;
        return this;
    }
    public GetSpannerClusterDetail getData() {
        return this.data;
    }

}
