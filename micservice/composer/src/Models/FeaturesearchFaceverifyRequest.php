<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MICSERVICE\Models;

use AlibabaCloud\Tea\Model;

class FeaturesearchFaceverifyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 业务流程的唯一id
    /**
     * @var string
     */
    public $bizId;

    // 场景id
    /**
     * @var string
     */
    public $sceneId;

    // 特征类型
    /**
     * @var string
     */
    public $featureType;

    // 特征向量，维度要求128/256/512
    /**
     * @var string[]
     */
    public $featureVector;

    // 扩展字段，string类型，json格式
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'     => 'auth_token',
        'userId'        => 'user_id',
        'bizId'         => 'biz_id',
        'sceneId'       => 'scene_id',
        'featureType'   => 'feature_type',
        'featureVector' => 'feature_vector',
        'extInfo'       => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
        Model::validateRequired('featureType', $this->featureType, true);
        Model::validateRequired('featureVector', $this->featureVector, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->featureType) {
            $res['feature_type'] = $this->featureType;
        }
        if (null !== $this->featureVector) {
            $res['feature_vector'] = $this->featureVector;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FeaturesearchFaceverifyRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }
        if (isset($map['feature_type'])) {
            $model->featureType = $map['feature_type'];
        }
        if (isset($map['feature_vector'])) {
            if (!empty($map['feature_vector'])) {
                $model->featureVector = $map['feature_vector'];
            }
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
