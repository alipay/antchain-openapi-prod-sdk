<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\VideoUrl;
use AntChain\CREATIVE\Models\VideoUsage;
use AntChain\CREATIVE\Models\Error;

class QueryMaasVideoResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'taskId' => 'task_id',
        'status' => 'status',
        'model' => 'model',
        'createdAt' => 'created_at',
        'updatedAt' => 'updated_at',
        'content' => 'content',
        'duration' => 'duration',
        'ratio' => 'ratio',
        'resolution' => 'resolution',
        'generateAudio' => 'generate_audio',
        'usage' => 'usage',
        'extraInfo' => 'extra_info',
        'error' => 'error',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->createdAt) {
            $res['created_at'] = $this->createdAt;
        }
        if (null !== $this->updatedAt) {
            $res['updated_at'] = $this->updatedAt;
        }
        if (null !== $this->content) {
            $res['content'] = null !== $this->content ? $this->content->toMap() : null;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->resolution) {
            $res['resolution'] = $this->resolution;
        }
        if (null !== $this->generateAudio) {
            $res['generate_audio'] = $this->generateAudio;
        }
        if (null !== $this->usage) {
            $res['usage'] = [];
            if(null !== $this->usage && is_array($this->usage)){
                $n = 0;
                foreach($this->usage as $item){
                    $res['usage'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->error) {
            $res['error'] = null !== $this->error ? $this->error->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMaasVideoResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['created_at'])){
            $model->createdAt = $map['created_at'];
        }
        if(isset($map['updated_at'])){
            $model->updatedAt = $map['updated_at'];
        }
        if(isset($map['content'])){
            $model->content = VideoUrl::fromMap($map['content']);
        }
        if(isset($map['duration'])){
            $model->duration = $map['duration'];
        }
        if(isset($map['ratio'])){
            $model->ratio = $map['ratio'];
        }
        if(isset($map['resolution'])){
            $model->resolution = $map['resolution'];
        }
        if(isset($map['generate_audio'])){
            $model->generateAudio = $map['generate_audio'];
        }
        if(isset($map['usage'])){
            if(!empty($map['usage'])){
                $model->usage = [];
                $n = 0;
                foreach($map['usage'] as $item) {
                    $model->usage[$n++] = null !== $item ? VideoUsage::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['error'])){
            $model->error = Error::fromMap($map['error']);
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 视频任务 ID
    /**
     * @var string
     */
    public $taskId;

    // 任务状态
    /**
     * @var string
     */
    public $status;

    // 实际使用的模型
    /**
     * @var string
     */
    public $model;

    // 创建时间，Unix 秒级时间戳
    /**
     * @var string
     */
    public $createdAt;

    // 更新时间，Unix 秒级时间戳
    /**
     * @var string
     */
    public $updatedAt;

    // 视频 URL（成功时返回）
    /**
     * @var VideoUrl
     */
    public $content;

    // 视频时长（秒
    /**
     * @var string
     */
    public $duration;

    // 宽高比
    /**
     * @var string
     */
    public $ratio;

    // 分辨率
    /**
     * @var string
     */
    public $resolution;

    // 是否生成音轨
    /**
     * @var bool
     */
    public $generateAudio;

    // 用量数组
    /**
     * @var VideoUsage[]
     */
    public $usage;

    // 非标准化补充信息，JSON 字符串
    /**
     * @var string
     */
    public $extraInfo;

    // 失败时返回
    /**
     * @var Error
     */
    public $error;

}
