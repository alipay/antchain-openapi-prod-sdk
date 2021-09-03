<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class RepairData extends Model
{
    // 修复结果状态：“RPS001”: 不可外呼，”RPS002":可以 外呼
    /**
     * @example RPS001,RPS002
     *
     * @var string
     */
    public $repairStatus;

    // 身份证号
    /**
     * @example 1311xxxx
     *
     * @var string
     */
    public $idCard;

    // 姓名：显示的姓名为修复请求的 待修复人名
    /**
     * @example 刘猫本
     *
     * @var string
     */
    public $userName;

    // 案件编号，特定使用运营商页面平台产生
    /**
     * @example xxxx
     *
     * @var string
     */
    public $caseNo;

    // 修复号码数量
    /**
     * @example 2
     *
     * @var int
     */
    public $resultListNumber;
    protected $_name = [
        'repairStatus'     => 'repair_status',
        'idCard'           => 'id_card',
        'userName'         => 'user_name',
        'caseNo'           => 'case_no',
        'resultListNumber' => 'result_list_number',
    ];

    public function validate()
    {
        Model::validateRequired('repairStatus', $this->repairStatus, true);
        Model::validateRequired('idCard', $this->idCard, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('resultListNumber', $this->resultListNumber, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->repairStatus) {
            $res['repair_status'] = $this->repairStatus;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->caseNo) {
            $res['case_no'] = $this->caseNo;
        }
        if (null !== $this->resultListNumber) {
            $res['result_list_number'] = $this->resultListNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepairData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['repair_status'])) {
            $model->repairStatus = $map['repair_status'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['case_no'])) {
            $model->caseNo = $map['case_no'];
        }
        if (isset($map['result_list_number'])) {
            $model->resultListNumber = $map['result_list_number'];
        }

        return $model;
    }
}
