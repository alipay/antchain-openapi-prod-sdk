// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class RecognizeOcrFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解析数据结果，对应不同证件
    @NameInMap("parse_data")
    public String parseData;

    public static RecognizeOcrFileResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeOcrFileResponse self = new RecognizeOcrFileResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeOcrFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeOcrFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeOcrFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeOcrFileResponse setParseData(String parseData) {
        this.parseData = parseData;
        return this;
    }
    public String getParseData() {
        return this.parseData;
    }

}
