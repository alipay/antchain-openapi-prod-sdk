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

    // 模型标识，如 ：doubao-seedance-2-0-260128
    /**
     * @var string
     */
    public $model;

    // 文本提示词
    /**
     * @var string
     */
    public $prompt;

    // 图生视频参考图片 URL
    /**
     * @var string[]
     */
    public $imageUrl;

    // 视频参考/续写时传入视频 URL
    /**
     * @var string[]
     */
    public $videoUrl;

    // 参考音频URL列表
    /**
     * @var string[]
     */
    public $audioUrl;

    // 比例
    /**
     * @var string
     */
    public $ratio;

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
        'ratio'             => 'ratio',
        'duration'          => 'duration',
        'requestId'         => 'request_id',
        'ext'               => 'ext',
    ];

    public function validate()
    {
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('prompt', $this->prompt, true);
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
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
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
            if (!empty($map['image_url'])) {
                $model->imageUrl = $map['image_url'];
            }
        }
        if (isset($map['video_url'])) {
            if (!empty($map['video_url'])) {
                $model->videoUrl = $map['video_url'];
            }
        }
        if (isset($map['audio_url'])) {
            if (!empty($map['audio_url'])) {
                $model->audioUrl = $map['audio_url'];
            }
        }
        if (isset($map['ratio'])) {
            $model->ratio = $map['ratio'];
        }
        if (isset($map['duration'])) {
            $model->duration = $map['duration'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['ext'])) {
            $model->ext = $map['ext'];
        }

        return $model;
    }
}
