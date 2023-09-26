// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ListChaininsightAssetinterfacesrequiredResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果
    @NameInMap("result")
    public java.util.List<ChainInsightContractInterface> result;

    public static ListChaininsightAssetinterfacesrequiredResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChaininsightAssetinterfacesrequiredResponse self = new ListChaininsightAssetinterfacesrequiredResponse();
        return TeaModel.build(map, self);
    }

    public ListChaininsightAssetinterfacesrequiredResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListChaininsightAssetinterfacesrequiredResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListChaininsightAssetinterfacesrequiredResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListChaininsightAssetinterfacesrequiredResponse setResult(java.util.List<ChainInsightContractInterface> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ChainInsightContractInterface> getResult() {
        return this.result;
    }

}
