<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LeaseOrderProductInfo extends Model
{
    // 商品编码 长度不可超过50
    /**
     * @example 123456
     *
     * @var string
     */
    public $productId;

    // 产品版本，每个版本可以对应一个价格 长度不可超过50，版本号未正整数，示例"123"
    /**
     * @example 123
     *
     * @var string
     */
    public $productVersion;

    // 商品名称 长度不可超过50
    /**
     * @example iphone13
     *
     * @var string
     */
    public $productName;

    // 采购价  精确到毫厘，即123400表示12.34元
    /**
     * @example 123400
     *
     * @var int
     */
    public $productPrice;

    // 供应商Id，用以做索引 长度不可超过50
    /**
     * @example 小米
     *
     * @var string
     */
    public $supplierIsvAccount;
    protected $_name = [
        'productId'          => 'product_id',
        'productVersion'     => 'product_version',
        'productName'        => 'product_name',
        'productPrice'       => 'product_price',
        'supplierIsvAccount' => 'supplier_isv_account',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productVersion', $this->productVersion, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('productPrice', $this->productPrice, true);
        Model::validateRequired('supplierIsvAccount', $this->supplierIsvAccount, true);
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
        if (null !== $this->supplierIsvAccount) {
            $res['supplier_isv_account'] = $this->supplierIsvAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeaseOrderProductInfo
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
        if (isset($map['supplier_isv_account'])) {
            $model->supplierIsvAccount = $map['supplier_isv_account'];
        }

        return $model;
    }
}
