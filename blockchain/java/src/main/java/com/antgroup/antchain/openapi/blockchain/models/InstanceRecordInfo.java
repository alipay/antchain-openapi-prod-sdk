// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InstanceRecordInfo extends TeaModel {
    // 应用标识
    /**
     * <strong>example:</strong>
     * <p>app20230725115808679d4f</p>
     */
    @NameInMap("application")
    public String application;

    // 执行结果
    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("status")
    public String status;

    // 操作时间
    /**
     * <strong>example:</strong>
     * <p>1690166971465</p>
     */
    @NameInMap("operating_time")
    public String operatingTime;

    public static InstanceRecordInfo build(java.util.Map<String, ?> map) throws Exception {
        InstanceRecordInfo self = new InstanceRecordInfo();
        return TeaModel.build(map, self);
    }

    public InstanceRecordInfo setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public InstanceRecordInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InstanceRecordInfo setOperatingTime(String operatingTime) {
        this.operatingTime = operatingTime;
        return this;
    }
    public String getOperatingTime() {
        return this.operatingTime;
    }

}
