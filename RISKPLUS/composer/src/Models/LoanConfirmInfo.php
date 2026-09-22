<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\RepayPlan;

class LoanConfirmInfo extends Model {
    protected $_name = [
        'loanPrin' => 'loan_prin',
        'repayType' => 'repay_type',
        'actualRate' => 'actual_rate',
        'preDiscRate' => 'pre_disc_rate',
        'loanTerm' => 'loan_term',
        'totalInt' => 'total_int',
        'startDate' => 'start_date',
        'expireDate' => 'expire_date',
        'totalDays' => 'total_days',
        'repayPlans' => 'repay_plans',
        'custName' => 'cust_name',
        'certNo' => 'cert_no',
        'mobile' => 'mobile',
        'homeAddr' => 'home_addr',
        'bankCardNo' => 'bank_card_no',
        'bankName' => 'bank_name',
        'bankCode' => 'bank_code',
        'certAddr' => 'cert_addr',
        'commAddr' => 'comm_addr',
        'discPlans' => 'disc_plans',
        'discInfo' => 'disc_info',
        'overdueRate' => 'overdue_rate',
        'misuseRate' => 'misuse_rate',
        'lpr' => 'lpr',
        'lprDay' => 'lpr_day',
        'bp' => 'bp',
        'feeRate' => 'fee_rate',
        'fixRate' => 'fix_rate',
        'fixCompany' => 'fix_company',
        'feeCompany' => 'fee_company',
    ];
    public function validate() {
        Model::validateRequired('loanPrin', $this->loanPrin, true);
        Model::validateRequired('repayType', $this->repayType, true);
        Model::validateRequired('actualRate', $this->actualRate, true);
        Model::validateRequired('loanTerm', $this->loanTerm, true);
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('expireDate', $this->expireDate, true);
        Model::validateRequired('repayPlans', $this->repayPlans, true);
        Model::validateRequired('custName', $this->custName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('homeAddr', $this->homeAddr, true);
        Model::validateRequired('bankCardNo', $this->bankCardNo, true);
        Model::validateRequired('bankName', $this->bankName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->loanPrin) {
            $res['loan_prin'] = $this->loanPrin;
        }
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->actualRate) {
            $res['actual_rate'] = $this->actualRate;
        }
        if (null !== $this->preDiscRate) {
            $res['pre_disc_rate'] = $this->preDiscRate;
        }
        if (null !== $this->loanTerm) {
            $res['loan_term'] = $this->loanTerm;
        }
        if (null !== $this->totalInt) {
            $res['total_int'] = $this->totalInt;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->totalDays) {
            $res['total_days'] = $this->totalDays;
        }
        if (null !== $this->repayPlans) {
            $res['repay_plans'] = [];
            if(null !== $this->repayPlans && is_array($this->repayPlans)){
                $n = 0;
                foreach($this->repayPlans as $item){
                    $res['repay_plans'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->custName) {
            $res['cust_name'] = $this->custName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->homeAddr) {
            $res['home_addr'] = $this->homeAddr;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->certAddr) {
            $res['cert_addr'] = $this->certAddr;
        }
        if (null !== $this->commAddr) {
            $res['comm_addr'] = $this->commAddr;
        }
        if (null !== $this->discPlans) {
            $res['disc_plans'] = [];
            if(null !== $this->discPlans && is_array($this->discPlans)){
                $n = 0;
                foreach($this->discPlans as $item){
                    $res['disc_plans'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->discInfo) {
            $res['disc_info'] = $this->discInfo;
        }
        if (null !== $this->overdueRate) {
            $res['overdue_rate'] = $this->overdueRate;
        }
        if (null !== $this->misuseRate) {
            $res['misuse_rate'] = $this->misuseRate;
        }
        if (null !== $this->lpr) {
            $res['lpr'] = $this->lpr;
        }
        if (null !== $this->lprDay) {
            $res['lpr_day'] = $this->lprDay;
        }
        if (null !== $this->bp) {
            $res['bp'] = $this->bp;
        }
        if (null !== $this->feeRate) {
            $res['fee_rate'] = $this->feeRate;
        }
        if (null !== $this->fixRate) {
            $res['fix_rate'] = $this->fixRate;
        }
        if (null !== $this->fixCompany) {
            $res['fix_company'] = $this->fixCompany;
        }
        if (null !== $this->feeCompany) {
            $res['fee_company'] = $this->feeCompany;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return LoanConfirmInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['loan_prin'])){
            $model->loanPrin = $map['loan_prin'];
        }
        if(isset($map['repay_type'])){
            $model->repayType = $map['repay_type'];
        }
        if(isset($map['actual_rate'])){
            $model->actualRate = $map['actual_rate'];
        }
        if(isset($map['pre_disc_rate'])){
            $model->preDiscRate = $map['pre_disc_rate'];
        }
        if(isset($map['loan_term'])){
            $model->loanTerm = $map['loan_term'];
        }
        if(isset($map['total_int'])){
            $model->totalInt = $map['total_int'];
        }
        if(isset($map['start_date'])){
            $model->startDate = $map['start_date'];
        }
        if(isset($map['expire_date'])){
            $model->expireDate = $map['expire_date'];
        }
        if(isset($map['total_days'])){
            $model->totalDays = $map['total_days'];
        }
        if(isset($map['repay_plans'])){
            if(!empty($map['repay_plans'])){
                $model->repayPlans = [];
                $n = 0;
                foreach($map['repay_plans'] as $item) {
                    $model->repayPlans[$n++] = null !== $item ? RepayPlan::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['cust_name'])){
            $model->custName = $map['cust_name'];
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['home_addr'])){
            $model->homeAddr = $map['home_addr'];
        }
        if(isset($map['bank_card_no'])){
            $model->bankCardNo = $map['bank_card_no'];
        }
        if(isset($map['bank_name'])){
            $model->bankName = $map['bank_name'];
        }
        if(isset($map['bank_code'])){
            $model->bankCode = $map['bank_code'];
        }
        if(isset($map['cert_addr'])){
            $model->certAddr = $map['cert_addr'];
        }
        if(isset($map['comm_addr'])){
            $model->commAddr = $map['comm_addr'];
        }
        if(isset($map['disc_plans'])){
            if(!empty($map['disc_plans'])){
                $model->discPlans = [];
                $n = 0;
                foreach($map['disc_plans'] as $item) {
                    $model->discPlans[$n++] = null !== $item ? RepayPlan::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['disc_info'])){
            $model->discInfo = $map['disc_info'];
        }
        if(isset($map['overdue_rate'])){
            $model->overdueRate = $map['overdue_rate'];
        }
        if(isset($map['misuse_rate'])){
            $model->misuseRate = $map['misuse_rate'];
        }
        if(isset($map['lpr'])){
            $model->lpr = $map['lpr'];
        }
        if(isset($map['lpr_day'])){
            $model->lprDay = $map['lpr_day'];
        }
        if(isset($map['bp'])){
            $model->bp = $map['bp'];
        }
        if(isset($map['fee_rate'])){
            $model->feeRate = $map['fee_rate'];
        }
        if(isset($map['fix_rate'])){
            $model->fixRate = $map['fix_rate'];
        }
        if(isset($map['fix_company'])){
            $model->fixCompany = $map['fix_company'];
        }
        if(isset($map['fee_company'])){
            $model->feeCompany = $map['fee_company'];
        }
        return $model;
    }
    // 借款本金
    /**
     * @example 1000.00
     * @var string
     */
    public $loanPrin;

    // 还款方式
    /**
     * @example 1
     * @var string
     */
    public $repayType;

    // 实际年化利率,单位：%，2
    // 位小数
    /**
     * @example 15.00
     * @var string
     */
    public $actualRate;

    // 优惠前年化利率,单位：%，2
    // 位小数
    /**
     * @example 15.00
     * @var string
     */
    public $preDiscRate;

    // 借款期数
    /**
     * @example 12
     * @var string
     */
    public $loanTerm;

    // 借款总利息,单位：元，
    // 2 位小数
    /**
     * @example 213.00
     * @var string
     */
    public $totalInt;

    // 借款起始日,整笔借据的
    // 开始时间 格
    // 式：yyyy-
    // MM-dd
    /**
     * @example 1999-01-01
     * @var string
     */
    public $startDate;

    // 借款到期日,格式：yyyy-MM-dd
    /**
     * @example 2000-01-01
     * @var string
     */
    public $expireDate;

    // 借款总天数，单位：天，不传expire_date时上送
    /**
     * @example 120
     * @var string
     */
    public $totalDays;

    // 还款计划列表
    /**
     * @example undefined
     * @var RepayPlan[]
     */
    public $repayPlans;

    // 客户姓名
    /**
     * @example 张三
     * @var string
     */
    public $custName;

    // 身份证号
    /**
     * @example 101101200101011234
     * @var string
     */
    public $certNo;

    // 联系电话
    /**
     * @example 18612341234
     * @var string
     */
    public $mobile;

    // 居住地址
    /**
     * @example XX省XX市XX区
     * @var string
     */
    public $homeAddr;

    // 银行卡号
    /**
     * @example 8888888888888888888
     * @var string
     */
    public $bankCardNo;

    // 开户行
    /**
     * @example 中国工商银行
     * @var string
     */
    public $bankName;

    // 银行编码
    /**
     * @example ICBC
     * @var string
     */
    public $bankCode;

    // 户籍所在地
    /**
     * @example XX省XX市XX区
     * @var string
     */
    public $certAddr;

    // 常用地址
    /**
     * @example XX省XX市XX区
     * @var string
     */
    public $commAddr;

    // 优惠前还款计划，有优惠时必填
    /**
     * @example undefined
     * @var RepayPlan[]
     */
    public $discPlans;

    // 优惠信息，优惠活动说明
    /**
     * @example 首笔利率 8 折
     * @var string
     */
    public $discInfo;

    // 逾期罚息利率，单位 %，2位小数
    /**
     * @example 15.33
     * @var string
     */
    public $overdueRate;

    // 挪用罚息利率，单位 %，2位小数
    /**
     * @example 15.00
     * @var string
     */
    public $misuseRate;

    // lpr利率，固定一年期,
    // 单位%
    /**
     * @example 3.50
     * @var string
     */
    public $lpr;

    // lpr发布时间，格式：yyyy-MM-dd
    /**
     * @example 1999-01-01
     * @var string
     */
    public $lprDay;

    // 上浮基点，100bp=1%
    /**
     * @example 1500
     * @var string
     */
    public $bp;

    // 手续费利率，增信服务费年利率，单位 %
    /**
     * @example 3.12
     * @var string
     */
    public $feeRate;

    // 固收利率，固守年利率，单位 %
    /**
     * @example 3.12
     * @var string
     */
    public $fixRate;

    // 固收主体，默认：浙江宁银消费金融股份有限公司
    /**
     * @example 浙江宁 银消费金融 股份有限公 司
     * @var string
     */
    public $fixCompany;

    // 融担公司主体,若有多家融担公司，以逗号分隔
    /**
     * @example 融担公司1，融担公司2
     * @var string
     */
    public $feeCompany;

}
