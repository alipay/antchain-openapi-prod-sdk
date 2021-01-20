// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListAppFavouriteResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

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
