<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\CreativeAssetRef;

class ExecAntcloudMarketingagentCreativeVideoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'prompt' => 'prompt',
        'inputElements' => 'input_elements',
        'model' => 'model',
        'scene' => 'scene',
        'ratio' => 'ratio',
        'duration' => 'duration',
        'resolution' => 'resolution',
        'generateAudio' => 'generate_audio',
        'expandScript' => 'expand_script',
        'generateSubtitle' => 'generate_subtitle',
    ];
    public function validate() {
        Model::validateRequired('prompt', $this->prompt, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        if (null !== $this->inputElements) {
            $res['input_elements'] = [];
            if(null !== $this->inputElements && is_array($this->inputElements)){
                $n = 0;
                foreach($this->inputElements as $item){
                    $res['input_elements'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->resolution) {
            $res['resolution'] = $this->resolution;
        }
        if (null !== $this->generateAudio) {
            $res['generate_audio'] = $this->generateAudio;
        }
        if (null !== $this->expandScript) {
            $res['expand_script'] = $this->expandScript;
        }
        if (null !== $this->generateSubtitle) {
            $res['generate_subtitle'] = $this->generateSubtitle;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentCreativeVideoRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['prompt'])){
            $model->prompt = $map['prompt'];
        }
        if(isset($map['input_elements'])){
            if(!empty($map['input_elements'])){
                $model->inputElements = [];
                $n = 0;
                foreach($map['input_elements'] as $item) {
                    $model->inputElements[$n++] = null !== $item ? CreativeAssetRef::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['ratio'])){
            $model->ratio = $map['ratio'];
        }
        if(isset($map['duration'])){
            $model->duration = $map['duration'];
        }
        if(isset($map['resolution'])){
            $model->resolution = $map['resolution'];
        }
        if(isset($map['generate_audio'])){
            $model->generateAudio = $map['generate_audio'];
        }
        if(isset($map['expand_script'])){
            $model->expandScript = $map['expand_script'];
        }
        if(isset($map['generate_subtitle'])){
            $model->generateSubtitle = $map['generate_subtitle'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 视频描述，文生视频、图生视频均不能为空
    /**
     * @var string
     */
    public $prompt;

    // 参考图片，最多 5 张；不传或空数组表示文生视频
    /**
     * @var CreativeAssetRef[]
     */
    public $inputElements;

    // 模型标识，不传使用服务端默认模型；可用值需与上游确认
    /**
     * @var string
     */
    public $model;

    // STORE_VISIT_VIDEO：探店视频；PRODUCT_PROMOTION_VIDEO：带货视频
    /**
     * @var string
     */
    public $scene;

    // 支持 9:16、1:1、16:9、4:3、3:4，默认 9:16
    /**
     * @var string
     */
    public $ratio;

    // 视频时长，单位秒，4～30 的整数，默认 15
    /**
     * @var int
     */
    public $duration;

    // 分辨率，支持 480、720、1080，默认 720
    /**
     * @var int
     */
    public $resolution;

    // 是否生成音频，默认 true
    /**
     * @var bool
     */
    public $generateAudio;

    // 是否扩写脚本，默认true
    /**
     * @var bool
     */
    public $expandScript;

    // 是否生成字幕，默认 true
    /**
     * @var bool
     */
    public $generateSubtitle;

}
