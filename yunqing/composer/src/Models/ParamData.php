<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ParamData extends Model
{
    // 参数key
    /**
     * @example BRANCH
     *
     * @var string
     */
    public $key;

    // 参数值
    /**
     * @example master
     *
     * @var string
     */
    public $value;

    // 类型, 对应Data的paramGroup
    /**
     * @example app_antx
     *
     * @var string
     */
    public $type;

    // 安全级别，脱敏用
    /**
     * @example SENSITIVE
     *
     * @var string
     */
    public $securityLevel;
    protected $_name = [
        'key'           => 'key',
        'value'         => 'value',
        'type'          => 'type',
        'securityLevel' => 'security_level',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->securityLevel) {
            $res['security_level'] = $this->securityLevel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ParamData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['security_level'])) {
            $model->securityLevel = $map['security_level'];
        }

        return $model;
    }
}
