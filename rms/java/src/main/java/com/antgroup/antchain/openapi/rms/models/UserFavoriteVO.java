// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UserFavoriteVO extends TeaModel {
    // 收藏资源 ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 收藏资源类型
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 用户收藏的 ID
    @NameInMap("user_favorite_id")
    @Validation(required = true)
    public Long userFavoriteId;

    public static UserFavoriteVO build(java.util.Map<String, ?> map) throws Exception {
        UserFavoriteVO self = new UserFavoriteVO();
        return TeaModel.build(map, self);
    }

    public UserFavoriteVO setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UserFavoriteVO setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UserFavoriteVO setUserFavoriteId(Long userFavoriteId) {
        this.userFavoriteId = userFavoriteId;
        return this;
    }
    public Long getUserFavoriteId() {
        return this.userFavoriteId;
    }

}
