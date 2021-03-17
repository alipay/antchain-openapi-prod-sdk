// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class CreateRealtytradePersonalsealRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 个人在数字房产平台的唯一ID
    @NameInMap("personal_id")
    @Validation(required = true)
    public String personalId;

    // 图片data，BASE64 编码后图片信息，图片原始格式必须为 png
    @NameInMap("picture_data")
    @Validation(required = true)
    public String pictureData;

    // 印章高度，单位为px，默认95
    @NameInMap("seal_height")
    public Long sealHeight;

    // 印章宽度，单位为px，默认95
    @NameInMap("seal_width")
    public Long sealWidth;

    // 否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景。
    @NameInMap("transparentizing")
    public Boolean transparentizing;

    public static CreateRealtytradePersonalsealRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealtytradePersonalsealRequest self = new CreateRealtytradePersonalsealRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealtytradePersonalsealRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRealtytradePersonalsealRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRealtytradePersonalsealRequest setPersonalId(String personalId) {
        this.personalId = personalId;
        return this;
    }
    public String getPersonalId() {
        return this.personalId;
    }

    public CreateRealtytradePersonalsealRequest setPictureData(String pictureData) {
        this.pictureData = pictureData;
        return this;
    }
    public String getPictureData() {
        return this.pictureData;
    }

    public CreateRealtytradePersonalsealRequest setSealHeight(Long sealHeight) {
        this.sealHeight = sealHeight;
        return this;
    }
    public Long getSealHeight() {
        return this.sealHeight;
    }

    public CreateRealtytradePersonalsealRequest setSealWidth(Long sealWidth) {
        this.sealWidth = sealWidth;
        return this;
    }
    public Long getSealWidth() {
        return this.sealWidth;
    }

    public CreateRealtytradePersonalsealRequest setTransparentizing(Boolean transparentizing) {
        this.transparentizing = transparentizing;
        return this;
    }
    public Boolean getTransparentizing() {
        return this.transparentizing;
    }

}
