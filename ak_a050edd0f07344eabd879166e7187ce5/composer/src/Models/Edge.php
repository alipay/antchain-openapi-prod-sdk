<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class Edge extends Model
{
    // 边的id，这个是前端生成的，用于图关系
    /**
     * @example e9dfjd
     *
     * @var string
     */
    public $edgeId;

    // key为上面content中的变量value为名称
    /**
     * @example ss
     *
     * @var string
     */
    public $variableMap;

    // 边的规则表达式
    /**
     * @example
     *
     * @var string[]
     */
    public $frontConditionExpression;

    // 前端图形相关
    /**
     * @example
     *
     * @var Shape
     */
    public $shape;

    // 边连接的上一个节点的feId
    /**
     * @example d9fvnei3
     *
     * @var string
     */
    public $source;

    // 边连接的下一个节点的feId
    /**
     * @example ie9f3jox
     *
     * @var string
     */
    public $target;

    // 优先级，0~999
    /**
     * @example
     *
     * @var int
     */
    public $priority;
    protected $_name = [
        'edgeId'                   => 'edge_id',
        'variableMap'              => 'variable_map',
        'frontConditionExpression' => 'front_condition_expression',
        'shape'                    => 'shape',
        'source'                   => 'source',
        'target'                   => 'target',
        'priority'                 => 'priority',
    ];

    public function validate()
    {
        Model::validateRequired('edgeId', $this->edgeId, true);
        Model::validateRequired('variableMap', $this->variableMap, true);
        Model::validateRequired('frontConditionExpression', $this->frontConditionExpression, true);
        Model::validateRequired('shape', $this->shape, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('target', $this->target, true);
        Model::validateRequired('priority', $this->priority, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->edgeId) {
            $res['edge_id'] = $this->edgeId;
        }
        if (null !== $this->variableMap) {
            $res['variable_map'] = $this->variableMap;
        }
        if (null !== $this->frontConditionExpression) {
            $res['front_condition_expression'] = $this->frontConditionExpression;
        }
        if (null !== $this->shape) {
            $res['shape'] = null !== $this->shape ? $this->shape->toMap() : null;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Edge
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['edge_id'])) {
            $model->edgeId = $map['edge_id'];
        }
        if (isset($map['variable_map'])) {
            $model->variableMap = $map['variable_map'];
        }
        if (isset($map['front_condition_expression'])) {
            if (!empty($map['front_condition_expression'])) {
                $model->frontConditionExpression = $map['front_condition_expression'];
            }
        }
        if (isset($map['shape'])) {
            $model->shape = Shape::fromMap($map['shape']);
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['target'])) {
            $model->target = $map['target'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }

        return $model;
    }
}
