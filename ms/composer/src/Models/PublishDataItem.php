<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class PublishDataItem extends Model
{
    // 推送目标 cell
    /**
     * @example cell1
     *
     * @var string
     */
    public $cell;

    // 推送值
    /**
     * @example some push data
     *
     * @var string
     */
    public $data;
    protected $_name = [
        'cell' => 'cell',
        'data' => 'data',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublishDataItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
