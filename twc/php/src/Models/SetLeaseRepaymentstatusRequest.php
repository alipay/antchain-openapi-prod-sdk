<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SetLeaseRepaymentstatusRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'leaseId' => 'lease_id',
        'applicationId' => 'application_id',
        'orderId' => 'order_id',
        'finish' => 'finish',
    ];
    public function validate() {
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('finish', $this->finish, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->finish) {
            $res['finish'] = $this->finish;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SetLeaseRepaymentstatusRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['lease_id'])){
            $model->leaseId = $map['lease_id'];
        }
        if(isset($map['application_id'])){
            $model->applicationId = $map['application_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['finish'])){
            $model->finish = $map['finish'];
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

    // 租赁机构金融科技租户Id
    /**
     * @var string
     */
    public $leaseId;

    // 融资租赁对应的合约id
    /**
     * @var string
     */
    public $applicationId;

    // 融资租赁对应的订单id
    /**
     * @var string
     */
    public $orderId;

    // finish只能为0或1，0表示订单重置此状态下订单可以被再次操作【如清分记录上传、还款记录上传等】，1表示订单结束，在1的状态下不会再进行清分、还款记录上传等操作
    /**
     * @var int
     */
    public $finish;

}
