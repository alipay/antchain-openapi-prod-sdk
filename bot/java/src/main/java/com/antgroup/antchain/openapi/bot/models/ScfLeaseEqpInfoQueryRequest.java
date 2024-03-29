// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ScfLeaseEqpInfoQueryRequest extends TeaModel {
    // 设备识别号
    @NameInMap("device_no")
    @Validation(required = true)
    public String deviceNo;

    // 运营日期
    @NameInMap("operation_date")
    @Validation(required = true)
    public String operationDate;

    public static ScfLeaseEqpInfoQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ScfLeaseEqpInfoQueryRequest self = new ScfLeaseEqpInfoQueryRequest();
        return TeaModel.build(map, self);
    }

    public ScfLeaseEqpInfoQueryRequest setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
        return this;
    }
    public String getDeviceNo() {
        return this.deviceNo;
    }

    public ScfLeaseEqpInfoQueryRequest setOperationDate(String operationDate) {
        this.operationDate = operationDate;
        return this;
    }
    public String getOperationDate() {
        return this.operationDate;
    }

}
