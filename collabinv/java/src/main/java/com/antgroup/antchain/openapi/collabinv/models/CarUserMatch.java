// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class CarUserMatch extends TeaModel {
    // 设备号或者手机号md5
    /**
     * <strong>example:</strong>
     * <p>12312asdasd123123123</p>
     */
    @NameInMap("match_id")
    @Validation(required = true)
    public String matchId;

    // 需要匹配的id类型：手机号md5、安卓设备号md5、ios设备号md5
    /**
     * <strong>example:</strong>
     * <p>phoneMd5/oaidMd5/idfaMd5</p>
     */
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    public static CarUserMatch build(java.util.Map<String, ?> map) throws Exception {
        CarUserMatch self = new CarUserMatch();
        return TeaModel.build(map, self);
    }

    public CarUserMatch setMatchId(String matchId) {
        this.matchId = matchId;
        return this;
    }
    public String getMatchId() {
        return this.matchId;
    }

    public CarUserMatch setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

}
