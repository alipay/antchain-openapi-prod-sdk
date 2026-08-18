<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\GESAAS\Models\MaterialContentDto;
use AntChain\GESAAS\Models\ModelToolDto;

class SaveOmngGenerationtaskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taskId' => 'task_id',
        'model' => 'model',
        'materialContentDto' => 'material_content_dto',
        'generateAudio' => 'generate_audio',
        'ratio' => 'ratio',
        'duration' => 'duration',
        'resolution' => 'resolution',
        'outputFormat' => 'output_format',
        'watermark' => 'watermark',
        'seed' => 'seed',
        'returnLastFrame' => 'return_last_frame',
        'tools' => 'tools',
        'serviceTier' => 'service_tier',
        'executionExpiresAfter' => 'execution_expires_after',
        'safetyIdentifier' => 'safety_identifier',
        'priority' => 'priority',
    ];
    public function validate() {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('materialContentDto', $this->materialContentDto, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->materialContentDto) {
            $res['material_content_dto'] = null !== $this->materialContentDto ? $this->materialContentDto->toMap() : null;
        }
        if (null !== $this->generateAudio) {
            $res['generate_audio'] = $this->generateAudio;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->resolution) {
            $res['resolution'] = $this->resolution;
        }
        if (null !== $this->outputFormat) {
            $res['output_format'] = $this->outputFormat;
        }
        if (null !== $this->watermark) {
            $res['watermark'] = $this->watermark;
        }
        if (null !== $this->seed) {
            $res['seed'] = $this->seed;
        }
        if (null !== $this->returnLastFrame) {
            $res['return_last_frame'] = $this->returnLastFrame;
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
        if (null !== $this->serviceTier) {
            $res['service_tier'] = $this->serviceTier;
        }
        if (null !== $this->executionExpiresAfter) {
            $res['execution_expires_after'] = $this->executionExpiresAfter;
        }
        if (null !== $this->safetyIdentifier) {
            $res['safety_identifier'] = $this->safetyIdentifier;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveOmngGenerationtaskRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['material_content_dto'])){
            $model->materialContentDto = MaterialContentDto::fromMap($map['material_content_dto']);
        }
        if(isset($map['generate_audio'])){
            $model->generateAudio = $map['generate_audio'];
        }
        if(isset($map['ratio'])){
            $model->ratio = $map['ratio'];
        }
        if(isset($map['duration'])){
            $model->duration = $map['duration'];
        }
        if(isset($map['resolution'])){
            $model->resolution = $map['resolution'];
        }
        if(isset($map['output_format'])){
            $model->outputFormat = $map['output_format'];
        }
        if(isset($map['watermark'])){
            $model->watermark = $map['watermark'];
        }
        if(isset($map['seed'])){
            $model->seed = $map['seed'];
        }
        if(isset($map['return_last_frame'])){
            $model->returnLastFrame = $map['return_last_frame'];
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
        if(isset($map['service_tier'])){
            $model->serviceTier = $map['service_tier'];
        }
        if(isset($map['execution_expires_after'])){
            $model->executionExpiresAfter = $map['execution_expires_after'];
        }
        if(isset($map['safety_identifier'])){
            $model->safetyIdentifier = $map['safety_identifier'];
        }
        if(isset($map['priority'])){
            $model->priority = $map['priority'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 任务ID、幂等处理
    /**
     * @var string
     */
    public $taskId;

    // 模型ID
    /**
     * @var string
     */
    public $model;

    // 素材内容
    /**
     * @var MaterialContentDto
     */
    public $materialContentDto;

    // 生成有声视频
    /**
     * @var bool
     */
    public $generateAudio;

    // 视频宽高比
    // 枚举值：16:9、4:3、1:1、3:4、9:16、21:9、adaptive
    /**
     * @var string
     */
    public $ratio;

    // 生成视频时长（单位：秒）。设置为 -1 时，实际生成视频的时长可通过 **视频生成任务查询接口 **返回的 duration 字段获取。视频时长与计费相关，请谨慎设置。
    // 目前最大值 仅支持 30、最小值-1。
    /**
     * @var int
     */
    public $duration;

    // 视频分辨率 可选值：480p、720p、1080p、4k
    /**
     * @var string
     */
    public $resolution;

    // 输出格式 枚举值:mp4、mov
    // 默认值：mp4
    /**
     * @var string
     */
    public $outputFormat;

    // 视频水印
    // 默认值：false
    // true：生成视频右下角会展示 AI 生成 水印。
    /**
     * @var bool
     */
    public $watermark;

    // 种子整数，用于控制生成内容的随机性
    /**
     * @var int
     */
    public $seed;

    // 返回尾帧 默认值 false
    // false/true
    /**
     * @var bool
     */
    public $returnLastFrame;

    // 配置模型要调用的工具
    /**
     * @var ModelToolDto[]
     */
    public $tools;

    // 指定处理本次请求的服务等级类型 默认值 default
    // + default：在线推理模式
    // + flex：离线推理模式
    /**
     * @var string
     */
    public $serviceTier;

    // 默认值 172800 秒 （48小时）
    // 3600 <=取值限制<= 259200
    /**
     * @var int
     */
    public $executionExpiresAfter;

    // 终端用户的唯一标识符
    /**
     * @var string
     */
    public $safetyIdentifier;

    // 执行优先级 默认值 0
    // 数值越大，优先级越高。
    /**
     * @var int
     */
    public $priority;

}
