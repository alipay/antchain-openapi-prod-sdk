// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EnterpriseProductSummary extends TeaModel {
    // 产品自定义编码
    /**
     * <strong>example:</strong>
     * <p>12312121</p>
     */
    @NameInMap("enterprise_custom_code")
    @Validation(required = true)
    public String enterpriseCustomCode;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>石墨</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 规格型号
    /**
     * <strong>example:</strong>
     * <p>DDD-1212</p>
     */
    @NameInMap("specification")
    @Validation(required = true)
    public String specification;

    // 产品描述
    /**
     * <strong>example:</strong>
     * <p>这是一个石墨产品</p>
     */
    @NameInMap("product_description")
    public String productDescription;

    // 产品分类名称
    /**
     * <strong>example:</strong>
     * <p>产品分类名</p>
     */
    @NameInMap("product_category_name")
    @Validation(required = true)
    public String productCategoryName;

    // 品牌信息
    /**
     * <strong>example:</strong>
     * <p>Adidas</p>
     */
    @NameInMap("brand_information")
    public String brandInformation;

    // 工艺流程文件路径，上传文件后由上传文件接口提供，最多支持上传3个工艺流程文件
    @NameInMap("process_flow_file_list")
    public java.util.List<EnterpriseDocumentFile> processFlowFileList;

    // 产品图片文件路径，上传文件后由上传文件接口提供，最多支持上传8个产品图片文件
    @NameInMap("product_picture_file_list")
    public java.util.List<EnterpriseDocumentFile> productPictureFileList;

    public static EnterpriseProductSummary build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseProductSummary self = new EnterpriseProductSummary();
        return TeaModel.build(map, self);
    }

    public EnterpriseProductSummary setEnterpriseCustomCode(String enterpriseCustomCode) {
        this.enterpriseCustomCode = enterpriseCustomCode;
        return this;
    }
    public String getEnterpriseCustomCode() {
        return this.enterpriseCustomCode;
    }

    public EnterpriseProductSummary setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public EnterpriseProductSummary setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public EnterpriseProductSummary setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    public String getProductDescription() {
        return this.productDescription;
    }

    public EnterpriseProductSummary setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
        return this;
    }
    public String getProductCategoryName() {
        return this.productCategoryName;
    }

    public EnterpriseProductSummary setBrandInformation(String brandInformation) {
        this.brandInformation = brandInformation;
        return this;
    }
    public String getBrandInformation() {
        return this.brandInformation;
    }

    public EnterpriseProductSummary setProcessFlowFileList(java.util.List<EnterpriseDocumentFile> processFlowFileList) {
        this.processFlowFileList = processFlowFileList;
        return this;
    }
    public java.util.List<EnterpriseDocumentFile> getProcessFlowFileList() {
        return this.processFlowFileList;
    }

    public EnterpriseProductSummary setProductPictureFileList(java.util.List<EnterpriseDocumentFile> productPictureFileList) {
        this.productPictureFileList = productPictureFileList;
        return this;
    }
    public java.util.List<EnterpriseDocumentFile> getProductPictureFileList() {
        return this.productPictureFileList;
    }

}
