<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeasePaymentfileRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId' => 'application_id',
        'async' => 'async',
        'extraInfo' => 'extra_info',
        'leaseId' => 'lease_id',
        'orderId' => 'order_id',
        'paymentFileHash' => 'payment_file_hash',
        'paymentFileTxHash' => 'payment_file_tx_hash',
        'paymentUrl' => 'payment_url',
        'relatedNotify' => 'related_notify',
    ];
    public function validate() {
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('orderId', $this->orderId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->async) {
            $res['async'] = $this->async;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->paymentFileHash) {
            $res['payment_file_hash'] = $this->paymentFileHash;
        }
        if (null !== $this->paymentFileTxHash) {
            $res['payment_file_tx_hash'] = $this->paymentFileTxHash;
        }
        if (null !== $this->paymentUrl) {
            $res['payment_url'] = $this->paymentUrl;
        }
        if (null !== $this->relatedNotify) {
            $res['related_notify'] = $this->relatedNotify;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateLeasePaymentfileRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['application_id'])){
            $model->applicationId = $map['application_id'];
        }
        if(isset($map['async'])){
            $model->async = $map['async'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['lease_id'])){
            $model->leaseId = $map['lease_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['payment_file_hash'])){
            $model->paymentFileHash = $map['payment_file_hash'];
        }
        if(isset($map['payment_file_tx_hash'])){
            $model->paymentFileTxHash = $map['payment_file_tx_hash'];
        }
        if(isset($map['payment_url'])){
            $model->paymentUrl = $map['payment_url'];
        }
        if(isset($map['related_notify'])){
            if(!empty($map['related_notify'])){
                $model->relatedNotify = $map['related_notify'];
            }
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

    // 融资租赁业务id，由资方控制台生成
    /**
     * @var string
     */
    public $applicationId;

    // 是否启动订单的异步处理
    /**
     * @var int
     */
    public $async;

    // 融资租赁额外字段
    /**
     * @var string
     */
    public $extraInfo;

    // 租赁服务平台ID 长度不可超过50
    /**
     * @var string
     */
    public $leaseId;

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 付款通知书加签完电子签名后，PDF文件hash
    /**
     * @var string
     */
    public $paymentFileHash;

    // 付款通知书存证交易哈希
    /**
     * @var string
     */
    public $paymentFileTxHash;

    // 付款通知所在路径
    /**
     * @var string
     */
    public $paymentUrl;

    // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
    // 
    /**
     * @var string[]
     */
    public $relatedNotify;

}
