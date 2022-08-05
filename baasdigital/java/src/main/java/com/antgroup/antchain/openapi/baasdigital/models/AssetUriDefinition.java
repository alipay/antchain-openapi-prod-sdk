// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class AssetUriDefinition extends TeaModel {
    // 数字权证名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 数字权证描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 该权证的图片地址
    @NameInMap("image")
    @Validation(required = true, minLength = 1)
    public String image;

    // 资产指向外部的链接
    @NameInMap("external_url")
    public String externalUrl;

    // 背景颜色, 16进制6位Hex
    @NameInMap("background_color")
    public String backgroundColor;

    // 动态资源地址，可指向音视频资源，需先上传
    @NameInMap("animation_url")
    public String animationUrl;

    // 资源集合，可定义多个组合资源，适合有多资源文件的资产
    @NameInMap("resource_bundle")
    public java.util.List<ResourceBundle> resourceBundle;

    // 自定义的资产属性数组，数组元素需为json格式
    @NameInMap("attributes")
    public java.util.List<String> attributes;

    public static AssetUriDefinition build(java.util.Map<String, ?> map) throws Exception {
        AssetUriDefinition self = new AssetUriDefinition();
        return TeaModel.build(map, self);
    }

    public AssetUriDefinition setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AssetUriDefinition setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AssetUriDefinition setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public AssetUriDefinition setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public AssetUriDefinition setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public AssetUriDefinition setAnimationUrl(String animationUrl) {
        this.animationUrl = animationUrl;
        return this;
    }
    public String getAnimationUrl() {
        return this.animationUrl;
    }

    public AssetUriDefinition setResourceBundle(java.util.List<ResourceBundle> resourceBundle) {
        this.resourceBundle = resourceBundle;
        return this;
    }
    public java.util.List<ResourceBundle> getResourceBundle() {
        return this.resourceBundle;
    }

    public AssetUriDefinition setAttributes(java.util.List<String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<String> getAttributes() {
        return this.attributes;
    }

}
