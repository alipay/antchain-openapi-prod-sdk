// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class RepoScanStrategy extends TeaModel {
    // 策略ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 仓库ID
    @NameInMap("repo_id")
    @Validation(required = true)
    public String repoId;

    // 仓库列表
    @NameInMap("projects")
    @Validation(required = true)
    public java.util.List<String> projects;

    // 仓库列表
    @NameInMap("repositories")
    @Validation(required = true)
    public java.util.List<String> repositories;

    // 扫描开始时间
    @NameInMap("image_begin_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String imageBeginTime;

    // 定时扫描任务
    @NameInMap("crontab")
    @Validation(required = true)
    public String crontab;

    // 下个日期
    @NameInMap("next_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String nextDate;

    // 策略状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    public static RepoScanStrategy build(java.util.Map<String, ?> map) throws Exception {
        RepoScanStrategy self = new RepoScanStrategy();
        return TeaModel.build(map, self);
    }

    public RepoScanStrategy setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RepoScanStrategy setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public RepoScanStrategy setProjects(java.util.List<String> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<String> getProjects() {
        return this.projects;
    }

    public RepoScanStrategy setRepositories(java.util.List<String> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<String> getRepositories() {
        return this.repositories;
    }

    public RepoScanStrategy setImageBeginTime(String imageBeginTime) {
        this.imageBeginTime = imageBeginTime;
        return this;
    }
    public String getImageBeginTime() {
        return this.imageBeginTime;
    }

    public RepoScanStrategy setCrontab(String crontab) {
        this.crontab = crontab;
        return this;
    }
    public String getCrontab() {
        return this.crontab;
    }

    public RepoScanStrategy setNextDate(String nextDate) {
        this.nextDate = nextDate;
        return this;
    }
    public String getNextDate() {
        return this.nextDate;
    }

    public RepoScanStrategy setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
