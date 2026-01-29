<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SignFundFlowRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 资方统一社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 合同待签署url
    /**
     * @var string
     */
    public $signDocUrl;

    // 签署状态 SIGNED-已签署 UNDO-作废
    /**
     * @var string
     */
    public $signStatus;

    // 签约id
    /**
     * @var string
     */
    public $signNo;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 文件名 非必填，sign_doc_url传了，此字段必传
    /**
     * @var string
     */
    public $contractName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'fundId'            => 'fund_id',
        'signDocUrl'        => 'sign_doc_url',
        'signStatus'        => 'sign_status',
        'signNo'            => 'sign_no',
        'tenantId'          => 'tenant_id',
        'contractName'      => 'contract_name',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('signStatus', $this->signStatus, true);
        Model::validateRequired('signNo', $this->signNo, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->signDocUrl) {
            $res['sign_doc_url'] = $this->signDocUrl;
        }
        if (null !== $this->signStatus) {
            $res['sign_status'] = $this->signStatus;
        }
        if (null !== $this->signNo) {
            $res['sign_no'] = $this->signNo;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignFundFlowRequest
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
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['sign_doc_url'])) {
            $model->signDocUrl = $map['sign_doc_url'];
        }
        if (isset($map['sign_status'])) {
            $model->signStatus = $map['sign_status'];
        }
        if (isset($map['sign_no'])) {
            $model->signNo = $map['sign_no'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }

        return $model;
    }
}
