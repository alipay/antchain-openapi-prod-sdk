// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class CorsInfoPagedListVO extends TeaModel {
    // cors列表
    @NameInMap("list")
    public java.util.List<CorsInfoVO> list;

    // 分页信息
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static CorsInfoPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        CorsInfoPagedListVO self = new CorsInfoPagedListVO();
        return TeaModel.build(map, self);
    }

    public CorsInfoPagedListVO setList(java.util.List<CorsInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<CorsInfoVO> getList() {
        return this.list;
    }

    public CorsInfoPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
