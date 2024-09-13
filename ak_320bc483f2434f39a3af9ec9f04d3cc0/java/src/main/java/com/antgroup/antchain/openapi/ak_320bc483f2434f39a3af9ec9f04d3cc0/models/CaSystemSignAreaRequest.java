// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSystemSignAreaRequest extends TeaModel {
    // 印章id,联系签署中心获取
    @NameInMap("seal_id")
    public String sealId;

    // 印章的url，如果印章url和印章id都不传，则自动生成默认印章加盖（自动签署）
    @NameInMap("seal_url")
    public String sealUrl;

    // 用印对齐类型,TOP_LEFT("TOP_LEFT", "左上角对齐"), BOTTOM_LEFT("BOTTOM_LEFT", "左下角对齐"), CENTER("CENTER", "xy值是印章的中心"), TOP_RIGHT("TOP_RIGHT", "xy值是印章右上角"), BOTTOM_RIGHT("BOTTOM_RIGHT", "xy值是印章右下角")
    @NameInMap("location_type")
    @Validation(required = true)
    public String locationType;

    // 签署位置类型，1-正文，2-骑缝
    @NameInMap("position_type")
    @Validation(required = true)
    public String positionType;

    // 骑缝章信息，需要盖骑缝章的时候 请传递此参数
    @NameInMap("system_cross_page_request")
    public CaSystemCrossPageRequest systemCrossPageRequest;

    // 正文章信息，正文章模式必填
    @NameInMap("system_main_body_request")
    public CaSystemMainBodyRequest systemMainBodyRequest;

    public static CaSystemSignAreaRequest build(java.util.Map<String, ?> map) throws Exception {
        CaSystemSignAreaRequest self = new CaSystemSignAreaRequest();
        return TeaModel.build(map, self);
    }

    public CaSystemSignAreaRequest setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public CaSystemSignAreaRequest setSealUrl(String sealUrl) {
        this.sealUrl = sealUrl;
        return this;
    }
    public String getSealUrl() {
        return this.sealUrl;
    }

    public CaSystemSignAreaRequest setLocationType(String locationType) {
        this.locationType = locationType;
        return this;
    }
    public String getLocationType() {
        return this.locationType;
    }

    public CaSystemSignAreaRequest setPositionType(String positionType) {
        this.positionType = positionType;
        return this;
    }
    public String getPositionType() {
        return this.positionType;
    }

    public CaSystemSignAreaRequest setSystemCrossPageRequest(CaSystemCrossPageRequest systemCrossPageRequest) {
        this.systemCrossPageRequest = systemCrossPageRequest;
        return this;
    }
    public CaSystemCrossPageRequest getSystemCrossPageRequest() {
        return this.systemCrossPageRequest;
    }

    public CaSystemSignAreaRequest setSystemMainBodyRequest(CaSystemMainBodyRequest systemMainBodyRequest) {
        this.systemMainBodyRequest = systemMainBodyRequest;
        return this;
    }
    public CaSystemMainBodyRequest getSystemMainBodyRequest() {
        return this.systemMainBodyRequest;
    }

}
