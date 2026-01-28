// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class InputStreamActiveData extends TeaModel {
    // 物料编码
    /**
     * <strong>example:</strong>
     * <p>0601020000</p>
     */
    @NameInMap("material_code")
    @Validation(required = true)
    public String materialCode;

    // 用量，非负，最多6位小数
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 单位
    /**
     * <strong>example:</strong>
     * <p>KG</p>
     */
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    // 运输信息列表
    @NameInMap("transport_list")
    public java.util.List<TransportActiveData> transportList;

    public static InputStreamActiveData build(java.util.Map<String, ?> map) throws Exception {
        InputStreamActiveData self = new InputStreamActiveData();
        return TeaModel.build(map, self);
    }

    public InputStreamActiveData setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
        return this;
    }
    public String getMaterialCode() {
        return this.materialCode;
    }

    public InputStreamActiveData setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public InputStreamActiveData setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public InputStreamActiveData setTransportList(java.util.List<TransportActiveData> transportList) {
        this.transportList = transportList;
        return this;
    }
    public java.util.List<TransportActiveData> getTransportList() {
        return this.transportList;
    }

}
