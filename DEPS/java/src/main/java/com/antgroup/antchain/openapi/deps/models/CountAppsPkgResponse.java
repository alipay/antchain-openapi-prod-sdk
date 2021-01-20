// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CountAppsPkgResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用包个数，键为应用ID，值为对应包个数
    @NameInMap("data")
    public java.util.List<Pair> data;

    public static CountAppsPkgResponse build(java.util.Map<String, ?> map) throws Exception {
        CountAppsPkgResponse self = new CountAppsPkgResponse();
        return TeaModel.build(map, self);
    }

    public CountAppsPkgResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountAppsPkgResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountAppsPkgResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountAppsPkgResponse setData(java.util.List<Pair> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Pair> getData() {
        return this.data;
    }

}
