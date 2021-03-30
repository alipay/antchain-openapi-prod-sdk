// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListWarehouseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 仓位总数
    @NameInMap("location_total")
    public Long locationTotal;

    // 总条目
    @NameInMap("total_count")
    public Long totalCount;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 仓库信息
    @NameInMap("warehouse_list")
    public java.util.List<WarehouseInfo> warehouseList;

    // 设备总数
    @NameInMap("device_total")
    public Long deviceTotal;

    public static ListWarehouseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWarehouseResponse self = new ListWarehouseResponse();
        return TeaModel.build(map, self);
    }

    public ListWarehouseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListWarehouseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListWarehouseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListWarehouseResponse setLocationTotal(Long locationTotal) {
        this.locationTotal = locationTotal;
        return this;
    }
    public Long getLocationTotal() {
        return this.locationTotal;
    }

    public ListWarehouseResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListWarehouseResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListWarehouseResponse setWarehouseList(java.util.List<WarehouseInfo> warehouseList) {
        this.warehouseList = warehouseList;
        return this;
    }
    public java.util.List<WarehouseInfo> getWarehouseList() {
        return this.warehouseList;
    }

    public ListWarehouseResponse setDeviceTotal(Long deviceTotal) {
        this.deviceTotal = deviceTotal;
        return this;
    }
    public Long getDeviceTotal() {
        return this.deviceTotal;
    }

}
