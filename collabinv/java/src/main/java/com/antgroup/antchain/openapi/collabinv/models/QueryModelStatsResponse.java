// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryModelStatsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据
    @NameInMap("datas")
    public java.util.List<GwCallDataStats> datas;

    public static QueryModelStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModelStatsResponse self = new QueryModelStatsResponse();
        return TeaModel.build(map, self);
    }

    public QueryModelStatsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryModelStatsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryModelStatsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryModelStatsResponse setDatas(java.util.List<GwCallDataStats> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<GwCallDataStats> getDatas() {
        return this.datas;
    }

}
