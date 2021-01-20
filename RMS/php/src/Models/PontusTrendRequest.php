<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\KeySet;

class PontusTrendRequest extends Model {
    protected $_name = [
        'token' => 'token',
        'metricTable' => 'metric_table',
        'siteEnv' => 'site_env',
        'viewId' => 'view_id',
        'periodType' => 'period_type',
        'extraDimNames' => 'extra_dim_names',
        'metricFilter' => 'metric_filter',
        'start' => 'start',
        'end' => 'end',
        'dimConditionsList' => 'dim_conditions_list',
        'dimExpression' => 'dim_expression',
        'dimExpressionList' => 'dim_expression_list',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->metricTable) {
            $res['metric_table'] = $this->metricTable;
        }
        if (null !== $this->siteEnv) {
            $res['site_env'] = $this->siteEnv;
        }
        if (null !== $this->viewId) {
            $res['view_id'] = $this->viewId;
        }
        if (null !== $this->periodType) {
            $res['period_type'] = $this->periodType;
        }
        if (null !== $this->extraDimNames) {
            $res['extra_dim_names'] = $this->extraDimNames;
        }
        if (null !== $this->metricFilter) {
            $res['metric_filter'] = $this->metricFilter;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->dimConditionsList) {
            $res['dim_conditions_list'] = [];
            if(null !== $this->dimConditionsList && is_array($this->dimConditionsList)){
                $n = 0;
                foreach($this->dimConditionsList as $item){
                    $res['dim_conditions_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dimExpression) {
            $res['dim_expression'] = null !== $this->dimExpression ? $this->dimExpression->toMap() : null;
        }
        if (null !== $this->dimExpressionList) {
            $res['dim_expression_list'] = [];
            if(null !== $this->dimExpressionList && is_array($this->dimExpressionList)){
                $n = 0;
                foreach($this->dimExpressionList as $item){
                    $res['dim_expression_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PontusTrendRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['token'])){
            $model->token = $map['token'];
        }
        if(isset($map['metric_table'])){
            $model->metricTable = $map['metric_table'];
        }
        if(isset($map['site_env'])){
            $model->siteEnv = $map['site_env'];
        }
        if(isset($map['view_id'])){
            $model->viewId = $map['view_id'];
        }
        if(isset($map['period_type'])){
            $model->periodType = $map['period_type'];
        }
        if(isset($map['extra_dim_names'])){
            if(!empty($map['extra_dim_names'])){
                $model->extraDimNames = $map['extra_dim_names'];
            }
        }
        if(isset($map['metric_filter'])){
            $model->metricFilter = $map['metric_filter'];
        }
        if(isset($map['start'])){
            $model->start = $map['start'];
        }
        if(isset($map['end'])){
            $model->end = $map['end'];
        }
        if(isset($map['dim_conditions_list'])){
            if(!empty($map['dim_conditions_list'])){
                $model->dimConditionsList = [];
                $n = 0;
                foreach($map['dim_conditions_list'] as $item) {
                    $model->dimConditionsList[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['dim_expression'])){
            $model->dimExpression = KeySet::fromMap($map['dim_expression']);
        }
        if(isset($map['dim_expression_list'])){
            if(!empty($map['dim_expression_list'])){
                $model->dimExpressionList = [];
                $n = 0;
                foreach($map['dim_expression_list'] as $item) {
                    $model->dimExpressionList[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // token
    /**
     * @example token
     * @var string
     */
    public $token;

    // metric_table
    /**
     * @example metric_table
     * @var string
     */
    public $metricTable;

    // site_env
    /**
     * @example site_env
     * @var string
     */
    public $siteEnv;

    // view_id
    /**
     * @example view_id
     * @var string
     */
    public $viewId;

    // period_type
    /**
     * @example period_type
     * @var string
     */
    public $periodType;

    // extraDimNames
    /**
     * @example extraDimNames
     * @var string[]
     */
    public $extraDimNames;

    // metric_filter
    /**
     * @example metric_filter
     * @var string
     */
    public $metricFilter;

    // start
    /**
     * @example start
     * @var int
     */
    public $start;

    // end
    /**
     * @example end
     * @var int
     */
    public $end;

    // dim_conditions_list
    /**
     * @example dim_conditions_list
     * @var KeySet[]
     */
    public $dimConditionsList;

    // dim_expression
    /**
     * @example dim_expression
     * @var KeySet
     */
    public $dimExpression;

    // dim_expression_list
    /**
     * @example dim_expression_list
     * @var KeySet[]
     */
    public $dimExpressionList;

}
