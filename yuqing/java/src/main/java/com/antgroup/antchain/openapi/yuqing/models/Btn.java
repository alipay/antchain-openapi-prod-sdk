// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class Btn extends TeaModel {
    // 标题
    @NameInMap("title")
    public String title;

    // 动作地址
    @NameInMap("action_url")
    public String actionUrl;

    public static Btn build(java.util.Map<String, ?> map) throws Exception {
        Btn self = new Btn();
        return TeaModel.build(map, self);
    }

    public Btn setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Btn setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
        return this;
    }
    public String getActionUrl() {
        return this.actionUrl;
    }

}
