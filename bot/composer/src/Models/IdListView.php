<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IdListView extends Model
{
    // 数据id
    /**
     * @example 10
     *
     * @var int
     */
    public $dataId;

    // 数据名称
    /**
     * @example name
     *
     * @var string
     */
    public $dataName;
    protected $_name = [
        'dataId'   => 'data_id',
        'dataName' => 'data_name',
    ];

    public function validate()
    {
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('dataName', $this->dataName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->dataName) {
            $res['data_name'] = $this->dataName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdListView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['data_name'])) {
            $model->dataName = $map['data_name'];
        }

        return $model;
    }
}
