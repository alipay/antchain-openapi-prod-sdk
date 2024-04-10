// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryOnlinepressuretestDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实体上链数据列表
    @NameInMap("entity_chain_data_list")
    public java.util.List<EntityChainData> entityChainDataList;

    public static QueryOnlinepressuretestDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOnlinepressuretestDataResponse self = new QueryOnlinepressuretestDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryOnlinepressuretestDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOnlinepressuretestDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOnlinepressuretestDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOnlinepressuretestDataResponse setEntityChainDataList(java.util.List<EntityChainData> entityChainDataList) {
        this.entityChainDataList = entityChainDataList;
        return this;
    }
    public java.util.List<EntityChainData> getEntityChainDataList() {
        return this.entityChainDataList;
    }

}
