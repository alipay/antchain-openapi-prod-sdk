// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCarinfoDetailResponse extends TeaModel {
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
    @NameInMap("extern_info")
    public String externInfo;

    // 车辆信息
    @NameInMap("car_info")
    public CarInfoDetail carInfo;

    public static QueryCarinfoDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCarinfoDetailResponse self = new QueryCarinfoDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryCarinfoDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCarinfoDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCarinfoDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCarinfoDetailResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

    public QueryCarinfoDetailResponse setCarInfo(CarInfoDetail carInfo) {
        this.carInfo = carInfo;
        return this;
    }
    public CarInfoDetail getCarInfo() {
        return this.carInfo;
    }

}
