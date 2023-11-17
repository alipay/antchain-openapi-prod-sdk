// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class QueryAntchainPdcpDatasourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询到的指定数据源的信息
    @NameInMap("data")
    public LocalDatasource data;

    public static QueryAntchainPdcpDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainPdcpDatasourceResponse self = new QueryAntchainPdcpDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainPdcpDatasourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainPdcpDatasourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainPdcpDatasourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainPdcpDatasourceResponse setData(LocalDatasource data) {
        this.data = data;
        return this;
    }
    public LocalDatasource getData() {
        return this.data;
    }

}
