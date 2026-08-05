<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryOrderRefundRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'refundRecordNo' => 'refund_record_no',
    ];
    public function validate() {
        Model::validateRequired('refundRecordNo', $this->refundRecordNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->refundRecordNo) {
            $res['refund_record_no'] = $this->refundRecordNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOrderRefundRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['refund_record_no'])){
            $model->refundRecordNo = $map['refund_record_no'];
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

    // 退款退分账唯一标识
    /**
     * @var string
     */
    public $refundRecordNo;

}
