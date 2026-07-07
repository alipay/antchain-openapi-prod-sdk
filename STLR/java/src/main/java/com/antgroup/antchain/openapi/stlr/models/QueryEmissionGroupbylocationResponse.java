// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEmissionGroupbylocationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 按照排放单元分组统计的碳排放量列表
    @NameInMap("list")
    public java.util.List<EmissionsLocationStatistics> list;

    public static QueryEmissionGroupbylocationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmissionGroupbylocationResponse self = new QueryEmissionGroupbylocationResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmissionGroupbylocationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEmissionGroupbylocationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEmissionGroupbylocationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEmissionGroupbylocationResponse setList(java.util.List<EmissionsLocationStatistics> list) {
        this.list = list;
        return this;
    }
    public java.util.List<EmissionsLocationStatistics> getList() {
        return this.list;
    }

}
