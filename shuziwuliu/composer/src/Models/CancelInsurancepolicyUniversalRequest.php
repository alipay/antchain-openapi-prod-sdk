<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CancelInsurancepolicyUniversalRequest extends Model
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

    // 投保订单号
    /**
     * @var string
     */
    public $applyTradeNo;

    // 保司, 01-华泰, 03-亚太
    /**
     * @var string
     */
    public $externalChannelCode;

    // 险种, 01-承运人平台责任险
    //
    /**
     * @var string
     */
    public $externalProductCode;

    // 保单号
    /**
     * @var string
     */
    public $polNo;

    // 退保全局唯一流水号
    /**
     * @var string
     */
    public $tradeNo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'applyTradeNo'        => 'apply_trade_no',
        'externalChannelCode' => 'external_channel_code',
        'externalProductCode' => 'external_product_code',
        'polNo'               => 'pol_no',
        'tradeNo'             => 'trade_no',
    ];

    public function validate()
    {
        Model::validateRequired('applyTradeNo', $this->applyTradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('polNo', $this->polNo, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateMaxLength('applyTradeNo', $this->applyTradeNo, 50);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 2);
        Model::validateMaxLength('externalProductCode', $this->externalProductCode, 2);
        Model::validateMaxLength('polNo', $this->polNo, 50);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
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
        if (null !== $this->externalProductCode) {
            $res['external_product_code'] = $this->externalProductCode;
        }
        if (null !== $this->polNo) {
            $res['pol_no'] = $this->polNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelInsurancepolicyUniversalRequest
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
        if (isset($map['external_product_code'])) {
            $model->externalProductCode = $map['external_product_code'];
        }
        if (isset($map['pol_no'])) {
            $model->polNo = $map['pol_no'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }

        return $model;
    }
}
