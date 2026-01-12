<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeInstallmentCreditamtResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 1：现金贷、2：分期付
    /**
     * @var string
     */
    public $prodType;

    // CREDIT_APPROVING : 授信中，用户还有没有完结的授信单，需等待天枢授信终态
    // CAN_APPLY : 可申请授信，用户已有授信单的额度不满足期望分期金额/或无额度，使用mobile初步预筛有资方承接，触发去授信链路
    // LOAN_AVAILABLE : 可支用，用户已有额度满足期望分期金额，使用 fund_code 触发去支用链路
    // NO_FUNDER : 无资方，用户已有授信单的额度不满足期望分期金额/或无额度，且使用mobile初步预筛没有资方承接，可流转到其他支付方式
    /**
     * @var string
     */
    public $status;

    // 资金方编号，去支用联登时的默认资金方
    /**
     * @var string
     */
    public $fundCode;

    // 资金方简称
    /**
     * @var string
     */
    public $abbreFundName;

    // 可用余额
    /**
     * @var int
     */
    public $restAmount;

    // 授信总额度，单位：元
    /**
     * @var int
     */
    public $creditAmount;

    // 授信年利率。精确到小数点后四位0.1250，表示年利率为12.5%
    /**
     * @var int
     */
    public $rateValue;

    // 授信申请状态：
    // 0- 通过
    // 1- 拒绝
    // 2- 审批中
    // 3- 失败
    // 4- 未授信
    /**
     * @var string
     */
    public $applyStatus;

    // 额度状态：
    // 0- 正常
    // 1- 冻结
    // 2- 过期
    /**
     * @var string
     */
    public $creditStatus;

    // 发放日期，yyyy-MM-dd
    /**
     * @var string
     */
    public $payDate;

    // 到期日期，yyyy-MM-dd
    /**
     * @var string
     */
    public $expireDate;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'prodType'      => 'prod_type',
        'status'        => 'status',
        'fundCode'      => 'fund_code',
        'abbreFundName' => 'abbre_fund_name',
        'restAmount'    => 'rest_amount',
        'creditAmount'  => 'credit_amount',
        'rateValue'     => 'rate_value',
        'applyStatus'   => 'apply_status',
        'creditStatus'  => 'credit_status',
        'payDate'       => 'pay_date',
        'expireDate'    => 'expire_date',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->prodType) {
            $res['prod_type'] = $this->prodType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }
        if (null !== $this->abbreFundName) {
            $res['abbre_fund_name'] = $this->abbreFundName;
        }
        if (null !== $this->restAmount) {
            $res['rest_amount'] = $this->restAmount;
        }
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->rateValue) {
            $res['rate_value'] = $this->rateValue;
        }
        if (null !== $this->applyStatus) {
            $res['apply_status'] = $this->applyStatus;
        }
        if (null !== $this->creditStatus) {
            $res['credit_status'] = $this->creditStatus;
        }
        if (null !== $this->payDate) {
            $res['pay_date'] = $this->payDate;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeInstallmentCreditamtResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['prod_type'])) {
            $model->prodType = $map['prod_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }
        if (isset($map['abbre_fund_name'])) {
            $model->abbreFundName = $map['abbre_fund_name'];
        }
        if (isset($map['rest_amount'])) {
            $model->restAmount = $map['rest_amount'];
        }
        if (isset($map['credit_amount'])) {
            $model->creditAmount = $map['credit_amount'];
        }
        if (isset($map['rate_value'])) {
            $model->rateValue = $map['rate_value'];
        }
        if (isset($map['apply_status'])) {
            $model->applyStatus = $map['apply_status'];
        }
        if (isset($map['credit_status'])) {
            $model->creditStatus = $map['credit_status'];
        }
        if (isset($map['pay_date'])) {
            $model->payDate = $map['pay_date'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }

        return $model;
    }
}
