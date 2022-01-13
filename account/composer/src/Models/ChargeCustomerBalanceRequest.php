<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class ChargeCustomerBalanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 充值金额，单位分
    /**
     * @var string
     */
    public $rechargeAmt;

    // 币种
    /**
     * @var string
     */
    public $currencyValue;

    // 用户充值后跳转的地址链接，若不填，则默认跳到中台费用中心页面
    /**
     * @var string
     */
    public $returnUrl;

    // 调用系统appName
    /**
     * @var string
     */
    public $source;

    // 充值渠道，默认传"01"
    /**
     * @var string
     */
    public $rechargeChannel;

    // 外部单据号，用于幂等
    /**
     * @var string
     */
    public $outBizNo;
    protected $_name = [
        'authToken'       => 'auth_token',
        'tenantId'        => 'tenant_id',
        'rechargeAmt'     => 'recharge_amt',
        'currencyValue'   => 'currency_value',
        'returnUrl'       => 'return_url',
        'source'          => 'source',
        'rechargeChannel' => 'recharge_channel',
        'outBizNo'        => 'out_biz_no',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('rechargeAmt', $this->rechargeAmt, true);
        Model::validateRequired('currencyValue', $this->currencyValue, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('rechargeChannel', $this->rechargeChannel, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->rechargeAmt) {
            $res['recharge_amt'] = $this->rechargeAmt;
        }
        if (null !== $this->currencyValue) {
            $res['currency_value'] = $this->currencyValue;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->rechargeChannel) {
            $res['recharge_channel'] = $this->rechargeChannel;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChargeCustomerBalanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['recharge_amt'])) {
            $model->rechargeAmt = $map['recharge_amt'];
        }
        if (isset($map['currency_value'])) {
            $model->currencyValue = $map['currency_value'];
        }
        if (isset($map['return_url'])) {
            $model->returnUrl = $map['return_url'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['recharge_channel'])) {
            $model->rechargeChannel = $map['recharge_channel'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }

        return $model;
    }
}
