<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class ExpenditureContract extends Model
{
    // 支出合同id
    /**
     * @example 支出合同id
     *
     * @var string
     */
    public $contractId;

    // 支出合同名称
    /**
     * @example 支出合同名称
     *
     * @var string
     */
    public $contractName;

    // 合同状态：
    // INIT("INIT","草稿", ""),
    // VALID("VALID","正式", ""),
    // INVALID("INVALID","作废", ""),
    // AUDIT_ING("AUDIT_ING", "审核中","STARTED"),
    // AUDIT_SUCCESS("AUDIT_SUCCESS", "审核成功","AGREED"),
    // AUDIT_FAIL("AUDIT_FAIL", "审核不通过", "DISAGREE"),
    /**
     * @example VALID
     *
     * @var string
     */
    public $status;

    // 有效期开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtStart;

    // 有效期结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtEnd;

    // 签约记录
    /**
     * @example
     *
     * @var SignRecord
     */
    public $signingRecord;

    // 支出结算规则
    /**
     * @example
     *
     * @var ExpenditureSettlementRule
     */
    public $settlementRule;

    // 扩展信息
    /**
     * @example {"key1": "value1", "key2": "value2"}
     *
     * @var string
     */
    public $extendInfo;
    protected $_name = [
        'contractId'     => 'contract_id',
        'contractName'   => 'contract_name',
        'status'         => 'status',
        'gmtStart'       => 'gmt_start',
        'gmtEnd'         => 'gmt_end',
        'signingRecord'  => 'signing_record',
        'settlementRule' => 'settlement_rule',
        'extendInfo'     => 'extend_info',
    ];

    public function validate()
    {
        Model::validateRequired('contractId', $this->contractId, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validatePattern('gmtStart', $this->gmtStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtEnd', $this->gmtEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->gmtStart) {
            $res['gmt_start'] = $this->gmtStart;
        }
        if (null !== $this->gmtEnd) {
            $res['gmt_end'] = $this->gmtEnd;
        }
        if (null !== $this->signingRecord) {
            $res['signing_record'] = null !== $this->signingRecord ? $this->signingRecord->toMap() : null;
        }
        if (null !== $this->settlementRule) {
            $res['settlement_rule'] = null !== $this->settlementRule ? $this->settlementRule->toMap() : null;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExpenditureContract
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['gmt_start'])) {
            $model->gmtStart = $map['gmt_start'];
        }
        if (isset($map['gmt_end'])) {
            $model->gmtEnd = $map['gmt_end'];
        }
        if (isset($map['signing_record'])) {
            $model->signingRecord = SignRecord::fromMap($map['signing_record']);
        }
        if (isset($map['settlement_rule'])) {
            $model->settlementRule = ExpenditureSettlementRule::fromMap($map['settlement_rule']);
        }
        if (isset($map['extend_info'])) {
            $model->extendInfo = $map['extend_info'];
        }

        return $model;
    }
}
