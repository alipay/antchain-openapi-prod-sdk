// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AddBclLogisticinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁订单ID
    // 最大长度：32
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 32)
    public String orderId;

    // 物流状态
    // 1.已发货：SHIPPED 
    // 2.已签收：SIGNED
    @NameInMap("logistic_status")
    @Validation(required = true, maxLength = 16)
    public String logisticStatus;

    // 物流照片网关文件ID
    // 先调用文件上传的接口,这里填上传后返回的fileid
    @NameInMap("logistics_file_id")
    @Validation(maxLength = 64)
    public String logisticsFileId;

    // 签收记录,网关文件ID
    // 先调用文件上传的接口,这里填上传后返回的fileid
    @NameInMap("arrive_confirm_file_id")
    @Validation(maxLength = 64)
    public String arriveConfirmFileId;

    // 用户签收时间
    // 示例：2023-06-27T10:50:23+08:00
    @NameInMap("arrive_confirm_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String arriveConfirmTime;

    // 物流公司简称
    @NameInMap("logistic_company_name")
    @Validation(required = true, maxLength = 32)
    public String logisticCompanyName;

    // 物流公司code：
    // 1.圆通速递：YTO
    // 2.韵达快递：YUNDA
    // 3.顺丰速运：SF
    // 4.EMS：EMS
    // 5.申通快递：STO
    // 6.中通快递：ZTO
    // 7.天天快递：TTKDEX
    // 8.全峰快递：QFKD
    // 9.中铁物流：ZTKY
    // 10.其他：OTHER
    @NameInMap("logistic_company_code")
    @Validation(required = true, maxLength = 32)
    public String logisticCompanyCode;

    // 物流订单ID
    // 最大长度64
    @NameInMap("logistics_order_id")
    @Validation(required = true, maxLength = 64)
    public String logisticsOrderId;

    // 物流发货时间
    // 示例：2023-06-27T10:50:23+08:00
    @NameInMap("deliver_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String deliverTime;

    // 租赁状态
    // LEASE,租赁 
    // RETURN_LEASE,退租
    @NameInMap("lease_type")
    @Validation(required = true, maxLength = 16)
    public String leaseType;

    // 发货地址
    @NameInMap("deliver_address")
    @Validation(required = true, maxLength = 512)
    public String deliverAddress;

    // 收货地址
    @NameInMap("arrive_address")
    @Validation(required = true, maxLength = 512)
    public String arriveAddress;

    // 收货人姓名
    @NameInMap("arrive_name")
    @Validation(required = true, maxLength = 128)
    public String arriveName;

    // 收货人联系电话
    @NameInMap("arrive_mobile")
    @Validation(required = true, maxLength = 32)
    public String arriveMobile;

    public static AddBclLogisticinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBclLogisticinfoRequest self = new AddBclLogisticinfoRequest();
        return TeaModel.build(map, self);
    }

    public AddBclLogisticinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddBclLogisticinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddBclLogisticinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AddBclLogisticinfoRequest setLogisticStatus(String logisticStatus) {
        this.logisticStatus = logisticStatus;
        return this;
    }
    public String getLogisticStatus() {
        return this.logisticStatus;
    }

    public AddBclLogisticinfoRequest setLogisticsFileId(String logisticsFileId) {
        this.logisticsFileId = logisticsFileId;
        return this;
    }
    public String getLogisticsFileId() {
        return this.logisticsFileId;
    }

    public AddBclLogisticinfoRequest setArriveConfirmFileId(String arriveConfirmFileId) {
        this.arriveConfirmFileId = arriveConfirmFileId;
        return this;
    }
    public String getArriveConfirmFileId() {
        return this.arriveConfirmFileId;
    }

    public AddBclLogisticinfoRequest setArriveConfirmTime(String arriveConfirmTime) {
        this.arriveConfirmTime = arriveConfirmTime;
        return this;
    }
    public String getArriveConfirmTime() {
        return this.arriveConfirmTime;
    }

    public AddBclLogisticinfoRequest setLogisticCompanyName(String logisticCompanyName) {
        this.logisticCompanyName = logisticCompanyName;
        return this;
    }
    public String getLogisticCompanyName() {
        return this.logisticCompanyName;
    }

    public AddBclLogisticinfoRequest setLogisticCompanyCode(String logisticCompanyCode) {
        this.logisticCompanyCode = logisticCompanyCode;
        return this;
    }
    public String getLogisticCompanyCode() {
        return this.logisticCompanyCode;
    }

    public AddBclLogisticinfoRequest setLogisticsOrderId(String logisticsOrderId) {
        this.logisticsOrderId = logisticsOrderId;
        return this;
    }
    public String getLogisticsOrderId() {
        return this.logisticsOrderId;
    }

    public AddBclLogisticinfoRequest setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
        return this;
    }
    public String getDeliverTime() {
        return this.deliverTime;
    }

    public AddBclLogisticinfoRequest setLeaseType(String leaseType) {
        this.leaseType = leaseType;
        return this;
    }
    public String getLeaseType() {
        return this.leaseType;
    }

    public AddBclLogisticinfoRequest setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
        return this;
    }
    public String getDeliverAddress() {
        return this.deliverAddress;
    }

    public AddBclLogisticinfoRequest setArriveAddress(String arriveAddress) {
        this.arriveAddress = arriveAddress;
        return this;
    }
    public String getArriveAddress() {
        return this.arriveAddress;
    }

    public AddBclLogisticinfoRequest setArriveName(String arriveName) {
        this.arriveName = arriveName;
        return this;
    }
    public String getArriveName() {
        return this.arriveName;
    }

    public AddBclLogisticinfoRequest setArriveMobile(String arriveMobile) {
        this.arriveMobile = arriveMobile;
        return this;
    }
    public String getArriveMobile() {
        return this.arriveMobile;
    }

}
