<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class CaptionsTask extends Model
{
    // 任务状态
    /**
     * @example success/failed/queuing/processing
     *
     * @var string
     */
    public $state;

    // 字幕对齐结果
    /**
     * @example
     *
     * @var CaptionsResult
     */
    public $result;
    protected $_name = [
        'state'  => 'state',
        'result' => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('result', $this->result, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaptionsTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['result'])) {
            $model->result = CaptionsResult::fromMap($map['result']);
        }

        return $model;
    }
}
