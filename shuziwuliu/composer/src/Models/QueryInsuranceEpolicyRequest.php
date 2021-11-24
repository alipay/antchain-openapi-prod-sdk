<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryInsuranceEpolicyRequest extends Model
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

    // 投保返回的交易流水号
    /**
     * @var string
     */
    public $applyTradeNo;

    // 保司编码
    /**
     * @var string
     */
    public $externalChannelCode;

    // 保单号
    /**
     * @var string
     */
    public $policyNo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'applyTradeNo'        => 'apply_trade_no',
        'externalChannelCode' => 'external_channel_code',
        'policyNo'            => 'policy_no',
    ];

    public function validate()
    {
        Model::validateRequired('applyTradeNo', $this->applyTradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateMaxLength('applyTradeNo', $this->applyTradeNo, 50);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 64);
        Model::validateMaxLength('policyNo', $this->policyNo, 64);
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
        if (null !== $this->applyTradeNo) {
            $res['apply_trade_no'] = $this->applyTradeNo;
        }
        if (null !== $this->externalChannelCode) {
            $res['external_channel_code'] = $this->externalChannelCode;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsuranceEpolicyRequest
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
        if (isset($map['apply_trade_no'])) {
            $model->applyTradeNo = $map['apply_trade_no'];
        }
        if (isset($map['external_channel_code'])) {
            $model->externalChannelCode = $map['external_channel_code'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }

        return $model;
    }
}
