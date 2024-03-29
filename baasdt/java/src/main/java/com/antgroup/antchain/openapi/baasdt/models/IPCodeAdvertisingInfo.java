// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCodeAdvertisingInfo extends TeaModel {
    // 资源位头图
    @NameInMap("ad_image")
    public String adImage;

    // 资源位头图可直接访问的临时链接
    @NameInMap("ad_image_tmp")
    public String adImageTmp;

    // 资源位链接
    @NameInMap("ad_url")
    public String adUrl;

    // 资源商品名称
    @NameInMap("ad_name")
    public String adName;

    // 广告位类型，为空时代表是商品广告位，Resource时代表是资源位
    @NameInMap("ad_type")
    public String adType;

    // 展示有效期开始时间
    @NameInMap("ad_valid_begin_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String adValidBeginTime;

    // 展示有效期结束时间
    @NameInMap("ad_valid_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String adValidEndTime;

    public static IPCodeAdvertisingInfo build(java.util.Map<String, ?> map) throws Exception {
        IPCodeAdvertisingInfo self = new IPCodeAdvertisingInfo();
        return TeaModel.build(map, self);
    }

    public IPCodeAdvertisingInfo setAdImage(String adImage) {
        this.adImage = adImage;
        return this;
    }
    public String getAdImage() {
        return this.adImage;
    }

    public IPCodeAdvertisingInfo setAdImageTmp(String adImageTmp) {
        this.adImageTmp = adImageTmp;
        return this;
    }
    public String getAdImageTmp() {
        return this.adImageTmp;
    }

    public IPCodeAdvertisingInfo setAdUrl(String adUrl) {
        this.adUrl = adUrl;
        return this;
    }
    public String getAdUrl() {
        return this.adUrl;
    }

    public IPCodeAdvertisingInfo setAdName(String adName) {
        this.adName = adName;
        return this;
    }
    public String getAdName() {
        return this.adName;
    }

    public IPCodeAdvertisingInfo setAdType(String adType) {
        this.adType = adType;
        return this;
    }
    public String getAdType() {
        return this.adType;
    }

    public IPCodeAdvertisingInfo setAdValidBeginTime(String adValidBeginTime) {
        this.adValidBeginTime = adValidBeginTime;
        return this;
    }
    public String getAdValidBeginTime() {
        return this.adValidBeginTime;
    }

    public IPCodeAdvertisingInfo setAdValidEndTime(String adValidEndTime) {
        this.adValidEndTime = adValidEndTime;
        return this;
    }
    public String getAdValidEndTime() {
        return this.adValidEndTime;
    }

}
