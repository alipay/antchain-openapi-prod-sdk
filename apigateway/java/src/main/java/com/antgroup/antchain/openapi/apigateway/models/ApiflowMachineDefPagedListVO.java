// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowMachineDefPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<ApiflowMachineDefVO> list;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static ApiflowMachineDefPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowMachineDefPagedListVO self = new ApiflowMachineDefPagedListVO();
        return TeaModel.build(map, self);
    }

    public ApiflowMachineDefPagedListVO setList(java.util.List<ApiflowMachineDefVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ApiflowMachineDefVO> getList() {
        return this.list;
    }

    public ApiflowMachineDefPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
