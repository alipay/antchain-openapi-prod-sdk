<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class AgentModelParams extends Model
{
    // 模型类型 AgentModelTypeEnum - DECISION: 决策模型 - GENERATE: 生成模型 - E2E: 端到端模型 - RAG: 检索生成模型
    //
    /**
     * @example GENERATE
     *
     * @var string
     */
    public $type;

    // 模型版本 {model}/{version}#{adapter}
    //
    /**
     * @example "gpt-3.5-turbo"
     *
     * @var string
     */
    public $model;

    // 生成策略预设配置 AgentModelPresetEnum - FLEXIBLE: 灵活 - NORMAL: 正常 - STRICT: 严格
    //
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $presetIndex;

    // temperature 浮点类型
    //
    /**
     * @example 0.1
     *
     * @var string
     */
    public $temperature;

    // top_k
    /**
     * @example
     *
     * @var int
     */
    public $topK;

    // top_p 浮点类型
    /**
     * @example 0.1
     *
     * @var string
     */
    public $topP;

    // doSample
    /**
     * @example true, false
     *
     * @var bool
     */
    public $doSample;

    // beam_width
    /**
     * @example
     *
     * @var int
     */
    public $beamWidth;

    // 最大输出长度
    //
    /**
     * @example 2048
     *
     * @var int
     */
    public $maxOutToken;

    // 是否为支持 function call 的模型
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $functionCall;

    // 自定义推理服务url
    //
    /**
     * @example "http://..."
     *
     * @var string
     */
    public $customUrl;

    // 是否平台官方模型
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $bailingOfficial;
    protected $_name = [
        'type'            => 'type',
        'model'           => 'model',
        'presetIndex'     => 'preset_index',
        'temperature'     => 'temperature',
        'topK'            => 'top_k',
        'topP'            => 'top_p',
        'doSample'        => 'do_sample',
        'beamWidth'       => 'beam_width',
        'maxOutToken'     => 'max_out_token',
        'functionCall'    => 'function_call',
        'customUrl'       => 'custom_url',
        'bailingOfficial' => 'bailing_official',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('presetIndex', $this->presetIndex, true);
        Model::validateRequired('temperature', $this->temperature, true);
        Model::validateRequired('topK', $this->topK, true);
        Model::validateRequired('topP', $this->topP, true);
        Model::validateRequired('doSample', $this->doSample, true);
        Model::validateRequired('beamWidth', $this->beamWidth, true);
        Model::validateRequired('maxOutToken', $this->maxOutToken, true);
        Model::validateRequired('functionCall', $this->functionCall, true);
        Model::validateRequired('customUrl', $this->customUrl, true);
        Model::validateRequired('bailingOfficial', $this->bailingOfficial, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->presetIndex) {
            $res['preset_index'] = $this->presetIndex;
        }
        if (null !== $this->temperature) {
            $res['temperature'] = $this->temperature;
        }
        if (null !== $this->topK) {
            $res['top_k'] = $this->topK;
        }
        if (null !== $this->topP) {
            $res['top_p'] = $this->topP;
        }
        if (null !== $this->doSample) {
            $res['do_sample'] = $this->doSample;
        }
        if (null !== $this->beamWidth) {
            $res['beam_width'] = $this->beamWidth;
        }
        if (null !== $this->maxOutToken) {
            $res['max_out_token'] = $this->maxOutToken;
        }
        if (null !== $this->functionCall) {
            $res['function_call'] = $this->functionCall;
        }
        if (null !== $this->customUrl) {
            $res['custom_url'] = $this->customUrl;
        }
        if (null !== $this->bailingOfficial) {
            $res['bailing_official'] = $this->bailingOfficial;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentModelParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['model'])) {
            $model->model = $map['model'];
        }
        if (isset($map['preset_index'])) {
            $model->presetIndex = $map['preset_index'];
        }
        if (isset($map['temperature'])) {
            $model->temperature = $map['temperature'];
        }
        if (isset($map['top_k'])) {
            $model->topK = $map['top_k'];
        }
        if (isset($map['top_p'])) {
            $model->topP = $map['top_p'];
        }
        if (isset($map['do_sample'])) {
            $model->doSample = $map['do_sample'];
        }
        if (isset($map['beam_width'])) {
            $model->beamWidth = $map['beam_width'];
        }
        if (isset($map['max_out_token'])) {
            $model->maxOutToken = $map['max_out_token'];
        }
        if (isset($map['function_call'])) {
            $model->functionCall = $map['function_call'];
        }
        if (isset($map['custom_url'])) {
            $model->customUrl = $map['custom_url'];
        }
        if (isset($map['bailing_official'])) {
            $model->bailingOfficial = $map['bailing_official'];
        }

        return $model;
    }
}
