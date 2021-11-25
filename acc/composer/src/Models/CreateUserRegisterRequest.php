<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateUserRegisterRequest extends Model
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

    // 默认登录名称
    /**
     * @var string
     */
    public $loginId;

    // 用户邮箱
    /**
     * @var string
     */
    public $email;

    // 用户手机号码
    /**
     * @var string
     */
    public $telphone;

    // 云蚂侧用户id
    /**
     * @var int
     */
    public $userId;

    // 来源 ： 1 APP注册，2 PC注册，3 后台添加
    /**
     * @var string
     */
    public $source;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'loginId'           => 'login_id',
        'email'             => 'email',
        'telphone'          => 'telphone',
        'userId'            => 'user_id',
        'source'            => 'source',
    ];

    public function validate()
    {
        Model::validateRequired('loginId', $this->loginId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('source', $this->source, true);
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
        if (null !== $this->loginId) {
            $res['login_id'] = $this->loginId;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->telphone) {
            $res['telphone'] = $this->telphone;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUserRegisterRequest
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
        if (isset($map['login_id'])) {
            $model->loginId = $map['login_id'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['telphone'])) {
            $model->telphone = $map['telphone'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}
