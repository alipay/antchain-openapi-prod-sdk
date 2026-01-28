<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class CheckDataphinTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // publishId
    /**
     * @var string
     */
    public $publishId;

    // tenantId
    /**
     * @var string
     */
    public $tenantId;

    // operator
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken' => 'auth_token',
        'publishId' => 'publish_id',
        'tenantId'  => 'tenant_id',
        'operator'  => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('publishId', $this->publishId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->publishId) {
            $res['publish_id'] = $this->publishId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckDataphinTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['publish_id'])) {
            $model->publishId = $map['publish_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
