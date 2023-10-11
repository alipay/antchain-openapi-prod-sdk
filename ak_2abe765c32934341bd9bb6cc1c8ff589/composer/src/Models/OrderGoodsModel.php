<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class OrderGoodsModel extends Model
{
    // 商品 id
    /**
     * @example 1
     *
     * @var string
     */
    public $productId;

    // 商品版本，每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
    /**
     * @example 1
     *
     * @var int
     */
    public $productVersion;

    // 商品名称
    /**
     * @example 测试洗面奶
     *
     * @var string
     */
    public $productName;

    // 商品价格,精确到分，即 1234 表示 12.34 元
    /**
     * @example 1234
     *
     * @var int
     */
    public $productPrice;

    // 商品(3C产品)的设备 id
    /**
     * @example xxx
     *
     * @var string
     */
    public $productImeiId;

    // 链上采购供应商租户 id，提供商品方的金融科技租户 id，否则平台自己名称
    /**
     * @example 001
     *
     * @var string
     */
    public $supplierId;

    // 商品数量，不能为空，且大于 0
    /**
     * @example 1
     *
     * @var int
     */
    public $productNumber;
    protected $_name = [
        'productId'      => 'product_id',
        'productVersion' => 'product_version',
        'productName'    => 'product_name',
        'productPrice'   => 'product_price',
        'productImeiId'  => 'product_imei_id',
        'supplierId'     => 'supplier_id',
        'productNumber'  => 'product_number',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productVersion', $this->productVersion, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('productPrice', $this->productPrice, true);
        Model::validateRequired('productImeiId', $this->productImeiId, true);
        Model::validateRequired('supplierId', $this->supplierId, true);
        Model::validateRequired('productNumber', $this->productNumber, true);
        Model::validateMaxLength('productId', $this->productId, 50);
        Model::validateMaxLength('productName', $this->productName, 50);
        Model::validateMaxLength('productImeiId', $this->productImeiId, 200);
        Model::validateMaxLength('supplierId', $this->supplierId, 50);
        Model::validateMinLength('productId', $this->productId, 0);
        Model::validateMinLength('productName', $this->productName, 0);
        Model::validateMinLength('productImeiId', $this->productImeiId, 0);
        Model::validateMinLength('supplierId', $this->supplierId, 0);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
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
        if (null !== $this->productImeiId) {
            $res['product_imei_id'] = $this->productImeiId;
        }
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }
        if (null !== $this->productNumber) {
            $res['product_number'] = $this->productNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderGoodsModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
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
        if (isset($map['product_imei_id'])) {
            $model->productImeiId = $map['product_imei_id'];
        }
        if (isset($map['supplier_id'])) {
            $model->supplierId = $map['supplier_id'];
        }
        if (isset($map['product_number'])) {
            $model->productNumber = $map['product_number'];
        }

        return $model;
    }
}
