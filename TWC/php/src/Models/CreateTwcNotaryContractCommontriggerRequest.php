<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\RepaymentOrderRequest;

class CreateTwcNotaryContractCommontriggerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'flowId' => 'flow_id',
        'repaymentOrderInfo' => 'repayment_order_info',
        'userTuid' => 'user_tuid',
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->repaymentOrderInfo) {
            $res['repayment_order_info'] = [];
            if(null !== $this->repaymentOrderInfo && is_array($this->repaymentOrderInfo)){
                $n = 0;
                foreach($this->repaymentOrderInfo as $item){
                    $res['repayment_order_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->userTuid) {
            $res['user_tuid'] = $this->userTuid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateTwcNotaryContractCommontriggerRequest
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
        if(isset($map['flow_id'])){
            $model->flowId = $map['flow_id'];
        }
        if(isset($map['repayment_order_info'])){
            if(!empty($map['repayment_order_info'])){
                $model->repaymentOrderInfo = [];
                $n = 0;
                foreach($map['repayment_order_info'] as $item) {
                    $model->repaymentOrderInfo[$n++] = null !== $item ? RepaymentOrderRequest::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['user_tuid'])){
            $model->userTuid = $map['user_tuid'];
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

    // 合同id
    /**
     * @var string
     */
    public $flowId;

    // 代扣规则详情
    /**
     * @var array
     */
    public $repaymentOrderInfo;

    // 用户在智能合同平台的身份
    /**
     * @var string
     */
    public $userTuid;

}
