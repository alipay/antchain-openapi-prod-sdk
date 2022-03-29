// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteXdashboardResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 删除成功资源列表
    @NameInMap("data")
    public java.util.List<XResource> data;

    public static DeleteXdashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteXdashboardResponse self = new DeleteXdashboardResponse();
        return TeaModel.build(map, self);
    }

    public DeleteXdashboardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteXdashboardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteXdashboardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteXdashboardResponse setData(java.util.List<XResource> data) {
        this.data = data;
        return this;
    }
    public java.util.List<XResource> getData() {
        return this.data;
    }

}
