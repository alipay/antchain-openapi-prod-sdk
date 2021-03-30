// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class BatchqueryWarehouseStoragelocationResponse extends TeaModel {
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
    @NameInMap("storage_location_list")
    public java.util.List<StorageLocation> storageLocationList;

    public static BatchqueryWarehouseStoragelocationResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryWarehouseStoragelocationResponse self = new BatchqueryWarehouseStoragelocationResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryWarehouseStoragelocationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryWarehouseStoragelocationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryWarehouseStoragelocationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryWarehouseStoragelocationResponse setStorageLocationList(java.util.List<StorageLocation> storageLocationList) {
        this.storageLocationList = storageLocationList;
        return this;
    }
    public java.util.List<StorageLocation> getStorageLocationList() {
        return this.storageLocationList;
    }

}
