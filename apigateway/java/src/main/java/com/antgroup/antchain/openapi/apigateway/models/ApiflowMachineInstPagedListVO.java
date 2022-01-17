// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowMachineInstPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<ApiflowMachineInstVO> list;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static ApiflowMachineInstPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowMachineInstPagedListVO self = new ApiflowMachineInstPagedListVO();
        return TeaModel.build(map, self);
    }

    public ApiflowMachineInstPagedListVO setList(java.util.List<ApiflowMachineInstVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ApiflowMachineInstVO> getList() {
        return this.list;
    }

    public ApiflowMachineInstPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
