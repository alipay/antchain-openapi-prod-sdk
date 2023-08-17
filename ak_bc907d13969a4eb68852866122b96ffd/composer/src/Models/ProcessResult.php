<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class ProcessResult extends Model
{
    // Node
    /**
     * @example Node
     *
     * @var string
     */
    public $node;

    // totalitem
    /**
     * @example totalitem
     *
     * @var int
     */
    public $totalitem;

    // finisheditem
    /**
     * @example finisheditem
     *
     * @var int
     */
    public $finisheditem;

    // TotalSubTask
    /**
     * @example TotalSubTask
     *
     * @var int
     */
    public $totalsubtask;

    // FinishedSubTask
    /**
     * @example FinishedSubTask
     *
     * @var int
     */
    public $finishedsubtask;
    protected $_name = [
        'node'            => 'node',
        'totalitem'       => 'totalitem',
        'finisheditem'    => 'finisheditem',
        'totalsubtask'    => 'totalsubtask',
        'finishedsubtask' => 'finishedsubtask',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->node) {
            $res['node'] = $this->node;
        }
        if (null !== $this->totalitem) {
            $res['totalitem'] = $this->totalitem;
        }
        if (null !== $this->finisheditem) {
            $res['finisheditem'] = $this->finisheditem;
        }
        if (null !== $this->totalsubtask) {
            $res['totalsubtask'] = $this->totalsubtask;
        }
        if (null !== $this->finishedsubtask) {
            $res['finishedsubtask'] = $this->finishedsubtask;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProcessResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node'])) {
            $model->node = $map['node'];
        }
        if (isset($map['totalitem'])) {
            $model->totalitem = $map['totalitem'];
        }
        if (isset($map['finisheditem'])) {
            $model->finisheditem = $map['finisheditem'];
        }
        if (isset($map['totalsubtask'])) {
            $model->totalsubtask = $map['totalsubtask'];
        }
        if (isset($map['finishedsubtask'])) {
            $model->finishedsubtask = $map['finishedsubtask'];
        }

        return $model;
    }
}
