<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models;

use AlibabaCloud\Tea\Model;

class SyncAntchainBbpInsuranceRequest extends Model
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

    // 保司编码
    /**
     * @var string
     */
    public $mechanismCode;

    // 理赔加密信息
    /**
     * @var string
     */
    public $policyEncryptionContext;

    // 保单号
    /**
     * @var string
     */
    public $policyNo;

    // 保险产品SKU
    /**
     * @var string
     */
    public $thirdpartSku;

    // 保司名称
    /**
     * @var string
     */
    public $mechanismName;

    // 保单种类，险种
    /**
     * @var string
     */
    public $insuranceType;

    // 操作类型
    // 下单 支付 理赔 退单
    /**
     * @var string
     */
    public $operation;

    // 赔付单号
    /**
     * @var string
     */
    public $claimOrderNo;

    // 理赔申请时间（毫秒值）
    /**
     * @var int
     */
    public $claimApplyTime;

    // 理赔赔付时间（毫秒值）
    /**
     * @var string
     */
    public $claimPayTime;

    // 理赔申请金额，单位元，保留小数点两位BigDecimal
    /**
     * @var int
     */
    public $claimApplyAmount;

    // 理赔金额
    /**
     * @var int
     */
    public $claimAmount;

    // 授权列表
    /**
     * @var AuthorizeRecordsPairs[]
     */
    public $authorizeRecords;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'mechanismCode'           => 'mechanism_code',
        'policyEncryptionContext' => 'policy_encryption_context',
        'policyNo'                => 'policy_no',
        'thirdpartSku'            => 'thirdpart_sku',
        'mechanismName'           => 'mechanism_name',
        'insuranceType'           => 'insurance_type',
        'operation'               => 'operation',
        'claimOrderNo'            => 'claim_order_no',
        'claimApplyTime'          => 'claim_apply_time',
        'claimPayTime'            => 'claim_pay_time',
        'claimApplyAmount'        => 'claim_apply_amount',
        'claimAmount'             => 'claim_amount',
        'authorizeRecords'        => 'authorize_records',
    ];

    public function validate()
    {
        Model::validateRequired('mechanismCode', $this->mechanismCode, true);
        Model::validateRequired('policyEncryptionContext', $this->policyEncryptionContext, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('thirdpartSku', $this->thirdpartSku, true);
        Model::validateRequired('claimOrderNo', $this->claimOrderNo, true);
        Model::validateRequired('claimApplyTime', $this->claimApplyTime, true);
        Model::validateRequired('claimPayTime', $this->claimPayTime, true);
        Model::validateRequired('claimApplyAmount', $this->claimApplyAmount, true);
        Model::validateRequired('claimAmount', $this->claimAmount, true);
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
        if (null !== $this->mechanismCode) {
            $res['mechanism_code'] = $this->mechanismCode;
        }
        if (null !== $this->policyEncryptionContext) {
            $res['policy_encryption_context'] = $this->policyEncryptionContext;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->thirdpartSku) {
            $res['thirdpart_sku'] = $this->thirdpartSku;
        }
        if (null !== $this->mechanismName) {
            $res['mechanism_name'] = $this->mechanismName;
        }
        if (null !== $this->insuranceType) {
            $res['insurance_type'] = $this->insuranceType;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->claimOrderNo) {
            $res['claim_order_no'] = $this->claimOrderNo;
        }
        if (null !== $this->claimApplyTime) {
            $res['claim_apply_time'] = $this->claimApplyTime;
        }
        if (null !== $this->claimPayTime) {
            $res['claim_pay_time'] = $this->claimPayTime;
        }
        if (null !== $this->claimApplyAmount) {
            $res['claim_apply_amount'] = $this->claimApplyAmount;
        }
        if (null !== $this->claimAmount) {
            $res['claim_amount'] = $this->claimAmount;
        }
        if (null !== $this->authorizeRecords) {
            $res['authorize_records'] = [];
            if (null !== $this->authorizeRecords && \is_array($this->authorizeRecords)) {
                $n = 0;
                foreach ($this->authorizeRecords as $item) {
                    $res['authorize_records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAntchainBbpInsuranceRequest
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
        if (isset($map['mechanism_code'])) {
            $model->mechanismCode = $map['mechanism_code'];
        }
        if (isset($map['policy_encryption_context'])) {
            $model->policyEncryptionContext = $map['policy_encryption_context'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['thirdpart_sku'])) {
            $model->thirdpartSku = $map['thirdpart_sku'];
        }
        if (isset($map['mechanism_name'])) {
            $model->mechanismName = $map['mechanism_name'];
        }
        if (isset($map['insurance_type'])) {
            $model->insuranceType = $map['insurance_type'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['claim_order_no'])) {
            $model->claimOrderNo = $map['claim_order_no'];
        }
        if (isset($map['claim_apply_time'])) {
            $model->claimApplyTime = $map['claim_apply_time'];
        }
        if (isset($map['claim_pay_time'])) {
            $model->claimPayTime = $map['claim_pay_time'];
        }
        if (isset($map['claim_apply_amount'])) {
            $model->claimApplyAmount = $map['claim_apply_amount'];
        }
        if (isset($map['claim_amount'])) {
            $model->claimAmount = $map['claim_amount'];
        }
        if (isset($map['authorize_records'])) {
            if (!empty($map['authorize_records'])) {
                $model->authorizeRecords = [];
                $n                       = 0;
                foreach ($map['authorize_records'] as $item) {
                    $model->authorizeRecords[$n++] = null !== $item ? AuthorizeRecordsPairs::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
