<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class OpsPlan extends Model
{
    // id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 名称
    /**
     * @example 名称
     *
     * @var string
     */
    public $name;

    // 环境Id
    /**
     * @example abc
     *
     * @var string
     */
    public $envId;

    // 解决方案Id
    /**
     * @example abcd
     *
     * @var string
     */
    public $solutionId;

    // 发布单类型
    /**
     * @example BASELINE_DEPLOY
     *
     * @var string
     */
    public $opsType;

    // 发布单类型
    /**
     * @example RELEASE
     *
     * @var string
     */
    public $planType;

    // 创建人id
    /**
     * @example jack
     *
     * @var string
     */
    public $creator;

    // 创建人名称
    /**
     * @example 创建人名称
     *
     * @var string
     */
    public $creatorName;

    // 发布单状态
    /**
     * @example INITIALIZING
     *
     * @var string
     */
    public $opsPlanStatus;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // 修改时间
    /**
     * @example 修改时间
     *
     * @var string
     */
    public $utcModified;
    protected $_name = [
        'id'            => 'id',
        'name'          => 'name',
        'envId'         => 'env_id',
        'solutionId'    => 'solution_id',
        'opsType'       => 'ops_type',
        'planType'      => 'plan_type',
        'creator'       => 'creator',
        'creatorName'   => 'creator_name',
        'opsPlanStatus' => 'ops_plan_status',
        'utcCreate'     => 'utc_create',
        'utcModified'   => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('solutionId', $this->solutionId, true);
        Model::validateRequired('opsType', $this->opsType, true);
        Model::validateRequired('planType', $this->planType, true);
        Model::validateRequired('creator', $this->creator, true);
        Model::validateRequired('creatorName', $this->creatorName, true);
        Model::validateRequired('opsPlanStatus', $this->opsPlanStatus, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validateRequired('utcModified', $this->utcModified, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->solutionId) {
            $res['solution_id'] = $this->solutionId;
        }
        if (null !== $this->opsType) {
            $res['ops_type'] = $this->opsType;
        }
        if (null !== $this->planType) {
            $res['plan_type'] = $this->planType;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->creatorName) {
            $res['creator_name'] = $this->creatorName;
        }
        if (null !== $this->opsPlanStatus) {
            $res['ops_plan_status'] = $this->opsPlanStatus;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsPlan
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['solution_id'])) {
            $model->solutionId = $map['solution_id'];
        }
        if (isset($map['ops_type'])) {
            $model->opsType = $map['ops_type'];
        }
        if (isset($map['plan_type'])) {
            $model->planType = $map['plan_type'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['creator_name'])) {
            $model->creatorName = $map['creator_name'];
        }
        if (isset($map['ops_plan_status'])) {
            $model->opsPlanStatus = $map['ops_plan_status'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
