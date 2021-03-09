<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteResourceComputerRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 要删除的机器ID
    /**
     * @var string
     */
    public $instanceId;

    // 是否强制删除
    /**
     * @var bool
     */
    public $force;
    protected $_name = [
        'authToken'  => 'auth_token',
        'instanceId' => 'instance_id',
        'force'      => 'force',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->force) {
            $res['force'] = $this->force;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteResourceComputerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['force'])) {
            $model->force = $map['force'];
        }

        return $model;
    }
}
