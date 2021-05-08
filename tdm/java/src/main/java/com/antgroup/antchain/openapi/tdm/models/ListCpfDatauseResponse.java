// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ListCpfDatauseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 机构用数记录
    @NameInMap("use_records")
    public java.util.List<CpfDataUsageLogVO> useRecords;

    public static ListCpfDatauseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCpfDatauseResponse self = new ListCpfDatauseResponse();
        return TeaModel.build(map, self);
    }

    public ListCpfDatauseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCpfDatauseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCpfDatauseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCpfDatauseResponse setUseRecords(java.util.List<CpfDataUsageLogVO> useRecords) {
        this.useRecords = useRecords;
        return this;
    }
    public java.util.List<CpfDataUsageLogVO> getUseRecords() {
        return this.useRecords;
    }

}
