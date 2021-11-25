<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class WorkersBaseInfo extends Model
{
    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $fullName;

    // 身份证号
    /**
     * @example 22312313
     *
     * @var string
     */
    public $idCard;

    // 身份证有效期起
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $idCardStartDate;

    // 身份证有效期止
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $idCardEndDate;

    // 农民工个人did（实名认证后才有工号id）
    /**
     * @example 1231212
     *
     * @var string
     */
    public $workersDid;

    // 手机号
    /**
     * @example 13944654125
     *
     * @var string
     */
    public $mobileNo;

    // 工种
    /**
     * @example ["钢筋工"]
     *
     * @var string[]
     */
    public $workType;

    // 工作状态   [1.进场   2.退场]
    /**
     * @example 1
     *
     * @var string
     */
    public $workState;

    // 进场时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $enterTime;

    // 退场时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $quitTime;

    // 合同薪资（单位：元）
    /**
     * @example 1000
     *
     * @var string
     */
    public $compensation;
    protected $_name = [
        'fullName'        => 'full_name',
        'idCard'          => 'id_card',
        'idCardStartDate' => 'id_card_start_date',
        'idCardEndDate'   => 'id_card_end_date',
        'workersDid'      => 'workers_did',
        'mobileNo'        => 'mobile_no',
        'workType'        => 'work_type',
        'workState'       => 'work_state',
        'enterTime'       => 'enter_time',
        'quitTime'        => 'quit_time',
        'compensation'    => 'compensation',
    ];

    public function validate()
    {
        Model::validateRequired('fullName', $this->fullName, true);
        Model::validateRequired('idCard', $this->idCard, true);
        Model::validateRequired('workType', $this->workType, true);
        Model::validateRequired('enterTime', $this->enterTime, true);
        Model::validatePattern('idCardStartDate', $this->idCardStartDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('idCardEndDate', $this->idCardEndDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('enterTime', $this->enterTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('quitTime', $this->quitTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fullName) {
            $res['full_name'] = $this->fullName;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->idCardStartDate) {
            $res['id_card_start_date'] = $this->idCardStartDate;
        }
        if (null !== $this->idCardEndDate) {
            $res['id_card_end_date'] = $this->idCardEndDate;
        }
        if (null !== $this->workersDid) {
            $res['workers_did'] = $this->workersDid;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }
        if (null !== $this->workType) {
            $res['work_type'] = $this->workType;
        }
        if (null !== $this->workState) {
            $res['work_state'] = $this->workState;
        }
        if (null !== $this->enterTime) {
            $res['enter_time'] = $this->enterTime;
        }
        if (null !== $this->quitTime) {
            $res['quit_time'] = $this->quitTime;
        }
        if (null !== $this->compensation) {
            $res['compensation'] = $this->compensation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkersBaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['full_name'])) {
            $model->fullName = $map['full_name'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['id_card_start_date'])) {
            $model->idCardStartDate = $map['id_card_start_date'];
        }
        if (isset($map['id_card_end_date'])) {
            $model->idCardEndDate = $map['id_card_end_date'];
        }
        if (isset($map['workers_did'])) {
            $model->workersDid = $map['workers_did'];
        }
        if (isset($map['mobile_no'])) {
            $model->mobileNo = $map['mobile_no'];
        }
        if (isset($map['work_type'])) {
            if (!empty($map['work_type'])) {
                $model->workType = $map['work_type'];
            }
        }
        if (isset($map['work_state'])) {
            $model->workState = $map['work_state'];
        }
        if (isset($map['enter_time'])) {
            $model->enterTime = $map['enter_time'];
        }
        if (isset($map['quit_time'])) {
            $model->quitTime = $map['quit_time'];
        }
        if (isset($map['compensation'])) {
            $model->compensation = $map['compensation'];
        }

        return $model;
    }
}
