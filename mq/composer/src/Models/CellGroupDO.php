<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CellGroupDO extends Model
{
    // cell_type
    /**
     * @example cell_type
     *
     * @var string
     */
    public $cellType;

    // cells
    /**
     * @example
     *
     * @var string[]
     */
    public $data;
    protected $_name = [
        'cellType' => 'cell_type',
        'data'     => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('cellType', $this->cellType, true);
        Model::validateRequired('data', $this->data, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellType) {
            $res['cell_type'] = $this->cellType;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellGroupDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_type'])) {
            $model->cellType = $map['cell_type'];
        }
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = $map['data'];
            }
        }

        return $model;
    }
}
