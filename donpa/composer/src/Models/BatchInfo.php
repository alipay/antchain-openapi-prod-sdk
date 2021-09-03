<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class BatchInfo extends Model
{
    // 修复的批次号
    /**
     * @example 5a0a52d01fa9304e8dba7170
     *
     * @var string
     */
    public $batchId;
    protected $_name = [
        'batchId' => 'batch_id',
    ];

    public function validate()
    {
        Model::validateRequired('batchId', $this->batchId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }

        return $model;
    }
}
