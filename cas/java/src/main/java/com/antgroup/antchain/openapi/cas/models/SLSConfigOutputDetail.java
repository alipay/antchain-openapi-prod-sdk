// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SLSConfigOutputDetail extends TeaModel {
    // 项目名称，必须为请求的project名。
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 日志库名称
    @NameInMap("logstore_name")
    @Validation(required = true)
    public String logstoreName;

    public static SLSConfigOutputDetail build(java.util.Map<String, ?> map) throws Exception {
        SLSConfigOutputDetail self = new SLSConfigOutputDetail();
        return TeaModel.build(map, self);
    }

    public SLSConfigOutputDetail setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SLSConfigOutputDetail setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

}
