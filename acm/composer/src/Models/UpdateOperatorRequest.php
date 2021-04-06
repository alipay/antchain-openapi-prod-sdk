<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class UpdateOperatorRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 邮箱
    /**
     * @var string
     */
    public $email;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 操作员昵称
    /**
     * @var string
     */
    public $nickname;

    // 操作员唯一ID
    /**
     * @var string
     */
    public $operatorId;

    // 操作员真实姓名
    /**
     * @var string
     */
    public $realName;
    protected $_name = [
        'authToken'  => 'auth_token',
        'email'      => 'email',
        'mobile'     => 'mobile',
        'nickname'   => 'nickname',
        'operatorId' => 'operator_id',
        'realName'   => 'real_name',
    ];

    public function validate()
    {
        Model::validateRequired('operatorId', $this->operatorId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->nickname) {
            $res['nickname'] = $this->nickname;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateOperatorRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['nickname'])) {
            $model->nickname = $map['nickname'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }

        return $model;
    }
}
