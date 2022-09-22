<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class QueryHealthInfoExtendedArg extends Model
{
    // 参数名
    /**
     * @example temperature
     *
     * @var string
     */
    public $argKey;

    // 参数值
    /**
     * @example 36.5
     *
     * @var string
     */
    public $argValue;
    protected $_name = [
        'argKey'   => 'arg_key',
        'argValue' => 'arg_value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->argKey) {
            $res['arg_key'] = $this->argKey;
        }
        if (null !== $this->argValue) {
            $res['arg_value'] = $this->argValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryHealthInfoExtendedArg
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['arg_key'])) {
            $model->argKey = $map['arg_key'];
        }
        if (isset($map['arg_value'])) {
            $model->argValue = $map['arg_value'];
        }

        return $model;
    }
}
