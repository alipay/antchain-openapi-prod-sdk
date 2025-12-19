<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ORG\Models;

use AlibabaCloud\Tea\Model;

class PaymentRecord extends Model
{
    // 云上租户id
    /**
     * @example 00000001
     *
     * @var string
     */
    public $cloudTenantId;

    // 打款金额，单位分
    /**
     * @example 1899932
     *
     * @var int
     */
    public $paymentAmount;

    // 服务商名称 - 即云租户名称，比如南京飞翰
    /**
     * @example 南京飞翰
     *
     * @var string
     */
    public $supplierName;

    // 打款日期
    /**
     * @example 2024-10-31 00:00:00
     *
     * @var string
     */
    public $paymentDate;

    // 唯一请求id，即payment_record_id
    /**
     * @example 082bab66-7b04-11ef-9df1-d38fddccce14
     *
     * @var string
     */
    public $requestUniqueId;
    protected $_name = [
        'cloudTenantId'   => 'cloud_tenant_id',
        'paymentAmount'   => 'payment_amount',
        'supplierName'    => 'supplier_name',
        'paymentDate'     => 'payment_date',
        'requestUniqueId' => 'request_unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('cloudTenantId', $this->cloudTenantId, true);
        Model::validateRequired('paymentAmount', $this->paymentAmount, true);
        Model::validateRequired('supplierName', $this->supplierName, true);
        Model::validateRequired('paymentDate', $this->paymentDate, true);
        Model::validateRequired('requestUniqueId', $this->requestUniqueId, true);
        Model::validatePattern('paymentDate', $this->paymentDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cloudTenantId) {
            $res['cloud_tenant_id'] = $this->cloudTenantId;
        }
        if (null !== $this->paymentAmount) {
            $res['payment_amount'] = $this->paymentAmount;
        }
        if (null !== $this->supplierName) {
            $res['supplier_name'] = $this->supplierName;
        }
        if (null !== $this->paymentDate) {
            $res['payment_date'] = $this->paymentDate;
        }
        if (null !== $this->requestUniqueId) {
            $res['request_unique_id'] = $this->requestUniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PaymentRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cloud_tenant_id'])) {
            $model->cloudTenantId = $map['cloud_tenant_id'];
        }
        if (isset($map['payment_amount'])) {
            $model->paymentAmount = $map['payment_amount'];
        }
        if (isset($map['supplier_name'])) {
            $model->supplierName = $map['supplier_name'];
        }
        if (isset($map['payment_date'])) {
            $model->paymentDate = $map['payment_date'];
        }
        if (isset($map['request_unique_id'])) {
            $model->requestUniqueId = $map['request_unique_id'];
        }

        return $model;
    }
}
