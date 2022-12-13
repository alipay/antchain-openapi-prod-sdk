// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_84c42ea3533d458aa799ea9a39aba49f.models;

import com.aliyun.tea.*;

public class QueryAntchainDefincashierSaasFunditemResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资金操作明细查询结果
    @NameInMap("data")
    public FundItemQueryResult data;

    public static QueryAntchainDefincashierSaasFunditemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDefincashierSaasFunditemResponse self = new QueryAntchainDefincashierSaasFunditemResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDefincashierSaasFunditemResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDefincashierSaasFunditemResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDefincashierSaasFunditemResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDefincashierSaasFunditemResponse setData(FundItemQueryResult data) {
        this.data = data;
        return this;
    }
    public FundItemQueryResult getData() {
        return this.data;
    }

}
