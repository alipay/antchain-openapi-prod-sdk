<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AffinityConfig extends Model
{
    // 尽量满足的应用列表
    /**
     * @example ["app1"]
     *
     * @var string[]
     */
    public $preferred;

    // 必须满足的应用列表
    /**
     * @example
     *
     * @var string[]
     */
    public $required;
    protected $_name = [
        'preferred' => 'preferred',
        'required'  => 'required',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->preferred) {
            $res['preferred'] = $this->preferred;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AffinityConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['preferred'])) {
            if (!empty($map['preferred'])) {
                $model->preferred = $map['preferred'];
            }
        }
        if (isset($map['required'])) {
            if (!empty($map['required'])) {
                $model->required = $map['required'];
            }
        }

        return $model;
    }
}
