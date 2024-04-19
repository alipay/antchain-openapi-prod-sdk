// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class InverterGeneration extends TeaModel {
    // 逆变器SN
    @NameInMap("inv_sn")
    @Validation(required = true)
    public String invSn;

    // 生产商名称
    @NameInMap("manufacturer")
    @Validation(required = true)
    public String manufacturer;

    // 当日发电量，最多3位小数
    @NameInMap("daily")
    @Validation(required = true)
    public String daily;

    // 累计发电量，最多3位小数
    @NameInMap("total")
    @Validation(required = true)
    public String total;

    public static InverterGeneration build(java.util.Map<String, ?> map) throws Exception {
        InverterGeneration self = new InverterGeneration();
        return TeaModel.build(map, self);
    }

    public InverterGeneration setInvSn(String invSn) {
        this.invSn = invSn;
        return this;
    }
    public String getInvSn() {
        return this.invSn;
    }

    public InverterGeneration setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public InverterGeneration setDaily(String daily) {
        this.daily = daily;
        return this;
    }
    public String getDaily() {
        return this.daily;
    }

    public InverterGeneration setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

}
