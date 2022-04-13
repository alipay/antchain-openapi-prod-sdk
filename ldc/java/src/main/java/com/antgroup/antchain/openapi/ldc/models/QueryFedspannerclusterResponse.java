// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFedspannerclusterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询集群列表时的简略信息
    @NameInMap("data")
    public java.util.List<QuerySpannerClusterDetail> data;

    public static QueryFedspannerclusterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFedspannerclusterResponse self = new QueryFedspannerclusterResponse();
        return TeaModel.build(map, self);
    }

    public QueryFedspannerclusterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFedspannerclusterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFedspannerclusterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFedspannerclusterResponse setData(java.util.List<QuerySpannerClusterDetail> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySpannerClusterDetail> getData() {
        return this.data;
    }

}
