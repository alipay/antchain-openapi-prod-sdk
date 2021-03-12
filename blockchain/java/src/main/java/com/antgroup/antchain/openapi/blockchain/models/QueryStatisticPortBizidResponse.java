// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryStatisticPortBizidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 链授权列表
    @NameInMap("biz_list")
    public java.util.List<MyChainInfo> bizList;

    public static QueryStatisticPortBizidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticPortBizidResponse self = new QueryStatisticPortBizidResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatisticPortBizidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStatisticPortBizidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStatisticPortBizidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStatisticPortBizidResponse setBizList(java.util.List<MyChainInfo> bizList) {
        this.bizList = bizList;
        return this;
    }
    public java.util.List<MyChainInfo> getBizList() {
        return this.bizList;
    }

}
