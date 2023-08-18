// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclLogisticsInfo extends TeaModel {
    // 物流订单
    @NameInMap("logistics_order_id")
    @Validation(required = true)
    public String logisticsOrderId;

    // 物流公司
    @NameInMap("logistic_company")
    @Validation(required = true)
    public String logisticCompany;

    // 物流状态
    // 1.已发货：SHIPPED
    // 2.已签收：SIGNED
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 发货时间
    // 示例：2023-06-27T10:50:23+08:00
    @NameInMap("deliver_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String deliverTime;

    // 租赁类型
    // 1.租赁：LEASE
    // 2.退租：RETURN_LEASE
    @NameInMap("lease_type")
    @Validation(required = true)
    public String leaseType;

    // 签收时间
    // 示例：2023-06-27T10:50:23+08:00
    @NameInMap("arrive_confirm_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String arriveConfirmTime;

    // 签收文件下载链接
    @NameInMap("arrive_confirm_file_url")
    @Validation(required = true)
    public String arriveConfirmFileUrl;

    // 发货地址
    @NameInMap("deliver_address")
    @Validation(required = true)
    public String deliverAddress;

    // 收货地址
    @NameInMap("arrive_address")
    @Validation(required = true)
    public String arriveAddress;

    // 收货人姓名 脱敏
    @NameInMap("arrive_name")
    @Validation(required = true)
    public String arriveName;

    // 收货人联系电话 脱敏
    @NameInMap("arrive_mobile")
    @Validation(required = true)
    public String arriveMobile;

    // 物流公司标志,参考菜鸟的物流公司定义
    @NameInMap("logistic_company_code")
    public String logisticCompanyCode;

    public static BclLogisticsInfo build(java.util.Map<String, ?> map) throws Exception {
        BclLogisticsInfo self = new BclLogisticsInfo();
        return TeaModel.build(map, self);
    }

    public BclLogisticsInfo setLogisticsOrderId(String logisticsOrderId) {
        this.logisticsOrderId = logisticsOrderId;
        return this;
    }
    public String getLogisticsOrderId() {
        return this.logisticsOrderId;
    }

    public BclLogisticsInfo setLogisticCompany(String logisticCompany) {
        this.logisticCompany = logisticCompany;
        return this;
    }
    public String getLogisticCompany() {
        return this.logisticCompany;
    }

    public BclLogisticsInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BclLogisticsInfo setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
        return this;
    }
    public String getDeliverTime() {
        return this.deliverTime;
    }

    public BclLogisticsInfo setLeaseType(String leaseType) {
        this.leaseType = leaseType;
        return this;
    }
    public String getLeaseType() {
        return this.leaseType;
    }

    public BclLogisticsInfo setArriveConfirmTime(String arriveConfirmTime) {
        this.arriveConfirmTime = arriveConfirmTime;
        return this;
    }
    public String getArriveConfirmTime() {
        return this.arriveConfirmTime;
    }

    public BclLogisticsInfo setArriveConfirmFileUrl(String arriveConfirmFileUrl) {
        this.arriveConfirmFileUrl = arriveConfirmFileUrl;
        return this;
    }
    public String getArriveConfirmFileUrl() {
        return this.arriveConfirmFileUrl;
    }

    public BclLogisticsInfo setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
        return this;
    }
    public String getDeliverAddress() {
        return this.deliverAddress;
    }

    public BclLogisticsInfo setArriveAddress(String arriveAddress) {
        this.arriveAddress = arriveAddress;
        return this;
    }
    public String getArriveAddress() {
        return this.arriveAddress;
    }

    public BclLogisticsInfo setArriveName(String arriveName) {
        this.arriveName = arriveName;
        return this;
    }
    public String getArriveName() {
        return this.arriveName;
    }

    public BclLogisticsInfo setArriveMobile(String arriveMobile) {
        this.arriveMobile = arriveMobile;
        return this;
    }
    public String getArriveMobile() {
        return this.arriveMobile;
    }

    public BclLogisticsInfo setLogisticCompanyCode(String logisticCompanyCode) {
        this.logisticCompanyCode = logisticCompanyCode;
        return this;
    }
    public String getLogisticCompanyCode() {
        return this.logisticCompanyCode;
    }

}
