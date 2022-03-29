<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class DeleteSofamqAdminuserRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 管理员用户名
    /**
     * @var string
     */
    public $loginName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'loginName'         => 'login_name',
    ];

    public function validate()
    {
        Model::validateRequired('loginName', $this->loginName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteSofamqAdminuserRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }

        return $model;
    }
}
