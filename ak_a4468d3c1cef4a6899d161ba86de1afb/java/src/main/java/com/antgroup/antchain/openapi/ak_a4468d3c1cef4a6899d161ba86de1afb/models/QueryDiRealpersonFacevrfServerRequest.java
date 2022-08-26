// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a4468d3c1cef4a6899d161ba86de1afb.models;

import com.aliyun.tea.*;

public class QueryDiRealpersonFacevrfServerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实人认证唯一标识
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    // 认证材料（如人脸图像）的哈希
    @NameInMap("material_hash")
    public String materialHash;

    // 外部唯一标识。用于定位。
    // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 场景ID
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    public static QueryDiRealpersonFacevrfServerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDiRealpersonFacevrfServerRequest self = new QueryDiRealpersonFacevrfServerRequest();
        return TeaModel.build(map, self);
    }

    public QueryDiRealpersonFacevrfServerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDiRealpersonFacevrfServerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDiRealpersonFacevrfServerRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryDiRealpersonFacevrfServerRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public QueryDiRealpersonFacevrfServerRequest setMaterialHash(String materialHash) {
        this.materialHash = materialHash;
        return this;
    }
    public String getMaterialHash() {
        return this.materialHash;
    }

    public QueryDiRealpersonFacevrfServerRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryDiRealpersonFacevrfServerRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
