<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AiPanelPushResponse extends Model {
    protected $_name = [
        'accepted' => 'accepted',
        'taskId' => 'task_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->accepted) {
            $res['accepted'] = $this->accepted;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AiPanelPushResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['accepted'])){
            $model->accepted = $map['accepted'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        return $model;
    }
    // 是否已成功进入设备下发链路
    /**
     * @example true
     * @var bool
     */
    public $accepted;

    // 任务标识，与请求消息标识一致
    /**
     * @example ac1002c017876357242061390225
     * @var string
     */
    public $taskId;

}
