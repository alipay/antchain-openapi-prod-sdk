// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryDevicestatisticsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备实时统计
    @NameInMap("data_list")
    public java.util.List<DeviceStatistics> dataList;

    public static QueryDevicestatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicestatisticsResponse self = new QueryDevicestatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicestatisticsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDevicestatisticsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDevicestatisticsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDevicestatisticsResponse setDataList(java.util.List<DeviceStatistics> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DeviceStatistics> getDataList() {
        return this.dataList;
    }

}
