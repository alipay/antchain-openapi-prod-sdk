<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class AssistantExtra extends Model {
    protected $_name = [
        'taskId' => 'task_id',
        'renderStatus' => 'render_status',
        'resultUrl' => 'result_url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->renderStatus) {
            $res['render_status'] = $this->renderStatus;
        }
        if (null !== $this->resultUrl) {
            $res['result_url'] = $this->resultUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AssistantExtra
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['render_status'])){
            $model->renderStatus = $map['render_status'];
        }
        if(isset($map['result_url'])){
            if(!empty($map['result_url'])){
                $model->resultUrl = $map['result_url'];
            }
        }
        return $model;
    }
    // 任务id
    /**
     * @example M_d3f7859e845a4ed58bedc446fec32427
     * @var string
     */
    public $taskId;

    // 生图状态
    /**
     * @example PROCESSING
     * @var string
     */
    public $renderStatus;

    // 生图结果
    /**
     * @example undefined
     * @var string[]
     */
    public $resultUrl;

}
