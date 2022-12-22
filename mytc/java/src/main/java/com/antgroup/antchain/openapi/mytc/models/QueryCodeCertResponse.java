// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryCodeCertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证内容。
    // 在注册溯源码、溯源码关联信息等接口调用情况下，上链内容会包装加密后上链。
    // 因此返回内容不可读，需要按照指定要求解密读取。
    @NameInMap("content")
    public String content;

    // 链交易信息
    @NameInMap("chain_transaction_info")
    public BlockChainTransactionInfo chainTransactionInfo;

    public static QueryCodeCertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCodeCertResponse self = new QueryCodeCertResponse();
        return TeaModel.build(map, self);
    }

    public QueryCodeCertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCodeCertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCodeCertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCodeCertResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryCodeCertResponse setChainTransactionInfo(BlockChainTransactionInfo chainTransactionInfo) {
        this.chainTransactionInfo = chainTransactionInfo;
        return this;
    }
    public BlockChainTransactionInfo getChainTransactionInfo() {
        return this.chainTransactionInfo;
    }

}
