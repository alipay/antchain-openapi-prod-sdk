<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BatchSubmitCarResult extends Model
{
    // 提交线索唯一请求id
    /**
     * @example xxx
     *
     * @var string
     */
    public $submitId;

    // 是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isSuccess;
    protected $_name = [
        'submitId'  => 'submit_id',
        'isSuccess' => 'is_success',
    ];

    public function validate()
    {
        Model::validateRequired('submitId', $this->submitId, true);
        Model::validateRequired('isSuccess', $this->isSuccess, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->submitId) {
            $res['submit_id'] = $this->submitId;
        }
        if (null !== $this->isSuccess) {
            $res['is_success'] = $this->isSuccess;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchSubmitCarResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['submit_id'])) {
            $model->submitId = $map['submit_id'];
        }
        if (isset($map['is_success'])) {
            $model->isSuccess = $map['is_success'];
        }

        return $model;
    }
}
