// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreatePngDetails extends TeaModel {
    // 明细唯一id，必填（用于标识明细中的唯一键，返回多个图片地址时，根据id去进行匹配）
    /**
     * <strong>example:</strong>
     * <p>明细唯一id，必填（用于标识明细中的唯一键，返回多个图片地址时，根据id去进行匹配）</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 身份类型，必填，SignUserTypeEnum
    /**
     * <strong>example:</strong>
     * <p>1、PERSON：个人 2、ORG：公司</p>
     */
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 名称，个人姓名/公司名称
    /**
     * <strong>example:</strong>
     * <p>个人姓名/公司名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 证件号，个人身份证/公司统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>个人身份证/公司统一社会信用代码</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 字体大小，选填，推荐不传（除特殊场景需要），默认40
    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("font_size")
    public Long fontSize;

    // 自定义名称，选填，不传则默认按照name参数中的值生成文件名。此参数主要用于同一个人需要生成不同样式的签名图片场景
    /**
     * <strong>example:</strong>
     * <p>自定义名称</p>
     */
    @NameInMap("custom_name")
    public String customName;

    // 字体颜色，选填，推荐不传（除特殊场景需要），默认黑色
    /**
     * <strong>example:</strong>
     * <p>字体颜色，选填，推荐不传（除特殊场景需要），默认黑色</p>
     */
    @NameInMap("font_color")
    public String fontColor;

    // [是否带边框，选填，推荐不传（除特殊场景需要），默认false]": "boolean"
    /**
     * <strong>example:</strong>
     * <p>是否带边框，选填，推荐不传（除特殊场景需要），默认false</p>
     */
    @NameInMap("with_border")
    public Boolean withBorder;

    // [边框颜色，选填，推荐不传（除特殊场景需要），默认红色]
    /**
     * <strong>example:</strong>
     * <p>[边框颜色，选填，推荐不传（除特殊场景需要），默认红色]</p>
     */
    @NameInMap("border_color")
    public String borderColor;

    public static CreatePngDetails build(java.util.Map<String, ?> map) throws Exception {
        CreatePngDetails self = new CreatePngDetails();
        return TeaModel.build(map, self);
    }

    public CreatePngDetails setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreatePngDetails setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreatePngDetails setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePngDetails setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreatePngDetails setFontSize(Long fontSize) {
        this.fontSize = fontSize;
        return this;
    }
    public Long getFontSize() {
        return this.fontSize;
    }

    public CreatePngDetails setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public CreatePngDetails setFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }
    public String getFontColor() {
        return this.fontColor;
    }

    public CreatePngDetails setWithBorder(Boolean withBorder) {
        this.withBorder = withBorder;
        return this;
    }
    public Boolean getWithBorder() {
        return this.withBorder;
    }

    public CreatePngDetails setBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }
    public String getBorderColor() {
        return this.borderColor;
    }

}
