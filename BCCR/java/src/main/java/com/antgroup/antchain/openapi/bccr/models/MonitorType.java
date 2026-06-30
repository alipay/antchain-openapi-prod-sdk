// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class MonitorType extends TeaModel {
    // 文件类型
    /**
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 提交类型
    /**
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("submit_type")
    @Validation(required = true)
    public String submitType;

    public static MonitorType build(java.util.Map<String, ?> map) throws Exception {
        MonitorType self = new MonitorType();
        return TeaModel.build(map, self);
    }

    public MonitorType setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public MonitorType setSubmitType(String submitType) {
        this.submitType = submitType;
        return this;
    }
    public String getSubmitType() {
        return this.submitType;
    }

}
