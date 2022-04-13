// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UnireleaseSolutionExtInfoLinkeInfo extends TeaModel {
    // linke发布窗口 
    @NameInMap("release_window")
    @Validation(required = true)
    public String releaseWindow;

    // ["EI61640467"]
    @NameInMap("iterations")
    @Validation(required = true)
    public java.util.List<String> iterations;

    // 发布接口人列表,要求为域账号
    @NameInMap("publisher")
    public java.util.List<String> publisher;

    // inke发布Id
    @NameInMap("release_id")
    public String releaseId;

    public static UnireleaseSolutionExtInfoLinkeInfo build(java.util.Map<String, ?> map) throws Exception {
        UnireleaseSolutionExtInfoLinkeInfo self = new UnireleaseSolutionExtInfoLinkeInfo();
        return TeaModel.build(map, self);
    }

    public UnireleaseSolutionExtInfoLinkeInfo setReleaseWindow(String releaseWindow) {
        this.releaseWindow = releaseWindow;
        return this;
    }
    public String getReleaseWindow() {
        return this.releaseWindow;
    }

    public UnireleaseSolutionExtInfoLinkeInfo setIterations(java.util.List<String> iterations) {
        this.iterations = iterations;
        return this;
    }
    public java.util.List<String> getIterations() {
        return this.iterations;
    }

    public UnireleaseSolutionExtInfoLinkeInfo setPublisher(java.util.List<String> publisher) {
        this.publisher = publisher;
        return this;
    }
    public java.util.List<String> getPublisher() {
        return this.publisher;
    }

    public UnireleaseSolutionExtInfoLinkeInfo setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
