// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class CreateDistributedeviceBydeviceidmulResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可信设备ID集合
    @NameInMap("trustiot_device_id_list")
    public java.util.List<TrustiotDeviceIdMap> trustiotDeviceIdList;

    public static CreateDistributedeviceBydeviceidmulResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributedeviceBydeviceidmulResponse self = new CreateDistributedeviceBydeviceidmulResponse();
        return TeaModel.build(map, self);
    }

    public CreateDistributedeviceBydeviceidmulResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDistributedeviceBydeviceidmulResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDistributedeviceBydeviceidmulResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDistributedeviceBydeviceidmulResponse setTrustiotDeviceIdList(java.util.List<TrustiotDeviceIdMap> trustiotDeviceIdList) {
        this.trustiotDeviceIdList = trustiotDeviceIdList;
        return this;
    }
    public java.util.List<TrustiotDeviceIdMap> getTrustiotDeviceIdList() {
        return this.trustiotDeviceIdList;
    }

}
