// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AppParamData extends TeaModel {
    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用启动参数
    @NameInMap("app_params")
    @Validation(required = true)
    public java.util.List<ParamData> appParams;

    public static AppParamData build(java.util.Map<String, ?> map) throws Exception {
        AppParamData self = new AppParamData();
        return TeaModel.build(map, self);
    }

    public AppParamData setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public AppParamData setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppParamData setAppParams(java.util.List<ParamData> appParams) {
        this.appParams = appParams;
        return this;
    }
    public java.util.List<ParamData> getAppParams() {
        return this.appParams;
    }

}
