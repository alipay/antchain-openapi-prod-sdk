<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class DeleteServiceaccountRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 服务账号名称
    /**
     * @var string
     */
    public $name;

    // 服务账号ID
    /**
     * @var string
     */
    public $serviceAccountId;
    protected $_name = [
        'authToken'        => 'auth_token',
        'name'             => 'name',
        'serviceAccountId' => 'service_account_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->serviceAccountId) {
            $res['service_account_id'] = $this->serviceAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteServiceaccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['service_account_id'])) {
            $model->serviceAccountId = $map['service_account_id'];
        }

        return $model;
    }
}
