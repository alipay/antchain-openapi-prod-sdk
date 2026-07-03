<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustomRelationStatus extends Model
{
    // 是否联登
    /**
     * @example true, false
     *
     * @var bool
     */
    public $regFlag;
    protected $_name = [
        'regFlag' => 'reg_flag',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->regFlag) {
            $res['reg_flag'] = $this->regFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomRelationStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['reg_flag'])) {
            $model->regFlag = $map['reg_flag'];
        }

        return $model;
    }
}
