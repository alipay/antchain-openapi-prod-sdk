// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class At extends TeaModel {
    // @手机号
    @NameInMap("at_mobiles")
    public java.util.List<String> atMobiles;

    // @用户ID
    @NameInMap("at_user_ids")
    public java.util.List<String> atUserIds;

    // @所有人
    @NameInMap("is_at_all")
    public Boolean isAtAll;

    public static At build(java.util.Map<String, ?> map) throws Exception {
        At self = new At();
        return TeaModel.build(map, self);
    }

    public At setAtMobiles(java.util.List<String> atMobiles) {
        this.atMobiles = atMobiles;
        return this;
    }
    public java.util.List<String> getAtMobiles() {
        return this.atMobiles;
    }

    public At setAtUserIds(java.util.List<String> atUserIds) {
        this.atUserIds = atUserIds;
        return this;
    }
    public java.util.List<String> getAtUserIds() {
        return this.atUserIds;
    }

    public At setIsAtAll(Boolean isAtAll) {
        this.isAtAll = isAtAll;
        return this;
    }
    public Boolean getIsAtAll() {
        return this.isAtAll;
    }

}
