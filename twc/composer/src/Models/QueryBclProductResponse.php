<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryBclProductResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 商品编码
    /**
     * @var string
     */
    public $productOuterId;

    // 商品版本; 每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
    /**
     * @var string
     */
    public $productVersion;

    // 商品名称
    /**
     * @var string
     */
    public $productName;

    // 商品官网价格，单位：分
    // 示例：856400，表示8564元，必须大于0
    /**
     * @var int
     */
    public $productPrice;

    // 一级行业代码
    /**
     * @var string
     */
    public $mainClass;

    // 二级行业代码
    /**
     * @var string
     */
    public $subClass;

    // 供应商名称
    // 商品从供应商采购为供应商名称，否则为平台自己名称，最大长度不能超过64
    /**
     * @var string
     */
    public $supplierName;

    // 供应商数字科技租户ID
    // 商品从供应商采购为供应商租户ID，否则为平台自己租户ID
    /**
     * @var string
     */
    public $supplierId;

    // 安装服务费，单位：分
    // 示例：150000则表示1500元，不能为负数
    /**
     * @var int
     */
    public $installPrice;

    // 商品来源，如 传 SUPPLIER 则表示来源为供应商。 取值范围如下： 【SUPPLIER： 供应商】 【LEASING_COMPANY ：租赁机构】
    /**
     * @var string
     */
    public $productOrigin;

    // 实际库存量
    /**
     * @var int
     */
    public $realStock;

    // 预估出货量
    /**
     * @var int
     */
    public $estimatedShipment;

    // 商品详情
    /**
     * @var string
     */
    public $productDetailInfo;

    // 商品链接
    /**
     * @var string
     */
    public $productUrl;

    // 商品品牌
    /**
     * @var string
     */
    public $productBrand;

    // 产品规格
    // 识别物品的编号，最大长度不能超过256
    /**
     * @var string
     */
    public $productModel;

    // 免押金额，单位：分
    // 示例：15600表示免押金额为156元，不能为负数
    /**
     * @var int
     */
    public $depositPrice;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'productOuterId'    => 'product_outer_id',
        'productVersion'    => 'product_version',
        'productName'       => 'product_name',
        'productPrice'      => 'product_price',
        'mainClass'         => 'main_class',
        'subClass'          => 'sub_class',
        'supplierName'      => 'supplier_name',
        'supplierId'        => 'supplier_id',
        'installPrice'      => 'install_price',
        'productOrigin'     => 'product_origin',
        'realStock'         => 'real_stock',
        'estimatedShipment' => 'estimated_shipment',
        'productDetailInfo' => 'product_detail_info',
        'productUrl'        => 'product_url',
        'productBrand'      => 'product_brand',
        'productModel'      => 'product_model',
        'depositPrice'      => 'deposit_price',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->productOuterId) {
            $res['product_outer_id'] = $this->productOuterId;
        }
        if (null !== $this->productVersion) {
            $res['product_version'] = $this->productVersion;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productPrice) {
            $res['product_price'] = $this->productPrice;
        }
        if (null !== $this->mainClass) {
            $res['main_class'] = $this->mainClass;
        }
        if (null !== $this->subClass) {
            $res['sub_class'] = $this->subClass;
        }
        if (null !== $this->supplierName) {
            $res['supplier_name'] = $this->supplierName;
        }
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }
        if (null !== $this->installPrice) {
            $res['install_price'] = $this->installPrice;
        }
        if (null !== $this->productOrigin) {
            $res['product_origin'] = $this->productOrigin;
        }
        if (null !== $this->realStock) {
            $res['real_stock'] = $this->realStock;
        }
        if (null !== $this->estimatedShipment) {
            $res['estimated_shipment'] = $this->estimatedShipment;
        }
        if (null !== $this->productDetailInfo) {
            $res['product_detail_info'] = $this->productDetailInfo;
        }
        if (null !== $this->productUrl) {
            $res['product_url'] = $this->productUrl;
        }
        if (null !== $this->productBrand) {
            $res['product_brand'] = $this->productBrand;
        }
        if (null !== $this->productModel) {
            $res['product_model'] = $this->productModel;
        }
        if (null !== $this->depositPrice) {
            $res['deposit_price'] = $this->depositPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBclProductResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['product_outer_id'])) {
            $model->productOuterId = $map['product_outer_id'];
        }
        if (isset($map['product_version'])) {
            $model->productVersion = $map['product_version'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_price'])) {
            $model->productPrice = $map['product_price'];
        }
        if (isset($map['main_class'])) {
            $model->mainClass = $map['main_class'];
        }
        if (isset($map['sub_class'])) {
            $model->subClass = $map['sub_class'];
        }
        if (isset($map['supplier_name'])) {
            $model->supplierName = $map['supplier_name'];
        }
        if (isset($map['supplier_id'])) {
            $model->supplierId = $map['supplier_id'];
        }
        if (isset($map['install_price'])) {
            $model->installPrice = $map['install_price'];
        }
        if (isset($map['product_origin'])) {
            $model->productOrigin = $map['product_origin'];
        }
        if (isset($map['real_stock'])) {
            $model->realStock = $map['real_stock'];
        }
        if (isset($map['estimated_shipment'])) {
            $model->estimatedShipment = $map['estimated_shipment'];
        }
        if (isset($map['product_detail_info'])) {
            $model->productDetailInfo = $map['product_detail_info'];
        }
        if (isset($map['product_url'])) {
            $model->productUrl = $map['product_url'];
        }
        if (isset($map['product_brand'])) {
            $model->productBrand = $map['product_brand'];
        }
        if (isset($map['product_model'])) {
            $model->productModel = $map['product_model'];
        }
        if (isset($map['deposit_price'])) {
            $model->depositPrice = $map['deposit_price'];
        }

        return $model;
    }
}
