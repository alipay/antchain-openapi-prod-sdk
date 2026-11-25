// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ContentInfo extends TeaModel {
    // 类型
    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // type=text时提供，文本
    /**
     * <strong>example:</strong>
     * <p>生成一只猫</p>
     */
    @NameInMap("text")
    public String text;

    // type=xxx_url时提供
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.test.com/123">www.test.com/123</a></p>
     */
    @NameInMap("url")
    public ContentUrl url;

    // 角色
    /**
     * <strong>example:</strong>
     * <p>reference_image</p>
     */
    @NameInMap("role")
    public String role;

    public static ContentInfo build(java.util.Map<String, ?> map) throws Exception {
        ContentInfo self = new ContentInfo();
        return TeaModel.build(map, self);
    }

    public ContentInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ContentInfo setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ContentInfo setUrl(ContentUrl url) {
        this.url = url;
        return this;
    }
    public ContentUrl getUrl() {
        return this.url;
    }

    public ContentInfo setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
