<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PushRbbInvoiceChargeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 租户码
    /**
     * @var string
     */
    public $tenantCode;

    // 授权类型
    /**
     * @var string
     */
    public $bizType;

    // 计费项,主租户：税号,子租户：子租户|税号
    /**
     * @var string
     */
    public $customerId;

    // 请求id
    /**
     * @var string
     */
    public $taskRequestId;

    // 利润共享方
    /**
     * @var string
     */
    public $benefitSharePartner;

    // 计费时间
    /**
     * @var string
     */
    public $feeTime;

    // 税号
    /**
     * @var string
     */
    public $sharding;

    // true为接收侧提交账单，false接收侧不用提交账单
    /**
     * @var bool
     */
    public $receiverSubmitBill;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'tenantCode'          => 'tenant_code',
        'bizType'             => 'biz_type',
        'customerId'          => 'customer_id',
        'taskRequestId'       => 'task_request_id',
        'benefitSharePartner' => 'benefit_share_partner',
        'feeTime'             => 'fee_time',
        'sharding'            => 'sharding',
        'receiverSubmitBill'  => 'receiver_submit_bill',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('customerId', $this->customerId, true);
        Model::validateRequired('taskRequestId', $this->taskRequestId, true);
        Model::validateRequired('benefitSharePartner', $this->benefitSharePartner, true);
        Model::validateRequired('feeTime', $this->feeTime, true);
        Model::validateRequired('sharding', $this->sharding, true);
        Model::validateRequired('receiverSubmitBill', $this->receiverSubmitBill, true);
        Model::validatePattern('feeTime', $this->feeTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->taskRequestId) {
            $res['task_request_id'] = $this->taskRequestId;
        }
        if (null !== $this->benefitSharePartner) {
            $res['benefit_share_partner'] = $this->benefitSharePartner;
        }
        if (null !== $this->feeTime) {
            $res['fee_time'] = $this->feeTime;
        }
        if (null !== $this->sharding) {
            $res['sharding'] = $this->sharding;
        }
        if (null !== $this->receiverSubmitBill) {
            $res['receiver_submit_bill'] = $this->receiverSubmitBill;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRbbInvoiceChargeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['task_request_id'])) {
            $model->taskRequestId = $map['task_request_id'];
        }
        if (isset($map['benefit_share_partner'])) {
            $model->benefitSharePartner = $map['benefit_share_partner'];
        }
        if (isset($map['fee_time'])) {
            $model->feeTime = $map['fee_time'];
        }
        if (isset($map['sharding'])) {
            $model->sharding = $map['sharding'];
        }
        if (isset($map['receiver_submit_bill'])) {
            $model->receiverSubmitBill = $map['receiver_submit_bill'];
        }

        return $model;
    }
}
