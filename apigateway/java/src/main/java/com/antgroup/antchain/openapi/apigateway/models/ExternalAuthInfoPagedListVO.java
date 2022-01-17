// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ExternalAuthInfoPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<ExternalAuthInfoVO> list;

    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static ExternalAuthInfoPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        ExternalAuthInfoPagedListVO self = new ExternalAuthInfoPagedListVO();
        return TeaModel.build(map, self);
    }

    public ExternalAuthInfoPagedListVO setList(java.util.List<ExternalAuthInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ExternalAuthInfoVO> getList() {
        return this.list;
    }

    public ExternalAuthInfoPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
