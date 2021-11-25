<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class AuthUserRefRequest extends Model
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

    // 操作员id，一般是C类用户
    /**
     * @var int
     */
    public $operatorId;

    // 待登录的B类账号id
    /**
     * @var int
     */
    public $refUserId;

    // operatorId 用户登录时对应的accessToken
    //
    //
    /**
     * @var string
     */
    public $accessToken;

    // 是否设为默认企业(1 设置默认企业 0 切换临时企业)
    //
    //
    /**
     * @var int
     */
    public $setDefault;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'operatorId'        => 'operator_id',
        'refUserId'         => 'ref_user_id',
        'accessToken'       => 'access_token',
        'setDefault'        => 'set_default',
    ];

    public function validate()
    {
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('refUserId', $this->refUserId, true);
        Model::validateRequired('accessToken', $this->accessToken, true);
        Model::validateRequired('setDefault', $this->setDefault, true);
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
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->refUserId) {
            $res['ref_user_id'] = $this->refUserId;
        }
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }
        if (null !== $this->setDefault) {
            $res['set_default'] = $this->setDefault;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthUserRefRequest
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
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['ref_user_id'])) {
            $model->refUserId = $map['ref_user_id'];
        }
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }
        if (isset($map['set_default'])) {
            $model->setDefault = $map['set_default'];
        }

        return $model;
    }
}
