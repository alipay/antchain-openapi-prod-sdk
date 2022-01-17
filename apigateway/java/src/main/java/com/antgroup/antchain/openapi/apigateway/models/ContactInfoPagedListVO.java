// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ContactInfoPagedListVO extends TeaModel {
    // 分页信息
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // 联系方式列表
    @NameInMap("list")
    public java.util.List<ContactInfoVO> list;

    public static ContactInfoPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        ContactInfoPagedListVO self = new ContactInfoPagedListVO();
        return TeaModel.build(map, self);
    }

    public ContactInfoPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ContactInfoPagedListVO setList(java.util.List<ContactInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ContactInfoVO> getList() {
        return this.list;
    }

}
