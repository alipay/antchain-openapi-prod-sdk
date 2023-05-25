<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class RiskSolution extends Model
{
    // 风险解决方案ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $id;

    // 名称
    /**
     * @example cve-20220921解决方案
     *
     * @var string
     */
    public $name;

    // 风险名称
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $riskName;

    // 来源
    /**
     * @example manual
     *
     * @var string
     */
    public $source;

    // 修复类型
    /**
     * @example config
     *
     * @var string
     */
    public $fixType;

    // 风险描述
    /**
     * @example 这是一段风险漏洞的描述
     *
     * @var string
     */
    public $riskDescription;

    // 风险解决方案
    /**
     * @example 这是一段风险解决方案
     *
     * @var string
     */
    public $solutionPlan;

    // 应急解决方案
    /**
     * @example 这是一段风险应急解决方案
     *
     * @var string
     */
    public $emergencyPlan;

    // 负责人
    /**
     * @example zhangsan
     *
     * @var string
     */
    public $owner;
    protected $_name = [
        'id'              => 'id',
        'name'            => 'name',
        'riskName'        => 'risk_name',
        'source'          => 'source',
        'fixType'         => 'fix_type',
        'riskDescription' => 'risk_description',
        'solutionPlan'    => 'solution_plan',
        'emergencyPlan'   => 'emergency_plan',
        'owner'           => 'owner',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('riskName', $this->riskName, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('fixType', $this->fixType, true);
        Model::validateRequired('riskDescription', $this->riskDescription, true);
        Model::validateRequired('solutionPlan', $this->solutionPlan, true);
        Model::validateRequired('emergencyPlan', $this->emergencyPlan, true);
        Model::validateRequired('owner', $this->owner, true);
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
        if (null !== $this->riskName) {
            $res['risk_name'] = $this->riskName;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->fixType) {
            $res['fix_type'] = $this->fixType;
        }
        if (null !== $this->riskDescription) {
            $res['risk_description'] = $this->riskDescription;
        }
        if (null !== $this->solutionPlan) {
            $res['solution_plan'] = $this->solutionPlan;
        }
        if (null !== $this->emergencyPlan) {
            $res['emergency_plan'] = $this->emergencyPlan;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskSolution
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
        if (isset($map['risk_name'])) {
            $model->riskName = $map['risk_name'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['fix_type'])) {
            $model->fixType = $map['fix_type'];
        }
        if (isset($map['risk_description'])) {
            $model->riskDescription = $map['risk_description'];
        }
        if (isset($map['solution_plan'])) {
            $model->solutionPlan = $map['solution_plan'];
        }
        if (isset($map['emergency_plan'])) {
            $model->emergencyPlan = $map['emergency_plan'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
