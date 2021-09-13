<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class InstanceLabel extends Model
{
    // 标签名。
    // 传递isvId
    /**
     * @example isvId
     *
     * @var string
     */
    public $instanceKey;

    // 标签值
    /**
     * @example 邀请码
     *
     * @var string
     */
    public $instanceValue;
    protected $_name = [
        'instanceKey'   => 'instance_key',
        'instanceValue' => 'instance_value',
    ];

    public function validate()
    {
        Model::validateRequired('instanceKey', $this->instanceKey, true);
        Model::validateRequired('instanceValue', $this->instanceValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceKey) {
            $res['instance_key'] = $this->instanceKey;
        }
        if (null !== $this->instanceValue) {
            $res['instance_value'] = $this->instanceValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstanceLabel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_key'])) {
            $model->instanceKey = $map['instance_key'];
        }
        if (isset($map['instance_value'])) {
            $model->instanceValue = $map['instance_value'];
        }

        return $model;
    }
}
