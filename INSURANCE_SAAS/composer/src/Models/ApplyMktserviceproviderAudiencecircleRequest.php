<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class ApplyMktserviceproviderAudiencecircleRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'requestId' => 'request_id',
        'projectId' => 'project_id',
        'bizScene' => 'biz_scene',
        'encryptionType' => 'encryption_type',
        'encryptedUserIds' => 'encrypted_user_ids',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('encryptionType', $this->encryptionType, true);
        Model::validateRequired('encryptedUserIds', $this->encryptedUserIds, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->encryptionType) {
            $res['encryption_type'] = $this->encryptionType;
        }
        if (null !== $this->encryptedUserIds) {
            $res['encrypted_user_ids'] = $this->encryptedUserIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyMktserviceproviderAudiencecircleRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['project_id'])){
            $model->projectId = $map['project_id'];
        }
        if(isset($map['biz_scene'])){
            $model->bizScene = $map['biz_scene'];
        }
        if(isset($map['encryption_type'])){
            $model->encryptionType = $map['encryption_type'];
        }
        if(isset($map['encrypted_user_ids'])){
            if(!empty($map['encrypted_user_ids'])){
                $model->encryptedUserIds = $map['encrypted_user_ids'];
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求id，每一次请求保持唯一；
    /**
     * @var string
     */
    public $requestId;

    // 项目ID，待蚂蚁分配
    /**
     * @var string
     */
    public $projectId;

    // 业务场景标识
    /**
     * @var string
     */
    public $bizScene;

    // 加密类型，MD5 32位小写
    /**
     * @var string
     */
    public $encryptionType;

    // 加密用户标识
    /**
     * @var string[]
     */
    public $encryptedUserIds;

}
