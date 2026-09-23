<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVESERVICE\Models;

use AlibabaCloud\Tea\Model;

class CallbackTaskCallresultRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'errorCode' => 'error_code',
        'dialResult' => 'dial_result',
    ];
    public function validate() {
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('dialResult', $this->dialResult, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->dialResult) {
            $res['dial_result'] = $this->dialResult;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackTaskCallresultRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
        }
        if(isset($map['dial_result'])){
            $model->dialResult = $map['dial_result'];
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

    // 错误编码(0: 正确)
    /**
     * @var string
     */
    public $errorCode;

    // 通话结果
    /**
     * @var string
     */
    public $dialResult;

}
