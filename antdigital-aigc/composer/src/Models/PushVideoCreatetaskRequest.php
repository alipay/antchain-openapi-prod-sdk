<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIGC\Models;

use AlibabaCloud\Tea\Model;

class PushVideoCreatetaskRequest extends Model
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

    // 模型标识，如 seedance-01-pro / happyhorse-t2v / wanx-v1
    /**
     * @var string
     */
    public $model;

    // 文本提示词
    /**
     * @var string
     */
    public $prompt;

    // 图生视频时传入参考图片 URL
    /**
     * @var string
     */
    public $imageUrl;

    // 视频续写时传入参考视频 URL
    /**
     * @var string
     */
    public $videoUrl;

    // 参考音频 URL（预留）
    /**
     * @var string
     */
    public $audioUrl;

    // 参考图片 URL（参考图生视频场景）
    /**
     * @var string
     */
    public $refImageUrl;

    // 分辨率，如 1280x720
    /**
     * @var string
     */
    public $size;

    // 视频时长（秒）
    /**
     * @var string
     */
    public $duration;

    // 请求追踪 ID，用于幂等去重
    /**
     * @var string
     */
    public $requestId;

    // MIST Token / API Key
    /**
     * @var string
     */
    public $token;

    // 扩展JSON
    /**
     * @var string
     */
    public $ext;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'model'             => 'model',
        'prompt'            => 'prompt',
        'imageUrl'          => 'image_url',
        'videoUrl'          => 'video_url',
        'audioUrl'          => 'audio_url',
        'refImageUrl'       => 'ref_image_url',
        'size'              => 'size',
        'duration'          => 'duration',
        'requestId'         => 'request_id',
        'token'             => 'token',
        'ext'               => 'ext',
    ];

    public function validate()
    {
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('prompt', $this->prompt, true);
        Model::validateRequired('token', $this->token, true);
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
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        if (null !== $this->imageUrl) {
            $res['image_url'] = $this->imageUrl;
        }
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
        }
        if (null !== $this->audioUrl) {
            $res['audio_url'] = $this->audioUrl;
        }
        if (null !== $this->refImageUrl) {
            $res['ref_image_url'] = $this->refImageUrl;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->ext) {
            $res['ext'] = $this->ext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushVideoCreatetaskRequest
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
        if (isset($map['model'])) {
            $model->model = $map['model'];
        }
        if (isset($map['prompt'])) {
            $model->prompt = $map['prompt'];
        }
        if (isset($map['image_url'])) {
            $model->imageUrl = $map['image_url'];
        }
        if (isset($map['video_url'])) {
            $model->videoUrl = $map['video_url'];
        }
        if (isset($map['audio_url'])) {
            $model->audioUrl = $map['audio_url'];
        }
        if (isset($map['ref_image_url'])) {
            $model->refImageUrl = $map['ref_image_url'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['duration'])) {
            $model->duration = $map['duration'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['ext'])) {
            $model->ext = $map['ext'];
        }

        return $model;
    }
}
