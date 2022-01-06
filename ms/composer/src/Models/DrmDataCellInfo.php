<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DrmDataCellInfo extends Model
{
    // 单元信息列表
    /**
     * @example [{CellInfo}]
     *
     * @var CellInfo[]
     */
    public $cellInfos;

    // 所有单元中是否存在有特殊推送过值的单元
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasSpecialCell;
    protected $_name = [
        'cellInfos'      => 'cell_infos',
        'hasSpecialCell' => 'has_special_cell',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellInfos) {
            $res['cell_infos'] = [];
            if (null !== $this->cellInfos && \is_array($this->cellInfos)) {
                $n = 0;
                foreach ($this->cellInfos as $item) {
                    $res['cell_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->hasSpecialCell) {
            $res['has_special_cell'] = $this->hasSpecialCell;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DrmDataCellInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_infos'])) {
            if (!empty($map['cell_infos'])) {
                $model->cellInfos = [];
                $n                = 0;
                foreach ($map['cell_infos'] as $item) {
                    $model->cellInfos[$n++] = null !== $item ? CellInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['has_special_cell'])) {
            $model->hasSpecialCell = $map['has_special_cell'];
        }

        return $model;
    }
}
