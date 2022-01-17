// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AuthAppInfoPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<AuthAppInfoVO> list;

    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static AuthAppInfoPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        AuthAppInfoPagedListVO self = new AuthAppInfoPagedListVO();
        return TeaModel.build(map, self);
    }

    public AuthAppInfoPagedListVO setList(java.util.List<AuthAppInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AuthAppInfoVO> getList() {
        return this.list;
    }

    public AuthAppInfoPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
