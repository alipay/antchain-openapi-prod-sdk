<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class OutboundPhoneResponseData extends Model
{
    // 通话唯一ID
    /**
     * @example XXX
     *
     * @var string
     */
    public $acid;

    // 是否同步
    /**
     * @example true, false
     *
     * @var bool
     */
    public $asyn;

    // 外呼ID
    /**
     * @example XXX
     *
     * @var string
     */
    public $outcallRequestId;

    // 外呼DB的ID
    /**
     * @example XXX
     *
     * @var string
     */
    public $asynDbId;
    protected $_name = [
        'acid'             => 'acid',
        'asyn'             => 'asyn',
        'outcallRequestId' => 'outcall_request_id',
        'asynDbId'         => 'asyn_db_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->acid) {
            $res['acid'] = $this->acid;
        }
        if (null !== $this->asyn) {
            $res['asyn'] = $this->asyn;
        }
        if (null !== $this->outcallRequestId) {
            $res['outcall_request_id'] = $this->outcallRequestId;
        }
        if (null !== $this->asynDbId) {
            $res['asyn_db_id'] = $this->asynDbId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OutboundPhoneResponseData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['acid'])) {
            $model->acid = $map['acid'];
        }
        if (isset($map['asyn'])) {
            $model->asyn = $map['asyn'];
        }
        if (isset($map['outcall_request_id'])) {
            $model->outcallRequestId = $map['outcall_request_id'];
        }
        if (isset($map['asyn_db_id'])) {
            $model->asynDbId = $map['asyn_db_id'];
        }

        return $model;
    }
}
