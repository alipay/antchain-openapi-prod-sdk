// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitActionTrailQuery extends TeaModel {
    // 操作时间
    @NameInMap("actiontrail_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String actiontrailTimestamp;

    // title
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static AppPortraitActionTrailQuery build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitActionTrailQuery self = new AppPortraitActionTrailQuery();
        return TeaModel.build(map, self);
    }

    public AppPortraitActionTrailQuery setActiontrailTimestamp(String actiontrailTimestamp) {
        this.actiontrailTimestamp = actiontrailTimestamp;
        return this;
    }
    public String getActiontrailTimestamp() {
        return this.actiontrailTimestamp;
    }

    public AppPortraitActionTrailQuery setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AppPortraitActionTrailQuery setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
