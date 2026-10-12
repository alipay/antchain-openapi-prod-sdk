<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class ExtraInfo extends Model {
    protected $_name = [
        'originalTaskId' => 'original_task_id',
        'originalVideoUrl' => 'original_video_url',
        'originalResponseSnapshot' => 'original_response_snapshot',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->originalTaskId) {
            $res['original_task_id'] = $this->originalTaskId;
        }
        if (null !== $this->originalVideoUrl) {
            $res['original_video_url'] = $this->originalVideoUrl;
        }
        if (null !== $this->originalResponseSnapshot) {
            $res['original_response_snapshot'] = $this->originalResponseSnapshot;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExtraInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['original_task_id'])){
            $model->originalTaskId = $map['original_task_id'];
        }
        if(isset($map['original_video_url'])){
            $model->originalVideoUrl = $map['original_video_url'];
        }
        if(isset($map['original_response_snapshot'])){
            $model->originalResponseSnapshot = $map['original_response_snapshot'];
        }
        return $model;
    }
    // 原厂任务ID
    /**
     * @example xxx-xxx-xxx
     * @var string
     */
    public $originalTaskId;

    // 原厂视频输出URL
    /**
     * @example https://xxx
     * @var string
     */
    public $originalVideoUrl;

    // 原厂响应体快照
    /**
     * @example "{"task_id":"csg-xxx-xx"...}"
     * @var string
     */
    public $originalResponseSnapshot;

}
