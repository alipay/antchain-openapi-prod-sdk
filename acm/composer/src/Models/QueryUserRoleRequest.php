<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class QueryUserRoleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 用户类型
    /**
     * @var string
     */
    public $userType;

    // 系统来源
    /**
     * @var string
     */
    public $sourceSystem;
    protected $_name = [
        'authToken'    => 'auth_token',
        'userId'       => 'user_id',
        'userType'     => 'user_type',
        'sourceSystem' => 'source_system',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('sourceSystem', $this->sourceSystem, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->sourceSystem) {
            $res['source_system'] = $this->sourceSystem;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUserRoleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['source_system'])) {
            $model->sourceSystem = $map['source_system'];
        }

        return $model;
    }
}
