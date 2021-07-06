// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class HitDetectItems extends TeaModel {
    // RULEORMODEL("RULEORMODEL", "规则或模型"), KEYWORDS("KEYWORDS", "关键字检测 "), REPEAT_MODEL("REPEAT_MODEL", "防重复模型"), REGEX("regex", "正则表达式"), URL("url", "URL检测"), SEXY_PIC("sexyPic", "黄图检测"), SAMPLE_PIC("samplePic", "样图检测"), OCR("ocr", "图文识别"), PICTURE_FACE("picture_face","图片人脸检测"), QRCODE("QRCode", "二维码检测"), MDP_MODEL("mdpModel", "mdp检测"), ANTI_SPAM_MODEL("anti_spam_model", "反垃圾模型");
    @NameInMap("detect_type_code")
    public String detectTypeCode;

    // 命中的检测项的资源： 如命中关键字，则存关键字，如命中正则表达式，则保存正则表达式
    @NameInMap("hit_detect_resource")
    public String hitDetectResource;

    // 保存被命中的内容： 如正则表达式，则保存被正则表达式命中的内容
    @NameInMap("hit_content")
    public String hitContent;

    // 级别
    @NameInMap("detect_resource_level")
    public String detectResourceLevel;

    public static HitDetectItems build(java.util.Map<String, ?> map) throws Exception {
        HitDetectItems self = new HitDetectItems();
        return TeaModel.build(map, self);
    }

    public HitDetectItems setDetectTypeCode(String detectTypeCode) {
        this.detectTypeCode = detectTypeCode;
        return this;
    }
    public String getDetectTypeCode() {
        return this.detectTypeCode;
    }

    public HitDetectItems setHitDetectResource(String hitDetectResource) {
        this.hitDetectResource = hitDetectResource;
        return this;
    }
    public String getHitDetectResource() {
        return this.hitDetectResource;
    }

    public HitDetectItems setHitContent(String hitContent) {
        this.hitContent = hitContent;
        return this;
    }
    public String getHitContent() {
        return this.hitContent;
    }

    public HitDetectItems setDetectResourceLevel(String detectResourceLevel) {
        this.detectResourceLevel = detectResourceLevel;
        return this;
    }
    public String getDetectResourceLevel() {
        return this.detectResourceLevel;
    }

}
