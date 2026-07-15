<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GetIdsquaredOtpRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceAuthCode' => 'device_auth_code',
        'apiVersion' => 'api_version',
    ];
    public function validate() {
        Model::validateRequired('deviceAuthCode', $this->deviceAuthCode, true);
        Model::validateRequired('apiVersion', $this->apiVersion, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->deviceAuthCode) {
            $res['device_auth_code'] = $this->deviceAuthCode;
        }
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetIdsquaredOtpRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['device_auth_code'])){
            $model->deviceAuthCode = $map['device_auth_code'];
        }
        if(isset($map['api_version'])){
            $model->apiVersion = $map['api_version'];
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

    // 设备侧鉴权码
    /**
     * @var string
     */
    public $deviceAuthCode;

    // API接口版本号
    /**
     * @var string
     */
    public $apiVersion;

}
