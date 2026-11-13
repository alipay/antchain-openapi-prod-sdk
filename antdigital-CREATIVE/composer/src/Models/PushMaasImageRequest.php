<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class PushMaasImageRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId' => 'request_id',
        'model' => 'model',
        'capabilityType' => 'capability_type',
        'generateMode' => 'generate_mode',
        'prompt' => 'prompt',
        'imageUrls' => 'image_urls',
        'size' => 'size',
        'n' => 'n',
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
        if (null !== $this->generateMode) {
            $res['generate_mode'] = $this->generateMode;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        if (null !== $this->imageUrls) {
            $res['image_urls'] = $this->imageUrls;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->n) {
            $res['n'] = $this->n;
        }
        if (null !== $this->extParams) {
            $res['ext_params'] = $this->extParams;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushMaasImageRequest
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
        if(isset($map['generate_mode'])){
            $model->generateMode = $map['generate_mode'];
        }
        if(isset($map['prompt'])){
            $model->prompt = $map['prompt'];
        }
        if(isset($map['image_urls'])){
            if(!empty($map['image_urls'])){
                $model->imageUrls = $map['image_urls'];
            }
        }
        if(isset($map['size'])){
            $model->size = $map['size'];
        }
        if(isset($map['n'])){
            $model->n = $map['n'];
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

    // 图片模型编码
    /**
     * @var string
     */
    public $model;

    // 类型
    /**
     * @var string
     */
    public $capabilityType;

    // 生成模式
    /**
     * @var string
     */
    public $generateMode;

    // 图片生成或编辑提示词
    /**
     * @var string
     */
    public $prompt;

    // 图片地址
    /**
     * @var string[]
     */
    public $imageUrls;

    // 图片尺寸
    /**
     * @var string
     */
    public $size;

    // 图片张数
    /**
     * @var int
     */
    public $n;

    // 扩展参数 JSON 字符串
    /**
     * @var string
     */
    public $extParams;

}
