// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class DataAdDataExportExperimentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 广告主账户为数字，如“9471147”
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 开始时间 yyyyMMdd
    @NameInMap("start_day")
    @Validation(required = true)
    public String startDay;

    // 结束时间 yyyyMMdd
    @NameInMap("end_day")
    @Validation(required = true)
    public String endDay;

    public static DataAdDataExportExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        DataAdDataExportExperimentRequest self = new DataAdDataExportExperimentRequest();
        return TeaModel.build(map, self);
    }

    public DataAdDataExportExperimentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DataAdDataExportExperimentRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DataAdDataExportExperimentRequest setStartDay(String startDay) {
        this.startDay = startDay;
        return this;
    }
    public String getStartDay() {
        return this.startDay;
    }

    public DataAdDataExportExperimentRequest setEndDay(String endDay) {
        this.endDay = endDay;
        return this;
    }
    public String getEndDay() {
        return this.endDay;
    }

}
