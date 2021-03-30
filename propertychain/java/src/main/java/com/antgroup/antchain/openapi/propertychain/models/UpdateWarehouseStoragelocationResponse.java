// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UpdateWarehouseStoragelocationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 库位信息
    @NameInMap("storage_location")
    public StorageLocation storageLocation;

    public static UpdateWarehouseStoragelocationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarehouseStoragelocationResponse self = new UpdateWarehouseStoragelocationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWarehouseStoragelocationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateWarehouseStoragelocationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateWarehouseStoragelocationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateWarehouseStoragelocationResponse setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public StorageLocation getStorageLocation() {
        return this.storageLocation;
    }

}
