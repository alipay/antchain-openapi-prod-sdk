// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryThreemetaOnlinetimeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 在网时长标准码，规则：
    // 1: [0,3)表示在⽹时⻓是 0~3 个⽉
    // 2: [3,6)表示在⽹时⻓是 3~6 个⽉
    // 3: [6,12)表示在⽹时⻓是 6~12 个⽉
    // 4: [12,24)表示在⽹时⻓是 12~24 ⽉
    // 5: [24,+)表示在⽹时⻓是 24个⽉及以上
    @NameInMap("length_code")
    public String lengthCode;

    // CHINA_TELECOM：中国电信
    // CHINA_MOBILE：中国移动
    // CHINA_UNICOM：中国联通
    @NameInMap("carrier")
    public String carrier;

    // 扩展信息，json格式
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryThreemetaOnlinetimeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThreemetaOnlinetimeResponse self = new QueryThreemetaOnlinetimeResponse();
        return TeaModel.build(map, self);
    }

    public QueryThreemetaOnlinetimeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryThreemetaOnlinetimeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryThreemetaOnlinetimeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryThreemetaOnlinetimeResponse setLengthCode(String lengthCode) {
        this.lengthCode = lengthCode;
        return this;
    }
    public String getLengthCode() {
        return this.lengthCode;
    }

    public QueryThreemetaOnlinetimeResponse setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public QueryThreemetaOnlinetimeResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
