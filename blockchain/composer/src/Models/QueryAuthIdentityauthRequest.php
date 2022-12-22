<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthIdentityauthRequest extends Model
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

    // 授权宝生成的bizId 与 核身token 用 ; 拼接成的字符串
    /**
     * @var string
     */
    public $securityId;

    // 核身的userid
    /**
     * @var string
     */
    public $userId;

    // 核身对应的操作类型，目前只有0，代表创建did
    /**
     * @var int
     */
    public $operationType;

    // 其它类型操作时的参数，json形式字符串
    /**
     * @var string
     */
    public $params;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'securityId'        => 'security_id',
        'userId'            => 'user_id',
        'operationType'     => 'operation_type',
        'params'            => 'params',
    ];

    public function validate()
    {
        Model::validateRequired('securityId', $this->securityId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('operationType', $this->operationType, true);
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
        if (null !== $this->securityId) {
            $res['security_id'] = $this->securityId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthIdentityauthRequest
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
        if (isset($map['security_id'])) {
            $model->securityId = $map['security_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }

        return $model;
    }
}
