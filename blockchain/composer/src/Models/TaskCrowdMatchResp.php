<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TaskCrowdMatchResp extends Model
{
    // 任务ID
    /**
     * @example NQYwDb1w5
     *
     * @var string
     */
    public $taskId;

    // 人群匹配结果
    /**
     * @example
     *
     * @var CrowdMatchResult
     */
    public $crowdMatchResult;
    protected $_name = [
        'taskId'           => 'task_id',
        'crowdMatchResult' => 'crowd_match_result',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('crowdMatchResult', $this->crowdMatchResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->crowdMatchResult) {
            $res['crowd_match_result'] = null !== $this->crowdMatchResult ? $this->crowdMatchResult->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskCrowdMatchResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['crowd_match_result'])) {
            $model->crowdMatchResult = CrowdMatchResult::fromMap($map['crowd_match_result']);
        }

        return $model;
    }
}
