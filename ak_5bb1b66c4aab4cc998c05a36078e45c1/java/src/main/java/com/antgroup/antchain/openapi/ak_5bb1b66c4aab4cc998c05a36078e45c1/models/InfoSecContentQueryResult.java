// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class InfoSecContentQueryResult extends TeaModel {
    // 检测来源等级
    @NameInMap("detect_resource_level")
    public String detectResourceLevel;

    // 检测结果类型
    @NameInMap("detect_type_code")
    public String detectTypeCode;

    // 命中内容
    @NameInMap("hit_content")
    public String hitContent;

    // 检测命中来源
    @NameInMap("hit_detect_resource")
    public String hitDetectResource;

    public static InfoSecContentQueryResult build(java.util.Map<String, ?> map) throws Exception {
        InfoSecContentQueryResult self = new InfoSecContentQueryResult();
        return TeaModel.build(map, self);
    }

    public InfoSecContentQueryResult setDetectResourceLevel(String detectResourceLevel) {
        this.detectResourceLevel = detectResourceLevel;
        return this;
    }
    public String getDetectResourceLevel() {
        return this.detectResourceLevel;
    }

    public InfoSecContentQueryResult setDetectTypeCode(String detectTypeCode) {
        this.detectTypeCode = detectTypeCode;
        return this;
    }
    public String getDetectTypeCode() {
        return this.detectTypeCode;
    }

    public InfoSecContentQueryResult setHitContent(String hitContent) {
        this.hitContent = hitContent;
        return this;
    }
    public String getHitContent() {
        return this.hitContent;
    }

    public InfoSecContentQueryResult setHitDetectResource(String hitDetectResource) {
        this.hitDetectResource = hitDetectResource;
        return this;
    }
    public String getHitDetectResource() {
        return this.hitDetectResource;
    }

}
