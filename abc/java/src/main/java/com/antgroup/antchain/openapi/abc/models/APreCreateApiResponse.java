// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class APreCreateApiResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跟新后的info
    @NameInMap("upd_info")
    public String updInfo;

    // 组合返回请求结果
    @NameInMap("upd_park")
    public InitParks updPark;

    public static APreCreateApiResponse build(java.util.Map<String, ?> map) throws Exception {
        APreCreateApiResponse self = new APreCreateApiResponse();
        return TeaModel.build(map, self);
    }

    public APreCreateApiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public APreCreateApiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public APreCreateApiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public APreCreateApiResponse setUpdInfo(String updInfo) {
        this.updInfo = updInfo;
        return this;
    }
    public String getUpdInfo() {
        return this.updInfo;
    }

    public APreCreateApiResponse setUpdPark(InitParks updPark) {
        this.updPark = updPark;
        return this;
    }
    public InitParks getUpdPark() {
        return this.updPark;
    }

}
