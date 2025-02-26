// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9705ae7650f74f47b1e8158151cc122f.models;

import com.aliyun.tea.*;

public class DciExplanationInfo extends TeaModel {
    // 创作目的，描述作品创作的目的
    @NameInMap("creation_purpose")
    @Validation(required = true)
    public String creationPurpose;

    // 创作过程，具体的创作过程
    @NameInMap("creation_process")
    @Validation(required = true)
    public String creationProcess;

    // 阐述作品的独创性
    @NameInMap("originality")
    @Validation(required = true)
    public String originality;

    // 创作过程涉及到字体使用相关版权说明
    @NameInMap("font_copyright")
    public String fontCopyright;

    // 创作过程涉及到字体使用相关版权说明	
    // 
    @NameInMap("font_types")
    public java.util.List<String> fontTypes;

    public static DciExplanationInfo build(java.util.Map<String, ?> map) throws Exception {
        DciExplanationInfo self = new DciExplanationInfo();
        return TeaModel.build(map, self);
    }

    public DciExplanationInfo setCreationPurpose(String creationPurpose) {
        this.creationPurpose = creationPurpose;
        return this;
    }
    public String getCreationPurpose() {
        return this.creationPurpose;
    }

    public DciExplanationInfo setCreationProcess(String creationProcess) {
        this.creationProcess = creationProcess;
        return this;
    }
    public String getCreationProcess() {
        return this.creationProcess;
    }

    public DciExplanationInfo setOriginality(String originality) {
        this.originality = originality;
        return this;
    }
    public String getOriginality() {
        return this.originality;
    }

    public DciExplanationInfo setFontCopyright(String fontCopyright) {
        this.fontCopyright = fontCopyright;
        return this;
    }
    public String getFontCopyright() {
        return this.fontCopyright;
    }

    public DciExplanationInfo setFontTypes(java.util.List<String> fontTypes) {
        this.fontTypes = fontTypes;
        return this;
    }
    public java.util.List<String> getFontTypes() {
        return this.fontTypes;
    }

}
