<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ExecContractCourtdeductRequest extends Model
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

    // 付款银行卡类型，例如：icbc（工行）
    /**
     * @var string
     */
    public $bankType;

    // 自定义交易id
    /**
     * @var string
     */
    public $bizTradeId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bankType'          => 'bank_type',
        'bizTradeId'        => 'biz_trade_id',
    ];

    public function validate()
    {
        Model::validateRequired('bankType', $this->bankType, true);
        Model::validateRequired('bizTradeId', $this->bizTradeId, true);
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
        if (null !== $this->bankType) {
            $res['bank_type'] = $this->bankType;
        }
        if (null !== $this->bizTradeId) {
            $res['biz_trade_id'] = $this->bizTradeId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecContractCourtdeductRequest
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
        if (isset($map['bank_type'])) {
            $model->bankType = $map['bank_type'];
        }
        if (isset($map['biz_trade_id'])) {
            $model->bizTradeId = $map['biz_trade_id'];
        }

        return $model;
    }
}
