<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\AiAlarmParams;
use AntChain\RMS\Models\TimeRange;
use AntChain\RMS\Models\DimFilter;
use AntChain\RMS\Models\TimeFilter;
use AntChain\RMS\Models\Trigger;
use AntChain\RMS\Models\ControlPlan;

class Rule extends Model {
    protected $_name = [
        'aiAlarmParams' => 'ai_alarm_params',
        'name' => 'name',
        'runType' => 'run_type',
        'calTimeRange' => 'cal_time_range',
        'excludeDataTimeRange' => 'exclude_data_time_range',
        'dimFilters' => 'dim_filters',
        'timeFilter' => 'time_filter',
        'triggers' => 'triggers',
        'andor' => 'andor',
        'controlPlanAuto' => 'control_plan_auto',
        'controlPlans' => 'control_plans',
        'functionId' => 'function_id',
        'fromTmpRule' => 'from_tmp_rule',
        'ruleType' => 'rule_type',
        'ports' => 'ports',
        'groupBy' => 'group_by',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->aiAlarmParams) {
            $res['ai_alarm_params'] = null !== $this->aiAlarmParams ? $this->aiAlarmParams->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->runType) {
            $res['run_type'] = $this->runType;
        }
        if (null !== $this->calTimeRange) {
            $res['cal_time_range'] = null !== $this->calTimeRange ? $this->calTimeRange->toMap() : null;
        }
        if (null !== $this->excludeDataTimeRange) {
            $res['exclude_data_time_range'] = null !== $this->excludeDataTimeRange ? $this->excludeDataTimeRange->toMap() : null;
        }
        if (null !== $this->dimFilters) {
            $res['dim_filters'] = [];
            if(null !== $this->dimFilters && is_array($this->dimFilters)){
                $n = 0;
                foreach($this->dimFilters as $item){
                    $res['dim_filters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->timeFilter) {
            $res['time_filter'] = null !== $this->timeFilter ? $this->timeFilter->toMap() : null;
        }
        if (null !== $this->triggers) {
            $res['triggers'] = [];
            if(null !== $this->triggers && is_array($this->triggers)){
                $n = 0;
                foreach($this->triggers as $item){
                    $res['triggers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->andor) {
            $res['andor'] = $this->andor;
        }
        if (null !== $this->controlPlanAuto) {
            $res['control_plan_auto'] = $this->controlPlanAuto;
        }
        if (null !== $this->controlPlans) {
            $res['control_plans'] = [];
            if(null !== $this->controlPlans && is_array($this->controlPlans)){
                $n = 0;
                foreach($this->controlPlans as $item){
                    $res['control_plans'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->functionId) {
            $res['function_id'] = $this->functionId;
        }
        if (null !== $this->fromTmpRule) {
            $res['from_tmp_rule'] = $this->fromTmpRule;
        }
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->ports) {
            $res['ports'] = $this->ports;
        }
        if (null !== $this->groupBy) {
            $res['group_by'] = $this->groupBy;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Rule
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['ai_alarm_params'])){
            $model->aiAlarmParams = AiAlarmParams::fromMap($map['ai_alarm_params']);
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['run_type'])){
            $model->runType = $map['run_type'];
        }
        if(isset($map['cal_time_range'])){
            $model->calTimeRange = TimeRange::fromMap($map['cal_time_range']);
        }
        if(isset($map['exclude_data_time_range'])){
            $model->excludeDataTimeRange = TimeRange::fromMap($map['exclude_data_time_range']);
        }
        if(isset($map['dim_filters'])){
            if(!empty($map['dim_filters'])){
                $model->dimFilters = [];
                $n = 0;
                foreach($map['dim_filters'] as $item) {
                    $model->dimFilters[$n++] = null !== $item ? DimFilter::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['time_filter'])){
            $model->timeFilter = TimeFilter::fromMap($map['time_filter']);
        }
        if(isset($map['triggers'])){
            if(!empty($map['triggers'])){
                $model->triggers = [];
                $n = 0;
                foreach($map['triggers'] as $item) {
                    $model->triggers[$n++] = null !== $item ? Trigger::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['andor'])){
            $model->andor = $map['andor'];
        }
        if(isset($map['control_plan_auto'])){
            $model->controlPlanAuto = $map['control_plan_auto'];
        }
        if(isset($map['control_plans'])){
            if(!empty($map['control_plans'])){
                $model->controlPlans = [];
                $n = 0;
                foreach($map['control_plans'] as $item) {
                    $model->controlPlans[$n++] = null !== $item ? ControlPlan::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['function_id'])){
            $model->functionId = $map['function_id'];
        }
        if(isset($map['from_tmp_rule'])){
            $model->fromTmpRule = $map['from_tmp_rule'];
        }
        if(isset($map['rule_type'])){
            $model->ruleType = $map['rule_type'];
        }
        if(isset($map['ports'])){
            if(!empty($map['ports'])){
                $model->ports = $map['ports'];
            }
        }
        if(isset($map['group_by'])){
            if(!empty($map['group_by'])){
                $model->groupBy = $map['group_by'];
            }
        }
        return $model;
    }
    // ai_alarm_params
    /**
     * @example ai_alarm_params
     * @var AiAlarmParams
     */
    public $aiAlarmParams;

    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // run_type
    /**
     * @example run_type
     * @var string
     */
    public $runType;

    // cal_time_range
    /**
     * @example cal_time_range
     * @var TimeRange
     */
    public $calTimeRange;

    // exclude_data_time_range
    /**
     * @example exclude_data_time_range
     * @var TimeRange
     */
    public $excludeDataTimeRange;

    // dim_filters
    /**
     * @example dim_filters
     * @var DimFilter[]
     */
    public $dimFilters;

    // time_filter
    /**
     * @example time_filter
     * @var TimeFilter
     */
    public $timeFilter;

    // triggers
    /**
     * @example triggers
     * @var Trigger[]
     */
    public $triggers;

    // andor
    /**
     * @example andor
     * @var string
     */
    public $andor;

    // control_plan_auto
    /**
     * @example true, false
     * @var bool
     */
    public $controlPlanAuto;

    // control_plans
    /**
     * @example control_plans
     * @var ControlPlan[]
     */
    public $controlPlans;

    // function_id
    /**
     * @example function_id
     * @var int
     */
    public $functionId;

    // from_tmp_rule
    /**
     * @example from_tmp_rule
     * @var int
     */
    public $fromTmpRule;

    // rule_type
    /**
     * @example rule_type
     * @var string
     */
    public $ruleType;

    // ports
    /**
     * @example ports
     * @var string[]
     */
    public $ports;

    // group_by
    /**
     * @example group_by
     * @var string[]
     */
    public $groupBy;

}
