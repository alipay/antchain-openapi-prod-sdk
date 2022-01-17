// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ParamMappingInfoPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<ParamMappingInfoVO> list;

    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static ParamMappingInfoPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        ParamMappingInfoPagedListVO self = new ParamMappingInfoPagedListVO();
        return TeaModel.build(map, self);
    }

    public ParamMappingInfoPagedListVO setList(java.util.List<ParamMappingInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ParamMappingInfoVO> getList() {
        return this.list;
    }

    public ParamMappingInfoPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
