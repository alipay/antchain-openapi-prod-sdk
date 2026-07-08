// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CarInfoPlus extends TeaModel {
    // 车牌号
    /**
     * <strong>example:</strong>
     * <p>京A123456</p>
     */
    @NameInMap("plate_no")
    public String plateNo;

    // 车辆型号，格式：1，2，3...
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("model")
    public String model;

    // 车辆颜色，格式：1，2，3
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("color")
    public String color;

    public static CarInfoPlus build(java.util.Map<String, ?> map) throws Exception {
        CarInfoPlus self = new CarInfoPlus();
        return TeaModel.build(map, self);
    }

    public CarInfoPlus setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public CarInfoPlus setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CarInfoPlus setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

}
