// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppportraitAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用名称列表数据
    @NameInMap("data")
    public java.util.List<AppPortraitAppList> data;

    public static ListAppportraitAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppportraitAppResponse self = new ListAppportraitAppResponse();
        return TeaModel.build(map, self);
    }

    public ListAppportraitAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppportraitAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppportraitAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppportraitAppResponse setData(java.util.List<AppPortraitAppList> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppPortraitAppList> getData() {
        return this.data;
    }

}
