// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class OrderInfo extends TeaModel {
    // 运单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 船名
    @NameInMap("ship_name")
    @Validation(required = true)
    public String shipName;

    // 航次
    @NameInMap("voyage_no")
    @Validation(required = true)
    public String voyageNo;

    // 起始地
    @NameInMap("original_place")
    @Validation(required = true)
    public String originalPlace;

    // 目的地
    @NameInMap("dest_place")
    @Validation(required = true)
    public String destPlace;

    // 离港时间
    @NameInMap("leave_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String leaveDate;

    // 预计到港时间
    @NameInMap("est_arri_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String estArriDate;

    // 实际到港时间
    @NameInMap("actual_arri_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String actualArriDate;

    // 运单重量
    @NameInMap("waybill_weight")
    @Validation(required = true)
    public String waybillWeight;

    // 船运箱子详情列表
    @NameInMap("cargo_tank_list")
    @Validation(required = true)
    public java.util.List<CargoTank> cargoTankList;

    // 委托人信息
    @NameInMap("grantor_info")
    @Validation(required = true)
    public java.util.List<String> grantorInfo;

    // 收货人信息
    @NameInMap("consignee_info")
    @Validation(required = true)
    public java.util.List<String> consigneeInfo;

    // 运单附件
    @NameInMap("attachment")
    @Validation(required = true)
    public String attachment;

    // 物流状态:
    // 1-->已离开港口;
    // 2-->已到达港口;
    @NameInMap("logistics_status")
    @Validation(required = true)
    public Long logisticsStatus;

    public static OrderInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderInfo self = new OrderInfo();
        return TeaModel.build(map, self);
    }

    public OrderInfo setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public OrderInfo setShipName(String shipName) {
        this.shipName = shipName;
        return this;
    }
    public String getShipName() {
        return this.shipName;
    }

    public OrderInfo setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo;
        return this;
    }
    public String getVoyageNo() {
        return this.voyageNo;
    }

    public OrderInfo setOriginalPlace(String originalPlace) {
        this.originalPlace = originalPlace;
        return this;
    }
    public String getOriginalPlace() {
        return this.originalPlace;
    }

    public OrderInfo setDestPlace(String destPlace) {
        this.destPlace = destPlace;
        return this;
    }
    public String getDestPlace() {
        return this.destPlace;
    }

    public OrderInfo setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
        return this;
    }
    public String getLeaveDate() {
        return this.leaveDate;
    }

    public OrderInfo setEstArriDate(String estArriDate) {
        this.estArriDate = estArriDate;
        return this;
    }
    public String getEstArriDate() {
        return this.estArriDate;
    }

    public OrderInfo setActualArriDate(String actualArriDate) {
        this.actualArriDate = actualArriDate;
        return this;
    }
    public String getActualArriDate() {
        return this.actualArriDate;
    }

    public OrderInfo setWaybillWeight(String waybillWeight) {
        this.waybillWeight = waybillWeight;
        return this;
    }
    public String getWaybillWeight() {
        return this.waybillWeight;
    }

    public OrderInfo setCargoTankList(java.util.List<CargoTank> cargoTankList) {
        this.cargoTankList = cargoTankList;
        return this;
    }
    public java.util.List<CargoTank> getCargoTankList() {
        return this.cargoTankList;
    }

    public OrderInfo setGrantorInfo(java.util.List<String> grantorInfo) {
        this.grantorInfo = grantorInfo;
        return this;
    }
    public java.util.List<String> getGrantorInfo() {
        return this.grantorInfo;
    }

    public OrderInfo setConsigneeInfo(java.util.List<String> consigneeInfo) {
        this.consigneeInfo = consigneeInfo;
        return this;
    }
    public java.util.List<String> getConsigneeInfo() {
        return this.consigneeInfo;
    }

    public OrderInfo setAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }
    public String getAttachment() {
        return this.attachment;
    }

    public OrderInfo setLogisticsStatus(Long logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
        return this;
    }
    public Long getLogisticsStatus() {
        return this.logisticsStatus;
    }

}
