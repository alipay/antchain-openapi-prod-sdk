// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class CustomerValueInfo extends TeaModel {
    // 客户价价值法信息
    @NameInMap("customer_value_details")
    public java.util.List<CustomerValueDetail> customerValueDetails;

    public static CustomerValueInfo build(java.util.Map<String, ?> map) throws Exception {
        CustomerValueInfo self = new CustomerValueInfo();
        return TeaModel.build(map, self);
    }

    public CustomerValueInfo setCustomerValueDetails(java.util.List<CustomerValueDetail> customerValueDetails) {
        this.customerValueDetails = customerValueDetails;
        return this;
    }
    public java.util.List<CustomerValueDetail> getCustomerValueDetails() {
        return this.customerValueDetails;
    }

}
