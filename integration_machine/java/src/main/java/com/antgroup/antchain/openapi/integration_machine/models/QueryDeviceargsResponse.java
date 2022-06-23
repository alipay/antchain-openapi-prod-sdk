// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryDeviceargsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备参数列表
    @NameInMap("args_name_value_list")
    public java.util.List<ArgsNameValue> argsNameValueList;

    public static QueryDeviceargsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceargsResponse self = new QueryDeviceargsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceargsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDeviceargsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDeviceargsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDeviceargsResponse setArgsNameValueList(java.util.List<ArgsNameValue> argsNameValueList) {
        this.argsNameValueList = argsNameValueList;
        return this;
    }
    public java.util.List<ArgsNameValue> getArgsNameValueList() {
        return this.argsNameValueList;
    }

}
