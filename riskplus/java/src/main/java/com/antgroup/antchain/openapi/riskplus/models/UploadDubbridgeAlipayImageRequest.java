// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UploadDubbridgeAlipayImageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // request请求单号，每次请求唯一，如uuid
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 门店Id
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 门店所属子品牌，
    // TBJHF: 赛鸽出行-
    // AIJNBJ: 智迈电动车
    // KJOKJBO: 金箭出行
    // IFJRJTIJ: 骑士智行
    // KVMPOH: 巨龙智行
    // NPGBRVBO: 摩生态A
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 图片种类，
    // 10: 营业执照
    // 20: 门头照
    // 21: 内景照
    @NameInMap("image_category")
    @Validation(required = true)
    public String imageCategory;

    // 文件base64字符串，最大10M；（建议）
    @NameInMap("image_content")
    public String imageContent;

    // 图片文件路径
    @NameInMap("image_path")
    public String imagePath;

    // 图片格式，
    // 支持格式：bmp、jpg、jpeg、png、gif
    @NameInMap("image_type")
    @Validation(required = true)
    public String imageType;

    public static UploadDubbridgeAlipayImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDubbridgeAlipayImageRequest self = new UploadDubbridgeAlipayImageRequest();
        return TeaModel.build(map, self);
    }

    public UploadDubbridgeAlipayImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadDubbridgeAlipayImageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadDubbridgeAlipayImageRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public UploadDubbridgeAlipayImageRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public UploadDubbridgeAlipayImageRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public UploadDubbridgeAlipayImageRequest setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

    public UploadDubbridgeAlipayImageRequest setImageContent(String imageContent) {
        this.imageContent = imageContent;
        return this;
    }
    public String getImageContent() {
        return this.imageContent;
    }

    public UploadDubbridgeAlipayImageRequest setImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }
    public String getImagePath() {
        return this.imagePath;
    }

    public UploadDubbridgeAlipayImageRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

}
