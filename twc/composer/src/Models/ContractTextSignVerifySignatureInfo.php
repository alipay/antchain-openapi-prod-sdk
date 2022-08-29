<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractTextSignVerifySignatureInfo extends Model
{
    // 是否被篡改
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isModify;
    protected $_name = [
        'isModify' => 'is_modify',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isModify) {
            $res['is_modify'] = $this->isModify;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractTextSignVerifySignatureInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['is_modify'])) {
            $model->isModify = $map['is_modify'];
        }

        return $model;
    }
}
