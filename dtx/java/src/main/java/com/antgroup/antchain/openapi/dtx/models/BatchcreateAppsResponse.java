// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class BatchcreateAppsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 编辑后的应用信息
    @NameInMap("data")
    public AppInfoVO data;

    public static BatchcreateAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateAppsResponse self = new BatchcreateAppsResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateAppsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateAppsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateAppsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateAppsResponse setData(AppInfoVO data) {
        this.data = data;
        return this;
    }
    public AppInfoVO getData() {
        return this.data;
    }

}
