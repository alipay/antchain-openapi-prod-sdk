// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ListContractmetaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 合约Meta列表
    @NameInMap("metas")
    public java.util.List<ContractMeta> metas;

    public static ListContractmetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContractmetaResponse self = new ListContractmetaResponse();
        return TeaModel.build(map, self);
    }

    public ListContractmetaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListContractmetaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListContractmetaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListContractmetaResponse setMetas(java.util.List<ContractMeta> metas) {
        this.metas = metas;
        return this;
    }
    public java.util.List<ContractMeta> getMetas() {
        return this.metas;
    }

}
