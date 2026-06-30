// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustomerUmktInfoModel extends TeaModel {
    // 基本圈客结果信息
    @NameInMap("base_info")
    @Validation(required = true)
    public BaseCustomerUmktInfoModel baseInfo;

    // 额外的营销分结果
    /**
     * <strong>example:</strong>
     * <p>{&quot;f_01&quot;:&quot;95.0&quot;}</p>
     */
    @NameInMap("umkt_out_put_info")
    public String umktOutPutInfo;

    public static CustomerUmktInfoModel build(java.util.Map<String, ?> map) throws Exception {
        CustomerUmktInfoModel self = new CustomerUmktInfoModel();
        return TeaModel.build(map, self);
    }

    public CustomerUmktInfoModel setBaseInfo(BaseCustomerUmktInfoModel baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }
    public BaseCustomerUmktInfoModel getBaseInfo() {
        return this.baseInfo;
    }

    public CustomerUmktInfoModel setUmktOutPutInfo(String umktOutPutInfo) {
        this.umktOutPutInfo = umktOutPutInfo;
        return this;
    }
    public String getUmktOutPutInfo() {
        return this.umktOutPutInfo;
    }

}
