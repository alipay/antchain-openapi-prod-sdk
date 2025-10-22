// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ListIssuerProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 项目基础信息
    @NameInMap("data")
    public java.util.List<ProjectBaseInfoVo> data;

    public static ListIssuerProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIssuerProjectResponse self = new ListIssuerProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListIssuerProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIssuerProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIssuerProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIssuerProjectResponse setData(java.util.List<ProjectBaseInfoVo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ProjectBaseInfoVo> getData() {
        return this.data;
    }

}
