// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryThirdCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 三方平台的产品ID
    @NameInMap("product_id")
    public String productId;

    // GreenProductCertification ：绿色产品认证证书
    // GarbonNeutrality ： 碳中和证书
    // GreenhouseGasInventory 温室气体核查证书
    @NameInMap("certification_type")
    public String certificationType;

    // 证书文件中的产品名称
    @NameInMap("cproduct_name")
    public String cproductName;

    // 证书文件中的产品型号
    @NameInMap("cproduct_model")
    public String cproductModel;

    // 证书文件中的生产商名称
    @NameInMap("cproduct_firm")
    public String cproductFirm;

    // 三方平台的企业ID
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    public static QueryThirdCertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThirdCertRequest self = new QueryThirdCertRequest();
        return TeaModel.build(map, self);
    }

    public QueryThirdCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryThirdCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryThirdCertRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryThirdCertRequest setCertificationType(String certificationType) {
        this.certificationType = certificationType;
        return this;
    }
    public String getCertificationType() {
        return this.certificationType;
    }

    public QueryThirdCertRequest setCproductName(String cproductName) {
        this.cproductName = cproductName;
        return this;
    }
    public String getCproductName() {
        return this.cproductName;
    }

    public QueryThirdCertRequest setCproductModel(String cproductModel) {
        this.cproductModel = cproductModel;
        return this;
    }
    public String getCproductModel() {
        return this.cproductModel;
    }

    public QueryThirdCertRequest setCproductFirm(String cproductFirm) {
        this.cproductFirm = cproductFirm;
        return this;
    }
    public String getCproductFirm() {
        return this.cproductFirm;
    }

    public QueryThirdCertRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

}
