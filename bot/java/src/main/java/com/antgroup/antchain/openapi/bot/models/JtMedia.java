// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class JtMedia extends TeaModel {
    // 多媒体ID
    @NameInMap("media_id")
    @Validation(required = true)
    public String mediaId;

    // 文件名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 可访问的url
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 上传时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 多媒体类型枚举：IMAGE 图像；AUDIO 音频；VIDEO视频； UN_KNOW  未知；
    @NameInMap("media_type")
    @Validation(required = true)
    public String mediaType;

    public static JtMedia build(java.util.Map<String, ?> map) throws Exception {
        JtMedia self = new JtMedia();
        return TeaModel.build(map, self);
    }

    public JtMedia setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public JtMedia setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public JtMedia setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public JtMedia setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public JtMedia setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

}
