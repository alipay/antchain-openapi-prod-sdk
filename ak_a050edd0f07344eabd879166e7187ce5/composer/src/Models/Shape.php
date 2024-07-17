<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class Shape extends Model
{
    // 边的样式
    /**
     * @example ss
     *
     * @var string
     */
    public $shape;

    // edgeId
    /**
     * @example ss
     *
     * @var string
     */
    public $edgeId;

    // 边起点的锚点位置
    /**
     * @example
     *
     * @var int
     */
    public $sourceAnchor;

    // 边终点的锚点位置
    /**
     * @example
     *
     * @var int
     */
    public $targetAnchor;
    protected $_name = [
        'shape'        => 'shape',
        'edgeId'       => 'edge_id',
        'sourceAnchor' => 'source_anchor',
        'targetAnchor' => 'target_anchor',
    ];

    public function validate()
    {
        Model::validateRequired('shape', $this->shape, true);
        Model::validateRequired('edgeId', $this->edgeId, true);
        Model::validateRequired('sourceAnchor', $this->sourceAnchor, true);
        Model::validateRequired('targetAnchor', $this->targetAnchor, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->shape) {
            $res['shape'] = $this->shape;
        }
        if (null !== $this->edgeId) {
            $res['edge_id'] = $this->edgeId;
        }
        if (null !== $this->sourceAnchor) {
            $res['source_anchor'] = $this->sourceAnchor;
        }
        if (null !== $this->targetAnchor) {
            $res['target_anchor'] = $this->targetAnchor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Shape
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['shape'])) {
            $model->shape = $map['shape'];
        }
        if (isset($map['edge_id'])) {
            $model->edgeId = $map['edge_id'];
        }
        if (isset($map['source_anchor'])) {
            $model->sourceAnchor = $map['source_anchor'];
        }
        if (isset($map['target_anchor'])) {
            $model->targetAnchor = $map['target_anchor'];
        }

        return $model;
    }
}
