<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class GetTrackingTokenRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outUserId' => 'out_user_id',
    ];
    public function validate() {
        Model::validateRequired('outUserId', $this->outUserId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->outUserId) {
            $res['out_user_id'] = $this->outUserId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetTrackingTokenRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['out_user_id'])){
            $model->outUserId = $map['out_user_id'];
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

    // 客户侧用户id
    /**
     * @var string
     */
    public $outUserId;

}
