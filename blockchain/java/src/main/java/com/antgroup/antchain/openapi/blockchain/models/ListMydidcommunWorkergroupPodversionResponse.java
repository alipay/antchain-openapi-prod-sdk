// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListMydidcommunWorkergroupPodversionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 版本列表
    @NameInMap("data")
    public String data;

    public static ListMydidcommunWorkergroupPodversionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMydidcommunWorkergroupPodversionResponse self = new ListMydidcommunWorkergroupPodversionResponse();
        return TeaModel.build(map, self);
    }

    public ListMydidcommunWorkergroupPodversionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListMydidcommunWorkergroupPodversionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMydidcommunWorkergroupPodversionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListMydidcommunWorkergroupPodversionResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
