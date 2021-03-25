// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AggregateExecutableProgress extends TeaModel {
    // base_progress
    @NameInMap("base_progress")
    @Validation(required = true)
    public ResourceGroupExecutionProgress baseProgress;

    // bg_release_progresses
    @NameInMap("bg_release_progresses")
    @Validation(required = true)
    public java.util.List<BGReleaseExecutionProgress> bgReleaseProgresses;

    // app_service_progresses
    @NameInMap("app_service_progresses")
    @Validation(required = true)
    public java.util.List<AppServiceExecutionProgressWithRollbackInfo> appServiceProgresses;

    // common_progresses
    @NameInMap("common_progresses")
    @Validation(required = true)
    public java.util.List<ResourceGroupExecutionProgress> commonProgresses;

    public static AggregateExecutableProgress build(java.util.Map<String, ?> map) throws Exception {
        AggregateExecutableProgress self = new AggregateExecutableProgress();
        return TeaModel.build(map, self);
    }

    public AggregateExecutableProgress setBaseProgress(ResourceGroupExecutionProgress baseProgress) {
        this.baseProgress = baseProgress;
        return this;
    }
    public ResourceGroupExecutionProgress getBaseProgress() {
        return this.baseProgress;
    }

    public AggregateExecutableProgress setBgReleaseProgresses(java.util.List<BGReleaseExecutionProgress> bgReleaseProgresses) {
        this.bgReleaseProgresses = bgReleaseProgresses;
        return this;
    }
    public java.util.List<BGReleaseExecutionProgress> getBgReleaseProgresses() {
        return this.bgReleaseProgresses;
    }

    public AggregateExecutableProgress setAppServiceProgresses(java.util.List<AppServiceExecutionProgressWithRollbackInfo> appServiceProgresses) {
        this.appServiceProgresses = appServiceProgresses;
        return this;
    }
    public java.util.List<AppServiceExecutionProgressWithRollbackInfo> getAppServiceProgresses() {
        return this.appServiceProgresses;
    }

    public AggregateExecutableProgress setCommonProgresses(java.util.List<ResourceGroupExecutionProgress> commonProgresses) {
        this.commonProgresses = commonProgresses;
        return this;
    }
    public java.util.List<ResourceGroupExecutionProgress> getCommonProgresses() {
        return this.commonProgresses;
    }

}
