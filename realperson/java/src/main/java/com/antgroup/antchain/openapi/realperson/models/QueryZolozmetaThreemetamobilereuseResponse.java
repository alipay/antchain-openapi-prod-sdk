// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryZolozmetaThreemetamobilereuseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否二次放号
    @NameInMap("phone_reuse")
    public String phoneReuse;

    // 扩展参数
    @NameInMap("extern_info")
    public String externInfo;

    // 运营商
    @NameInMap("carrier")
    public String carrier;

    public static QueryZolozmetaThreemetamobilereuseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryZolozmetaThreemetamobilereuseResponse self = new QueryZolozmetaThreemetamobilereuseResponse();
        return TeaModel.build(map, self);
    }

    public QueryZolozmetaThreemetamobilereuseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryZolozmetaThreemetamobilereuseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryZolozmetaThreemetamobilereuseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryZolozmetaThreemetamobilereuseResponse setPhoneReuse(String phoneReuse) {
        this.phoneReuse = phoneReuse;
        return this;
    }
    public String getPhoneReuse() {
        return this.phoneReuse;
    }

    public QueryZolozmetaThreemetamobilereuseResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

    public QueryZolozmetaThreemetamobilereuseResponse setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

}
