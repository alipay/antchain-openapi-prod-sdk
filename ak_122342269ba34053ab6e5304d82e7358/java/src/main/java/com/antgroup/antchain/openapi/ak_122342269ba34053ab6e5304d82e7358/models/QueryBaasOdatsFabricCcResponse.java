// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class QueryBaasOdatsFabricCcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 合约内容
    @NameInMap("chaincode")
    public String chaincode;

    public static QueryBaasOdatsFabricCcResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasOdatsFabricCcResponse self = new QueryBaasOdatsFabricCcResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasOdatsFabricCcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasOdatsFabricCcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasOdatsFabricCcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasOdatsFabricCcResponse setChaincode(String chaincode) {
        this.chaincode = chaincode;
        return this;
    }
    public String getChaincode() {
        return this.chaincode;
    }

}
