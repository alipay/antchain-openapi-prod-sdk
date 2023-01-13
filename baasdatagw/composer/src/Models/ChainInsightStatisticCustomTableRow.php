<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightStatisticCustomTableRow extends Model
{
    // 表格的一行
    /**
     * @example
     *
     * @var MapEntry[]
     */
    public $row;
    protected $_name = [
        'row' => 'row',
    ];

    public function validate()
    {
        Model::validateRequired('row', $this->row, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->row) {
            $res['row'] = [];
            if (null !== $this->row && \is_array($this->row)) {
                $n = 0;
                foreach ($this->row as $item) {
                    $res['row'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightStatisticCustomTableRow
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['row'])) {
            if (!empty($map['row'])) {
                $model->row = [];
                $n          = 0;
                foreach ($map['row'] as $item) {
                    $model->row[$n++] = null !== $item ? MapEntry::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
