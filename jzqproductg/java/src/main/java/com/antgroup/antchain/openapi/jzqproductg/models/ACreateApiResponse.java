// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.jzqproductg.models;

import com.aliyun.tea.*;

public class ACreateApiResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回描述
    @NameInMap("initdesc")
    public String initdesc;

    // 结构体组合返回
    @NameInMap("init_park")
    public InitParkDemo initPark;

    public static ACreateApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ACreateApiResponse self = new ACreateApiResponse();
        return TeaModel.build(map, self);
    }

    public ACreateApiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ACreateApiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ACreateApiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ACreateApiResponse setInitdesc(String initdesc) {
        this.initdesc = initdesc;
        return this;
    }
    public String getInitdesc() {
        return this.initdesc;
    }

    public ACreateApiResponse setInitPark(InitParkDemo initPark) {
        this.initPark = initPark;
        return this;
    }
    public InitParkDemo getInitPark() {
        return this.initPark;
    }

}
