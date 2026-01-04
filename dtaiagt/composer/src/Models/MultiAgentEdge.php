<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class MultiAgentEdge extends Model
{
    // edge 指向的下个agent instance id
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $nextInstanceId;

    // 跳到next agent的prompt
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $prompt;
    protected $_name = [
        'nextInstanceId' => 'next_instance_id',
        'prompt'         => 'prompt',
    ];

    public function validate()
    {
        Model::validateRequired('nextInstanceId', $this->nextInstanceId, true);
        Model::validateRequired('prompt', $this->prompt, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nextInstanceId) {
            $res['next_instance_id'] = $this->nextInstanceId;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MultiAgentEdge
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['next_instance_id'])) {
            $model->nextInstanceId = $map['next_instance_id'];
        }
        if (isset($map['prompt'])) {
            $model->prompt = $map['prompt'];
        }

        return $model;
    }
}
