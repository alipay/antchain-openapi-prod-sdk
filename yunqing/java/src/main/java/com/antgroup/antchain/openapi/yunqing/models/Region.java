// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Region extends TeaModel {
    // 地域标识（与阿里云identity对齐）
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 地域的名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // region的id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // 显示的名字，可重复
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 所在城市
    @NameInMap("city")
    @Validation(required = true)
    public String city;

    // 是否金区：FINANCIAL， NON_FINANCIAL
    @NameInMap("tag")
    @Validation(required = true)
    public String tag;

    public static Region build(java.util.Map<String, ?> map) throws Exception {
        Region self = new Region();
        return TeaModel.build(map, self);
    }

    public Region setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public Region setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Region setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Region setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Region setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public Region setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
