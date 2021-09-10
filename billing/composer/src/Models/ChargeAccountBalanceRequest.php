<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BILLING\Models;

use AlibabaCloud\Tea\Model;

class ChargeAccountBalanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // "10.11"代表10.11元,最小粒度到分，小数点后2位
    /**
     * @var string
     */
    public $chargeAmt;

    // 币种,支付宝体系内一般存储币种值（156/840/...），156代表人民币
    /**
     * @var string
     */
    public $currencyValue;

    // 渠道来源： ANTCLOUD_OFFICIAL 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台
    /**
     * @var string
     */
    public $fromChannel;

    // 唤起收银台后，充值后回调url链接
    /**
     * @var string
     */
    public $returnUrl;
    protected $_name = [
        'authToken'     => 'auth_token',
        'chargeAmt'     => 'charge_amt',
        'currencyValue' => 'currency_value',
        'fromChannel'   => 'from_channel',
        'returnUrl'     => 'return_url',
    ];

    public function validate()
    {
        Model::validateRequired('chargeAmt', $this->chargeAmt, true);
        Model::validateRequired('currencyValue', $this->currencyValue, true);
        Model::validateRequired('fromChannel', $this->fromChannel, true);
        Model::validateRequired('returnUrl', $this->returnUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->chargeAmt) {
            $res['charge_amt'] = $this->chargeAmt;
        }
        if (null !== $this->currencyValue) {
            $res['currency_value'] = $this->currencyValue;
        }
        if (null !== $this->fromChannel) {
            $res['from_channel'] = $this->fromChannel;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChargeAccountBalanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['charge_amt'])) {
            $model->chargeAmt = $map['charge_amt'];
        }
        if (isset($map['currency_value'])) {
            $model->currencyValue = $map['currency_value'];
        }
        if (isset($map['from_channel'])) {
            $model->fromChannel = $map['from_channel'];
        }
        if (isset($map['return_url'])) {
            $model->returnUrl = $map['return_url'];
        }

        return $model;
    }
}
