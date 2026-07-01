<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SubmitAilegalFeedbackRequest extends Model
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

    // twc.notary.ailegal.question.init(提出问题)接口返回的问题id,长度不超过32位
    /**
     * @var string
     */
    public $questionId;

    // 用户态度，参见枚举类AttitudeEnum
    /**
     * @var string
     */
    public $attitude;

    // 用户反馈标签集合，与用户态度相对应，参见枚举类TagEnum定义
    /**
     * @var string[]
     */
    public $tags;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'questionId'        => 'question_id',
        'attitude'          => 'attitude',
        'tags'              => 'tags',
    ];

    public function validate()
    {
        Model::validateRequired('questionId', $this->questionId, true);
        Model::validateRequired('attitude', $this->attitude, true);
        Model::validateRequired('tags', $this->tags, true);
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
        if (null !== $this->questionId) {
            $res['question_id'] = $this->questionId;
        }
        if (null !== $this->attitude) {
            $res['attitude'] = $this->attitude;
        }
        if (null !== $this->tags) {
            $res['tags'] = $this->tags;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAilegalFeedbackRequest
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
        if (isset($map['question_id'])) {
            $model->questionId = $map['question_id'];
        }
        if (isset($map['attitude'])) {
            $model->attitude = $map['attitude'];
        }
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = $map['tags'];
            }
        }

        return $model;
    }
}
