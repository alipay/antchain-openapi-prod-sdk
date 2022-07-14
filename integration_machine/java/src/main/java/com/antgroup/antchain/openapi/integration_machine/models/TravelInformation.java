// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class TravelInformation extends TeaModel {
    // 1:没去过疫情区，绿码;
    // 2:去过疫情区，红码;
    // 3:其他，黄码;
    // 0:行程信息不全;
    // -1查询失败
    @NameInMap("travel_code")
    @Validation(required = true)
    public String travelCode;

    // 行程途径地
    @NameInMap("travel_path")
    @Validation(required = true)
    public String travelPath;

    public static TravelInformation build(java.util.Map<String, ?> map) throws Exception {
        TravelInformation self = new TravelInformation();
        return TeaModel.build(map, self);
    }

    public TravelInformation setTravelCode(String travelCode) {
        this.travelCode = travelCode;
        return this;
    }
    public String getTravelCode() {
        return this.travelCode;
    }

    public TravelInformation setTravelPath(String travelPath) {
        this.travelPath = travelPath;
        return this;
    }
    public String getTravelPath() {
        return this.travelPath;
    }

}
