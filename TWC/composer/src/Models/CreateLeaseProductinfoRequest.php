<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseProductinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 合约id
    /**
     * @var string
     */
    public $applicationId;

    // 保证金  精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $depositPrice;

    // 安装拆卸费 精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $installPrice;

    // 租赁服务平台id
    /**
     * @var string
     */
    public $leaseId;

    // 一级分类
    /**
     * @var string
     */
    public $mainClass;

    // 商品编码 长度不可超过50
    /**
     * @var string
     */
    public $productId;

    // 商品名称
    /**
     * @var string
     */
    public $productName;

    // 采购价  精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $productPrice;

    // 出租详细信息
    /**
     * @var RentInfo[]
     */
    public $rentinfos;

    // 二级分类
    /**
     * @var string
     */
    public $subClass;

    // 供应商id
    /**
     * @var string
     */
    public $supplierId;

    // 供应商
    /**
     * @var string
     */
    public $supplierName;

    // 供应商对该产品版本
    /**
     * @var string
     */
    public $supplierVersion;

    // 商品目录额外信息
    /**
     * @var string
     */
    public $extraInfo;

    // 商品规格
    /**
     * @var string
     */
    public $productModel;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId'     => 'application_id',
        'depositPrice'      => 'deposit_price',
        'installPrice'      => 'install_price',
        'leaseId'           => 'lease_id',
        'mainClass'         => 'main_class',
        'productId'         => 'product_id',
        'productName'       => 'product_name',
        'productPrice'      => 'product_price',
        'rentinfos'         => 'rentinfos',
        'subClass'          => 'sub_class',
        'supplierId'        => 'supplier_id',
        'supplierName'      => 'supplier_name',
        'supplierVersion'   => 'supplier_version',
        'extraInfo'         => 'extra_info',
        'productModel'      => 'product_model',
    ];

    public function validate()
    {
        Model::validateRequired('depositPrice', $this->depositPrice, true);
        Model::validateRequired('installPrice', $this->installPrice, true);
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('mainClass', $this->mainClass, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('productPrice', $this->productPrice, true);
        Model::validateRequired('rentinfos', $this->rentinfos, true);
        Model::validateRequired('subClass', $this->subClass, true);
        Model::validateRequired('supplierName', $this->supplierName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->depositPrice) {
            $res['deposit_price'] = $this->depositPrice;
        }
        if (null !== $this->installPrice) {
            $res['install_price'] = $this->installPrice;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->mainClass) {
            $res['main_class'] = $this->mainClass;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productPrice) {
            $res['product_price'] = $this->productPrice;
        }
        if (null !== $this->rentinfos) {
            $res['rentinfos'] = [];
            if (null !== $this->rentinfos && \is_array($this->rentinfos)) {
                $n = 0;
                foreach ($this->rentinfos as $item) {
                    $res['rentinfos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->subClass) {
            $res['sub_class'] = $this->subClass;
        }
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }
        if (null !== $this->supplierName) {
            $res['supplier_name'] = $this->supplierName;
        }
        if (null !== $this->supplierVersion) {
            $res['supplier_version'] = $this->supplierVersion;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->productModel) {
            $res['product_model'] = $this->productModel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseProductinfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['deposit_price'])) {
            $model->depositPrice = $map['deposit_price'];
        }
        if (isset($map['install_price'])) {
            $model->installPrice = $map['install_price'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }
        if (isset($map['main_class'])) {
            $model->mainClass = $map['main_class'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_price'])) {
            $model->productPrice = $map['product_price'];
        }
        if (isset($map['rentinfos'])) {
            if (!empty($map['rentinfos'])) {
                $model->rentinfos = [];
                $n                = 0;
                foreach ($map['rentinfos'] as $item) {
                    $model->rentinfos[$n++] = null !== $item ? RentInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sub_class'])) {
            $model->subClass = $map['sub_class'];
        }
        if (isset($map['supplier_id'])) {
            $model->supplierId = $map['supplier_id'];
        }
        if (isset($map['supplier_name'])) {
            $model->supplierName = $map['supplier_name'];
        }
        if (isset($map['supplier_version'])) {
            $model->supplierVersion = $map['supplier_version'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['product_model'])) {
            $model->productModel = $map['product_model'];
        }

        return $model;
    }
}
