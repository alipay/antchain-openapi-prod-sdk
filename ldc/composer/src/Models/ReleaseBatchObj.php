<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ReleaseBatchObj extends Model
{
    // 第一个批次
    /**
     * @example 1
     *
     * @var int
     */
    public $batchNum;

    // 单元内服务数组
    /**
     * @example
     *
     * @var CellServer[]
     */
    public $cellServers;
    protected $_name = [
        'batchNum'    => 'batch_num',
        'cellServers' => 'cell_servers',
    ];

    public function validate()
    {
        Model::validateRequired('batchNum', $this->batchNum, true);
        Model::validateRequired('cellServers', $this->cellServers, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->batchNum) {
            $res['batch_num'] = $this->batchNum;
        }
        if (null !== $this->cellServers) {
            $res['cell_servers'] = [];
            if (null !== $this->cellServers && \is_array($this->cellServers)) {
                $n = 0;
                foreach ($this->cellServers as $item) {
                    $res['cell_servers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReleaseBatchObj
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['batch_num'])) {
            $model->batchNum = $map['batch_num'];
        }
        if (isset($map['cell_servers'])) {
            if (!empty($map['cell_servers'])) {
                $model->cellServers = [];
                $n                  = 0;
                foreach ($map['cell_servers'] as $item) {
                    $model->cellServers[$n++] = null !== $item ? CellServer::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
