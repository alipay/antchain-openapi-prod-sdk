<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVEAGENT\Models;

use AlibabaCloud\Tea\Model;

class PushCustomerLogininfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'custNo' => 'cust_no',
        'actionInfo' => 'action_info',
    ];
    public function validate() {
        Model::validateRequired('custNo', $this->custNo, true);
        Model::validateRequired('actionInfo', $this->actionInfo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->custNo) {
            $res['cust_no'] = $this->custNo;
        }
        if (null !== $this->actionInfo) {
            $res['action_info'] = $this->actionInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushCustomerLogininfoRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['cust_no'])){
            $model->custNo = $map['cust_no'];
        }
        if(isset($map['action_info'])){
            $model->actionInfo = $map['action_info'];
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

    // 客户号
    /**
     * @var string
     */
    public $custNo;

    // 客户行为
    /**
     * @var string
     */
    public $actionInfo;

}
