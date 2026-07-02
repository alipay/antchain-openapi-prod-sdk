// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class JtMedia extends TeaModel {
    // 多媒体ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("media_id")
    @Validation(required = true)
    public String mediaId;

    // 文件名称
    /**
     * <strong>example:</strong>
     * <p>xxxx.jpg</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 可访问的url
    /**
     * <strong>example:</strong>
     * <p><a href="https://oss.com/53/85855.jpg?sign=xxx">https://oss.com/53/85855.jpg?sign=xxx</a></p>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 上传时间
    /**
     * <strong>example:</strong>
     * <p>1687859592688</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 多媒体类型枚举：IMAGE 图像；AUDIO 音频；VIDEO视频； UN_KNOW  未知；
    /**
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
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
