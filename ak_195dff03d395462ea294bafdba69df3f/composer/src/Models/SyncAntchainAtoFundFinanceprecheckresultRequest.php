<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class SyncAntchainAtoFundFinanceprecheckresultRequest extends Model
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

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 订单所属商户的社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 资方的社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 预审结果
    // ● APPROVAL ： 通过
    // ● REFUSE ：拒绝
    /**
     * @var string
     */
    public $result;

    // 拒绝原因
    /**
     * @var string
     */
    public $refuseReason;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'merchantId'        => 'merchant_id',
        'fundId'            => 'fund_id',
        'result'            => 'result',
        'refuseReason'      => 'refuse_reason',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('result', $this->result, true);
        Model::validateMinLength('orderId', $this->orderId, 6);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('fundId', $this->fundId, 1);
        Model::validateMinLength('result', $this->result, 1);
        Model::validateMaxLength('refuseReason', $this->refuseReason, 100);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->refuseReason) {
            $res['refuse_reason'] = $this->refuseReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAntchainAtoFundFinanceprecheckresultRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['refuse_reason'])) {
            $model->refuseReason = $map['refuse_reason'];
        }

        return $model;
    }
}
