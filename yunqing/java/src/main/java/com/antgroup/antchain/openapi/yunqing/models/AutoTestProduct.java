// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AutoTestProduct extends TeaModel {
    // 部署单元id
    @NameInMap("deploy_unit")
    public String deployUnit;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 应用启动参数数据
    @NameInMap("app_param_data")
    public java.util.List<AppParamData> appParamData;

    public static AutoTestProduct build(java.util.Map<String, ?> map) throws Exception {
        AutoTestProduct self = new AutoTestProduct();
        return TeaModel.build(map, self);
    }

    public AutoTestProduct setDeployUnit(String deployUnit) {
        this.deployUnit = deployUnit;
        return this;
    }
    public String getDeployUnit() {
        return this.deployUnit;
    }

    public AutoTestProduct setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public AutoTestProduct setAppParamData(java.util.List<AppParamData> appParamData) {
        this.appParamData = appParamData;
        return this;
    }
    public java.util.List<AppParamData> getAppParamData() {
        return this.appParamData;
    }

}
