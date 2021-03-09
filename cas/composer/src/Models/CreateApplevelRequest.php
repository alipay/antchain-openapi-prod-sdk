<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateApplevelRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 应用等级
    /**
     * @var AppLevel
     */
    public $level;

    // 占位，因为入参不能只有一个结构体
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken' => 'auth_token',
        'level'     => 'level',
        'tenantId'  => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('level', $this->level, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->level) {
            $res['level'] = null !== $this->level ? $this->level->toMap() : null;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateApplevelRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['level'])) {
            $model->level = AppLevel::fromMap($map['level']);
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
