// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class SubmitImagesReposcanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 镜像仓库ID
    @NameInMap("repo_id")
    @Validation(required = true)
    public String repoId;

    // 项目列表
    @NameInMap("projects")
    public java.util.List<String> projects;

    // 仓库列表
    @NameInMap("repositories")
    public java.util.List<String> repositories;

    // 镜像起始时间
    @NameInMap("image_begin_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String imageBeginTime;

    // 并发扫描数
    @NameInMap("concurrent_count")
    public Long concurrentCount;

    // 扫描轮询间隔，单位s
    @NameInMap("poll_interval")
    public Long pollInterval;

    public static SubmitImagesReposcanRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImagesReposcanRequest self = new SubmitImagesReposcanRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImagesReposcanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitImagesReposcanRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public SubmitImagesReposcanRequest setProjects(java.util.List<String> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<String> getProjects() {
        return this.projects;
    }

    public SubmitImagesReposcanRequest setRepositories(java.util.List<String> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<String> getRepositories() {
        return this.repositories;
    }

    public SubmitImagesReposcanRequest setImageBeginTime(String imageBeginTime) {
        this.imageBeginTime = imageBeginTime;
        return this;
    }
    public String getImageBeginTime() {
        return this.imageBeginTime;
    }

    public SubmitImagesReposcanRequest setConcurrentCount(Long concurrentCount) {
        this.concurrentCount = concurrentCount;
        return this;
    }
    public Long getConcurrentCount() {
        return this.concurrentCount;
    }

    public SubmitImagesReposcanRequest setPollInterval(Long pollInterval) {
        this.pollInterval = pollInterval;
        return this;
    }
    public Long getPollInterval() {
        return this.pollInterval;
    }

}
