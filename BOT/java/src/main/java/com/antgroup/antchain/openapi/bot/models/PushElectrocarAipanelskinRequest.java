// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushElectrocarAipanelskinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ekyt设备唯一标识
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 皮肤id
    @NameInMap("skin_id")
    @Validation(required = true)
    public String skinId;

    // 0 全量、1 背景图、2 开关机动画、3 电子宠物动画
    @NameInMap("skin_type")
    @Validation(required = true)
    public Long skinType;

    // 文件大小，单位字节
    @NameInMap("skin_size")
    @Validation(required = true)
    public Long skinSize;

    // 是	目标屏幕宽高
    @NameInMap("screen_w")
    @Validation(required = true)
    public Long screenW;

    // 目标屏幕高
    @NameInMap("screen_h")
    @Validation(required = true)
    public Long screenH;

    // 格式版本
    @NameInMap("format_ver")
    public Long formatVer;

    // 打包皮肤url地址
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 可选扩展字段
    @NameInMap("ext")
    public String ext;

    // 面板id
    @NameInMap("dash_id")
    @Validation(required = true)
    public String dashId;

    public static PushElectrocarAipanelskinRequest build(java.util.Map<String, ?> map) throws Exception {
        PushElectrocarAipanelskinRequest self = new PushElectrocarAipanelskinRequest();
        return TeaModel.build(map, self);
    }

    public PushElectrocarAipanelskinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushElectrocarAipanelskinRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushElectrocarAipanelskinRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public PushElectrocarAipanelskinRequest setSkinId(String skinId) {
        this.skinId = skinId;
        return this;
    }
    public String getSkinId() {
        return this.skinId;
    }

    public PushElectrocarAipanelskinRequest setSkinType(Long skinType) {
        this.skinType = skinType;
        return this;
    }
    public Long getSkinType() {
        return this.skinType;
    }

    public PushElectrocarAipanelskinRequest setSkinSize(Long skinSize) {
        this.skinSize = skinSize;
        return this;
    }
    public Long getSkinSize() {
        return this.skinSize;
    }

    public PushElectrocarAipanelskinRequest setScreenW(Long screenW) {
        this.screenW = screenW;
        return this;
    }
    public Long getScreenW() {
        return this.screenW;
    }

    public PushElectrocarAipanelskinRequest setScreenH(Long screenH) {
        this.screenH = screenH;
        return this;
    }
    public Long getScreenH() {
        return this.screenH;
    }

    public PushElectrocarAipanelskinRequest setFormatVer(Long formatVer) {
        this.formatVer = formatVer;
        return this;
    }
    public Long getFormatVer() {
        return this.formatVer;
    }

    public PushElectrocarAipanelskinRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public PushElectrocarAipanelskinRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public PushElectrocarAipanelskinRequest setDashId(String dashId) {
        this.dashId = dashId;
        return this;
    }
    public String getDashId() {
        return this.dashId;
    }

}
