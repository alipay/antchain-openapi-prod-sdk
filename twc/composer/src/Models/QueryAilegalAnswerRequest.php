<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryAilegalAnswerRequest extends Model
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

    // twc.notary.ailegal.question.init(提出问题)接口返回的问题id
    // 长度不超过32位
    /**
     * @var string
     */
    public $questionId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'questionId'        => 'question_id',
    ];

    public function validate()
    {
        Model::validateRequired('questionId', $this->questionId, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAilegalAnswerRequest
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

        return $model;
    }
}
