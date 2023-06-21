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

    // 商品价格,单位为分。如：856400，表示8564元
    /**
     * @var int
     */
    public $productPrice;

    // 一级行业代码。 具体参考如下定义 格式如：【一级行业 -> 一级行业代码】： 【3C办公 -> 3C 】； 【IOT -> IOT 】； 【新能源 -> NE 】； 【泛行业 -> GENERAL 】
    /**
     * @var string
     */
    public $mainClass;

    // 二级行业代码。 具体参考如下： 【二级行业 -> 二级行业代码】； 【手机 -> 3c_mobile】； 电脑 -> 3c_pc】； 【摄影 -> 3c_camera】； 办公设备 -> 3c_office】； 【3C-其他 -> 3c_other】； 【售卖柜 -> iot_auto_container】； 【驿站 -> iot_stage】； 【IOT-其他 -> iot_other】； 【电池 -> ne_battery】； 【电动车 -> ne_electric_car】； 【新能源-其他 -> ne_other】； 【家具 -> general_furniture】； 【家电 -> general_tv】； 【泛其他 -> general_other】；
    /**
     * @var string
     */
    public $subClass;

    // 供应商名称,(采购模式)供应商模式则为供应商名称，否则平台自己名称
    /**
     * @var string
     */
    public $supplierName;

    // 金融科技租户id; 采购模式)提供商品方的金融科技租户id
    /**
     * @var string
     */
    public $supplierId;

    // 安装服务费，单位为分，150000则表示1500元；
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

    // 产品规格是用来识别物品的编号
    /**
     * @var string
     */
    public $productModel;

    // 免押金额，单位分。如：15600表示免押金额为156元。
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
