// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ListDigitalkeyRentaltripResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总条数
    @NameInMap("total")
    public Long total;

    // 行程列表信息
    @NameInMap("trip_list")
    public java.util.List<TripInfo> tripList;

    public static ListDigitalkeyRentaltripResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalkeyRentaltripResponse self = new ListDigitalkeyRentaltripResponse();
        return TeaModel.build(map, self);
    }

    public ListDigitalkeyRentaltripResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDigitalkeyRentaltripResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDigitalkeyRentaltripResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDigitalkeyRentaltripResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListDigitalkeyRentaltripResponse setTripList(java.util.List<TripInfo> tripList) {
        this.tripList = tripList;
        return this;
    }
    public java.util.List<TripInfo> getTripList() {
        return this.tripList;
    }

}
