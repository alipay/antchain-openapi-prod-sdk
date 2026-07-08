// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCarinfoBriefResponse extends TeaModel {
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
    public CarInfoBrief carInfo;

    public static QueryCarinfoBriefResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCarinfoBriefResponse self = new QueryCarinfoBriefResponse();
        return TeaModel.build(map, self);
    }

    public QueryCarinfoBriefResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCarinfoBriefResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCarinfoBriefResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCarinfoBriefResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

    public QueryCarinfoBriefResponse setCarInfo(CarInfoBrief carInfo) {
        this.carInfo = carInfo;
        return this;
    }
    public CarInfoBrief getCarInfo() {
        return this.carInfo;
    }

}
