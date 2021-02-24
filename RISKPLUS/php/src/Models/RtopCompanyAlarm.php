<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopCompanyAlarm extends Model {
    protected $_name = [
        'alarmDate' => 'alarm_date',
        'alarmFlag' => 'alarm_flag',
        'alarmIdx' => 'alarm_idx',
        'alarmType' => 'alarm_type',
        'companyId' => 'company_id',
    ];
    public function validate() {
        Model::validateRequired('alarmDate', $this->alarmDate, true);
        Model::validateRequired('alarmFlag', $this->alarmFlag, true);
        Model::validateRequired('alarmIdx', $this->alarmIdx, true);
        Model::validateRequired('alarmType', $this->alarmType, true);
        Model::validateRequired('companyId', $this->companyId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->alarmDate) {
            $res['alarm_date'] = $this->alarmDate;
        }
        if (null !== $this->alarmFlag) {
            $res['alarm_flag'] = $this->alarmFlag;
        }
        if (null !== $this->alarmIdx) {
            $res['alarm_idx'] = $this->alarmIdx;
        }
        if (null !== $this->alarmType) {
            $res['alarm_type'] = $this->alarmType;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RtopCompanyAlarm
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['alarm_date'])){
            $model->alarmDate = $map['alarm_date'];
        }
        if(isset($map['alarm_flag'])){
            $model->alarmFlag = $map['alarm_flag'];
        }
        if(isset($map['alarm_idx'])){
            $model->alarmIdx = $map['alarm_idx'];
        }
        if(isset($map['alarm_type'])){
            $model->alarmType = $map['alarm_type'];
        }
        if(isset($map['company_id'])){
            $model->companyId = $map['company_id'];
        }
        return $model;
    }
    // 预警日期
    /**
     * @example 1
     * @var string
     */
    public $alarmDate;

    // 预警标识，是否需要预警
    /**
     * @example 1
     * @var string
     */
    public $alarmFlag;

    // 预警序号
    /**
     * @example 1
     * @var string
     */
    public $alarmIdx;

    // 预警类型
    /**
     * @example 1
     * @var string
     */
    public $alarmType;

    // 企业ID
    /**
     * @example 1
     * @var string
     */
    public $companyId;

}
