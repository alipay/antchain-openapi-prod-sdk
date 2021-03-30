// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateWarehouseStoraglocationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 库位id
    @NameInMap("storage_location_id")
    public String storageLocationId;

    public static CreateWarehouseStoraglocationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWarehouseStoraglocationResponse self = new CreateWarehouseStoraglocationResponse();
        return TeaModel.build(map, self);
    }

    public CreateWarehouseStoraglocationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateWarehouseStoraglocationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateWarehouseStoraglocationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateWarehouseStoraglocationResponse setStorageLocationId(String storageLocationId) {
        this.storageLocationId = storageLocationId;
        return this;
    }
    public String getStorageLocationId() {
        return this.storageLocationId;
    }

}
