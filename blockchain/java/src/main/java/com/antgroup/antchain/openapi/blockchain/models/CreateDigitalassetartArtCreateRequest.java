// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDigitalassetartArtCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 艺术品锚定物
    @NameInMap("art_anchor")
    @Validation(required = true)
    public String artAnchor;

    // 艺术品唯一id
    @NameInMap("art_id")
    @Validation(required = true)
    public String artId;

    // 艺术品名称
    @NameInMap("art_name")
    @Validation(required = true)
    public String artName;

    // 艺术品代码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 创建时间
    @NameInMap("create_date")
    @Validation(required = true)
    public String createDate;

    // 鉴定者账户
    @NameInMap("identifiers")
    @Validation(required = true)
    public java.util.List<String> identifiers;

    // 艺术品图片哈希
    @NameInMap("image_hashes")
    @Validation(required = true)
    public java.util.List<String> imageHashes;

    // 一级分类
    @NameInMap("main_class")
    @Validation(required = true)
    public String mainClass;

    // 拥有者链上账户地址
    @NameInMap("owner_account_id")
    @Validation(required = true)
    public String ownerAccountId;

    // 二级分类
    @NameInMap("sub_class")
    @Validation(required = true)
    public String subClass;

    // 艺术品视频哈希
    @NameInMap("vedio_hashes")
    @Validation(required = true)
    public java.util.List<String> vedioHashes;

    public static CreateDigitalassetartArtCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalassetartArtCreateRequest self = new CreateDigitalassetartArtCreateRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalassetartArtCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDigitalassetartArtCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDigitalassetartArtCreateRequest setArtAnchor(String artAnchor) {
        this.artAnchor = artAnchor;
        return this;
    }
    public String getArtAnchor() {
        return this.artAnchor;
    }

    public CreateDigitalassetartArtCreateRequest setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

    public CreateDigitalassetartArtCreateRequest setArtName(String artName) {
        this.artName = artName;
        return this;
    }
    public String getArtName() {
        return this.artName;
    }

    public CreateDigitalassetartArtCreateRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDigitalassetartArtCreateRequest setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public CreateDigitalassetartArtCreateRequest setIdentifiers(java.util.List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }
    public java.util.List<String> getIdentifiers() {
        return this.identifiers;
    }

    public CreateDigitalassetartArtCreateRequest setImageHashes(java.util.List<String> imageHashes) {
        this.imageHashes = imageHashes;
        return this;
    }
    public java.util.List<String> getImageHashes() {
        return this.imageHashes;
    }

    public CreateDigitalassetartArtCreateRequest setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public CreateDigitalassetartArtCreateRequest setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public CreateDigitalassetartArtCreateRequest setSubClass(String subClass) {
        this.subClass = subClass;
        return this;
    }
    public String getSubClass() {
        return this.subClass;
    }

    public CreateDigitalassetartArtCreateRequest setVedioHashes(java.util.List<String> vedioHashes) {
        this.vedioHashes = vedioHashes;
        return this;
    }
    public java.util.List<String> getVedioHashes() {
        return this.vedioHashes;
    }

}
