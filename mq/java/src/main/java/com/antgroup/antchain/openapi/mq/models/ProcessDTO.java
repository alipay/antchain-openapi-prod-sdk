// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ProcessDTO extends TeaModel {
    // 工单名称
    @NameInMap("process_name")
    @Validation(required = true)
    public String processName;

    // 状态
    @NameInMap("process_status")
    @Validation(required = true)
    public String processStatus;

    // 工单链接
    @NameInMap("process_url")
    @Validation(required = true)
    public String processUrl;

    public static ProcessDTO build(java.util.Map<String, ?> map) throws Exception {
        ProcessDTO self = new ProcessDTO();
        return TeaModel.build(map, self);
    }

    public ProcessDTO setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public ProcessDTO setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

    public ProcessDTO setProcessUrl(String processUrl) {
        this.processUrl = processUrl;
        return this;
    }
    public String getProcessUrl() {
        return this.processUrl;
    }

}
