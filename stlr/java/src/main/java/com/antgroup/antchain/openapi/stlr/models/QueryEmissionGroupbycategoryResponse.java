// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEmissionGroupbycategoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 按照排放类型分组统计的排放量结果列表
    @NameInMap("list")
    public java.util.List<EmissionsCategoryStatistics> list;

    public static QueryEmissionGroupbycategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmissionGroupbycategoryResponse self = new QueryEmissionGroupbycategoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmissionGroupbycategoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEmissionGroupbycategoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEmissionGroupbycategoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEmissionGroupbycategoryResponse setList(java.util.List<EmissionsCategoryStatistics> list) {
        this.list = list;
        return this;
    }
    public java.util.List<EmissionsCategoryStatistics> getList() {
        return this.list;
    }

}
