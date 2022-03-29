// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class LinkDTO extends TeaModel {
    // demo工程
    @NameInMap("demo_project")
    @Validation(required = true)
    public String demoProject;

    // 产品文档
    @NameInMap("product_doc")
    @Validation(required = true)
    public String productDoc;

    // 快速开始文档
    @NameInMap("quick_start")
    @Validation(required = true)
    public String quickStart;

    public static LinkDTO build(java.util.Map<String, ?> map) throws Exception {
        LinkDTO self = new LinkDTO();
        return TeaModel.build(map, self);
    }

    public LinkDTO setDemoProject(String demoProject) {
        this.demoProject = demoProject;
        return this;
    }
    public String getDemoProject() {
        return this.demoProject;
    }

    public LinkDTO setProductDoc(String productDoc) {
        this.productDoc = productDoc;
        return this;
    }
    public String getProductDoc() {
        return this.productDoc;
    }

    public LinkDTO setQuickStart(String quickStart) {
        this.quickStart = quickStart;
        return this;
    }
    public String getQuickStart() {
        return this.quickStart;
    }

}
