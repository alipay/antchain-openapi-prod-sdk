<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CodeListView extends Model
{
    // 数据code
    /**
     * @example ahog
     *
     * @var string
     */
    public $dataCode;

    // 数据名称
    /**
     * @example name
     *
     * @var string
     */
    public $dataName;
    protected $_name = [
        'dataCode' => 'data_code',
        'dataName' => 'data_name',
    ];

    public function validate()
    {
        Model::validateRequired('dataCode', $this->dataCode, true);
        Model::validateRequired('dataName', $this->dataName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataCode) {
            $res['data_code'] = $this->dataCode;
        }
        if (null !== $this->dataName) {
            $res['data_name'] = $this->dataName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CodeListView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_code'])) {
            $model->dataCode = $map['data_code'];
        }
        if (isset($map['data_name'])) {
            $model->dataName = $map['data_name'];
        }

        return $model;
    }
}
