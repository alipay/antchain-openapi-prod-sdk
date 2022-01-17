// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiMockConfigVO extends TeaModel {
    // mock_data
    @NameInMap("mock_data")
    public String mockData;

    public static ApiMockConfigVO build(java.util.Map<String, ?> map) throws Exception {
        ApiMockConfigVO self = new ApiMockConfigVO();
        return TeaModel.build(map, self);
    }

    public ApiMockConfigVO setMockData(String mockData) {
        this.mockData = mockData;
        return this;
    }
    public String getMockData() {
        return this.mockData;
    }

}
