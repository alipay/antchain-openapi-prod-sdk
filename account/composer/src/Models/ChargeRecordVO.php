<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class ChargeRecordVO extends Model
{
    // 充值凭证号
    /**
     * @example 2019032510730500001400640000000001
     *
     * @var string
     */
    public $voucherNo;

    // 外部单据号
    /**
     * @example 2019032510730500001400640000000001
     *
     * @var string
     */
    public $outBizNo;

    // 充值时间
    /**
     * @example 2020-01-01 22:22:22
     *
     * @var string
     */
    public $rechargeTime;

    // 支付状态（INIT-创建订单/SUCCESS-充值成功/FAIL-充值失败）
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $rechargeStatus;

    // 金额
    /**
     * @example
     *
     * @var MultiCurrencyMoneyOpenApi
     */
    public $multiCurrencyMoneyOpenApi;
    protected $_name = [
        'voucherNo'                 => 'voucher_no',
        'outBizNo'                  => 'out_biz_no',
        'rechargeTime'              => 'recharge_time',
        'rechargeStatus'            => 'recharge_status',
        'multiCurrencyMoneyOpenApi' => 'multi_currency_money_open_api',
    ];

    public function validate()
    {
        Model::validateRequired('voucherNo', $this->voucherNo, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('rechargeTime', $this->rechargeTime, true);
        Model::validateRequired('rechargeStatus', $this->rechargeStatus, true);
        Model::validateRequired('multiCurrencyMoneyOpenApi', $this->multiCurrencyMoneyOpenApi, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->voucherNo) {
            $res['voucher_no'] = $this->voucherNo;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->rechargeTime) {
            $res['recharge_time'] = $this->rechargeTime;
        }
        if (null !== $this->rechargeStatus) {
            $res['recharge_status'] = $this->rechargeStatus;
        }
        if (null !== $this->multiCurrencyMoneyOpenApi) {
            $res['multi_currency_money_open_api'] = null !== $this->multiCurrencyMoneyOpenApi ? $this->multiCurrencyMoneyOpenApi->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChargeRecordVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['voucher_no'])) {
            $model->voucherNo = $map['voucher_no'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['recharge_time'])) {
            $model->rechargeTime = $map['recharge_time'];
        }
        if (isset($map['recharge_status'])) {
            $model->rechargeStatus = $map['recharge_status'];
        }
        if (isset($map['multi_currency_money_open_api'])) {
            $model->multiCurrencyMoneyOpenApi = MultiCurrencyMoneyOpenApi::fromMap($map['multi_currency_money_open_api']);
        }

        return $model;
    }
}
