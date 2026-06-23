// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class PageContext extends TeaModel {
    // 页面di
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("page_id")
    public String pageId;

    // 页面标题
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
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
