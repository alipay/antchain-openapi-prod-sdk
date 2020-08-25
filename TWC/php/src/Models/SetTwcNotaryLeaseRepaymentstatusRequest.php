<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SetTwcNotaryLeaseRepaymentstatusRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'applicationId' => 'application_id',
        'finish' => 'finish',
        'leaseId' => 'lease_id',
        'orderId' => 'order_id',
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
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->finish) {
            $res['finish'] = $this->finish;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SetTwcNotaryLeaseRepaymentstatusRequest
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
        if(isset($map['application_id'])){
            $model->applicationId = $map['application_id'];
        }
        if(isset($map['finish'])){
            $model->finish = $map['finish'];
        }
        if(isset($map['lease_id'])){
            $model->leaseId = $map['lease_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
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

    // 融资租赁对应的合约id
    /**
     * @var string
     */
    public $applicationId;

    // finish只能为0或1，0表示订单重置此状态下订单可以被再次操作【如清分记录上传、还款记录上传等】，1表示订单结束，在1的状态下不会再进行清分、还款记录上传等操作
    /**
     * @var int
     */
    public $finish;

    // 租赁机构金融科技租户Id
    /**
     * @var string
     */
    public $leaseId;

    // 融资租赁对应的订单id
    /**
     * @var string
     */
    public $orderId;

}
