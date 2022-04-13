<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CellPods extends Model
{
    // 部署单元名称
    /**
     * @example RZ01A
     *
     * @var string
     */
    public $cell;

    // pod标识列表
    /**
     * @example ["pod-name-A", "pod-name-B"]
     *
     * @var string[]
     */
    public $podNames;
    protected $_name = [
        'cell'     => 'cell',
        'podNames' => 'pod_names',
    ];

    public function validate()
    {
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('podNames', $this->podNames, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->podNames) {
            $res['pod_names'] = $this->podNames;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellPods
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['pod_names'])) {
            if (!empty($map['pod_names'])) {
                $model->podNames = $map['pod_names'];
            }
        }

        return $model;
    }
}
