// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class PhaseItem extends TeaModel {
    // 标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 类型
    // TEXT: 文本，
    // IMAGE： 图片,
    // VIDEO:  视频,
    // LONGTEXT: 长文本,
    // MAP: 地图,
    // BANNER: 广告位,
    // PDF: pdf文件,
    // CERTIFICATE: 认证信息
    // NESTED： 嵌套类型
    // CUSTOMIZE： 自定义类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 扩展信息
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    public static PhaseItem build(java.util.Map<String, ?> map) throws Exception {
        PhaseItem self = new PhaseItem();
        return TeaModel.build(map, self);
    }

    public PhaseItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PhaseItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PhaseItem setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public PhaseItem setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
