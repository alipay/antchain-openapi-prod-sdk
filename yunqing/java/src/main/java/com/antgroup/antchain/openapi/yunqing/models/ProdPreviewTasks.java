// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ProdPreviewTasks extends TeaModel {
    // 应用是否需要部署
    @NameInMap("app_preview_tasks")
    @Validation(required = true)
    public java.util.List<AppPreviewTask> appPreviewTasks;

    public static ProdPreviewTasks build(java.util.Map<String, ?> map) throws Exception {
        ProdPreviewTasks self = new ProdPreviewTasks();
        return TeaModel.build(map, self);
    }

    public ProdPreviewTasks setAppPreviewTasks(java.util.List<AppPreviewTask> appPreviewTasks) {
        this.appPreviewTasks = appPreviewTasks;
        return this;
    }
    public java.util.List<AppPreviewTask> getAppPreviewTasks() {
        return this.appPreviewTasks;
    }

}
