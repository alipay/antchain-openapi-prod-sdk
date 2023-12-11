<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class InitAilegalQuestionRequest extends Model
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

    // 提问问题
    /**
     * @var string
     */
    public $question;

    // 是否开启新会话
    /**
     * @var bool
     */
    public $first;

    // 用户id，用户唯一标识
    /**
     * @var string
     */
    public $userId;

    // 用户类型，参见枚举类UserTypeEnum
    /**
     * @var string
     */
    public $userType;

    // app类型，参见枚举类AppTypeEnum
    /**
     * @var string
     */
    public $appType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'question'          => 'question',
        'first'             => 'first',
        'userId'            => 'user_id',
        'userType'          => 'user_type',
        'appType'           => 'app_type',
    ];

    public function validate()
    {
        Model::validateRequired('question', $this->question, true);
        Model::validateRequired('first', $this->first, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('appType', $this->appType, true);
        Model::validateMaxLength('question', $this->question, 1000);
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
        if (null !== $this->first) {
            $res['first'] = $this->first;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->appType) {
            $res['app_type'] = $this->appType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitAilegalQuestionRequest
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
        if (isset($map['first'])) {
            $model->first = $map['first'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['app_type'])) {
            $model->appType = $map['app_type'];
        }

        return $model;
    }
}
