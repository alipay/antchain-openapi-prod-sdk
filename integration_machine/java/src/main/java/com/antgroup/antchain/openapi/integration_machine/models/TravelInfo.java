// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class TravelInfo extends TeaModel {
    // 行程码信息
    // 1:没去过疫情区，绿码;
    // 2:去过疫情区，红码;
    // 3:其他，黄码;
    // 0:行程信息不全;
    // -1:查询失败
    @NameInMap("travel_code")
    public String travelCode;

    // 行程码异常原因
    @NameInMap("travel_factor")
    public String travelFactor;

    public static TravelInfo build(java.util.Map<String, ?> map) throws Exception {
        TravelInfo self = new TravelInfo();
        return TeaModel.build(map, self);
    }

    public TravelInfo setTravelCode(String travelCode) {
        this.travelCode = travelCode;
        return this;
    }
    public String getTravelCode() {
        return this.travelCode;
    }

    public TravelInfo setTravelFactor(String travelFactor) {
        this.travelFactor = travelFactor;
        return this;
    }
    public String getTravelFactor() {
        return this.travelFactor;
    }

}
