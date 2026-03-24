<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class ApplyExtYdataRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 之前调用返回的 req_msg_id
    /**
     * @var string
     */
    public $historyOrderNo;

    // 绑卡页面银行排序（从上到下）
    /**
     * @var string
     */
    public $bankDisplay;

    // 用户选卡银行
    /**
     * @var string
     */
    public $interimSelectedBankCode;

    // 用户绑卡银行
    /**
     * @var string
     */
    public $bindBankCode;

    // 用户最终绑卡银行在页面上的排序
    /**
     * @var string
     */
    public $bindBankDisplay;

    // 卡类型
    // 储蓄卡（Debit Card）或者信用卡（Credit Card）
    // 储蓄卡：DC
    // 信用卡：CC
    /**
     * @var string
     */
    public $bankType;

    // 第一期是否扣款成功
    /**
     * @var bool
     */
    public $firstDeduction;

    // 第一期扣款金额
    /**
     * @var string
     */
    public $firstDeductionAmount;

    // 第二期是否扣款成功
    /**
     * @var bool
     */
    public $secondDeduction;

    // 第二期扣款金额
    /**
     * @var string
     */
    public $secondDeductionAmount;

    // 第三期是否扣款成功
    /**
     * @var bool
     */
    public $thirdDeduction;

    // 第三期扣款金额
    /**
     * @var string
     */
    public $thirdDeductionAmount;

    // 第四期是否扣款成功
    /**
     * @var bool
     */
    public $fourthDeduction;

    // 第四期扣款金额
    /**
     * @var string
     */
    public $fourthDeductionAmount;

    // 第五期是否扣款成功
    /**
     * @var bool
     */
    public $fifthDeduction;

    // 第五期扣款金额
    /**
     * @var string
     */
    public $fifthDeductionAmount;

    // 第六期是否扣款成功
    /**
     * @var bool
     */
    public $sixthDeduction;

    // 第六期是否扣款成功
    /**
     * @var string
     */
    public $sixthDeductionAmount;

    // 预留扩展参数
    /**
     * @var string
     */
    public $externParam;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'outerOrderNo'            => 'outer_order_no',
        'historyOrderNo'          => 'history_order_no',
        'bankDisplay'             => 'bank_display',
        'interimSelectedBankCode' => 'interim_selected_bank_code',
        'bindBankCode'            => 'bind_bank_code',
        'bindBankDisplay'         => 'bind_bank_display',
        'bankType'                => 'bank_type',
        'firstDeduction'          => 'first_deduction',
        'firstDeductionAmount'    => 'first_deduction_amount',
        'secondDeduction'         => 'second_deduction',
        'secondDeductionAmount'   => 'second_deduction_amount',
        'thirdDeduction'          => 'third_deduction',
        'thirdDeductionAmount'    => 'third_deduction_amount',
        'fourthDeduction'         => 'fourth_deduction',
        'fourthDeductionAmount'   => 'fourth_deduction_amount',
        'fifthDeduction'          => 'fifth_deduction',
        'fifthDeductionAmount'    => 'fifth_deduction_amount',
        'sixthDeduction'          => 'sixth_deduction',
        'sixthDeductionAmount'    => 'sixth_deduction_amount',
        'externParam'             => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('historyOrderNo', $this->historyOrderNo, true);
        Model::validateRequired('bindBankCode', $this->bindBankCode, true);
        Model::validateRequired('bankType', $this->bankType, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->historyOrderNo) {
            $res['history_order_no'] = $this->historyOrderNo;
        }
        if (null !== $this->bankDisplay) {
            $res['bank_display'] = $this->bankDisplay;
        }
        if (null !== $this->interimSelectedBankCode) {
            $res['interim_selected_bank_code'] = $this->interimSelectedBankCode;
        }
        if (null !== $this->bindBankCode) {
            $res['bind_bank_code'] = $this->bindBankCode;
        }
        if (null !== $this->bindBankDisplay) {
            $res['bind_bank_display'] = $this->bindBankDisplay;
        }
        if (null !== $this->bankType) {
            $res['bank_type'] = $this->bankType;
        }
        if (null !== $this->firstDeduction) {
            $res['first_deduction'] = $this->firstDeduction;
        }
        if (null !== $this->firstDeductionAmount) {
            $res['first_deduction_amount'] = $this->firstDeductionAmount;
        }
        if (null !== $this->secondDeduction) {
            $res['second_deduction'] = $this->secondDeduction;
        }
        if (null !== $this->secondDeductionAmount) {
            $res['second_deduction_amount'] = $this->secondDeductionAmount;
        }
        if (null !== $this->thirdDeduction) {
            $res['third_deduction'] = $this->thirdDeduction;
        }
        if (null !== $this->thirdDeductionAmount) {
            $res['third_deduction_amount'] = $this->thirdDeductionAmount;
        }
        if (null !== $this->fourthDeduction) {
            $res['fourth_deduction'] = $this->fourthDeduction;
        }
        if (null !== $this->fourthDeductionAmount) {
            $res['fourth_deduction_amount'] = $this->fourthDeductionAmount;
        }
        if (null !== $this->fifthDeduction) {
            $res['fifth_deduction'] = $this->fifthDeduction;
        }
        if (null !== $this->fifthDeductionAmount) {
            $res['fifth_deduction_amount'] = $this->fifthDeductionAmount;
        }
        if (null !== $this->sixthDeduction) {
            $res['sixth_deduction'] = $this->sixthDeduction;
        }
        if (null !== $this->sixthDeductionAmount) {
            $res['sixth_deduction_amount'] = $this->sixthDeductionAmount;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyExtYdataRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['history_order_no'])) {
            $model->historyOrderNo = $map['history_order_no'];
        }
        if (isset($map['bank_display'])) {
            $model->bankDisplay = $map['bank_display'];
        }
        if (isset($map['interim_selected_bank_code'])) {
            $model->interimSelectedBankCode = $map['interim_selected_bank_code'];
        }
        if (isset($map['bind_bank_code'])) {
            $model->bindBankCode = $map['bind_bank_code'];
        }
        if (isset($map['bind_bank_display'])) {
            $model->bindBankDisplay = $map['bind_bank_display'];
        }
        if (isset($map['bank_type'])) {
            $model->bankType = $map['bank_type'];
        }
        if (isset($map['first_deduction'])) {
            $model->firstDeduction = $map['first_deduction'];
        }
        if (isset($map['first_deduction_amount'])) {
            $model->firstDeductionAmount = $map['first_deduction_amount'];
        }
        if (isset($map['second_deduction'])) {
            $model->secondDeduction = $map['second_deduction'];
        }
        if (isset($map['second_deduction_amount'])) {
            $model->secondDeductionAmount = $map['second_deduction_amount'];
        }
        if (isset($map['third_deduction'])) {
            $model->thirdDeduction = $map['third_deduction'];
        }
        if (isset($map['third_deduction_amount'])) {
            $model->thirdDeductionAmount = $map['third_deduction_amount'];
        }
        if (isset($map['fourth_deduction'])) {
            $model->fourthDeduction = $map['fourth_deduction'];
        }
        if (isset($map['fourth_deduction_amount'])) {
            $model->fourthDeductionAmount = $map['fourth_deduction_amount'];
        }
        if (isset($map['fifth_deduction'])) {
            $model->fifthDeduction = $map['fifth_deduction'];
        }
        if (isset($map['fifth_deduction_amount'])) {
            $model->fifthDeductionAmount = $map['fifth_deduction_amount'];
        }
        if (isset($map['sixth_deduction'])) {
            $model->sixthDeduction = $map['sixth_deduction'];
        }
        if (isset($map['sixth_deduction_amount'])) {
            $model->sixthDeductionAmount = $map['sixth_deduction_amount'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
