<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class AddSupplierPaymentRequest extends Model
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

    // 云上租户id
    /**
     * @var string
     */
    public $cloudTenantId;

    // 打款金额，单位分
    /**
     * @var int
     */
    public $paymentAmount;

    // 服务商名称 - 即云租户名称，比如南京飞翰
    /**
     * @var string
     */
    public $supplierName;

    // 打款日期
    /**
     * @var string
     */
    public $paymentDate;

    // 唯一请求id
    /**
     * @var string
     */
    public $requestUniqueId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cloudTenantId'     => 'cloud_tenant_id',
        'paymentAmount'     => 'payment_amount',
        'supplierName'      => 'supplier_name',
        'paymentDate'       => 'payment_date',
        'requestUniqueId'   => 'request_unique_id',
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
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
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
     * @return AddSupplierPaymentRequest
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
