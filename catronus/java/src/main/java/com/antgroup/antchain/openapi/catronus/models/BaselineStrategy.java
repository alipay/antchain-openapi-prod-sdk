// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class BaselineStrategy extends TeaModel {
    // 框架列表
    @NameInMap("frameworks")
    public java.util.List<Framework> frameworks;

    // cronjob
    @NameInMap("cronjob")
    public Cronjob cronjob;

    // 额外配置
    @NameInMap("extended")
    public String extended;

    public static BaselineStrategy build(java.util.Map<String, ?> map) throws Exception {
        BaselineStrategy self = new BaselineStrategy();
        return TeaModel.build(map, self);
    }

    public BaselineStrategy setFrameworks(java.util.List<Framework> frameworks) {
        this.frameworks = frameworks;
        return this;
    }
    public java.util.List<Framework> getFrameworks() {
        return this.frameworks;
    }

    public BaselineStrategy setCronjob(Cronjob cronjob) {
        this.cronjob = cronjob;
        return this;
    }
    public Cronjob getCronjob() {
        return this.cronjob;
    }

    public BaselineStrategy setExtended(String extended) {
        this.extended = extended;
        return this;
    }
    public String getExtended() {
        return this.extended;
    }

}
