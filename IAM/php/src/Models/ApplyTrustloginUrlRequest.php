<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class ApplyTrustloginUrlRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'gotoUrl' => 'goto_url',
        'operatorId' => 'operator_id',
    ];
    public function validate() {
        Model::validateRequired('gotoUrl', $this->gotoUrl, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->gotoUrl) {
            $res['goto_url'] = $this->gotoUrl;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyTrustloginUrlRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['goto_url'])){
            $model->gotoUrl = $map['goto_url'];
        }
        if(isset($map['operator_id'])){
            $model->operatorId = $map['operator_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 跳转地址
    /**
     * @var string
     */
    public $gotoUrl;

    // 操作员id
    /**
     * @var string
     */
    public $operatorId;

}
