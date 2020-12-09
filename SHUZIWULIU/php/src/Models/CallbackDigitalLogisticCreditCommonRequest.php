<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CallbackDigitalLogisticCreditCommonRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'msgData' => 'msg_data',
        'msgMethod' => 'msg_method',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->msgData) {
            $res['msg_data'] = $this->msgData;
        }
        if (null !== $this->msgMethod) {
            $res['msg_method'] = $this->msgMethod;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackDigitalLogisticCreditCommonRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['msg_data'])){
            $model->msgData = $map['msg_data'];
        }
        if(isset($map['msg_method'])){
            $model->msgMethod = $map['msg_method'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 回调数据，根据不同msg_method 返回不同结构
    /**
     * @var string
     */
    public $msgData;

    // 回调方法类型
    /**
     * @var string
     */
    public $msgMethod;

}
