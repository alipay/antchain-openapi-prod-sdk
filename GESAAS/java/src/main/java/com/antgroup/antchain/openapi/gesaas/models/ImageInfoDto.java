// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class ImageInfoDto extends TeaModel {
    // 图片url
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx.alipay.com/paths/xx.png">https://xxx.alipay.com/paths/xx.png</a></p>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 角色/用途   首帧:first_frame、尾帧:last_frame 、参考图：reference_image
    /**
     * <strong>example:</strong>
     * <p>first_frame</p>
     */
    @NameInMap("role")
    public String role;

    public static ImageInfoDto build(java.util.Map<String, ?> map) throws Exception {
        ImageInfoDto self = new ImageInfoDto();
        return TeaModel.build(map, self);
    }

    public ImageInfoDto setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ImageInfoDto setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
