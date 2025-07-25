// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CarItemsInfo extends TeaModel {
    // 车架号
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("vin")
    public String vin;

    // 发动机号
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("engine_no")
    public String engineNo;

    // 注册日期
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("register_date")
    public String registerDate;

    // 品牌车型
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("model_code")
    public String modelCode;

    // 营运性质
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("use_nature_code")
    public String useNatureCode;

    public static CarItemsInfo build(java.util.Map<String, ?> map) throws Exception {
        CarItemsInfo self = new CarItemsInfo();
        return TeaModel.build(map, self);
    }

    public CarItemsInfo setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public CarItemsInfo setEngineNo(String engineNo) {
        this.engineNo = engineNo;
        return this;
    }
    public String getEngineNo() {
        return this.engineNo;
    }

    public CarItemsInfo setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }
    public String getRegisterDate() {
        return this.registerDate;
    }

    public CarItemsInfo setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public CarItemsInfo setUseNatureCode(String useNatureCode) {
        this.useNatureCode = useNatureCode;
        return this;
    }
    public String getUseNatureCode() {
        return this.useNatureCode;
    }

}
