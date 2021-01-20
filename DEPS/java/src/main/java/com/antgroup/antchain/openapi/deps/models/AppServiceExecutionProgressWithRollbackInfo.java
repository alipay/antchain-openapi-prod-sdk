// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppServiceExecutionProgressWithRollbackInfo extends TeaModel {
    // progress
    @NameInMap("progress")
    public AppServiceExecutionProgress progress;

    // rollback_progress
    @NameInMap("rollback_progress")
    public AppServiceExecutionProgress rollbackProgress;

    public static AppServiceExecutionProgressWithRollbackInfo build(java.util.Map<String, ?> map) throws Exception {
        AppServiceExecutionProgressWithRollbackInfo self = new AppServiceExecutionProgressWithRollbackInfo();
        return TeaModel.build(map, self);
    }

    public AppServiceExecutionProgressWithRollbackInfo setProgress(AppServiceExecutionProgress progress) {
        this.progress = progress;
        return this;
    }
    public AppServiceExecutionProgress getProgress() {
        return this.progress;
    }

    public AppServiceExecutionProgressWithRollbackInfo setRollbackProgress(AppServiceExecutionProgress rollbackProgress) {
        this.rollbackProgress = rollbackProgress;
        return this;
    }
    public AppServiceExecutionProgress getRollbackProgress() {
        return this.rollbackProgress;
    }

}
