// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiQrcodeComparisonReqData extends TeaModel {
    // query图片定位信息
    @NameInMap("query_image_location")
    @Validation(required = true)
    public BaiResourceLocation queryImageLocation;

    // gallery图片定位信息
    @NameInMap("gallery_image_location")
    @Validation(required = true)
    public BaiResourceLocation galleryImageLocation;

    // 是否允许降级
    @NameInMap("downgrade")
    @Validation(required = true)
    public Boolean downgrade;

    public static BaiQrcodeComparisonReqData build(java.util.Map<String, ?> map) throws Exception {
        BaiQrcodeComparisonReqData self = new BaiQrcodeComparisonReqData();
        return TeaModel.build(map, self);
    }

    public BaiQrcodeComparisonReqData setQueryImageLocation(BaiResourceLocation queryImageLocation) {
        this.queryImageLocation = queryImageLocation;
        return this;
    }
    public BaiResourceLocation getQueryImageLocation() {
        return this.queryImageLocation;
    }

    public BaiQrcodeComparisonReqData setGalleryImageLocation(BaiResourceLocation galleryImageLocation) {
        this.galleryImageLocation = galleryImageLocation;
        return this;
    }
    public BaiResourceLocation getGalleryImageLocation() {
        return this.galleryImageLocation;
    }

    public BaiQrcodeComparisonReqData setDowngrade(Boolean downgrade) {
        this.downgrade = downgrade;
        return this;
    }
    public Boolean getDowngrade() {
        return this.downgrade;
    }

}
