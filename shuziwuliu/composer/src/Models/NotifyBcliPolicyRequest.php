<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class NotifyBcliPolicyRequest extends Model
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

    // 业务流水号,格式：日期_身份标识_全局唯一序号
    /**
     * @var string
     */
    public $tradeNo;

    // 投保流水号，用于关联保单
    /**
     * @var string
     */
    public $insureTradeNo;

    // 保单号
    /**
     * @var string
     */
    public $policyNo;

    // 保额，金额人民币元，精确到小数点后2位
    /**
     * @var string
     */
    public $amount;

    // 保费，金额人民币元，精确到小数点后2位
    /**
     * @var string
     */
    public $premium;

    // 保险起期 格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $insureStart;

    // 保险止期 格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $insureEnd;

    // 电子保单URL,公网可以访问的URL
    /**
     * @var string
     */
    public $polUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tradeNo'           => 'trade_no',
        'insureTradeNo'     => 'insure_trade_no',
        'policyNo'          => 'policy_no',
        'amount'            => 'amount',
        'premium'           => 'premium',
        'insureStart'       => 'insure_start',
        'insureEnd'         => 'insure_end',
        'polUrl'            => 'pol_url',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('insureTradeNo', $this->insureTradeNo, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('premium', $this->premium, true);
        Model::validateRequired('insureStart', $this->insureStart, true);
        Model::validateRequired('insureEnd', $this->insureEnd, true);
        Model::validateRequired('polUrl', $this->polUrl, true);
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->insureTradeNo) {
            $res['insure_trade_no'] = $this->insureTradeNo;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->premium) {
            $res['premium'] = $this->premium;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
        }
        if (null !== $this->insureEnd) {
            $res['insure_end'] = $this->insureEnd;
        }
        if (null !== $this->polUrl) {
            $res['pol_url'] = $this->polUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyBcliPolicyRequest
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['insure_trade_no'])) {
            $model->insureTradeNo = $map['insure_trade_no'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['premium'])) {
            $model->premium = $map['premium'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
        }
        if (isset($map['insure_end'])) {
            $model->insureEnd = $map['insure_end'];
        }
        if (isset($map['pol_url'])) {
            $model->polUrl = $map['pol_url'];
        }

        return $model;
    }
}
