<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiModelItem extends Model {
    protected $_name = [
        'modelKey' => 'model_key',
        'supplierId' => 'supplier_id',
        'upstreamModelId' => 'upstream_model_id',
        'displayName' => 'display_name',
        'capabilities' => 'capabilities',
        'isDefault' => 'is_default',
        'status' => 'status',
        'thinkingPolicy' => 'thinking_policy',
        'supportedEfforts' => 'supported_efforts',
        'defaultEffort' => 'default_effort',
        'contextWindow' => 'context_window',
        'maxOutputTokens' => 'max_output_tokens',
    ];
    public function validate() {
        Model::validateRequired('modelKey', $this->modelKey, true);
        Model::validateRequired('supplierId', $this->supplierId, true);
        Model::validateRequired('upstreamModelId', $this->upstreamModelId, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('capabilities', $this->capabilities, true);
        Model::validateRequired('isDefault', $this->isDefault, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('contextWindow', $this->contextWindow, true);
        Model::validateRequired('maxOutputTokens', $this->maxOutputTokens, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->modelKey) {
            $res['model_key'] = $this->modelKey;
        }
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }
        if (null !== $this->upstreamModelId) {
            $res['upstream_model_id'] = $this->upstreamModelId;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->capabilities) {
            $res['capabilities'] = $this->capabilities;
        }
        if (null !== $this->isDefault) {
            $res['is_default'] = $this->isDefault;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->thinkingPolicy) {
            $res['thinking_policy'] = $this->thinkingPolicy;
        }
        if (null !== $this->supportedEfforts) {
            $res['supported_efforts'] = $this->supportedEfforts;
        }
        if (null !== $this->defaultEffort) {
            $res['default_effort'] = $this->defaultEffort;
        }
        if (null !== $this->contextWindow) {
            $res['context_window'] = $this->contextWindow;
        }
        if (null !== $this->maxOutputTokens) {
            $res['max_output_tokens'] = $this->maxOutputTokens;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiModelItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['model_key'])){
            $model->modelKey = $map['model_key'];
        }
        if(isset($map['supplier_id'])){
            $model->supplierId = $map['supplier_id'];
        }
        if(isset($map['upstream_model_id'])){
            $model->upstreamModelId = $map['upstream_model_id'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['capabilities'])){
            if(!empty($map['capabilities'])){
                $model->capabilities = $map['capabilities'];
            }
        }
        if(isset($map['is_default'])){
            $model->isDefault = $map['is_default'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['thinking_policy'])){
            $model->thinkingPolicy = $map['thinking_policy'];
        }
        if(isset($map['supported_efforts'])){
            if(!empty($map['supported_efforts'])){
                $model->supportedEfforts = $map['supported_efforts'];
            }
        }
        if(isset($map['default_effort'])){
            $model->defaultEffort = $map['default_effort'];
        }
        if(isset($map['context_window'])){
            $model->contextWindow = $map['context_window'];
        }
        if(isset($map['max_output_tokens'])){
            $model->maxOutputTokens = $map['max_output_tokens'];
        }
        return $model;
    }
    // 模型目录稳定键（chat model_key 提交该值）
    /**
     * @example dtmaas/deepseek-v4.1-flash
     * @var string
     */
    public $modelKey;

    // 模型供应商
    /**
     * @example dtmaas-default
     * @var string
     */
    public $supplierId;

    // 上游模型标识
    /**
     * @example deepseek-v4.1-flash-1017
     * @var string
     */
    public $upstreamModelId;

    // 展示显示名
    /**
     * @example DeepSeek V4.1 Flash (DTMaaS)
     * @var string
     */
    public $displayName;

    // 能力位列表（TEXT/VISION/OMNI/ASR/TTS/EMBEDDING/IMAGE_GEN/VOICE_CLONE）
    /**
     * @example undefined
     * @var string[]
     */
    public $capabilities;

    // 是否该能力位的平台默认模型
    /**
     * @example false
     * @var bool
     */
    public $isDefault;

    // 启用状态（ACTIVE）
    /**
     * @example ACTIVE
     * @var string
     */
    public $status;

    // 思考策略（受控选项，未声明不输出）
    /**
     * @example OPENAI_REASONING_EFFORT
     * @var string
     */
    public $thinkingPolicy;

    // 支持的思考等级（受控选项，未声明不输出）
    /**
     * @example undefined
     * @var string[]
     */
    public $supportedEfforts;

    // 默认思考等级（受控选项，未声明不输出）
    /**
     * @example low
     * @var string
     */
    public $defaultEffort;

    // 上下文窗口 token 数
    /**
     * @example 1000000
     * @var int
     */
    public $contextWindow;

    // 最大输出 token 数
    /**
     * @example 16384
     * @var int
     */
    public $maxOutputTokens;

}
