<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AskdataJobResult extends Model {
    protected $_name = [
        'jobId' => 'job_id',
        'requestId' => 'request_id',
    ];
    public function validate() {
        Model::validateRequired('jobId', $this->jobId, true);
        Model::validateRequired('requestId', $this->requestId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->jobId) {
            $res['job_id'] = $this->jobId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AskdataJobResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['job_id'])){
            $model->jobId = $map['job_id'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        return $model;
    }
    // 任务ID
    /**
     * @example 97F385D2D8595AA4DC262C72965507
     * @var string
     */
    public $jobId;

    // 唯一标识
    /**
     * @example 97F385D2D8595AA4DC262C72965507
     * @var string
     */
    public $requestId;

}
