// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class Cronjob extends TeaModel {
    // crontab格式表述的cronjob
    @NameInMap("crontab")
    public String crontab;

    public static Cronjob build(java.util.Map<String, ?> map) throws Exception {
        Cronjob self = new Cronjob();
        return TeaModel.build(map, self);
    }

    public Cronjob setCrontab(String crontab) {
        this.crontab = crontab;
        return this;
    }
    public String getCrontab() {
        return this.crontab;
    }

}
