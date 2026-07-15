// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class SmsMaterial extends TeaModel {
    // 素材名称，当素材类型
    // 为"text/plain"时可不传，其他情况必传
    /**
     * <strong>example:</strong>
     * <p>图片1</p>
     */
    @NameInMap("material_name")
    public String materialName;

    // 素材类型
    // 本期最多只⽀持⼀张图⽚和⼀段⽂本信息；变量占位符只能是按顺序的数字{1}-{9},最多⽀持9个变量；链接中的变量只能放在尾部，如：http://aabbcc/{1}
    /**
     * <strong>example:</strong>
     * <p>1、图⽚ &quot;image/png&quot; &quot;image/jpg&quot; &quot;image/gif&quot; &quot;image/jpeg&quot; 2、视频 &quot;video/mp4&quot; &quot;video/3gp&quot; 3、⾳频 &quot;audio/mp3&quot; &quot;audio/amr&quot; &quot;audio/aac&quot; 4、⽂本 &quot;text/plain&quot;</p>
     */
    @NameInMap("material_type")
    @Validation(required = true)
    public String materialType;

    // 素材内容
    /**
     * <strong>example:</strong>
     * <p> 1、⽂本：原内容 2、图⽚/视频/⾳ 频：base64编码之 后的字符串</p>
     */
    @NameInMap("material_content")
    @Validation(required = true)
    public String materialContent;

    public static SmsMaterial build(java.util.Map<String, ?> map) throws Exception {
        SmsMaterial self = new SmsMaterial();
        return TeaModel.build(map, self);
    }

    public SmsMaterial setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public SmsMaterial setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public SmsMaterial setMaterialContent(String materialContent) {
        this.materialContent = materialContent;
        return this;
    }
    public String getMaterialContent() {
        return this.materialContent;
    }

}
