// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class UpdateImageReposcanstrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 策略ID 
    @NameInMap("strategy_id")
    @Validation(required = true)
    public String strategyId;

    // 项目列表
    @NameInMap("projects")
    public java.util.List<String> projects;

    // 仓库列表
    @NameInMap("repositories")
    public java.util.List<String> repositories;

    // 镜像开始时间
    @NameInMap("image_begin_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String imageBeginTime;

    // 定时描述
    @NameInMap("crontab")
    public String crontab;

    public static UpdateImageReposcanstrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageReposcanstrategyRequest self = new UpdateImageReposcanstrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageReposcanstrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateImageReposcanstrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public UpdateImageReposcanstrategyRequest setProjects(java.util.List<String> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<String> getProjects() {
        return this.projects;
    }

    public UpdateImageReposcanstrategyRequest setRepositories(java.util.List<String> repositories) {
        this.repositories = repositories;
        return this;
    }
    public java.util.List<String> getRepositories() {
        return this.repositories;
    }

    public UpdateImageReposcanstrategyRequest setImageBeginTime(String imageBeginTime) {
        this.imageBeginTime = imageBeginTime;
        return this;
    }
    public String getImageBeginTime() {
        return this.imageBeginTime;
    }

    public UpdateImageReposcanstrategyRequest setCrontab(String crontab) {
        this.crontab = crontab;
        return this;
    }
    public String getCrontab() {
        return this.crontab;
    }

}
