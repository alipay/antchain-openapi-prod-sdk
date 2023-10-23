<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ANTVERSE\Models;

use AlibabaCloud\Tea\Model;

class SubmitAvatarVideoRequest extends Model
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

    // 视频名称
    /**
     * @var string
     */
    public $name;

    // 数字人id
    /**
     * @var string
     */
    public $avatarId;

    // 说话人code
    /**
     * @var string
     */
    public $speakerCode;

    // 播报文本（一千字以内），支持SSML
    /**
     * @var string
     */
    public $text;

    // 音量（0~100，默认50）
    /**
     * @var int
     */
    public $volume;

    // 语速（-50~50，默认 0）
    /**
     * @var int
     */
    public $speed;

    // 音调（-50~50，默认 0）
    /**
     * @var int
     */
    public $tone;

    // 背景图片Url，需要公网可访问
    /**
     * @var string
     */
    public $backgroundUrl;

    // 分辨率，暂只支持1080
    /**
     * @var string
     */
    public $resolution;

    // 画布比例，16:9/9:16
    /**
     * @var string
     */
    public $radio;

    // 数字人位置大小信息，以左上角为起始坐标，向右向下为正值
    /**
     * @var PositionSizeInfo
     */
    public $humanConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'avatarId'          => 'avatar_id',
        'speakerCode'       => 'speaker_code',
        'text'              => 'text',
        'volume'            => 'volume',
        'speed'             => 'speed',
        'tone'              => 'tone',
        'backgroundUrl'     => 'background_url',
        'resolution'        => 'resolution',
        'radio'             => 'radio',
        'humanConfig'       => 'human_config',
    ];

    public function validate()
    {
        Model::validateRequired('avatarId', $this->avatarId, true);
        Model::validateRequired('speakerCode', $this->speakerCode, true);
        Model::validateRequired('text', $this->text, true);
        Model::validateRequired('backgroundUrl', $this->backgroundUrl, true);
        Model::validateRequired('resolution', $this->resolution, true);
        Model::validateRequired('radio', $this->radio, true);
        Model::validateRequired('humanConfig', $this->humanConfig, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->avatarId) {
            $res['avatar_id'] = $this->avatarId;
        }
        if (null !== $this->speakerCode) {
            $res['speaker_code'] = $this->speakerCode;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->volume) {
            $res['volume'] = $this->volume;
        }
        if (null !== $this->speed) {
            $res['speed'] = $this->speed;
        }
        if (null !== $this->tone) {
            $res['tone'] = $this->tone;
        }
        if (null !== $this->backgroundUrl) {
            $res['background_url'] = $this->backgroundUrl;
        }
        if (null !== $this->resolution) {
            $res['resolution'] = $this->resolution;
        }
        if (null !== $this->radio) {
            $res['radio'] = $this->radio;
        }
        if (null !== $this->humanConfig) {
            $res['human_config'] = null !== $this->humanConfig ? $this->humanConfig->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAvatarVideoRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['avatar_id'])) {
            $model->avatarId = $map['avatar_id'];
        }
        if (isset($map['speaker_code'])) {
            $model->speakerCode = $map['speaker_code'];
        }
        if (isset($map['text'])) {
            $model->text = $map['text'];
        }
        if (isset($map['volume'])) {
            $model->volume = $map['volume'];
        }
        if (isset($map['speed'])) {
            $model->speed = $map['speed'];
        }
        if (isset($map['tone'])) {
            $model->tone = $map['tone'];
        }
        if (isset($map['background_url'])) {
            $model->backgroundUrl = $map['background_url'];
        }
        if (isset($map['resolution'])) {
            $model->resolution = $map['resolution'];
        }
        if (isset($map['radio'])) {
            $model->radio = $map['radio'];
        }
        if (isset($map['human_config'])) {
            $model->humanConfig = PositionSizeInfo::fromMap($map['human_config']);
        }

        return $model;
    }
}
