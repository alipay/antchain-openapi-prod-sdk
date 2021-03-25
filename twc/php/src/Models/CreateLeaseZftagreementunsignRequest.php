<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseZftagreementunsignRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId' => 'order_id',
        'applicationId' => 'application_id',
        'leaseId' => 'lease_id',
        'agreementNo' => 'agreement_no',
        'unsignTime' => 'unsign_time',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('agreementNo', $this->agreementNo, true);
        Model::validateRequired('unsignTime', $this->unsignTime, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->unsignTime) {
            $res['unsign_time'] = $this->unsignTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateLeaseZftagreementunsignRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['application_id'])){
            $model->applicationId = $map['application_id'];
        }
        if(isset($map['lease_id'])){
            $model->leaseId = $map['lease_id'];
        }
        if(isset($map['agreement_no'])){
            $model->agreementNo = $map['agreement_no'];
        }
        if(isset($map['unsign_time'])){
            $model->unsignTime = $map['unsign_time'];
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 合约id
    /**
     * @var string
     */
    public $applicationId;

    // 租赁方金融科技租户id
    /**
     * @var string
     */
    public $leaseId;

    // 直付通网商模式代扣协议号
    /**
     * @var string
     */
    public $agreementNo;

    // 直付通代扣协议解约时间
    /**
     * @var string
     */
    public $unsignTime;

}
