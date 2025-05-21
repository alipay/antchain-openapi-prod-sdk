// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dog.models;

import com.aliyun.tea.*;

public class QueryWorkbenchTestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // OK
    @NameInMap("stauts")
    public String stauts;

    // SUCCESS le
    @NameInMap("msg")
    public String msg;

    // copy
    @NameInMap("init_desc")
    public String initDesc;

    // 组合返回请求结果
    @NameInMap("init_pack")
    public InitPack initPack;

    public static QueryWorkbenchTestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkbenchTestResponse self = new QueryWorkbenchTestResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorkbenchTestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWorkbenchTestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWorkbenchTestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWorkbenchTestResponse setStauts(String stauts) {
        this.stauts = stauts;
        return this;
    }
    public String getStauts() {
        return this.stauts;
    }

    public QueryWorkbenchTestResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryWorkbenchTestResponse setInitDesc(String initDesc) {
        this.initDesc = initDesc;
        return this;
    }
    public String getInitDesc() {
        return this.initDesc;
    }

    public QueryWorkbenchTestResponse setInitPack(InitPack initPack) {
        this.initPack = initPack;
        return this;
    }
    public InitPack getInitPack() {
        return this.initPack;
    }

}
