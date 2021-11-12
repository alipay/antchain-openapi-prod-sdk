// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class SolutionInstance extends TeaModel {
    // 解决方案id
    @NameInMap("solution_id")
    @Validation(required = true)
    public String solutionId;

    // 环境ID
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 解决方案的名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 解决方案的状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static SolutionInstance build(java.util.Map<String, ?> map) throws Exception {
        SolutionInstance self = new SolutionInstance();
        return TeaModel.build(map, self);
    }

    public SolutionInstance setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public SolutionInstance setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public SolutionInstance setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SolutionInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
