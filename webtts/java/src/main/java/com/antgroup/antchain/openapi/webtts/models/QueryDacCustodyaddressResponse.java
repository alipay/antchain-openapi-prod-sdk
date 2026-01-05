// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class QueryDacCustodyaddressResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户特定区块链的托管钱包地址，用于deposit转账使用
    @NameInMap("custody_address")
    public String custodyAddress;

    public static QueryDacCustodyaddressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDacCustodyaddressResponse self = new QueryDacCustodyaddressResponse();
        return TeaModel.build(map, self);
    }

    public QueryDacCustodyaddressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDacCustodyaddressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDacCustodyaddressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDacCustodyaddressResponse setCustodyAddress(String custodyAddress) {
        this.custodyAddress = custodyAddress;
        return this;
    }
    public String getCustodyAddress() {
        return this.custodyAddress;
    }

}
