<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PfCreditQuotaInfo extends Model {
    protected $_name = [
        'certNo' => 'cert_no',
        'certType' => 'cert_type',
        'creditEnd' => 'credit_end',
        'creditStart' => 'credit_start',
        'quotaNo' => 'quota_no',
        'remainingQuota' => 'remaining_quota',
        'remark' => 'remark',
        'status' => 'status',
        'totalQuota' => 'total_quota',
        'updateTime' => 'update_time',
        'totalPledgeQuota' => 'total_pledge_quota',
        'remainPledgeQuota' => 'remain_pledge_quota',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->creditEnd) {
            $res['credit_end'] = $this->creditEnd;
        }
        if (null !== $this->creditStart) {
            $res['credit_start'] = $this->creditStart;
        }
        if (null !== $this->quotaNo) {
            $res['quota_no'] = $this->quotaNo;
        }
        if (null !== $this->remainingQuota) {
            $res['remaining_quota'] = $this->remainingQuota;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->totalQuota) {
            $res['total_quota'] = $this->totalQuota;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->totalPledgeQuota) {
            $res['total_pledge_quota'] = $this->totalPledgeQuota;
        }
        if (null !== $this->remainPledgeQuota) {
            $res['remain_pledge_quota'] = $this->remainPledgeQuota;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PfCreditQuotaInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['cert_type'])){
            $model->certType = $map['cert_type'];
        }
        if(isset($map['credit_end'])){
            $model->creditEnd = $map['credit_end'];
        }
        if(isset($map['credit_start'])){
            $model->creditStart = $map['credit_start'];
        }
        if(isset($map['quota_no'])){
            $model->quotaNo = $map['quota_no'];
        }
        if(isset($map['remaining_quota'])){
            $model->remainingQuota = $map['remaining_quota'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['total_quota'])){
            $model->totalQuota = $map['total_quota'];
        }
        if(isset($map['update_time'])){
            $model->updateTime = $map['update_time'];
        }
        if(isset($map['total_pledge_quota'])){
            $model->totalPledgeQuota = $map['total_pledge_quota'];
        }
        if(isset($map['remain_pledge_quota'])){
            $model->remainPledgeQuota = $map['remain_pledge_quota'];
        }
        return $model;
    }
    // 证件号
    /**
     * @example 6323232
     * @var string
     */
    public $certNo;

    // 证件类型
    /**
     * @example 0
     * @var string
     */
    public $certType;

    // 授信到期日期
    /**
     * @example 2020-09-19
     * @var string
     */
    public $creditEnd;

    // 授信起始日期
    /**
     * @example 2020-09-11
     * @var string
     */
    public $creditStart;

    // 额度编号
    /**
     * @example 923323
     * @var string
     */
    public $quotaNo;

    // 剩余额度
    /**
     * @example 1
     * @var string
     */
    public $remainingQuota;

    // SON:放款账号loanAccNo
    // 还款账号repayAcctNo
    /**
     * @example loanAccNo
     * @var string
     */
    public $remark;

    // 额度状态：
    // 0、停用 / 1、启用  /  2、冻结
    /**
     * @example 0
     * @var string
     */
    public $status;

    // 授信额度
    /**
     * @example 0
     * @var string
     */
    public $totalQuota;

    // 数据更新时间
    /**
     * @example 2020-09-10
     * @var string
     */
    public $updateTime;

    // 总质押额度
    /**
     * @example 100
     * @var string
     */
    public $totalPledgeQuota;

    // 剩余质押额度
    /**
     * @example 10
     * @var string
     */
    public $remainPledgeQuota;

}
