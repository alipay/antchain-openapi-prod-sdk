<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CancelContractPaysingletradeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId' => 'flow_id',
        'cancelOutOrderNo' => 'cancel_out_order_no',
    ];
    public function validate() {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('cancelOutOrderNo', $this->cancelOutOrderNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->cancelOutOrderNo) {
            $res['cancel_out_order_no'] = $this->cancelOutOrderNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CancelContractPaysingletradeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['flow_id'])){
            $model->flowId = $map['flow_id'];
        }
        if(isset($map['cancel_out_order_no'])){
            $model->cancelOutOrderNo = $map['cancel_out_order_no'];
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

    // 智能合同id
    /**
     * @var string
     */
    public $flowId;

    // 被取消的某一期的代扣id
    /**
     * @var string
     */
    public $cancelOutOrderNo;

}
