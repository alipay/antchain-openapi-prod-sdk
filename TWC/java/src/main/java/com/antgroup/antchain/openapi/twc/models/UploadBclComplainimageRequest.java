// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UploadBclComplainimageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 图片格式，支持格式：jpg、jpeg、png
    @NameInMap("image_name")
    @Validation(required = true, maxLength = 64)
    public String imageName;

    // 图片二进制字节流
    @NameInMap("image_content")
    @Validation(required = true)
    public String imageContent;

    public static UploadBclComplainimageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadBclComplainimageRequest self = new UploadBclComplainimageRequest();
        return TeaModel.build(map, self);
    }

    public UploadBclComplainimageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadBclComplainimageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadBclComplainimageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public UploadBclComplainimageRequest setImageContent(String imageContent) {
        this.imageContent = imageContent;
        return this;
    }
    public String getImageContent() {
        return this.imageContent;
    }

}
