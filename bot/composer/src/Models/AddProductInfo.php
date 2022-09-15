<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AddProductInfo extends Model
{
    // 产品名称
    /**
     * @example 防疫一体机
     *
     * @var string
     */
    public $productName;

    // 产品code
    /**
     * @example face_smart
     *
     * @var string
     */
    public $productCode;

    // 产品描述
    /**
     * @example 智能防疫机
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'productName' => 'product_name',
        'productCode' => 'product_code',
        'remark'      => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('productCode', $this->productCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddProductInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
