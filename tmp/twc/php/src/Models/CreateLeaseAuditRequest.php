<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseAuditRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId' => 'application_id',
        'async' => 'async',
        'batchIndex' => 'batch_index',
        'currentAuditIndex' => 'current_audit_index',
        'extraInfo' => 'extra_info',
        'leaseId' => 'lease_id',
        'manualAudit' => 'manual_audit',
        'manualAuditComments' => 'manual_audit_comments',
        'orderId' => 'order_id',
        'totalAuditNumber' => 'total_audit_number',
        'relatedNotify' => 'related_notify',
    ];
    public function validate() {
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('manualAudit', $this->manualAudit, true);
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
        if (null !== $this->batchIndex) {
            $res['batch_index'] = $this->batchIndex;
        }
        if (null !== $this->currentAuditIndex) {
            $res['current_audit_index'] = $this->currentAuditIndex;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->manualAudit) {
            $res['manual_audit'] = $this->manualAudit;
        }
        if (null !== $this->manualAuditComments) {
            $res['manual_audit_comments'] = $this->manualAuditComments;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->totalAuditNumber) {
            $res['total_audit_number'] = $this->totalAuditNumber;
        }
        if (null !== $this->relatedNotify) {
            $res['related_notify'] = $this->relatedNotify;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateLeaseAuditRequest
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
        if(isset($map['batch_index'])){
            $model->batchIndex = $map['batch_index'];
        }
        if(isset($map['current_audit_index'])){
            $model->currentAuditIndex = $map['current_audit_index'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['lease_id'])){
            $model->leaseId = $map['lease_id'];
        }
        if(isset($map['manual_audit'])){
            $model->manualAudit = $map['manual_audit'];
        }
        if(isset($map['manual_audit_comments'])){
            $model->manualAuditComments = $map['manual_audit_comments'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['total_audit_number'])){
            $model->totalAuditNumber = $map['total_audit_number'];
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

    // 融资租赁业务id，由资方控制台创建返回
    /**
     * @var string
     */
    public $applicationId;

    // 是否启动订单的异步处理
    /**
     * @var int
     */
    public $async;

    // 融资机构审核批次
    // 
    /**
     * @var string
     */
    public $batchIndex;

    // 当前订单处于本批次中的index
    /**
     * @var int
     */
    public $currentAuditIndex;

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

    // 融资机构审核状态，0.审核中1.审核失败2.审核成功
    /**
     * @var int
     */
    public $manualAudit;

    // 融资结构审核说明，非必填，审核失败必填失败原因
    /**
     * @var string
     */
    public $manualAuditComments;

    // 订单id 长度不可超过50
    // 
    /**
     * @var string
     */
    public $orderId;

    // 总审核的个数
    /**
     * @var int
     */
    public $totalAuditNumber;

    // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
    // 
    /**
     * @var string[]
     */
    public $relatedNotify;

}
