<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class CommoditySourceType extends Model
{
    // 商品来源code
    /**
     * @example S1P_SELF_DEV
     *
     * @var string
     */
    public $typeCode;

    // 商品来源描述
    /**
     * @example 一方纯自研
     *
     * @var string
     */
    public $typeDesc;
    protected $_name = [
        'typeCode' => 'type_code',
        'typeDesc' => 'type_desc',
    ];

    public function validate()
    {
        Model::validateRequired('typeCode', $this->typeCode, true);
        Model::validateRequired('typeDesc', $this->typeDesc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->typeCode) {
            $res['type_code'] = $this->typeCode;
        }
        if (null !== $this->typeDesc) {
            $res['type_desc'] = $this->typeDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommoditySourceType
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type_code'])) {
            $model->typeCode = $map['type_code'];
        }
        if (isset($map['type_desc'])) {
            $model->typeDesc = $map['type_desc'];
        }

        return $model;
    }
}
