// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCarrierNetstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 在网状态结果值
    @NameInMap("tel_network_status")
    public String telNetworkStatus;

    // 运营商类型： CHINA_TELECOM； CHINA_MOBILE； CHINA_UNICOM
    @NameInMap("carrier")
    public String carrier;

    // 扩展信息，为JSONObject。
    // 包含携号转网状态，字段名telNumberTransStatus，字段类型为字符串，字段值示例"1"，描述：1-携号转网 0-未携号转网 2-未知
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryCarrierNetstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCarrierNetstatusResponse self = new QueryCarrierNetstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryCarrierNetstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCarrierNetstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCarrierNetstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCarrierNetstatusResponse setTelNetworkStatus(String telNetworkStatus) {
        this.telNetworkStatus = telNetworkStatus;
        return this;
    }
    public String getTelNetworkStatus() {
        return this.telNetworkStatus;
    }

    public QueryCarrierNetstatusResponse setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public QueryCarrierNetstatusResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
