// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class RegistryInfoPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<RegistryInfoVO> list;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static RegistryInfoPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        RegistryInfoPagedListVO self = new RegistryInfoPagedListVO();
        return TeaModel.build(map, self);
    }

    public RegistryInfoPagedListVO setList(java.util.List<RegistryInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<RegistryInfoVO> getList() {
        return this.list;
    }

    public RegistryInfoPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
