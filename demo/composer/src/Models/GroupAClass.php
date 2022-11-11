<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class GroupAClass extends Model
{
    // -
    /**
     * @example -
     *
     * @var string
     */
    public $productInstanceId;

    // 防伪码类型
    /**
     * @example 103001
     *
     * @var string
     */
    public $codeType;

    // 防伪码码值
    /**
     * @example 600011111
     *
     * @var string
     */
    public $code;
    protected $_name = [
        'productInstanceId' => 'product_instance_id',
        'codeType'          => 'code_type',
        'code'              => 'code',
    ];

    public function validate()
    {
        Model::validateRequired('codeType', $this->codeType, true);
        Model::validateRequired('code', $this->code, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->codeType) {
            $res['code_type'] = $this->codeType;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GroupAClass
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['code_type'])) {
            $model->codeType = $map['code_type'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }

        return $model;
    }
}
