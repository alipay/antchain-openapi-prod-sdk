// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryEntityrelationJtdevicebycarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 车辆关联的部标设备列表
    @NameInMap("device_list")
    public java.util.List<JtDevice> deviceList;

    // 所关联车辆实体信息
    @NameInMap("car_entity")
    public RelatedEntity carEntity;

    public static QueryEntityrelationJtdevicebycarResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEntityrelationJtdevicebycarResponse self = new QueryEntityrelationJtdevicebycarResponse();
        return TeaModel.build(map, self);
    }

    public QueryEntityrelationJtdevicebycarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEntityrelationJtdevicebycarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEntityrelationJtdevicebycarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEntityrelationJtdevicebycarResponse setDeviceList(java.util.List<JtDevice> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<JtDevice> getDeviceList() {
        return this.deviceList;
    }

    public QueryEntityrelationJtdevicebycarResponse setCarEntity(RelatedEntity carEntity) {
        this.carEntity = carEntity;
        return this;
    }
    public RelatedEntity getCarEntity() {
        return this.carEntity;
    }

}
