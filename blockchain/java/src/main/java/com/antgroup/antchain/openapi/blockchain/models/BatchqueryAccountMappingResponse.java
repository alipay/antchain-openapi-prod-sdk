// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchqueryAccountMappingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回查询的数据
    @NameInMap("data")
    public QueryMappingBatchResult data;

    public static BatchqueryAccountMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryAccountMappingResponse self = new BatchqueryAccountMappingResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryAccountMappingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryAccountMappingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryAccountMappingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryAccountMappingResponse setData(QueryMappingBatchResult data) {
        this.data = data;
        return this;
    }
    public QueryMappingBatchResult getData() {
        return this.data;
    }

}
