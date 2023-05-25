// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class CreateImageReposcanstrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 仓库ID
    @NameInMap("repo_id")
    @Validation(required = true)
    public String repoId;

    //  项目列表
    @NameInMap("projects")
    public java.util.List<String> projects;

    // 仓库列表
    @NameInMap("repositories")
    public java.util.List<String> repositories;

    // 镜像开始时间
    @NameInMap("image_begin_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String imageBeginTime;

    // 定时crontab
    @NameInMap("crontab")
    @Validation(required = true)
    public String crontab;

    public static CreateImageReposcanstrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageReposcanstrategyRequest self = new CreateImageReposcanstrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageReposcanstrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateImageReposcanstrategyRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public CreateImageReposcanstrategyRequest setProjects(java.util.List<String> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<String> getProjects() {
        return this.projects;
    }

    public CreateImageReposcanstrategyRequest setRepositories(java.util.List<String> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<String> getRepositories() {
        return this.repositories;
    }

    public CreateImageReposcanstrategyRequest setImageBeginTime(String imageBeginTime) {
        this.imageBeginTime = imageBeginTime;
        return this;
    }
    public String getImageBeginTime() {
        return this.imageBeginTime;
    }

    public CreateImageReposcanstrategyRequest setCrontab(String crontab) {
        this.crontab = crontab;
        return this;
    }
    public String getCrontab() {
        return this.crontab;
    }

}
