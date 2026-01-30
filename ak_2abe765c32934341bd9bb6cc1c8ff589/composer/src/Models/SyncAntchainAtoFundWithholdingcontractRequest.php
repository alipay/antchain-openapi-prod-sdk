<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class SyncAntchainAtoFundWithholdingcontractRequest extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderId;

    // 商家在数科注册的租户id
    /**
     * @var string
     */
    public $merchantTenantId;

    // 代扣协议号
    /**
     * @var string
     */
    public $withholdingContractId;

    // json的字符串，存储额外信息
    /**
     * @var string
     */
    public $extraInfo;

    // 签署状态：
    // - ACCEPT : 接受
    // - REFUSE : 拒绝
    // - TIMEOUT : 超时
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'orderId'               => 'order_id',
        'merchantTenantId'      => 'merchant_tenant_id',
        'withholdingContractId' => 'withholding_contract_id',
        'extraInfo'             => 'extra_info',
        'status'                => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateRequired('withholdingContractId', $this->withholdingContractId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('merchantTenantId', $this->merchantTenantId, 50);
        Model::validateMaxLength('withholdingContractId', $this->withholdingContractId, 100);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('merchantTenantId', $this->merchantTenantId, 1);
        Model::validateMinLength('withholdingContractId', $this->withholdingContractId, 1);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantTenantId) {
            $res['merchant_tenant_id'] = $this->merchantTenantId;
        }
        if (null !== $this->withholdingContractId) {
            $res['withholding_contract_id'] = $this->withholdingContractId;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAntchainAtoFundWithholdingcontractRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_tenant_id'])) {
            $model->merchantTenantId = $map['merchant_tenant_id'];
        }
        if (isset($map['withholding_contract_id'])) {
            $model->withholdingContractId = $map['withholding_contract_id'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
