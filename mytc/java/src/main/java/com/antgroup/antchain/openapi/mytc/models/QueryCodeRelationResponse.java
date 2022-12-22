// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryCodeRelationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总历史记录条数
    @NameInMap("total")
    public Long total;

    // 溯源码关联信息列表
    @NameInMap("data")
    public java.util.List<CodeRelationInfo> data;

    public static QueryCodeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCodeRelationResponse self = new QueryCodeRelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryCodeRelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCodeRelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCodeRelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCodeRelationResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryCodeRelationResponse setData(java.util.List<CodeRelationInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CodeRelationInfo> getData() {
        return this.data;
    }

}
