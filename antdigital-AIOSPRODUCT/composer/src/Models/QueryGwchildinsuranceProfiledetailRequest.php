<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AIOSPRODUCT\Models;

use AlibabaCloud\Tea\Model;

class QueryGwchildinsuranceProfiledetailRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenanatId' => 'tenanat_id',
        'userId' => 'user_id',
        'sessionId' => 'session_id',
    ];
    public function validate() {
        Model::validateRequired('tenanatId', $this->tenanatId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenanatId) {
            $res['tenanat_id'] = $this->tenanatId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryGwchildinsuranceProfiledetailRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tenanat_id'])){
            $model->tenanatId = $map['tenanat_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 当前联调租户；必须精确命中 finaigateway 发布白名单
    /**
     * @var string
     */
    public $tenanatId;

    // 当前用户，最大 64 字符
    /**
     * @var string
     */
    public $userId;

    // 当前会话，最大 64 字符
    /**
     * @var string
     */
    public $sessionId;

}
