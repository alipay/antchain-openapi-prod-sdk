<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

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

    // OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试，PENDING 未知，需要重试
    /**
     * @example OK/INVALID/NO_DEMAND/PENDING
     *
     * @var string
     */
    public $pushResultCode;

    // 失败原因
    /**
     * @example 失败原因
     *
     * @var string
     */
    public $invalidReason;
    protected $_name = [
        'submitId'       => 'submit_id',
        'isSuccess'      => 'is_success',
        'pushResultCode' => 'push_result_code',
        'invalidReason'  => 'invalid_reason',
    ];

    public function validate()
    {
        Model::validateRequired('submitId', $this->submitId, true);
        Model::validateRequired('isSuccess', $this->isSuccess, true);
        Model::validateRequired('pushResultCode', $this->pushResultCode, true);
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
        if (null !== $this->pushResultCode) {
            $res['push_result_code'] = $this->pushResultCode;
        }
        if (null !== $this->invalidReason) {
            $res['invalid_reason'] = $this->invalidReason;
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
        if (isset($map['push_result_code'])) {
            $model->pushResultCode = $map['push_result_code'];
        }
        if (isset($map['invalid_reason'])) {
            $model->invalidReason = $map['invalid_reason'];
        }

        return $model;
    }
}
