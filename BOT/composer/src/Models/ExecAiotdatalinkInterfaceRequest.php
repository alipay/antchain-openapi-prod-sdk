<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecAiotdatalinkInterfaceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'api' => 'api',
        'requestData' => 'request_data',
    ];
    public function validate() {
        Model::validateRequired('api', $this->api, true);
        Model::validateRequired('requestData', $this->requestData, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->api) {
            $res['api'] = $this->api;
        }
        if (null !== $this->requestData) {
            $res['request_data'] = $this->requestData;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAiotdatalinkInterfaceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['api'])){
            $model->api = $map['api'];
        }
        if(isset($map['request_data'])){
            $model->requestData = $map['request_data'];
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

    // 服务接口
    /**
     * @var string
     */
    public $api;

    // 请求示例，会根据不同的接口传入不同的参数，json 格式字符串
    /**
     * @var string
     */
    public $requestData;

}
