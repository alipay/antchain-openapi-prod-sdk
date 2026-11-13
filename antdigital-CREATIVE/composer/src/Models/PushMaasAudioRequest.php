<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class PushMaasAudioRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId' => 'request_id',
        'model' => 'model',
        'capabilityType' => 'capability_type',
        'prompt' => 'prompt',
        'text' => 'text',
        'audioUrls' => 'audio_urls',
        'imageUrls' => 'image_urls',
        'extParams' => 'ext_params',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('capabilityType', $this->capabilityType, true);
        Model::validateRequired('prompt', $this->prompt, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->capabilityType) {
            $res['capability_type'] = $this->capabilityType;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->audioUrls) {
            $res['audio_urls'] = $this->audioUrls;
        }
        if (null !== $this->imageUrls) {
            $res['image_urls'] = $this->imageUrls;
        }
        if (null !== $this->extParams) {
            $res['ext_params'] = $this->extParams;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushMaasAudioRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['capability_type'])){
            $model->capabilityType = $map['capability_type'];
        }
        if(isset($map['prompt'])){
            $model->prompt = $map['prompt'];
        }
        if(isset($map['text'])){
            $model->text = $map['text'];
        }
        if(isset($map['audio_urls'])){
            if(!empty($map['audio_urls'])){
                $model->audioUrls = $map['audio_urls'];
            }
        }
        if(isset($map['image_urls'])){
            if(!empty($map['image_urls'])){
                $model->imageUrls = $map['image_urls'];
            }
        }
        if(isset($map['ext_params'])){
            $model->extParams = $map['ext_params'];
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

    // 幂等标识，由客户端生成
    /**
     * @var string
     */
    public $requestId;

    // 音频模型编码
    /**
     * @var string
     */
    public $model;

    // 类型
    /**
     * @var string
     */
    public $capabilityType;

    // 音频生成提示词
    /**
     * @var string
     */
    public $prompt;

    // 需要朗读的文本，仅支持该参数的模型使用
    /**
     * @var string
     */
    public $text;

    // 音频链接，REFERENCE_TO_AUDIO 时非空
    /**
     * @var string[]
     */
    public $audioUrls;

    // 图片链接，IMAGE_TO_AUDIO 时非空
    /**
     * @var string[]
     */
    public $imageUrls;

    // 扩展参数 JSON 字符串，内容按模型扩展参数对象组织
    /**
     * @var string
     */
    public $extParams;

}
