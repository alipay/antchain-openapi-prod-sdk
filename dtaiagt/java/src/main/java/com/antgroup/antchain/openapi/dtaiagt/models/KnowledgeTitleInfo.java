// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class KnowledgeTitleInfo extends TeaModel {
    // title
    /**
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // score 浮点类型
    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    public static KnowledgeTitleInfo build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeTitleInfo self = new KnowledgeTitleInfo();
        return TeaModel.build(map, self);
    }

    public KnowledgeTitleInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public KnowledgeTitleInfo setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

}
