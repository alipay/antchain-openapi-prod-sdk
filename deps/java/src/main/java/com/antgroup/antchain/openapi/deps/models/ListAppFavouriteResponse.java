// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListAppFavouriteResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前用户收藏的所有应用
    @NameInMap("data")
    public java.util.List<App> data;

    public static ListAppFavouriteResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppFavouriteResponse self = new ListAppFavouriteResponse();
        return TeaModel.build(map, self);
    }

    public ListAppFavouriteResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppFavouriteResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppFavouriteResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppFavouriteResponse setData(java.util.List<App> data) {
        this.data = data;
        return this;
    }
    public java.util.List<App> getData() {
        return this.data;
    }

}
