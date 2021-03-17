<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class MgReleaseOrder extends Model
{
    // 解抵押单号
    /**
     * @example 20200810001221020000000000000001
     *
     * @var string
     */
    public $mgReleaseOrderNo;

    // 不动产中心解抵押单号
    /**
     * @example 2434355656434
     *
     * @var string
     */
    public $rtcMgReleaseOrderNo;

    // 机构侧业务单号
    /**
     * @example 45233445564543C
     *
     * @var string
     */
    public $outBizNo;

    // 抵押登记权证号(他项权证号)
    /**
     * @example 232331311212
     *
     * @var string
     */
    public $otherRightCertNo;

    // 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
    /**
     * @example OAN_FINISHED
     *
     * @var string
     */
    public $wipeMortgageReason;

    // 解抵押状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $status;

    // 房产链内部银行编号
    /**
     * @example 20200810001221020000000000000001
     *
     * @var string
     */
    public $bankNo;

    // 银行名称
    /**
     * @example 宁波银行
     *
     * @var string
     */
    public $bankName;

    // 房产链内部不动产中心编号
    /**
     * @example 20200810001221020000000000000001
     *
     * @var string
     */
    public $rtcNo;

    // 不动产中心名称
    /**
     * @example 宁波不动产中心
     *
     * @var string
     */
    public $rtcName;

    // 办理业务分支行
    /**
     * @example
     *
     * @var Bank
     */
    public $branchBank;

    // 解抵押的房产信息
    /**
     * @example
     *
     * @var House
     */
    public $house;

    // 解抵押的合同列表
    /**
     * @example
     *
     * @var Agreement[]
     */
    public $agreements;

    // 解抵押相关的附件材料
    /**
     * @example
     *
     * @var Archive[]
     */
    public $archives;

    // 解抵押单据生成时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 解抵押单据结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 解抵押失败code,MGR_AR_SIGN_FAIL=解抵押合同签署失败
    /**
     * @example MGR_AR_SIGN_FAIL
     *
     * @var string
     */
    public $failCode;

    // 解抵押失败原因描述
    /**
     * @example 解抵押合同签署失败
     *
     * @var string
     */
    public $failDesc;

    // 助贷平台
    /**
     * @example JIEBEI
     *
     * @var string
     */
    public $loanAssistPlatform;
    protected $_name = [
        'mgReleaseOrderNo'    => 'mg_release_order_no',
        'rtcMgReleaseOrderNo' => 'rtc_mg_release_order_no',
        'outBizNo'            => 'out_biz_no',
        'otherRightCertNo'    => 'other_right_cert_no',
        'wipeMortgageReason'  => 'wipe_mortgage_reason',
        'status'              => 'status',
        'bankNo'              => 'bank_no',
        'bankName'            => 'bank_name',
        'rtcNo'               => 'rtc_no',
        'rtcName'             => 'rtc_name',
        'branchBank'          => 'branch_bank',
        'house'               => 'house',
        'agreements'          => 'agreements',
        'archives'            => 'archives',
        'startTime'           => 'start_time',
        'endTime'             => 'end_time',
        'failCode'            => 'fail_code',
        'failDesc'            => 'fail_desc',
        'loanAssistPlatform'  => 'loan_assist_platform',
    ];

    public function validate()
    {
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mgReleaseOrderNo) {
            $res['mg_release_order_no'] = $this->mgReleaseOrderNo;
        }
        if (null !== $this->rtcMgReleaseOrderNo) {
            $res['rtc_mg_release_order_no'] = $this->rtcMgReleaseOrderNo;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->otherRightCertNo) {
            $res['other_right_cert_no'] = $this->otherRightCertNo;
        }
        if (null !== $this->wipeMortgageReason) {
            $res['wipe_mortgage_reason'] = $this->wipeMortgageReason;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->rtcNo) {
            $res['rtc_no'] = $this->rtcNo;
        }
        if (null !== $this->rtcName) {
            $res['rtc_name'] = $this->rtcName;
        }
        if (null !== $this->branchBank) {
            $res['branch_bank'] = null !== $this->branchBank ? $this->branchBank->toMap() : null;
        }
        if (null !== $this->house) {
            $res['house'] = null !== $this->house ? $this->house->toMap() : null;
        }
        if (null !== $this->agreements) {
            $res['agreements'] = [];
            if (null !== $this->agreements && \is_array($this->agreements)) {
                $n = 0;
                foreach ($this->agreements as $item) {
                    $res['agreements'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->archives) {
            $res['archives'] = [];
            if (null !== $this->archives && \is_array($this->archives)) {
                $n = 0;
                foreach ($this->archives as $item) {
                    $res['archives'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->failCode) {
            $res['fail_code'] = $this->failCode;
        }
        if (null !== $this->failDesc) {
            $res['fail_desc'] = $this->failDesc;
        }
        if (null !== $this->loanAssistPlatform) {
            $res['loan_assist_platform'] = $this->loanAssistPlatform;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MgReleaseOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mg_release_order_no'])) {
            $model->mgReleaseOrderNo = $map['mg_release_order_no'];
        }
        if (isset($map['rtc_mg_release_order_no'])) {
            $model->rtcMgReleaseOrderNo = $map['rtc_mg_release_order_no'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['other_right_cert_no'])) {
            $model->otherRightCertNo = $map['other_right_cert_no'];
        }
        if (isset($map['wipe_mortgage_reason'])) {
            $model->wipeMortgageReason = $map['wipe_mortgage_reason'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['rtc_no'])) {
            $model->rtcNo = $map['rtc_no'];
        }
        if (isset($map['rtc_name'])) {
            $model->rtcName = $map['rtc_name'];
        }
        if (isset($map['branch_bank'])) {
            $model->branchBank = Bank::fromMap($map['branch_bank']);
        }
        if (isset($map['house'])) {
            $model->house = House::fromMap($map['house']);
        }
        if (isset($map['agreements'])) {
            if (!empty($map['agreements'])) {
                $model->agreements = [];
                $n                 = 0;
                foreach ($map['agreements'] as $item) {
                    $model->agreements[$n++] = null !== $item ? Agreement::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['archives'])) {
            if (!empty($map['archives'])) {
                $model->archives = [];
                $n               = 0;
                foreach ($map['archives'] as $item) {
                    $model->archives[$n++] = null !== $item ? Archive::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['fail_code'])) {
            $model->failCode = $map['fail_code'];
        }
        if (isset($map['fail_desc'])) {
            $model->failDesc = $map['fail_desc'];
        }
        if (isset($map['loan_assist_platform'])) {
            $model->loanAssistPlatform = $map['loan_assist_platform'];
        }

        return $model;
    }
}
