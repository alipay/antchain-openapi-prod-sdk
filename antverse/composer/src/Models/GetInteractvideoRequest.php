<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ANTVERSE\Models;

use AlibabaCloud\Tea\Model;

class GetInteractvideoRequest extends Model
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

    // 问题
    /**
     * @var string
     */
    public $question;

    // 数字人形象ID(不填写时,返回默认形象视频)
    /**
     * @var string
     */
    public $avatarId;

    // 交互类型（默认为QA, 问答：QA）
    /**
     * @var string
     */
    public $interactType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'question'          => 'question',
        'avatarId'          => 'avatar_id',
        'interactType'      => 'interact_type',
    ];

    public function validate()
    {
        Model::validateRequired('question', $this->question, true);
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
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->avatarId) {
            $res['avatar_id'] = $this->avatarId;
        }
        if (null !== $this->interactType) {
            $res['interact_type'] = $this->interactType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetInteractvideoRequest
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
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['avatar_id'])) {
            $model->avatarId = $map['avatar_id'];
        }
        if (isset($map['interact_type'])) {
            $model->interactType = $map['interact_type'];
        }

        return $model;
    }
}
