// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class QueryInfosecHoloxcontentcheckqueryserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回回调结果
    @NameInMap("data")
    public InfoSecContentQueryResult data;

    public static QueryInfosecHoloxcontentcheckqueryserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInfosecHoloxcontentcheckqueryserviceResponse self = new QueryInfosecHoloxcontentcheckqueryserviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryInfosecHoloxcontentcheckqueryserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInfosecHoloxcontentcheckqueryserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInfosecHoloxcontentcheckqueryserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInfosecHoloxcontentcheckqueryserviceResponse setData(InfoSecContentQueryResult data) {
        this.data = data;
        return this;
    }
    public InfoSecContentQueryResult getData() {
        return this.data;
    }

}
