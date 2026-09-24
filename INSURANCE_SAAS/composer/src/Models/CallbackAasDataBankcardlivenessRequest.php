<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackAasDataBankcardlivenessRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productCode' => 'product_code',
        'requestId' => 'request_id',
        'historyRequestId' => 'history_request_id',
        'bankDisplay' => 'bank_display',
        'interimSelectedBankCode' => 'interim_selected_bank_code',
        'bindBankCode' => 'bind_bank_code',
        'bindBankDisplay' => 'bind_bank_display',
        'bankType' => 'bank_type',
        'firstDeduction' => 'first_deduction',
        'firstDeductionAmount' => 'first_deduction_amount',
        'secondDeduction' => 'second_deduction',
        'secondDeductionAmount' => 'second_deduction_amount',
        'thirdDeduction' => 'third_deduction',
        'thirdDeductionAmount' => 'third_deduction_amount',
        'extInfo' => 'ext_info',
    ];
    public function validate() {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('historyRequestId', $this->historyRequestId, true);
        Model::validateRequired('bindBankCode', $this->bindBankCode, true);
        Model::validateRequired('bankType', $this->bankType, true);
        Model::validateRequired('firstDeduction', $this->firstDeduction, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->historyRequestId) {
            $res['history_request_id'] = $this->historyRequestId;
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
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackAasDataBankcardlivenessRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['history_request_id'])){
            $model->historyRequestId = $map['history_request_id'];
        }
        if(isset($map['bank_display'])){
            $model->bankDisplay = $map['bank_display'];
        }
        if(isset($map['interim_selected_bank_code'])){
            $model->interimSelectedBankCode = $map['interim_selected_bank_code'];
        }
        if(isset($map['bind_bank_code'])){
            $model->bindBankCode = $map['bind_bank_code'];
        }
        if(isset($map['bind_bank_display'])){
            $model->bindBankDisplay = $map['bind_bank_display'];
        }
        if(isset($map['bank_type'])){
            $model->bankType = $map['bank_type'];
        }
        if(isset($map['first_deduction'])){
            $model->firstDeduction = $map['first_deduction'];
        }
        if(isset($map['first_deduction_amount'])){
            $model->firstDeductionAmount = $map['first_deduction_amount'];
        }
        if(isset($map['second_deduction'])){
            $model->secondDeduction = $map['second_deduction'];
        }
        if(isset($map['second_deduction_amount'])){
            $model->secondDeductionAmount = $map['second_deduction_amount'];
        }
        if(isset($map['third_deduction'])){
            $model->thirdDeduction = $map['third_deduction'];
        }
        if(isset($map['third_deduction_amount'])){
            $model->thirdDeductionAmount = $map['third_deduction_amount'];
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码：BANKCARD_LIVENESS
    /**
     * @var string
     */
    public $productCode;

    // 请求ID，最大32位字母数字
    /**
     * @var string
     */
    public $requestId;

    // 响应ID（原查询接口返回的history_request_id）
    /**
     * @var string
     */
    public $historyRequestId;

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

    // 卡类型：DC-储蓄卡，CC-信用卡
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

    // 扩展信息
    /**
     * @var string
     */
    public $extInfo;

}
