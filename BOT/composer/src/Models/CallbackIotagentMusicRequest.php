<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CallbackIotagentMusicRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'code' => 'code',
        'state' => 'state',
    ];
    public function validate() {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('state', $this->state, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackIotagentMusicRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
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

    // 云音乐授权码
    /**
     * @var string
     */
    public $code;

    // 云音乐CSRF状态码
    /**
     * @var string
     */
    public $state;

}
