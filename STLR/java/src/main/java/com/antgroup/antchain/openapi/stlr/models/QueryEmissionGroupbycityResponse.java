// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEmissionGroupbycityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 按城市分组统计的碳排放量列表
    @NameInMap("list")
    public java.util.List<EmissionsCityStatistics> list;

    public static QueryEmissionGroupbycityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmissionGroupbycityResponse self = new QueryEmissionGroupbycityResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmissionGroupbycityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEmissionGroupbycityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEmissionGroupbycityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEmissionGroupbycityResponse setList(java.util.List<EmissionsCityStatistics> list) {
        this.list = list;
        return this;
    }
    public java.util.List<EmissionsCityStatistics> getList() {
        return this.list;
    }

}
