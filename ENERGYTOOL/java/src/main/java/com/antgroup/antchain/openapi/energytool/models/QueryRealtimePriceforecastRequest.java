// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryRealtimePriceforecastRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 运行日期，yyyy-mm-dd
    @NameInMap("run_date")
    @Validation(required = true)
    public String runDate;

    // 业务类型 枚举： REAL_TIME - 实时 DAY_AHEAD - 日前	
    // 
    @NameInMap("busi_type")
    @Validation(required = true)
    public String busiType;

    // 省地区编码，目前仅支持江苏省	
    // 
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    public static QueryRealtimePriceforecastRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRealtimePriceforecastRequest self = new QueryRealtimePriceforecastRequest();
        return TeaModel.build(map, self);
    }

    public QueryRealtimePriceforecastRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRealtimePriceforecastRequest setRunDate(String runDate) {
        this.runDate = runDate;
        return this;
    }
    public String getRunDate() {
        return this.runDate;
    }

    public QueryRealtimePriceforecastRequest setBusiType(String busiType) {
        this.busiType = busiType;
        return this;
    }
    public String getBusiType() {
        return this.busiType;
    }

    public QueryRealtimePriceforecastRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
