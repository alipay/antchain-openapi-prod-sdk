<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SubmitAuthBusinessDataRequest extends Model
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

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 推送的数据内容，json字符串形式
    /**
     * @var string
     */
    public $pushDataContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'sceneCode'         => 'scene_code',
        'pushDataContent'   => 'push_data_content',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('pushDataContent', $this->pushDataContent, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->pushDataContent) {
            $res['push_data_content'] = $this->pushDataContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAuthBusinessDataRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['push_data_content'])) {
            $model->pushDataContent = $map['push_data_content'];
        }

        return $model;
    }
}
