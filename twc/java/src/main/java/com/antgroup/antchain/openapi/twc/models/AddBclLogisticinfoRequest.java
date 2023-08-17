// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AddBclLogisticinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 32)
    public String orderId;

    // - SHIPPED 已发货 
    // - TRANSPORT 运输中 
    // - SIGNED 已签收  
    // 当前暂时只支持已发货和已签收
    @NameInMap("logistic_status")
    @Validation(required = true, maxLength = 16)
    public String logisticStatus;

    // 物流照片网关文件id,调用网关文件上传时文件的名称(包含文件后缀)不要超过32位
    @NameInMap("logistics_file_id")
    @Validation(maxLength = 64)
    public String logisticsFileId;

    // 签收记录,网关文件id,调用网关文件上传时文件的名称(包含文件后缀)不要超过32位
    @NameInMap("arrive_confirm_file_id")
    @Validation(maxLength = 64)
    public String arriveConfirmFileId;

    // 用户签收时间格式为2019-8-31 12:00:00
    @NameInMap("arrive_confirm_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String arriveConfirmTime;

    // 物流公司简称
    @NameInMap("logistic_company_name")
    @Validation(required = true, maxLength = 32)
    public String logisticCompanyName;

    // 物流公司code
    @NameInMap("logistic_company_code")
    @Validation(required = true, maxLength = 32)
    public String logisticCompanyCode;

    // 物流订单id
    @NameInMap("logistics_order_id")
    @Validation(required = true, maxLength = 64)
    public String logisticsOrderId;

    // 物流发货时间,格式为2019-8-31 12:00:00
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
    @Validation(required = true, maxLength = 32)
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
