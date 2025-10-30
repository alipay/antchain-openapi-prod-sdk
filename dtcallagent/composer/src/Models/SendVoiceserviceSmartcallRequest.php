<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTCALLAGENT\Models;

use AlibabaCloud\Tea\Model;

class SendVoiceserviceSmartcallRequest extends Model
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

    // code
    /**
     * @var string
     */
    public $voiceCode;

    // 停顿时长。用于设置用户停顿多久表示一句话结束。单位：毫秒，取值范围：300~1200。默认800。非特殊情况不建议调整
    /**
     * @var int
     */
    public $pauseTime;

    // 静音时长。用于设置用户多久不说话通话结束。单位：毫秒，取值范围：1000~20000。默认 10000
    /**
     * @var int
     */
    public $muteTime;

    // 当前返回的媒体文件是否可以被打断。默认取值为 true，即可被打断。
    // 如果为 false，即使下一个动作 action_break 为 true，也无法打断当前放音。
    /**
     * @var bool
     */
    public $actionCodeBreak;

    // 基于用户持续说话时长打断。单位：毫秒。
    // 如果当前媒体文件 ActionCodeBreak 为 true，用户持续说话可以打断当前播放。不设置或者为 0，不生效。
    /**
     * @var int
     */
    public $actionCodeTimeBreak;

    // 最大通话时长，超时后自动挂断。单位：秒。
    /**
     * @var int
     */
    public $sessionTimeout;

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

    // 用户和机器人对话时播放的背景语音文件 ID。
    /**
     * @var string
     */
    public $backgroundFileCode;

    // 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
    // 字符串类型，长度限制为 1~128 个字符。
    /**
     * @var string
     */
    public $outId;

    // 预留给调用方使用的动态扩展 ID。在回调地址中带回，用于客户的开发标识。
    /**
     * @var string
     */
    public $dynamicId;

    // 是否在后处理中执行 ITN。默认为 false，即不执行。
    // 设置为 true 时，中文数字将转为阿拉伯数字输出。
    /**
     * @var bool
     */
    public $enableITN;
    protected $_name = [
        'authToken'           => 'auth_token',
        'tenantId'            => 'tenant_id',
        'instanceCode'        => 'instance_code',
        'calledShowNumber'    => 'called_show_number',
        'calledNumber'        => 'called_number',
        'context'             => 'context',
        'voiceCode'           => 'voice_code',
        'pauseTime'           => 'pause_time',
        'muteTime'            => 'mute_time',
        'actionCodeBreak'     => 'action_code_break',
        'actionCodeTimeBreak' => 'action_code_time_break',
        'sessionTimeout'      => 'session_timeout',
        'ttsStyle'            => 'tts_style',
        'ttsVolume'           => 'tts_volume',
        'ttsSpeed'            => 'tts_speed',
        'backgroundFileCode'  => 'background_file_code',
        'outId'               => 'out_id',
        'dynamicId'           => 'dynamic_id',
        'enableITN'           => 'enable_i_t_n',
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
        if (null !== $this->pauseTime) {
            $res['pause_time'] = $this->pauseTime;
        }
        if (null !== $this->muteTime) {
            $res['mute_time'] = $this->muteTime;
        }
        if (null !== $this->actionCodeBreak) {
            $res['action_code_break'] = $this->actionCodeBreak;
        }
        if (null !== $this->actionCodeTimeBreak) {
            $res['action_code_time_break'] = $this->actionCodeTimeBreak;
        }
        if (null !== $this->sessionTimeout) {
            $res['session_timeout'] = $this->sessionTimeout;
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
        if (null !== $this->backgroundFileCode) {
            $res['background_file_code'] = $this->backgroundFileCode;
        }
        if (null !== $this->outId) {
            $res['out_id'] = $this->outId;
        }
        if (null !== $this->dynamicId) {
            $res['dynamic_id'] = $this->dynamicId;
        }
        if (null !== $this->enableITN) {
            $res['enable_i_t_n'] = $this->enableITN;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendVoiceserviceSmartcallRequest
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
        if (isset($map['pause_time'])) {
            $model->pauseTime = $map['pause_time'];
        }
        if (isset($map['mute_time'])) {
            $model->muteTime = $map['mute_time'];
        }
        if (isset($map['action_code_break'])) {
            $model->actionCodeBreak = $map['action_code_break'];
        }
        if (isset($map['action_code_time_break'])) {
            $model->actionCodeTimeBreak = $map['action_code_time_break'];
        }
        if (isset($map['session_timeout'])) {
            $model->sessionTimeout = $map['session_timeout'];
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
        if (isset($map['background_file_code'])) {
            $model->backgroundFileCode = $map['background_file_code'];
        }
        if (isset($map['out_id'])) {
            $model->outId = $map['out_id'];
        }
        if (isset($map['dynamic_id'])) {
            $model->dynamicId = $map['dynamic_id'];
        }
        if (isset($map['enable_i_t_n'])) {
            $model->enableITN = $map['enable_i_t_n'];
        }

        return $model;
    }
}
