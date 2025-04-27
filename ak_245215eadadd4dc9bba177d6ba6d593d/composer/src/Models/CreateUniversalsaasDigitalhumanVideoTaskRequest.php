<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class CreateUniversalsaasDigitalhumanVideoTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 画布大小
    /**
     * @var int
     */
    public $height;

    // 数字人id
    /**
     * @var string
     */
    public $avatarId;

    // text/audio, 合成驱动--文本/音频
    /**
     * @var string
     */
    public $driverType;

    // 形象设置
    /**
     * @var ProfileInfo
     */
    public $profileInfo;

    // 话术脚本语音配置
    /**
     * @var ScriptVoiceConfig
     */
    public $scriptVoiceConfig;

    // 是否开启字幕
    /**
     * @var bool
     */
    public $openCaptions;

    // 字幕配置
    /**
     * @var CaptionsInfo
     */
    public $captionsInfo;

    // 是否替换字幕敏感词
    /**
     * @var bool
     */
    public $replaceSensitive;

    // 背景信息
    /**
     * @var Background
     */
    public $background;

    // 贴片元素信息
    /**
     * @var Paster[]
     */
    public $pasters;

    // 数字人视频生成格式，默认不填
    /**
     * @var string
     */
    public $videoFormat;

    // 画布大小
    /**
     * @var int
     */
    public $width;

    // 是否返回字幕时间戳，但不合成到视频画面里面
    /**
     * @var bool
     */
    public $returnCaptions;

    // 多场景--话术语音配置列表
    /**
     * @var ScriptVoiceConfig[]
     */
    public $scriptVoiceConfigList;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'height'                => 'height',
        'avatarId'              => 'avatar_id',
        'driverType'            => 'driver_type',
        'profileInfo'           => 'profile_info',
        'scriptVoiceConfig'     => 'script_voice_config',
        'openCaptions'          => 'open_captions',
        'captionsInfo'          => 'captions_info',
        'replaceSensitive'      => 'replace_sensitive',
        'background'            => 'background',
        'pasters'               => 'pasters',
        'videoFormat'           => 'video_format',
        'width'                 => 'width',
        'returnCaptions'        => 'return_captions',
        'scriptVoiceConfigList' => 'script_voice_config_list',
    ];

    public function validate()
    {
        Model::validateRequired('avatarId', $this->avatarId, true);
        Model::validateRequired('openCaptions', $this->openCaptions, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->avatarId) {
            $res['avatar_id'] = $this->avatarId;
        }
        if (null !== $this->driverType) {
            $res['driver_type'] = $this->driverType;
        }
        if (null !== $this->profileInfo) {
            $res['profile_info'] = null !== $this->profileInfo ? $this->profileInfo->toMap() : null;
        }
        if (null !== $this->scriptVoiceConfig) {
            $res['script_voice_config'] = null !== $this->scriptVoiceConfig ? $this->scriptVoiceConfig->toMap() : null;
        }
        if (null !== $this->openCaptions) {
            $res['open_captions'] = $this->openCaptions;
        }
        if (null !== $this->captionsInfo) {
            $res['captions_info'] = null !== $this->captionsInfo ? $this->captionsInfo->toMap() : null;
        }
        if (null !== $this->replaceSensitive) {
            $res['replace_sensitive'] = $this->replaceSensitive;
        }
        if (null !== $this->background) {
            $res['background'] = null !== $this->background ? $this->background->toMap() : null;
        }
        if (null !== $this->pasters) {
            $res['pasters'] = [];
            if (null !== $this->pasters && \is_array($this->pasters)) {
                $n = 0;
                foreach ($this->pasters as $item) {
                    $res['pasters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->videoFormat) {
            $res['video_format'] = $this->videoFormat;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->returnCaptions) {
            $res['return_captions'] = $this->returnCaptions;
        }
        if (null !== $this->scriptVoiceConfigList) {
            $res['script_voice_config_list'] = [];
            if (null !== $this->scriptVoiceConfigList && \is_array($this->scriptVoiceConfigList)) {
                $n = 0;
                foreach ($this->scriptVoiceConfigList as $item) {
                    $res['script_voice_config_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUniversalsaasDigitalhumanVideoTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['avatar_id'])) {
            $model->avatarId = $map['avatar_id'];
        }
        if (isset($map['driver_type'])) {
            $model->driverType = $map['driver_type'];
        }
        if (isset($map['profile_info'])) {
            $model->profileInfo = ProfileInfo::fromMap($map['profile_info']);
        }
        if (isset($map['script_voice_config'])) {
            $model->scriptVoiceConfig = ScriptVoiceConfig::fromMap($map['script_voice_config']);
        }
        if (isset($map['open_captions'])) {
            $model->openCaptions = $map['open_captions'];
        }
        if (isset($map['captions_info'])) {
            $model->captionsInfo = CaptionsInfo::fromMap($map['captions_info']);
        }
        if (isset($map['replace_sensitive'])) {
            $model->replaceSensitive = $map['replace_sensitive'];
        }
        if (isset($map['background'])) {
            $model->background = Background::fromMap($map['background']);
        }
        if (isset($map['pasters'])) {
            if (!empty($map['pasters'])) {
                $model->pasters = [];
                $n              = 0;
                foreach ($map['pasters'] as $item) {
                    $model->pasters[$n++] = null !== $item ? Paster::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['video_format'])) {
            $model->videoFormat = $map['video_format'];
        }
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }
        if (isset($map['return_captions'])) {
            $model->returnCaptions = $map['return_captions'];
        }
        if (isset($map['script_voice_config_list'])) {
            if (!empty($map['script_voice_config_list'])) {
                $model->scriptVoiceConfigList = [];
                $n                            = 0;
                foreach ($map['script_voice_config_list'] as $item) {
                    $model->scriptVoiceConfigList[$n++] = null !== $item ? ScriptVoiceConfig::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
