// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CpfDataUsageLogVO extends TeaModel {
    // 使用方名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 使用时间
    @NameInMap("usage_time")
    @Validation(required = true)
    public String usageTime;

    // 数据项描述
    @NameInMap("data_desc")
    @Validation(required = true)
    public String dataDesc;

    // 用途
    @NameInMap("purpose")
    @Validation(required = true)
    public String purpose;

    // 业务流水号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    public static CpfDataUsageLogVO build(java.util.Map<String, ?> map) throws Exception {
        CpfDataUsageLogVO self = new CpfDataUsageLogVO();
        return TeaModel.build(map, self);
    }

    public CpfDataUsageLogVO setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CpfDataUsageLogVO setUsageTime(String usageTime) {
        this.usageTime = usageTime;
        return this;
    }
    public String getUsageTime() {
        return this.usageTime;
    }

    public CpfDataUsageLogVO setDataDesc(String dataDesc) {
        this.dataDesc = dataDesc;
        return this;
    }
    public String getDataDesc() {
        return this.dataDesc;
    }

    public CpfDataUsageLogVO setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public CpfDataUsageLogVO setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
