<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class Assessment extends Model
{
    // 供应商
    /**
     * @example 供应商A
     *
     * @var string
     */
    public $supCode;

    // 供应商B
    /**
     * @example 供应商A
     *
     * @var string
     */
    public $supName;

    // 员工号
    /**
     * @example S0001
     *
     * @var string
     */
    public $jobNumber;

    // 员工姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 考核分数
    /**
     * @example 90
     *
     * @var int
     */
    public $assessmentNum;

    // 级别
    /**
     * @example 级别
     *
     * @var string
     */
    public $level;

    // 创建时间
    /**
     * @example 2021-03-04 11:16:23
     *
     * @var string
     */
    public $createDate;

    // 管理员
    /**
     * @example 管理员
     *
     * @var string
     */
    public $creator;

    // 202103
    /**
     * @example 202103
     *
     * @var string
     */
    public $scoreDate;

    // 结果状态
    /**
     * @example 1
     *
     * @var string
     */
    public $resultstate;

    // 工作地点
    /**
     * @example 工作地点
     *
     * @var string
     */
    public $workplace;

    // 状态更新时间
    /**
     * @example 2021-03-06 11:16:23
     *
     * @var string
     */
    public $resultdate;

    // 确认人
    /**
     * @example 确认人
     *
     * @var string
     */
    public $resultby;

    // 备注
    /**
     * @example 备注
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'supCode'       => 'sup_code',
        'supName'       => 'sup_name',
        'jobNumber'     => 'job_number',
        'name'          => 'name',
        'assessmentNum' => 'assessment_num',
        'level'         => 'level',
        'createDate'    => 'create_date',
        'creator'       => 'creator',
        'scoreDate'     => 'score_date',
        'resultstate'   => 'resultstate',
        'workplace'     => 'workplace',
        'resultdate'    => 'resultdate',
        'resultby'      => 'resultby',
        'remark'        => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('supCode', $this->supCode, true);
        Model::validateRequired('supName', $this->supName, true);
        Model::validateRequired('jobNumber', $this->jobNumber, true);
        Model::validateRequired('assessmentNum', $this->assessmentNum, true);
        Model::validateRequired('level', $this->level, true);
        Model::validateRequired('createDate', $this->createDate, true);
        Model::validateRequired('scoreDate', $this->scoreDate, true);
        Model::validateRequired('resultstate', $this->resultstate, true);
        Model::validateRequired('resultdate', $this->resultdate, true);
        Model::validateRequired('resultby', $this->resultby, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->supCode) {
            $res['sup_code'] = $this->supCode;
        }
        if (null !== $this->supName) {
            $res['sup_name'] = $this->supName;
        }
        if (null !== $this->jobNumber) {
            $res['job_number'] = $this->jobNumber;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->assessmentNum) {
            $res['assessment_num'] = $this->assessmentNum;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->createDate) {
            $res['create_date'] = $this->createDate;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->scoreDate) {
            $res['score_date'] = $this->scoreDate;
        }
        if (null !== $this->resultstate) {
            $res['resultstate'] = $this->resultstate;
        }
        if (null !== $this->workplace) {
            $res['workplace'] = $this->workplace;
        }
        if (null !== $this->resultdate) {
            $res['resultdate'] = $this->resultdate;
        }
        if (null !== $this->resultby) {
            $res['resultby'] = $this->resultby;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Assessment
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sup_code'])) {
            $model->supCode = $map['sup_code'];
        }
        if (isset($map['sup_name'])) {
            $model->supName = $map['sup_name'];
        }
        if (isset($map['job_number'])) {
            $model->jobNumber = $map['job_number'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['assessment_num'])) {
            $model->assessmentNum = $map['assessment_num'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['create_date'])) {
            $model->createDate = $map['create_date'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['score_date'])) {
            $model->scoreDate = $map['score_date'];
        }
        if (isset($map['resultstate'])) {
            $model->resultstate = $map['resultstate'];
        }
        if (isset($map['workplace'])) {
            $model->workplace = $map['workplace'];
        }
        if (isset($map['resultdate'])) {
            $model->resultdate = $map['resultdate'];
        }
        if (isset($map['resultby'])) {
            $model->resultby = $map['resultby'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
