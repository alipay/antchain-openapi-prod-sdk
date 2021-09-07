// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DescribeAcarReductionemissionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 减排情况列表
    @NameInMap("list")
    public java.util.List<EmissionsReductionStatistics> list;

    public static DescribeAcarReductionemissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcarReductionemissionsResponse self = new DescribeAcarReductionemissionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAcarReductionemissionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeAcarReductionemissionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAcarReductionemissionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeAcarReductionemissionsResponse setList(java.util.List<EmissionsReductionStatistics> list) {
        this.list = list;
        return this;
    }
    public java.util.List<EmissionsReductionStatistics> getList() {
        return this.list;
    }

}
