// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class QueryWarehouseStoragelocationResponse extends TeaModel {
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

    public static QueryWarehouseStoragelocationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWarehouseStoragelocationResponse self = new QueryWarehouseStoragelocationResponse();
        return TeaModel.build(map, self);
    }

    public QueryWarehouseStoragelocationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWarehouseStoragelocationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWarehouseStoragelocationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWarehouseStoragelocationResponse setStorageLocationList(java.util.List<StorageLocation> storageLocationList) {
        this.storageLocationList = storageLocationList;
        return this;
    }
    public java.util.List<StorageLocation> getStorageLocationList() {
        return this.storageLocationList;
    }

}
