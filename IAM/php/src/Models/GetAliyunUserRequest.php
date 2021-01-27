<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetAliyunUserRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'userId' => 'user_id',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetAliyunUserRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 阿里云用户ID
    /**
     * @var string
     */
    public $userId;

}
