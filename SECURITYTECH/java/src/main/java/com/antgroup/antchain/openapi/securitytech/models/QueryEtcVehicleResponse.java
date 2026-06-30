// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryEtcVehicleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求方租户所关联的车辆入驻信息
    @NameInMap("etc_vehicle")
    public EtcVehicleInfo etcVehicle;

    // json格式字符串扩展信息，预留字段。
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryEtcVehicleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEtcVehicleResponse self = new QueryEtcVehicleResponse();
        return TeaModel.build(map, self);
    }

    public QueryEtcVehicleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEtcVehicleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEtcVehicleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEtcVehicleResponse setEtcVehicle(EtcVehicleInfo etcVehicle) {
        this.etcVehicle = etcVehicle;
        return this;
    }
    public EtcVehicleInfo getEtcVehicle() {
        return this.etcVehicle;
    }

    public QueryEtcVehicleResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
