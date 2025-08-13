// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiResourceLocation extends TeaModel {
    // 资源定位类型
    // HTTP_URL：资源url
    // STRING_BASE64：资源base64字符串（不带base64头部）
    /**
     * <strong>example:</strong>
     * <p>HTTP_URL, STRING_BASE64</p>
     */
    @NameInMap("location_type")
    @Validation(required = true)
    public String locationType;

    // 资源定位值
    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("location_value")
    @Validation(required = true)
    public String locationValue;

    public static BaiResourceLocation build(java.util.Map<String, ?> map) throws Exception {
        BaiResourceLocation self = new BaiResourceLocation();
        return TeaModel.build(map, self);
    }

    public BaiResourceLocation setLocationType(String locationType) {
        this.locationType = locationType;
        return this;
    }
    public String getLocationType() {
        return this.locationType;
    }

    public BaiResourceLocation setLocationValue(String locationValue) {
        this.locationValue = locationValue;
        return this;
    }
    public String getLocationValue() {
        return this.locationValue;
    }

}
