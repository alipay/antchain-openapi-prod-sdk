// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryFaceverifyServermaterialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实人认证唯一标识
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 场景ID
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    // 图片的传入加密模式 0：明文 1：AES加密
    @NameInMap("material_enc_type")
    public String materialEncType;

    // 公钥加密后的密钥，用于传入的加密图片/视频
    @NameInMap("material_enc_token")
    public String materialEncToken;

    public static QueryFaceverifyServermaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceverifyServermaterialRequest self = new QueryFaceverifyServermaterialRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceverifyServermaterialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFaceverifyServermaterialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFaceverifyServermaterialRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryFaceverifyServermaterialRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryFaceverifyServermaterialRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public QueryFaceverifyServermaterialRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public QueryFaceverifyServermaterialRequest setMaterialEncType(String materialEncType) {
        this.materialEncType = materialEncType;
        return this;
    }
    public String getMaterialEncType() {
        return this.materialEncType;
    }

    public QueryFaceverifyServermaterialRequest setMaterialEncToken(String materialEncToken) {
        this.materialEncToken = materialEncToken;
        return this;
    }
    public String getMaterialEncToken() {
        return this.materialEncToken;
    }

}
