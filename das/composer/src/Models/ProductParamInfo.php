<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class ProductParamInfo extends Model
{
    // 产品码
    /**
     * @example -
     *
     * @var string
     */
    public $productCode;

    // 参数key
    /**
     * @example -
     *
     * @var string
     */
    public $paramKey;

    // 参数类型
    /**
     * @example -
     *
     * @var string
     */
    public $paramType;

    // 参数描述
    /**
     * @example -
     *
     * @var string
     */
    public $paramDesc;

    // 是否可空
    /**
     * @example true, false
     *
     * @var bool
     */
    public $nullable;
    protected $_name = [
        'productCode' => 'product_code',
        'paramKey'    => 'param_key',
        'paramType'   => 'param_type',
        'paramDesc'   => 'param_desc',
        'nullable'    => 'nullable',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('paramKey', $this->paramKey, true);
        Model::validateRequired('paramType', $this->paramType, true);
        Model::validateRequired('paramDesc', $this->paramDesc, true);
        Model::validateRequired('nullable', $this->nullable, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->paramKey) {
            $res['param_key'] = $this->paramKey;
        }
        if (null !== $this->paramType) {
            $res['param_type'] = $this->paramType;
        }
        if (null !== $this->paramDesc) {
            $res['param_desc'] = $this->paramDesc;
        }
        if (null !== $this->nullable) {
            $res['nullable'] = $this->nullable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductParamInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['param_key'])) {
            $model->paramKey = $map['param_key'];
        }
        if (isset($map['param_type'])) {
            $model->paramType = $map['param_type'];
        }
        if (isset($map['param_desc'])) {
            $model->paramDesc = $map['param_desc'];
        }
        if (isset($map['nullable'])) {
            $model->nullable = $map['nullable'];
        }

        return $model;
    }
}
