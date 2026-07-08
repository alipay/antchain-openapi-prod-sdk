// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ProcessDetail extends TeaModel {
    // 单元过程名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("process_name")
    public String processName;

    // 过程编码
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("process_no")
    public String processNo;

    public static ProcessDetail build(java.util.Map<String, ?> map) throws Exception {
        ProcessDetail self = new ProcessDetail();
        return TeaModel.build(map, self);
    }

    public ProcessDetail setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public ProcessDetail setProcessNo(String processNo) {
        this.processNo = processNo;
        return this;
    }
    public String getProcessNo() {
        return this.processNo;
    }

}
