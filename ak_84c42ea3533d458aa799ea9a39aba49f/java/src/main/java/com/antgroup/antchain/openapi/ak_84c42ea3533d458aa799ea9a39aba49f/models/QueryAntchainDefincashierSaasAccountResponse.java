// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_84c42ea3533d458aa799ea9a39aba49f.models;

import com.aliyun.tea.*;

public class QueryAntchainDefincashierSaasAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账户查询结果
    @NameInMap("data")
    public AccountQueryResult data;

    public static QueryAntchainDefincashierSaasAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDefincashierSaasAccountResponse self = new QueryAntchainDefincashierSaasAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDefincashierSaasAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDefincashierSaasAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDefincashierSaasAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDefincashierSaasAccountResponse setData(AccountQueryResult data) {
        this.data = data;
        return this;
    }
    public AccountQueryResult getData() {
        return this.data;
    }

}
