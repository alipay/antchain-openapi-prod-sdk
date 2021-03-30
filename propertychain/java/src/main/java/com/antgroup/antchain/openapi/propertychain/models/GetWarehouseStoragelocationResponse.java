// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class GetWarehouseStoragelocationResponse extends TeaModel {
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

    public static GetWarehouseStoragelocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWarehouseStoragelocationResponse self = new GetWarehouseStoragelocationResponse();
        return TeaModel.build(map, self);
    }

    public GetWarehouseStoragelocationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetWarehouseStoragelocationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetWarehouseStoragelocationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetWarehouseStoragelocationResponse setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public StorageLocation getStorageLocation() {
        return this.storageLocation;
    }

}
