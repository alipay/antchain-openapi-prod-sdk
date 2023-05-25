// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ImageStrategy extends TeaModel {
    // 准入
    @NameInMap("access")
    public Boolean access;

    // 巡检
    @NameInMap("cronjob")
    public Cronjob cronjob;

    public static ImageStrategy build(java.util.Map<String, ?> map) throws Exception {
        ImageStrategy self = new ImageStrategy();
        return TeaModel.build(map, self);
    }

    public ImageStrategy setAccess(Boolean access) {
        this.access = access;
        return this;
    }
    public Boolean getAccess() {
        return this.access;
    }

    public ImageStrategy setCronjob(Cronjob cronjob) {
        this.cronjob = cronjob;
        return this;
    }
    public Cronjob getCronjob() {
        return this.cronjob;
    }

}
