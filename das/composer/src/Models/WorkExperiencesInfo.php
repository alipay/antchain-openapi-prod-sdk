<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class WorkExperiencesInfo extends Model
{
    // 工作开始日期
    /**
     * @example 12
     *
     * @var int
     */
    public $workStartTime;

    // 工作结束日期
    /**
     * @example 12
     *
     * @var int
     */
    public $workEndTime;

    // 公司名称
    /**
     * @example xxx有限公司
     *
     * @var string
     */
    public $companyName;

    // 工作描述
    /**
     * @example 工作描述
     *
     * @var string
     */
    public $workDesc;

    // 职业
    /**
     * @example 职业
     *
     * @var string
     */
    public $jobName;

    // 行业名称
    /**
     * @example 行业名称
     *
     * @var string
     */
    public $professionName;
    protected $_name = [
        'workStartTime'  => 'work_start_time',
        'workEndTime'    => 'work_end_time',
        'companyName'    => 'company_name',
        'workDesc'       => 'work_desc',
        'jobName'        => 'job_name',
        'professionName' => 'profession_name',
    ];

    public function validate()
    {
        Model::validateMaximum('workStartTime', $this->workStartTime, 32);
        Model::validateMaximum('workEndTime', $this->workEndTime, 32);
        Model::validateMaxLength('companyName', $this->companyName, 128);
        Model::validateMaxLength('workDesc', $this->workDesc, 1024);
        Model::validateMaxLength('jobName', $this->jobName, 128);
        Model::validateMaxLength('professionName', $this->professionName, 128);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workStartTime) {
            $res['work_start_time'] = $this->workStartTime;
        }
        if (null !== $this->workEndTime) {
            $res['work_end_time'] = $this->workEndTime;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->workDesc) {
            $res['work_desc'] = $this->workDesc;
        }
        if (null !== $this->jobName) {
            $res['job_name'] = $this->jobName;
        }
        if (null !== $this->professionName) {
            $res['profession_name'] = $this->professionName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkExperiencesInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['work_start_time'])) {
            $model->workStartTime = $map['work_start_time'];
        }
        if (isset($map['work_end_time'])) {
            $model->workEndTime = $map['work_end_time'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['work_desc'])) {
            $model->workDesc = $map['work_desc'];
        }
        if (isset($map['job_name'])) {
            $model->jobName = $map['job_name'];
        }
        if (isset($map['profession_name'])) {
            $model->professionName = $map['profession_name'];
        }

        return $model;
    }
}
