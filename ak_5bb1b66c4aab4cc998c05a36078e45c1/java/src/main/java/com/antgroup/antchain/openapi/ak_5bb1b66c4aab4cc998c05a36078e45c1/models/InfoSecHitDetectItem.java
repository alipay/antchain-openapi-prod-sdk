// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class InfoSecHitDetectItem extends TeaModel {
    // 123
    @NameInMap("detect_type_code")
    public String detectTypeCode;

    // 123
    @NameInMap("hit_detect_resource")
    public String hitDetectResource;

    // 123
    @NameInMap("hit_content")
    public String hitContent;

    // 123
    @NameInMap("detect_resource_level")
    public String detectResourceLevel;

    public static InfoSecHitDetectItem build(java.util.Map<String, ?> map) throws Exception {
        InfoSecHitDetectItem self = new InfoSecHitDetectItem();
        return TeaModel.build(map, self);
    }

    public InfoSecHitDetectItem setDetectTypeCode(String detectTypeCode) {
        this.detectTypeCode = detectTypeCode;
        return this;
    }
    public String getDetectTypeCode() {
        return this.detectTypeCode;
    }

    public InfoSecHitDetectItem setHitDetectResource(String hitDetectResource) {
        this.hitDetectResource = hitDetectResource;
        return this;
    }
    public String getHitDetectResource() {
        return this.hitDetectResource;
    }

    public InfoSecHitDetectItem setHitContent(String hitContent) {
        this.hitContent = hitContent;
        return this;
    }
    public String getHitContent() {
        return this.hitContent;
    }

    public InfoSecHitDetectItem setDetectResourceLevel(String detectResourceLevel) {
        this.detectResourceLevel = detectResourceLevel;
        return this;
    }
    public String getDetectResourceLevel() {
        return this.detectResourceLevel;
    }

}
