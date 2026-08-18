<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\GESAAS\Models\TaskErrorDto;
use AntChain\GESAAS\Models\ContentInfoDto;
use AntChain\GESAAS\Models\TokenUsageDto;
use AntChain\GESAAS\Models\ModelToolDto;

class TaskResultInfoDto extends Model {
    protected $_name = [
        'taskId' => 'task_id',
        'model' => 'model',
        'status' => 'status',
        'error' => 'error',
        'content' => 'content',
        'usage' => 'usage',
        'duration' => 'duration',
        'frames' => 'frames',
        'resolution' => 'resolution',
        'ratio' => 'ratio',
        'seed' => 'seed',
        'framespersecond' => 'framespersecond',
        'generateAudio' => 'generate_audio',
        'serviceTier' => 'service_tier',
        'executionExpiresAfter' => 'execution_expires_after',
        'priority' => 'priority',
        'safetyIdentifier' => 'safety_identifier',
        'createdAt' => 'created_at',
        'updatedAt' => 'updated_at',
        'tools' => 'tools',
    ];
    public function validate() {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('framespersecond', $this->framespersecond, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->error) {
            $res['error'] = null !== $this->error ? $this->error->toMap() : null;
        }
        if (null !== $this->content) {
            $res['content'] = null !== $this->content ? $this->content->toMap() : null;
        }
        if (null !== $this->usage) {
            $res['usage'] = null !== $this->usage ? $this->usage->toMap() : null;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->frames) {
            $res['frames'] = $this->frames;
        }
        if (null !== $this->resolution) {
            $res['resolution'] = $this->resolution;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->seed) {
            $res['seed'] = $this->seed;
        }
        if (null !== $this->framespersecond) {
            $res['framespersecond'] = $this->framespersecond;
        }
        if (null !== $this->generateAudio) {
            $res['generate_audio'] = $this->generateAudio;
        }
        if (null !== $this->serviceTier) {
            $res['service_tier'] = $this->serviceTier;
        }
        if (null !== $this->executionExpiresAfter) {
            $res['execution_expires_after'] = $this->executionExpiresAfter;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->safetyIdentifier) {
            $res['safety_identifier'] = $this->safetyIdentifier;
        }
        if (null !== $this->createdAt) {
            $res['created_at'] = $this->createdAt;
        }
        if (null !== $this->updatedAt) {
            $res['updated_at'] = $this->updatedAt;
        }
        if (null !== $this->tools) {
            $res['tools'] = [];
            if(null !== $this->tools && is_array($this->tools)){
                $n = 0;
                foreach($this->tools as $item){
                    $res['tools'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TaskResultInfoDto
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['error'])){
            $model->error = TaskErrorDto::fromMap($map['error']);
        }
        if(isset($map['content'])){
            $model->content = ContentInfoDto::fromMap($map['content']);
        }
        if(isset($map['usage'])){
            $model->usage = TokenUsageDto::fromMap($map['usage']);
        }
        if(isset($map['duration'])){
            $model->duration = $map['duration'];
        }
        if(isset($map['frames'])){
            $model->frames = $map['frames'];
        }
        if(isset($map['resolution'])){
            $model->resolution = $map['resolution'];
        }
        if(isset($map['ratio'])){
            $model->ratio = $map['ratio'];
        }
        if(isset($map['seed'])){
            $model->seed = $map['seed'];
        }
        if(isset($map['framespersecond'])){
            $model->framespersecond = $map['framespersecond'];
        }
        if(isset($map['generate_audio'])){
            $model->generateAudio = $map['generate_audio'];
        }
        if(isset($map['service_tier'])){
            $model->serviceTier = $map['service_tier'];
        }
        if(isset($map['execution_expires_after'])){
            $model->executionExpiresAfter = $map['execution_expires_after'];
        }
        if(isset($map['priority'])){
            $model->priority = $map['priority'];
        }
        if(isset($map['safety_identifier'])){
            $model->safetyIdentifier = $map['safety_identifier'];
        }
        if(isset($map['created_at'])){
            $model->createdAt = $map['created_at'];
        }
        if(isset($map['updated_at'])){
            $model->updatedAt = $map['updated_at'];
        }
        if(isset($map['tools'])){
            if(!empty($map['tools'])){
                $model->tools = [];
                $n = 0;
                foreach($map['tools'] as $item) {
                    $model->tools[$n++] = null !== $item ? ModelToolDto::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 任务ID
    /**
     * @example 1798234932684395
     * @var string
     */
    public $taskId;

    // 模型名称与版本
    // 格式为 模型名称-版本
    /**
     * @example doubao-seedance-2-0-260128
     * @var string
     */
    public $model;

    // 任务状态
    // + creating: 任务创建中
    // + queued：排队中
    // + running：任务运行中
    // + cancelled：取消任务，取消状态 24h 自动删除（只支持排队中状态的任务被取消）
    // + succeeded：任务成功
    // + failed：任务失败
    // + expired：任务超时
    /**
     * @example creating
     * @var string
     */
    public $status;

    // 错误信息（任务失败时返回错误数据）
    /**
     * @example undefined
     * @var TaskErrorDto
     */
    public $error;

    // 输出内容
    /**
     * @example undefined
     * @var ContentInfoDto
     */
    public $content;

    // token 用量
    /**
     * @example undefined
     * @var TokenUsageDto
     */
    public $usage;

    // 视频时长（秒）
    /**
     * @example 1
     * @var int
     */
    public $duration;

    // 视频帧数
    // 说明： duration 和 frames 参数只会返回一个 。
    /**
     * @example 323
     * @var int
     */
    public $frames;

    // 分辨率
    /**
     * @example 4k
     * @var string
     */
    public $resolution;

    // 宽高比
    /**
     * @example 4:3
     * @var string
     */
    public $ratio;

    // 随机种子
    /**
     * @example 233
     * @var int
     */
    public $seed;

    // 视频帧率
    /**
     * @example 321
     * @var int
     */
    public $framespersecond;

    // 是否生成同步音频
    /**
     * @example false
     * @var bool
     */
    public $generateAudio;

    // 服务等级
    /**
     * @example default
     * @var string
     */
    public $serviceTier;

    // 任务超时阈值（秒）
    /**
     * @example 23543
     * @var int
     */
    public $executionExpiresAfter;

    // 执行优先级
    /**
     * @example 1
     * @var int
     */
    public $priority;

    // 终端用户标识
    /**
     * @example tools
     * @var string
     */
    public $safetyIdentifier;

    // 任务实际创建时间 格式 yyyy-MM-dd HH:mm:ss
    /**
     * @example 2026-06-10 10:09:01
     * @var string
     */
    public $createdAt;

    // 更新时间  格式 yyyy-MM-dd HH:mm:ss
    /**
     * @example 2026-06-10 10:09:01
     * @var string
     */
    public $updatedAt;

    // 实际使用的工具
    /**
     * @example undefined
     * @var ModelToolDto[]
     */
    public $tools;

}
