// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class QueryWarehouseDeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备信息
    @NameInMap("device_list")
    public java.util.List<DeviceInfo> deviceList;

    public static QueryWarehouseDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWarehouseDeviceResponse self = new QueryWarehouseDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryWarehouseDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWarehouseDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWarehouseDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWarehouseDeviceResponse setDeviceList(java.util.List<DeviceInfo> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<DeviceInfo> getDeviceList() {
        return this.deviceList;
    }

}
