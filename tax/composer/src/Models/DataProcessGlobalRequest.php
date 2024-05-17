<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class DataProcessGlobalRequest extends Model
{
    // 产品码
    /**
     * @example SCIAZDR
     *
     * @var string
     */
    public $productCode;

    // 租户类型
    /**
     * @example SCIAZDR
     *
     * @var string
     */
    public $instCode;

    // 参数
    /**
     * @example {"aa":"aa"}
     *
     * @var string
     */
    public $param;
    protected $_name = [
        'productCode' => 'product_code',
        'instCode'    => 'inst_code',
        'param'       => 'param',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('param', $this->param, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->param) {
            $res['param'] = $this->param;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataProcessGlobalRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['param'])) {
            $model->param = $map['param'];
        }

        return $model;
    }
}
