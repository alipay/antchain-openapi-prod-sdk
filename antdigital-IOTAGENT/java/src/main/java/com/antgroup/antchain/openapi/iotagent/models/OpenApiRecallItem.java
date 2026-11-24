// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class OpenApiRecallItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("source_file")
    @Validation(required = true)
    public String sourceFile;

    // 现有召回引擎原始相关性分数，不假定0到1
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("score")
    @Validation(required = true)
    public Long score;

    public static OpenApiRecallItem build(java.util.Map<String, ?> map) throws Exception {
        OpenApiRecallItem self = new OpenApiRecallItem();
        return TeaModel.build(map, self);
    }

    public OpenApiRecallItem setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public OpenApiRecallItem setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
        return this;
    }
    public String getSourceFile() {
        return this.sourceFile;
    }

    public OpenApiRecallItem setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

}
