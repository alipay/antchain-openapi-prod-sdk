<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models;

use AlibabaCloud\Tea\Model;

class QueryMaxCopilotFinRequest extends Model
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

    // 用户问题
    /**
     * @var string
     */
    public $question;

    // 指定的专家框架
    /**
     * @var string
     */
    public $userFrameworkCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'question'          => 'question',
        'userFrameworkCode' => 'user_framework_code',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->userFrameworkCode) {
            $res['user_framework_code'] = $this->userFrameworkCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMaxCopilotFinRequest
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
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['user_framework_code'])) {
            $model->userFrameworkCode = $map['user_framework_code'];
        }

        return $model;
    }
}
