<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeleteApplicationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 目标应用完整名称
    /**
     * @var string
     */
    public $applicationName;
    protected $_name = [
        'authToken'       => 'auth_token',
        'tenant'          => 'tenant',
        'applicationName' => 'application_name',
    ];

    public function validate()
    {
        Model::validateRequired('applicationName', $this->applicationName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteApplicationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['application_name'])) {
            $model->applicationName = $map['application_name'];
        }

        return $model;
    }
}
