<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTCALLAGENT\Models;

use AlibabaCloud\Tea\Model;

class SendVoiceserviceSinglecallRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 分配的租户id
    /**
     * @var string
     */
    public $tenantId;

    // 分配的业务code
    /**
     * @var string
     */
    public $instanceCode;

    // 分配的主叫号码
    /**
     * @var string
     */
    public $calledShowNumber;

    // 被叫用户号码
    /**
     * @var string
     */
    public $calledNumber;

    // 播报文本内容
    /**
     * @var string
     */
    public $context;

    // 录音字段
    /**
     * @var string
     */
    public $voiceCode;

    // TTS 变量播放时的声音风格。
    /**
     * @var string
     */
    public $ttsStyle;

    // TTS 变量播放的音量。取值范围：0~100，默认值为 50。
    /**
     * @var int
     */
    public $ttsVolume;

    // TTS 变量播放时的声音速度。取值范围：0.5~2，默认值为 1。
    /**
     * @var int
     */
    public $ttsSpeed;

    // 播放次数。取值范围：1~3，默认取值 3。
    /**
     * @var int
     */
    public $playTimes;

    // 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
    // 字符串类型，长度限制为 1~128 个字符。
    /**
     * @var string
     */
    public $outId;
    protected $_name = [
        'authToken'        => 'auth_token',
        'tenantId'         => 'tenant_id',
        'instanceCode'     => 'instance_code',
        'calledShowNumber' => 'called_show_number',
        'calledNumber'     => 'called_number',
        'context'          => 'context',
        'voiceCode'        => 'voice_code',
        'ttsStyle'         => 'tts_style',
        'ttsVolume'        => 'tts_volume',
        'ttsSpeed'         => 'tts_speed',
        'playTimes'        => 'play_times',
        'outId'            => 'out_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('instanceCode', $this->instanceCode, true);
        Model::validateRequired('calledShowNumber', $this->calledShowNumber, true);
        Model::validateRequired('calledNumber', $this->calledNumber, true);
        Model::validateRequired('context', $this->context, true);
        Model::validateRequired('ttsStyle', $this->ttsStyle, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceCode) {
            $res['instance_code'] = $this->instanceCode;
        }
        if (null !== $this->calledShowNumber) {
            $res['called_show_number'] = $this->calledShowNumber;
        }
        if (null !== $this->calledNumber) {
            $res['called_number'] = $this->calledNumber;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }
        if (null !== $this->voiceCode) {
            $res['voice_code'] = $this->voiceCode;
        }
        if (null !== $this->ttsStyle) {
            $res['tts_style'] = $this->ttsStyle;
        }
        if (null !== $this->ttsVolume) {
            $res['tts_volume'] = $this->ttsVolume;
        }
        if (null !== $this->ttsSpeed) {
            $res['tts_speed'] = $this->ttsSpeed;
        }
        if (null !== $this->playTimes) {
            $res['play_times'] = $this->playTimes;
        }
        if (null !== $this->outId) {
            $res['out_id'] = $this->outId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendVoiceserviceSinglecallRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['instance_code'])) {
            $model->instanceCode = $map['instance_code'];
        }
        if (isset($map['called_show_number'])) {
            $model->calledShowNumber = $map['called_show_number'];
        }
        if (isset($map['called_number'])) {
            $model->calledNumber = $map['called_number'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }
        if (isset($map['voice_code'])) {
            $model->voiceCode = $map['voice_code'];
        }
        if (isset($map['tts_style'])) {
            $model->ttsStyle = $map['tts_style'];
        }
        if (isset($map['tts_volume'])) {
            $model->ttsVolume = $map['tts_volume'];
        }
        if (isset($map['tts_speed'])) {
            $model->ttsSpeed = $map['tts_speed'];
        }
        if (isset($map['play_times'])) {
            $model->playTimes = $map['play_times'];
        }
        if (isset($map['out_id'])) {
            $model->outId = $map['out_id'];
        }

        return $model;
    }
}
