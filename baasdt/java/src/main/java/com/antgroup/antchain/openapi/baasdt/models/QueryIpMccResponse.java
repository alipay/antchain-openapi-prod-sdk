// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpMccResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // mcc类别列表
    @NameInMap("mcc_list")
    public java.util.List<IPMCC> mccList;

    public static QueryIpMccResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpMccResponse self = new QueryIpMccResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpMccResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpMccResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpMccResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpMccResponse setMccList(java.util.List<IPMCC> mccList) {
        this.mccList = mccList;
        return this;
    }
    public java.util.List<IPMCC> getMccList() {
        return this.mccList;
    }

}
