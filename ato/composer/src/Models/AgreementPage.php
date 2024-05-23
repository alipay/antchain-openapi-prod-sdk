<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AgreementPage extends Model
{
    // 协议id
    /**
     * @example 1231234343423423
     *
     * @var string
     */
    public $agreementId;

    // 代理企业名称
    /**
     * @example xx公司
     *
     * @var string
     */
    public $merchantName;

    // 租户8位id
    /**
     * @example SADWQWAW
     *
     * @var string
     */
    public $tenantId;

    // 业务类型 枚举
    /**
     * @example 业务类型
     *
     * @var string
     */
    public $productMainClass;

    // 协议类型 枚举
    /**
     * @example 协议类型
     *
     * @var string
     */
    public $agreementType;

    // 租户签约状态 枚举
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $signStatus;
    protected $_name = [
        'agreementId'      => 'agreement_id',
        'merchantName'     => 'merchant_name',
        'tenantId'         => 'tenant_id',
        'productMainClass' => 'product_main_class',
        'agreementType'    => 'agreement_type',
        'signStatus'       => 'sign_status',
    ];

    public function validate()
    {
        Model::validateRequired('agreementId', $this->agreementId, true);
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productMainClass', $this->productMainClass, true);
        Model::validateRequired('agreementType', $this->agreementType, true);
        Model::validateRequired('signStatus', $this->signStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->agreementId) {
            $res['agreement_id'] = $this->agreementId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productMainClass) {
            $res['product_main_class'] = $this->productMainClass;
        }
        if (null !== $this->agreementType) {
            $res['agreement_type'] = $this->agreementType;
        }
        if (null !== $this->signStatus) {
            $res['sign_status'] = $this->signStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgreementPage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['agreement_id'])) {
            $model->agreementId = $map['agreement_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['product_main_class'])) {
            $model->productMainClass = $map['product_main_class'];
        }
        if (isset($map['agreement_type'])) {
            $model->agreementType = $map['agreement_type'];
        }
        if (isset($map['sign_status'])) {
            $model->signStatus = $map['sign_status'];
        }

        return $model;
    }
}
