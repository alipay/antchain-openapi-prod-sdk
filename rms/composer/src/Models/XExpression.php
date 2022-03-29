<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XExpression extends Model
{
    // name
    /**
     * @example
     *
     * @var string
     */
    public $name;

    /**
     * @example
     *
     * @var string
     */
    public $description;

    /**
     * @example
     *
     * @var XMatchExpression
     */
    public $matchExpression;

    /**
     * @example
     *
     * @var XTranslate
     */
    public $translateExpression;

    // metric type
    /**
     * @example
     *
     * @var string
     */
    public $type;

    /**
     * @example
     *
     * @var string
     */
    public $unit;

    /**
     * @example
     *
     * @var string
     */
    public $downsampleFunc;

    /**
     * @example
     *
     * @var string
     */
    public $aggregationFunc;

    // prometheus tags
    /**
     * @example
     *
     * @var XMetricInfo[]
     */
    public $expressionTags;

    // prometheus metric-tags 是否采集
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enabled;

    // line filter
    /**
     * @example
     *
     * @var string[]
     */
    public $values;

    /**
     * @example
     *
     * @var string
     */
    public $displayName;

    /**
     * @example
     *
     * @var XStringKeyValue[]
     */
    public $pathParameters;

    // x
    /**
     * @example x
     *
     * @var XCalculationExpression
     */
    public $calculationExpression;

    // 计算数据源使用的原始指标名称
    /**
     * @example
     *
     * @var string
     */
    public $sourceName;
    protected $_name = [
        'name'                  => 'name',
        'description'           => 'description',
        'matchExpression'       => 'match_expression',
        'translateExpression'   => 'translate_expression',
        'type'                  => 'type',
        'unit'                  => 'unit',
        'downsampleFunc'        => 'downsample_func',
        'aggregationFunc'       => 'aggregation_func',
        'expressionTags'        => 'expression_tags',
        'enabled'               => 'enabled',
        'values'                => 'values',
        'displayName'           => 'display_name',
        'pathParameters'        => 'path_parameters',
        'calculationExpression' => 'calculation_expression',
        'sourceName'            => 'source_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->matchExpression) {
            $res['match_expression'] = null !== $this->matchExpression ? $this->matchExpression->toMap() : null;
        }
        if (null !== $this->translateExpression) {
            $res['translate_expression'] = null !== $this->translateExpression ? $this->translateExpression->toMap() : null;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->downsampleFunc) {
            $res['downsample_func'] = $this->downsampleFunc;
        }
        if (null !== $this->aggregationFunc) {
            $res['aggregation_func'] = $this->aggregationFunc;
        }
        if (null !== $this->expressionTags) {
            $res['expression_tags'] = [];
            if (null !== $this->expressionTags && \is_array($this->expressionTags)) {
                $n = 0;
                foreach ($this->expressionTags as $item) {
                    $res['expression_tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->values) {
            $res['values'] = $this->values;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->pathParameters) {
            $res['path_parameters'] = [];
            if (null !== $this->pathParameters && \is_array($this->pathParameters)) {
                $n = 0;
                foreach ($this->pathParameters as $item) {
                    $res['path_parameters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->calculationExpression) {
            $res['calculation_expression'] = null !== $this->calculationExpression ? $this->calculationExpression->toMap() : null;
        }
        if (null !== $this->sourceName) {
            $res['source_name'] = $this->sourceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XExpression
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['match_expression'])) {
            $model->matchExpression = XMatchExpression::fromMap($map['match_expression']);
        }
        if (isset($map['translate_expression'])) {
            $model->translateExpression = XTranslate::fromMap($map['translate_expression']);
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['downsample_func'])) {
            $model->downsampleFunc = $map['downsample_func'];
        }
        if (isset($map['aggregation_func'])) {
            $model->aggregationFunc = $map['aggregation_func'];
        }
        if (isset($map['expression_tags'])) {
            if (!empty($map['expression_tags'])) {
                $model->expressionTags = [];
                $n                     = 0;
                foreach ($map['expression_tags'] as $item) {
                    $model->expressionTags[$n++] = null !== $item ? XMetricInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = $map['values'];
            }
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['path_parameters'])) {
            if (!empty($map['path_parameters'])) {
                $model->pathParameters = [];
                $n                     = 0;
                foreach ($map['path_parameters'] as $item) {
                    $model->pathParameters[$n++] = null !== $item ? XStringKeyValue::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['calculation_expression'])) {
            $model->calculationExpression = XCalculationExpression::fromMap($map['calculation_expression']);
        }
        if (isset($map['source_name'])) {
            $model->sourceName = $map['source_name'];
        }

        return $model;
    }
}
