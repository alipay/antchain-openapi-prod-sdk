<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\ContentInfo;

class PushMaasVideoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId' => 'request_id',
        'model' => 'model',
        'capabilityType' => 'capability_type',
        'content' => 'content',
        'duration' => 'duration',
        'ratio' => 'ratio',
        'resolution' => 'resolution',
        'generateAudio' => 'generate_audio',
        'watermark' => 'watermark',
        'extParams' => 'ext_params',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('capabilityType', $this->capabilityType, true);
        Model::validateRequired('content', $this->content, true);
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
        if (null !== $this->content) {
            $res['content'] = [];
            if(null !== $this->content && is_array($this->content)){
                $n = 0;
                foreach($this->content as $item){
                    $res['content'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->resolution) {
            $res['resolution'] = $this->resolution;
        }
        if (null !== $this->generateAudio) {
            $res['generate_audio'] = $this->generateAudio;
        }
        if (null !== $this->watermark) {
            $res['watermark'] = $this->watermark;
        }
        if (null !== $this->extParams) {
            $res['ext_params'] = $this->extParams;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushMaasVideoRequest
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
        if(isset($map['content'])){
            if(!empty($map['content'])){
                $model->content = [];
                $n = 0;
                foreach($map['content'] as $item) {
                    $model->content[$n++] = null !== $item ? ContentInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['duration'])){
            $model->duration = $map['duration'];
        }
        if(isset($map['ratio'])){
            $model->ratio = $map['ratio'];
        }
        if(isset($map['resolution'])){
            $model->resolution = $map['resolution'];
        }
        if(isset($map['generate_audio'])){
            $model->generateAudio = $map['generate_audio'];
        }
        if(isset($map['watermark'])){
            $model->watermark = $map['watermark'];
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

    // 视频模型编码
    /**
     * @var string
     */
    public $model;

    // 类型
    /**
     * @var string
     */
    public $capabilityType;

    // 非空内容列表，至少含文本或素材
    /**
     * @var ContentInfo[]
     */
    public $content;

    // 视频时长（秒）
    /**
     * @var string
     */
    public $duration;

    // 宽高比，如 16:9、9:16
    /**
     * @var string
     */
    public $ratio;

    // 分辨率，如 720P、1080P
    /**
     * @var string
     */
    public $resolution;

    // 是否生成音轨，默认 false
    /**
     * @var bool
     */
    public $generateAudio;

    // 是否添加水印
    /**
     * @var bool
     */
    public $watermark;

    // 扩展参数 JSON 字符串
    /**
     * @var string
     */
    public $extParams;

}
