<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\LongImageSegment;

class AssistantExtra extends Model {
    protected $_name = [
        'taskId' => 'task_id',
        'renderStatus' => 'render_status',
        'resultUrl' => 'result_url',
        'subImages' => 'sub_images',
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
        if (null !== $this->subImages) {
            $res['sub_images'] = [];
            if(null !== $this->subImages && is_array($this->subImages)){
                $n = 0;
                foreach($this->subImages as $item){
                    $res['sub_images'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if(isset($map['sub_images'])){
            if(!empty($map['sub_images'])){
                $model->subImages = [];
                $n = 0;
                foreach($map['sub_images'] as $item) {
                    $model->subImages[$n++] = null !== $item ? LongImageSegment::fromMap($item) : $item;
                }
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

    // 基金长图子图列表，仅在 return_sub_images 为 true 且长图生成完成时返回。
    /**
     * @example undefined
     * @var LongImageSegment[]
     */
    public $subImages;

}
