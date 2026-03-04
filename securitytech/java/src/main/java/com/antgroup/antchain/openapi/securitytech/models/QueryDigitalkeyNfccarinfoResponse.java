// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDigitalkeyNfccarinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页器
    @NameInMap("paginator")
    public Paginator paginator;

    // 车辆信息列表
    @NameInMap("car_info_list")
    public java.util.List<CarInfoVO> carInfoList;

    public static QueryDigitalkeyNfccarinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalkeyNfccarinfoResponse self = new QueryDigitalkeyNfccarinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalkeyNfccarinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDigitalkeyNfccarinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDigitalkeyNfccarinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDigitalkeyNfccarinfoResponse setPaginator(Paginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public Paginator getPaginator() {
        return this.paginator;
    }

    public QueryDigitalkeyNfccarinfoResponse setCarInfoList(java.util.List<CarInfoVO> carInfoList) {
        this.carInfoList = carInfoList;
        return this;
    }
    public java.util.List<CarInfoVO> getCarInfoList() {
        return this.carInfoList;
    }

}
