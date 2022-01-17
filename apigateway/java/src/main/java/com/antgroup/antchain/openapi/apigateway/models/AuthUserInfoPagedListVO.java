// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AuthUserInfoPagedListVO extends TeaModel {
    // 当前页的数据
    @NameInMap("list")
    public java.util.List<AuthUserInfoVO> list;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static AuthUserInfoPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        AuthUserInfoPagedListVO self = new AuthUserInfoPagedListVO();
        return TeaModel.build(map, self);
    }

    public AuthUserInfoPagedListVO setList(java.util.List<AuthUserInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AuthUserInfoVO> getList() {
        return this.list;
    }

    public AuthUserInfoPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
