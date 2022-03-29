<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SwitchoverAction extends Model
{
    // 目标单元
    /**
     * @example GZ00B
     *
     * @var string
     */
    public $destCell;

    // 来源单元
    /**
     * @example GZ00A
     *
     * @var string
     */
    public $sourceCell;
    protected $_name = [
        'destCell'   => 'dest_cell',
        'sourceCell' => 'source_cell',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->destCell) {
            $res['dest_cell'] = $this->destCell;
        }
        if (null !== $this->sourceCell) {
            $res['source_cell'] = $this->sourceCell;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SwitchoverAction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dest_cell'])) {
            $model->destCell = $map['dest_cell'];
        }
        if (isset($map['source_cell'])) {
            $model->sourceCell = $map['source_cell'];
        }

        return $model;
    }
}
