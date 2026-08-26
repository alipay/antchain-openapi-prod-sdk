<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class UpdateAntcloudAcmTenantProjectRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'userId' => 'user_id',
        'projectId' => 'project_id',
        'projectName' => 'project_name',
        'description' => 'description',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('projectName', $this->projectName, true);
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
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateAntcloudAcmTenantProjectRequest
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
        if(isset($map['project_name'])){
            $model->projectName = $map['project_name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
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

    // 项目名称
    /**
     * @var string
     */
    public $projectName;

    // 项目描述
    /**
     * @var string
     */
    public $description;

}
