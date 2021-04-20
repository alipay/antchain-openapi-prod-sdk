<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class Project extends Model
{
    // 项目对应的合约 ID
    /**
     * @example f0aa07eb022d0504ba33d0d1bb99e0afee30d810393dcacc022aa220
     *
     * @var string
     */
    public $contractId;

    // 项目结束时间，精确到毫秒，FILM类型订单必填
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $projectEndTime;

    // 项目ID
    /**
     * @example 123456
     *
     * @var string
     */
    public $projectId;

    // 项目名称
    /**
     * @example 玩具总动员2
     *
     * @var string
     */
    public $projectName;

    // 项目开始时间，精确到毫秒，FILM类型订单必填
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $projectStartTime;

    // 项目类型，目前支持FILM：电影，CAR：汽车
    /**
     * @example FILM | CAR
     *
     * @var string
     */
    public $projectType;
    protected $_name = [
        'contractId'       => 'contract_id',
        'projectEndTime'   => 'project_end_time',
        'projectId'        => 'project_id',
        'projectName'      => 'project_name',
        'projectStartTime' => 'project_start_time',
        'projectType'      => 'project_type',
    ];

    public function validate()
    {
        Model::validatePattern('projectEndTime', $this->projectEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('projectStartTime', $this->projectStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('projectType', $this->projectType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->projectEndTime) {
            $res['project_end_time'] = $this->projectEndTime;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->projectStartTime) {
            $res['project_start_time'] = $this->projectStartTime;
        }
        if (null !== $this->projectType) {
            $res['project_type'] = $this->projectType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Project
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['project_end_time'])) {
            $model->projectEndTime = $map['project_end_time'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['project_start_time'])) {
            $model->projectStartTime = $map['project_start_time'];
        }
        if (isset($map['project_type'])) {
            $model->projectType = $map['project_type'];
        }

        return $model;
    }
}
