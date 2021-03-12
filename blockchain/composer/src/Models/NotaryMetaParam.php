<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NotaryMetaParam extends Model
{
    // 描述本条存证在存证事务中的阶段，用户可自行维护
    /**
     * @example 合同内容
     *
     * @var string
     */
    public $phase;

    // 扩展字段
    /**
     * @example {"key":"value"}
     *
     * @var string
     */
    public $properties;

    // 全局唯一的存证事务ID
    /**
     * @example 877c4383-9c83-477b-b7ec-03828a946e54
     *
     * @var string
     */
    public $token;
    protected $_name = [
        'phase'      => 'phase',
        'properties' => 'properties',
        'token'      => 'token',
    ];

    public function validate()
    {
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('token', $this->token, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryMetaParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }

        return $model;
    }
}
