// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiGoodsPoint extends TeaModel {
    // 鉴定点名称
    /**
     * <strong>example:</strong>
     * <p>内包装</p>
     */
    @NameInMap("point_name")
    @Validation(required = true)
    public String pointName;

    // 鉴定点子项
    /**
     * <strong>example:</strong>
     * <p>正面</p>
     */
    @NameInMap("sub_point_name")
    @Validation(required = true)
    public String subPointName;

    // 鉴定点图片的url
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxxxx/a.png">https://xxxxxx/a.png</a></p>
     */
    @NameInMap("image_url")
    public String imageUrl;

    // 图片内容base64编码的字符串，该字段与image_url至少一个非空，同时传入以image_url为准
    /**
     * <strong>example:</strong>
     * <p>/9j/4QyXRXhpZgAATU0AKgAAAAgABwESAAMAAAABAAEAAAEa......</p>
     */
    @NameInMap("image_base64")
    public String imageBase64;

    // 用户侧鉴定单关联id
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("user_point_id")
    public String userPointId;

    public static BaiGoodsPoint build(java.util.Map<String, ?> map) throws Exception {
        BaiGoodsPoint self = new BaiGoodsPoint();
        return TeaModel.build(map, self);
    }

    public BaiGoodsPoint setPointName(String pointName) {
        this.pointName = pointName;
        return this;
    }
    public String getPointName() {
        return this.pointName;
    }

    public BaiGoodsPoint setSubPointName(String subPointName) {
        this.subPointName = subPointName;
        return this;
    }
    public String getSubPointName() {
        return this.subPointName;
    }

    public BaiGoodsPoint setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public BaiGoodsPoint setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }
    public String getImageBase64() {
        return this.imageBase64;
    }

    public BaiGoodsPoint setUserPointId(String userPointId) {
        this.userPointId = userPointId;
        return this;
    }
    public String getUserPointId() {
        return this.userPointId;
    }

}
