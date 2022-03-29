<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ContainVals extends Model
{
    // 包含值列表
    /**
     * @example
     *
     * @var string[]
     */
    public $vals;
    protected $_name = [
        'vals' => 'vals',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->vals) {
            $res['vals'] = $this->vals;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainVals
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['vals'])) {
            if (!empty($map['vals'])) {
                $model->vals = $map['vals'];
            }
        }

        return $model;
    }
}
