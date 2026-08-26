<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class AddAntcloudAcmProjectMemberRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'userId' => 'user_id',
        'projectId' => 'project_id',
        'users' => 'users',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('users', $this->users, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->users) {
            $res['users'] = $this->users;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AddAntcloudAcmProjectMemberRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['project_id'])){
            $model->projectId = $map['project_id'];
        }
        if(isset($map['users'])){
            if(!empty($map['users'])){
                $model->users = $map['users'];
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 操作者用户ID
    /**
     * @var string
     */
    public $userId;

    // 项目ID
    /**
     * @var string
     */
    public $projectId;

    // 成员用户ID列表
    /**
     * @var string[]
     */
    public $users;

}
