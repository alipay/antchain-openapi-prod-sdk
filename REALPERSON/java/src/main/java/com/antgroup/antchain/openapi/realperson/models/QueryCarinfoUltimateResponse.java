// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCarinfoUltimateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 扩展信息，为JSONObject。
    // 
    @NameInMap("extern_info")
    public String externInfo;

    //  用户名下车辆数量，格式：1，2，3...
    @NameInMap("amont")
    public String amont;

    // 车辆信息
    @NameInMap("car_infos")
    public java.util.List<CarInfo> carInfos;

    public static QueryCarinfoUltimateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCarinfoUltimateResponse self = new QueryCarinfoUltimateResponse();
        return TeaModel.build(map, self);
    }

    public QueryCarinfoUltimateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCarinfoUltimateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCarinfoUltimateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCarinfoUltimateResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

    public QueryCarinfoUltimateResponse setAmont(String amont) {
        this.amont = amont;
        return this;
    }
    public String getAmont() {
        return this.amont;
    }

    public QueryCarinfoUltimateResponse setCarInfos(java.util.List<CarInfo> carInfos) {
        this.carInfos = carInfos;
        return this;
    }
    public java.util.List<CarInfo> getCarInfos() {
        return this.carInfos;
    }

}
