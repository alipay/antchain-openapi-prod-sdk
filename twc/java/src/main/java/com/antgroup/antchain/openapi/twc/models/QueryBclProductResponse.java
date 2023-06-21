// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品编码
    @NameInMap("product_outer_id")
    public String productOuterId;

    // 商品版本; 每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
    @NameInMap("product_version")
    public String productVersion;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 商品价格,单位为分。如：856400，表示8564元
    @NameInMap("product_price")
    public Long productPrice;

    // 一级行业代码。 具体参考如下定义 格式如：【一级行业 -> 一级行业代码】： 【3C办公 -> 3C 】； 【IOT -> IOT 】； 【新能源 -> NE 】； 【泛行业 -> GENERAL 】
    @NameInMap("main_class")
    public String mainClass;

    // 二级行业代码。 具体参考如下： 【二级行业 -> 二级行业代码】； 【手机 -> 3c_mobile】； 电脑 -> 3c_pc】； 【摄影 -> 3c_camera】； 办公设备 -> 3c_office】； 【3C-其他 -> 3c_other】； 【售卖柜 -> iot_auto_container】； 【驿站 -> iot_stage】； 【IOT-其他 -> iot_other】； 【电池 -> ne_battery】； 【电动车 -> ne_electric_car】； 【新能源-其他 -> ne_other】； 【家具 -> general_furniture】； 【家电 -> general_tv】； 【泛其他 -> general_other】；
    @NameInMap("sub_class")
    public String subClass;

    // 供应商名称,(采购模式)供应商模式则为供应商名称，否则平台自己名称
    @NameInMap("supplier_name")
    public String supplierName;

    // 金融科技租户id; 采购模式)提供商品方的金融科技租户id
    @NameInMap("supplier_id")
    public String supplierId;

    // 安装服务费，单位为分，150000则表示1500元；
    @NameInMap("install_price")
    public Long installPrice;

    // 商品来源，如 传 SUPPLIER 则表示来源为供应商。 取值范围如下： 【SUPPLIER： 供应商】 【LEASING_COMPANY ：租赁机构】
    @NameInMap("product_origin")
    public String productOrigin;

    // 实际库存量
    @NameInMap("real_stock")
    public Long realStock;

    // 预估出货量
    @NameInMap("estimated_shipment")
    public Long estimatedShipment;

    // 商品详情
    @NameInMap("product_detail_info")
    public String productDetailInfo;

    // 商品链接
    @NameInMap("product_url")
    public String productUrl;

    // 商品品牌
    @NameInMap("product_brand")
    public String productBrand;

    // 产品规格是用来识别物品的编号
    @NameInMap("product_model")
    public String productModel;

    // 免押金额，单位分。如：15600表示免押金额为156元。
    @NameInMap("deposit_price")
    public Long depositPrice;

    public static QueryBclProductResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBclProductResponse self = new QueryBclProductResponse();
        return TeaModel.build(map, self);
    }

    public QueryBclProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBclProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBclProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBclProductResponse setProductOuterId(String productOuterId) {
        this.productOuterId = productOuterId;
        return this;
    }
    public String getProductOuterId() {
        return this.productOuterId;
    }

    public QueryBclProductResponse setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public QueryBclProductResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryBclProductResponse setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public Long getProductPrice() {
        return this.productPrice;
    }

    public QueryBclProductResponse setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public QueryBclProductResponse setSubClass(String subClass) {
        this.subClass = subClass;
        return this;
    }
    public String getSubClass() {
        return this.subClass;
    }

    public QueryBclProductResponse setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public QueryBclProductResponse setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public QueryBclProductResponse setInstallPrice(Long installPrice) {
        this.installPrice = installPrice;
        return this;
    }
    public Long getInstallPrice() {
        return this.installPrice;
    }

    public QueryBclProductResponse setProductOrigin(String productOrigin) {
        this.productOrigin = productOrigin;
        return this;
    }
    public String getProductOrigin() {
        return this.productOrigin;
    }

    public QueryBclProductResponse setRealStock(Long realStock) {
        this.realStock = realStock;
        return this;
    }
    public Long getRealStock() {
        return this.realStock;
    }

    public QueryBclProductResponse setEstimatedShipment(Long estimatedShipment) {
        this.estimatedShipment = estimatedShipment;
        return this;
    }
    public Long getEstimatedShipment() {
        return this.estimatedShipment;
    }

    public QueryBclProductResponse setProductDetailInfo(String productDetailInfo) {
        this.productDetailInfo = productDetailInfo;
        return this;
    }
    public String getProductDetailInfo() {
        return this.productDetailInfo;
    }

    public QueryBclProductResponse setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }
    public String getProductUrl() {
        return this.productUrl;
    }

    public QueryBclProductResponse setProductBrand(String productBrand) {
        this.productBrand = productBrand;
        return this;
    }
    public String getProductBrand() {
        return this.productBrand;
    }

    public QueryBclProductResponse setProductModel(String productModel) {
        this.productModel = productModel;
        return this;
    }
    public String getProductModel() {
        return this.productModel;
    }

    public QueryBclProductResponse setDepositPrice(Long depositPrice) {
        this.depositPrice = depositPrice;
        return this;
    }
    public Long getDepositPrice() {
        return this.depositPrice;
    }

}
