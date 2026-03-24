// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ydindustry.models;

import com.aliyun.tea.*;

public class BatchqueryRetailScoreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求流水号
    @NameInMap("trans_no")
    public String transNo;

    // 评分对象
    @NameInMap("result_list")
    public java.util.List<RetailScore> resultList;

    public static BatchqueryRetailScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryRetailScoreResponse self = new BatchqueryRetailScoreResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryRetailScoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryRetailScoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryRetailScoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryRetailScoreResponse setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }
    public String getTransNo() {
        return this.transNo;
    }

    public BatchqueryRetailScoreResponse setResultList(java.util.List<RetailScore> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<RetailScore> getResultList() {
        return this.resultList;
    }

}
