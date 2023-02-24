// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class CheckApplicationHascarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否有车，true：有车；false：无车
    @NameInMap("has_car")
    public Boolean hasCar;

    public static CheckApplicationHascarResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckApplicationHascarResponse self = new CheckApplicationHascarResponse();
        return TeaModel.build(map, self);
    }

    public CheckApplicationHascarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckApplicationHascarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckApplicationHascarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckApplicationHascarResponse setHasCar(Boolean hasCar) {
        this.hasCar = hasCar;
        return this;
    }
    public Boolean getHasCar() {
        return this.hasCar;
    }

}
