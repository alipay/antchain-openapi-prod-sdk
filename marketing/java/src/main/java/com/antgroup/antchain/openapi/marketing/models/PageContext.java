// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class PageContext extends TeaModel {
    // 页面di
    @NameInMap("page_id")
    public String pageId;

    // 页面标题
    @NameInMap("page_title")
    public String pageTitle;

    public static PageContext build(java.util.Map<String, ?> map) throws Exception {
        PageContext self = new PageContext();
        return TeaModel.build(map, self);
    }

    public PageContext setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public PageContext setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
        return this;
    }
    public String getPageTitle() {
        return this.pageTitle;
    }

}
