// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgApprelationsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用关系数据
    @NameInMap("graph_data")
    public String graphData;

    public static QuerySgApprelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySgApprelationsResponse self = new QuerySgApprelationsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySgApprelationsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySgApprelationsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySgApprelationsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySgApprelationsResponse setGraphData(String graphData) {
        this.graphData = graphData;
        return this;
    }
    public String getGraphData() {
        return this.graphData;
    }

}
