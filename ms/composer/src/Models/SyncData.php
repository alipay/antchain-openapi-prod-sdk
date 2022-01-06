<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class SyncData extends Model
{
    // 源数据
    /**
     * @example fdsjfdlsjak;fj;sk
     *
     * @var string
     */
    public $sourceData;

    // 目标数据
    /**
     * @example 1.1.2.1:122200
     *
     * @var string
     */
    public $targetData;
    protected $_name = [
        'sourceData' => 'source_data',
        'targetData' => 'target_data',
    ];

    public function validate()
    {
        Model::validateRequired('sourceData', $this->sourceData, true);
        Model::validateRequired('targetData', $this->targetData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sourceData) {
            $res['source_data'] = $this->sourceData;
        }
        if (null !== $this->targetData) {
            $res['target_data'] = $this->targetData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['source_data'])) {
            $model->sourceData = $map['source_data'];
        }
        if (isset($map['target_data'])) {
            $model->targetData = $map['target_data'];
        }

        return $model;
    }
}
