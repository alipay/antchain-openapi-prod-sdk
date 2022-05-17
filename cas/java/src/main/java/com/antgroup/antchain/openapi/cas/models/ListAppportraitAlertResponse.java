// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppportraitAlertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回数据
    @NameInMap("data")
    public java.util.List<AppPortraitAlertList> data;

    public static ListAppportraitAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppportraitAlertResponse self = new ListAppportraitAlertResponse();
        return TeaModel.build(map, self);
    }

    public ListAppportraitAlertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppportraitAlertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppportraitAlertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppportraitAlertResponse setData(java.util.List<AppPortraitAlertList> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppPortraitAlertList> getData() {
        return this.data;
    }

}
