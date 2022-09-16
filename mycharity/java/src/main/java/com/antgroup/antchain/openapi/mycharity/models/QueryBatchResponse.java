// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class QueryBatchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批次详情
    @NameInMap("batch_detail_vo")
    public BatchDetailVO batchDetailVo;

    public static QueryBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchResponse self = new QueryBatchResponse();
        return TeaModel.build(map, self);
    }

    public QueryBatchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBatchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBatchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBatchResponse setBatchDetailVo(BatchDetailVO batchDetailVo) {
        this.batchDetailVo = batchDetailVo;
        return this;
    }
    public BatchDetailVO getBatchDetailVo() {
        return this.batchDetailVo;
    }

}
