// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LogisticsInfo extends TeaModel {
    // 发货时间
    @NameInMap("delivery_time")
    @Validation(required = true)
    public String deliveryTime;

    // 快递物流公司
    @NameInMap("express_logistics_company")
    @Validation(required = true)
    public String expressLogisticsCompany;

    // 快递单号
    @NameInMap("courier_number")
    @Validation(required = true)
    public String courierNumber;

    // 签收时间
    @NameInMap("sign_time")
    @Validation(required = true)
    public String signTime;

    public static LogisticsInfo build(java.util.Map<String, ?> map) throws Exception {
        LogisticsInfo self = new LogisticsInfo();
        return TeaModel.build(map, self);
    }

    public LogisticsInfo setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }
    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public LogisticsInfo setExpressLogisticsCompany(String expressLogisticsCompany) {
        this.expressLogisticsCompany = expressLogisticsCompany;
        return this;
    }
    public String getExpressLogisticsCompany() {
        return this.expressLogisticsCompany;
    }

    public LogisticsInfo setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
        return this;
    }
    public String getCourierNumber() {
        return this.courierNumber;
    }

    public LogisticsInfo setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

}
