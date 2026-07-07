// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class OutputStreamActiveData extends TeaModel {
    // 物料编码
    /**
     * <strong>example:</strong>
     * <p>0102010000</p>
     */
    @NameInMap("material_code")
    @Validation(required = true)
    public String materialCode;

    // 用量，非负，最多6位小数
    /**
     * <strong>example:</strong>
     * <p>200.12</p>
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

    // 单价（仅产品用，产品不传时默认为空）
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("unit_price")
    public String unitPrice;

    // 处置方式编码（仅废弃物用）
    /**
     * <strong>example:</strong>
     * <p>5201000000</p>
     */
    @NameInMap("disposal_type_code")
    public String disposalTypeCode;

    // 运输信息列表（仅废弃物用）
    @NameInMap("transport_list")
    public java.util.List<TransportActiveData> transportList;

    public static OutputStreamActiveData build(java.util.Map<String, ?> map) throws Exception {
        OutputStreamActiveData self = new OutputStreamActiveData();
        return TeaModel.build(map, self);
    }

    public OutputStreamActiveData setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
        return this;
    }
    public String getMaterialCode() {
        return this.materialCode;
    }

    public OutputStreamActiveData setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public OutputStreamActiveData setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public OutputStreamActiveData setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public String getUnitPrice() {
        return this.unitPrice;
    }

    public OutputStreamActiveData setDisposalTypeCode(String disposalTypeCode) {
        this.disposalTypeCode = disposalTypeCode;
        return this;
    }
    public String getDisposalTypeCode() {
        return this.disposalTypeCode;
    }

    public OutputStreamActiveData setTransportList(java.util.List<TransportActiveData> transportList) {
        this.transportList = transportList;
        return this;
    }
    public java.util.List<TransportActiveData> getTransportList() {
        return this.transportList;
    }

}
