<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class MgOrder extends Model
{
    // 已签署的合同列表
    /**
     * @example
     *
     * @var Agreement[]
     */
    public $agreements;

    // 附件材料列表
    /**
     * @example
     *
     * @var Archive[]
     */
    public $archives;

    // 房屋授权查询合同签署任务
    /**
     * @example
     *
     * @var ArSignTask
     */
    public $authArSignTask;

    // 银行名称
    /**
     * @example xx银行xx支行
     *
     * @var string
     */
    public $bankName;

    // 银行编号
    /**
     * @example 20200810001220030000000000000001
     *
     * @var string
     */
    public $bankNo;

    // 借款人身份证号
    /**
     * @example 330108****1232
     *
     * @var string
     */
    public $certNo;

    // 证件类型，比如：ID_CARD=身份证
    /**
     * @example ID_CARD
     *
     * @var string
     */
    public $certType;

    // 借款人编号
    /**
     * @example 20200810001220030000000000000001
     *
     * @var string
     */
    public $cmNo;

    // 抵押登记结束日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 抵押登记失败类型，比如：MF_REALTY_NOT_EXISTS=房产信息不存在
    /**
     * @example MF_REALTY_NOT_EXISTS
     *
     * @var string
     */
    public $failCode;

    // 抵押登记错误信息描述
    /**
     * @example 房产信息不存在
     *
     * @var string
     */
    public $failDesc;

    // 不动产返回房产信息
    /**
     * @example
     *
     * @var House
     */
    public $house;

    // 确认预抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
    /**
     * @example {"k1":"v1","k2":"v2"}
     *
     * @var string
     */
    public $initArVarValueJson;

    // 借款人婚姻状况，比如：MARRIED=已婚
    /**
     * @example MARRIED
     *
     * @var string
     */
    public $marriage;

    // 抵押登记相关合同签署任务列表
    /**
     * @example
     *
     * @var ArSignTask[]
     */
    public $mgArSignTasks;

    // 抵押登记回执
    /**
     * @example
     *
     * @var MgCert
     */
    public $mgCert;

    // 抵押单号
    /**
     * @example 20200810001220080000000000000001
     *
     * @var string
     */
    public $mgOrderNo;

    // 借款人身份证
    /**
     * @example 330108****1232
     *
     * @var string
     */
    public $name;

    // 银行的业务编号
    /**
     * @example 343434312313
     *
     * @var string
     */
    public $outBizNo;

    // 抵押登记申请日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $regApplyDate;

    // 登记设立原因，比如：LOAN=借贷
    /**
     * @example LOAN
     *
     * @var string
     */
    public $regReason;

    // 登记设立原因描述
    /**
     * @example 借贷
     *
     * @var string
     */
    public $regReasonRemark;

    // 登记权利,比如：MORTGAGE_RIGHTS=抵押权
    /**
     * @example MORTGAGE_RIGHTS
     *
     * @var string
     */
    public $regRights;

    // 登记类型，比如：FIRST_REG=首次登记
    /**
     * @example FIRST_REG
     *
     * @var string
     */
    public $regType;

    // 不动产中心的抵押登记号
    /**
     * @example 243332323233
     *
     * @var string
     */
    public $rtcMgOrderNo;

    // 不动产登记中心名称
    /**
     * @example xx市不动产登记中心
     *
     * @var string
     */
    public $rtcName;

    // 不动产登记中心编号
    /**
     * @example 20200810001220040000000000000001
     *
     * @var string
     */
    public $rtcNo;

    // 借款人配偶客户编号
    /**
     * @example 20200810001220030000000000000001
     *
     * @var string
     */
    public $spouseCmNo;

    // 发起抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
    /**
     * @example {"k1":"v1","k2":"v2"}
     *
     * @var string
     */
    public $startArVarValueJson;

    // 抵押登记发起日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 抵押单状态 ，比如：MG_ING=抵押登记中
    /**
     * @example MG_ING
     *
     * @var string
     */
    public $status;

    // 扩展字段
    /**
     * @example {"k1":"v1","k2":"v2"}
     *
     * @var string
     */
    public $extendJson;

    // 助贷平台
    /**
     * @example JIEBEI
     *
     * @var string
     */
    public $loanAssistPlatform;

    // 办理业务分支行
    /**
     * @example
     *
     * @var Bank
     */
    public $branchBank;
    protected $_name = [
        'agreements'          => 'agreements',
        'archives'            => 'archives',
        'authArSignTask'      => 'auth_ar_sign_task',
        'bankName'            => 'bank_name',
        'bankNo'              => 'bank_no',
        'certNo'              => 'cert_no',
        'certType'            => 'cert_type',
        'cmNo'                => 'cm_no',
        'endTime'             => 'end_time',
        'failCode'            => 'fail_code',
        'failDesc'            => 'fail_desc',
        'house'               => 'house',
        'initArVarValueJson'  => 'init_ar_var_value_json',
        'marriage'            => 'marriage',
        'mgArSignTasks'       => 'mg_ar_sign_tasks',
        'mgCert'              => 'mg_cert',
        'mgOrderNo'           => 'mg_order_no',
        'name'                => 'name',
        'outBizNo'            => 'out_biz_no',
        'regApplyDate'        => 'reg_apply_date',
        'regReason'           => 'reg_reason',
        'regReasonRemark'     => 'reg_reason_remark',
        'regRights'           => 'reg_rights',
        'regType'             => 'reg_type',
        'rtcMgOrderNo'        => 'rtc_mg_order_no',
        'rtcName'             => 'rtc_name',
        'rtcNo'               => 'rtc_no',
        'spouseCmNo'          => 'spouse_cm_no',
        'startArVarValueJson' => 'start_ar_var_value_json',
        'startTime'           => 'start_time',
        'status'              => 'status',
        'extendJson'          => 'extend_json',
        'loanAssistPlatform'  => 'loan_assist_platform',
        'branchBank'          => 'branch_bank',
    ];

    public function validate()
    {
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('regApplyDate', $this->regApplyDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->authArSignTask) {
            $res['auth_ar_sign_task'] = null !== $this->authArSignTask ? $this->authArSignTask->toMap() : null;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->cmNo) {
            $res['cm_no'] = $this->cmNo;
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
        if (null !== $this->house) {
            $res['house'] = null !== $this->house ? $this->house->toMap() : null;
        }
        if (null !== $this->initArVarValueJson) {
            $res['init_ar_var_value_json'] = $this->initArVarValueJson;
        }
        if (null !== $this->marriage) {
            $res['marriage'] = $this->marriage;
        }
        if (null !== $this->mgArSignTasks) {
            $res['mg_ar_sign_tasks'] = [];
            if (null !== $this->mgArSignTasks && \is_array($this->mgArSignTasks)) {
                $n = 0;
                foreach ($this->mgArSignTasks as $item) {
                    $res['mg_ar_sign_tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->mgCert) {
            $res['mg_cert'] = null !== $this->mgCert ? $this->mgCert->toMap() : null;
        }
        if (null !== $this->mgOrderNo) {
            $res['mg_order_no'] = $this->mgOrderNo;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->regApplyDate) {
            $res['reg_apply_date'] = $this->regApplyDate;
        }
        if (null !== $this->regReason) {
            $res['reg_reason'] = $this->regReason;
        }
        if (null !== $this->regReasonRemark) {
            $res['reg_reason_remark'] = $this->regReasonRemark;
        }
        if (null !== $this->regRights) {
            $res['reg_rights'] = $this->regRights;
        }
        if (null !== $this->regType) {
            $res['reg_type'] = $this->regType;
        }
        if (null !== $this->rtcMgOrderNo) {
            $res['rtc_mg_order_no'] = $this->rtcMgOrderNo;
        }
        if (null !== $this->rtcName) {
            $res['rtc_name'] = $this->rtcName;
        }
        if (null !== $this->rtcNo) {
            $res['rtc_no'] = $this->rtcNo;
        }
        if (null !== $this->spouseCmNo) {
            $res['spouse_cm_no'] = $this->spouseCmNo;
        }
        if (null !== $this->startArVarValueJson) {
            $res['start_ar_var_value_json'] = $this->startArVarValueJson;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->extendJson) {
            $res['extend_json'] = $this->extendJson;
        }
        if (null !== $this->loanAssistPlatform) {
            $res['loan_assist_platform'] = $this->loanAssistPlatform;
        }
        if (null !== $this->branchBank) {
            $res['branch_bank'] = null !== $this->branchBank ? $this->branchBank->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MgOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['auth_ar_sign_task'])) {
            $model->authArSignTask = ArSignTask::fromMap($map['auth_ar_sign_task']);
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cm_no'])) {
            $model->cmNo = $map['cm_no'];
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
        if (isset($map['house'])) {
            $model->house = House::fromMap($map['house']);
        }
        if (isset($map['init_ar_var_value_json'])) {
            $model->initArVarValueJson = $map['init_ar_var_value_json'];
        }
        if (isset($map['marriage'])) {
            $model->marriage = $map['marriage'];
        }
        if (isset($map['mg_ar_sign_tasks'])) {
            if (!empty($map['mg_ar_sign_tasks'])) {
                $model->mgArSignTasks = [];
                $n                    = 0;
                foreach ($map['mg_ar_sign_tasks'] as $item) {
                    $model->mgArSignTasks[$n++] = null !== $item ? ArSignTask::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['mg_cert'])) {
            $model->mgCert = MgCert::fromMap($map['mg_cert']);
        }
        if (isset($map['mg_order_no'])) {
            $model->mgOrderNo = $map['mg_order_no'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['reg_apply_date'])) {
            $model->regApplyDate = $map['reg_apply_date'];
        }
        if (isset($map['reg_reason'])) {
            $model->regReason = $map['reg_reason'];
        }
        if (isset($map['reg_reason_remark'])) {
            $model->regReasonRemark = $map['reg_reason_remark'];
        }
        if (isset($map['reg_rights'])) {
            $model->regRights = $map['reg_rights'];
        }
        if (isset($map['reg_type'])) {
            $model->regType = $map['reg_type'];
        }
        if (isset($map['rtc_mg_order_no'])) {
            $model->rtcMgOrderNo = $map['rtc_mg_order_no'];
        }
        if (isset($map['rtc_name'])) {
            $model->rtcName = $map['rtc_name'];
        }
        if (isset($map['rtc_no'])) {
            $model->rtcNo = $map['rtc_no'];
        }
        if (isset($map['spouse_cm_no'])) {
            $model->spouseCmNo = $map['spouse_cm_no'];
        }
        if (isset($map['start_ar_var_value_json'])) {
            $model->startArVarValueJson = $map['start_ar_var_value_json'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['extend_json'])) {
            $model->extendJson = $map['extend_json'];
        }
        if (isset($map['loan_assist_platform'])) {
            $model->loanAssistPlatform = $map['loan_assist_platform'];
        }
        if (isset($map['branch_bank'])) {
            $model->branchBank = Bank::fromMap($map['branch_bank']);
        }

        return $model;
    }
}
