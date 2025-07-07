// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PoapInfo extends TeaModel {
    // 徽章ID，具有唯一性
    /**
     * <strong>example:</strong>
     * <p>ACconstellation_ADF</p>
     */
    @NameInMap("poap_id")
    @Validation(required = true)
    public String poapId;

    // 徽章名字
    /**
     * <strong>example:</strong>
     * <p>星座徽章</p>
     */
    @NameInMap("poap_name")
    @Validation(required = true)
    public String poapName;

    // 徽章HASH
    /**
     * <strong>example:</strong>
     * <p>0fddf9087f7c5bd71c2fabb4b520bdec9fe7157c00807b26f9ddff9cd5d73d77</p>
     */
    @NameInMap("uni_hash")
    @Validation(required = true)
    public String uniHash;

    // 状态，枚举值
    /**
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("status")
    public String status;

    // 徽章资源 URL
    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxx.ff.png">http://xxxx.ff.png</a></p>
     */
    @NameInMap("poap_url")
    @Validation(required = true)
    public String poapUrl;

    // 枚举值，2D_IMAGE--2D图片渲染；3D_OASISENGINE--3D模型渲染
    /**
     * <strong>example:</strong>
     * <p>2D_IMAGE</p>
     */
    @NameInMap("render_type")
    @Validation(required = true)
    public String renderType;

    // 3D模型降级使用的资源URL
    /**
     * <strong>example:</strong>
     * <p><a href="http://xxx.png">http://xxx.png</a></p>
     */
    @NameInMap("fault_tolerance_url")
    public String faultToleranceUrl;

    // 小程序详情跳转URL。临时链接，过期时间为 detail_alipays_url_expire_time 字段的值
    /**
     * <strong>example:</strong>
     * <p>alipays://platformapi/startapp?</p>
     */
    @NameInMap("detail_alipays_url")
    public String detailAlipaysUrl;

    // 详情页跳转URL过期时间
    /**
     * <strong>example:</strong>
     * <p>2022-12-31 23:59:59</p>
     */
    @NameInMap("detail_alipays_url_expire_time")
    public String detailAlipaysUrlExpireTime;

    public static PoapInfo build(java.util.Map<String, ?> map) throws Exception {
        PoapInfo self = new PoapInfo();
        return TeaModel.build(map, self);
    }

    public PoapInfo setPoapId(String poapId) {
        this.poapId = poapId;
        return this;
    }
    public String getPoapId() {
        return this.poapId;
    }

    public PoapInfo setPoapName(String poapName) {
        this.poapName = poapName;
        return this;
    }
    public String getPoapName() {
        return this.poapName;
    }

    public PoapInfo setUniHash(String uniHash) {
        this.uniHash = uniHash;
        return this;
    }
    public String getUniHash() {
        return this.uniHash;
    }

    public PoapInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PoapInfo setPoapUrl(String poapUrl) {
        this.poapUrl = poapUrl;
        return this;
    }
    public String getPoapUrl() {
        return this.poapUrl;
    }

    public PoapInfo setRenderType(String renderType) {
        this.renderType = renderType;
        return this;
    }
    public String getRenderType() {
        return this.renderType;
    }

    public PoapInfo setFaultToleranceUrl(String faultToleranceUrl) {
        this.faultToleranceUrl = faultToleranceUrl;
        return this;
    }
    public String getFaultToleranceUrl() {
        return this.faultToleranceUrl;
    }

    public PoapInfo setDetailAlipaysUrl(String detailAlipaysUrl) {
        this.detailAlipaysUrl = detailAlipaysUrl;
        return this;
    }
    public String getDetailAlipaysUrl() {
        return this.detailAlipaysUrl;
    }

    public PoapInfo setDetailAlipaysUrlExpireTime(String detailAlipaysUrlExpireTime) {
        this.detailAlipaysUrlExpireTime = detailAlipaysUrlExpireTime;
        return this;
    }
    public String getDetailAlipaysUrlExpireTime() {
        return this.detailAlipaysUrlExpireTime;
    }

}
