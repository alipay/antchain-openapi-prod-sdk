<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\CreativeTemplateAssetRef;

class MaterialTemplateData extends Model {
    protected $_name = [
        'prompt' => 'prompt',
        'imageModelId' => 'image_model_id',
        'videoModelId' => 'video_model_id',
        'imageRefs' => 'image_refs',
        'voiceRefs' => 'voice_refs',
        'videoRefs' => 'video_refs',
    ];
    public function validate() {
        Model::validateRequired('prompt', $this->prompt, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        if (null !== $this->imageModelId) {
            $res['image_model_id'] = $this->imageModelId;
        }
        if (null !== $this->videoModelId) {
            $res['video_model_id'] = $this->videoModelId;
        }
        if (null !== $this->imageRefs) {
            $res['image_refs'] = [];
            if(null !== $this->imageRefs && is_array($this->imageRefs)){
                $n = 0;
                foreach($this->imageRefs as $item){
                    $res['image_refs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->voiceRefs) {
            $res['voice_refs'] = [];
            if(null !== $this->voiceRefs && is_array($this->voiceRefs)){
                $n = 0;
                foreach($this->voiceRefs as $item){
                    $res['voice_refs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->videoRefs) {
            $res['video_refs'] = [];
            if(null !== $this->videoRefs && is_array($this->videoRefs)){
                $n = 0;
                foreach($this->videoRefs as $item){
                    $res['video_refs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaterialTemplateData
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['prompt'])){
            $model->prompt = $map['prompt'];
        }
        if(isset($map['image_model_id'])){
            $model->imageModelId = $map['image_model_id'];
        }
        if(isset($map['video_model_id'])){
            $model->videoModelId = $map['video_model_id'];
        }
        if(isset($map['image_refs'])){
            if(!empty($map['image_refs'])){
                $model->imageRefs = [];
                $n = 0;
                foreach($map['image_refs'] as $item) {
                    $model->imageRefs[$n++] = null !== $item ? CreativeTemplateAssetRef::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['voice_refs'])){
            if(!empty($map['voice_refs'])){
                $model->voiceRefs = [];
                $n = 0;
                foreach($map['voice_refs'] as $item) {
                    $model->voiceRefs[$n++] = null !== $item ? CreativeTemplateAssetRef::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['video_refs'])){
            if(!empty($map['video_refs'])){
                $model->videoRefs = [];
                $n = 0;
                foreach($map['video_refs'] as $item) {
                    $model->videoRefs[$n++] = null !== $item ? CreativeTemplateAssetRef::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // prompt
    /**
     * @example 参考 @{商品图,ref-01}，先拍全景，再切近景
     * @var string
     */
    public $prompt;

    // 生图模型id
    /**
     * @example image-model-demo
     * @var string
     */
    public $imageModelId;

    // 生视频模型id
    /**
     * @example video-model-demo
     * @var string
     */
    public $videoModelId;

    // 参考图片列表
    /**
     * @example undefined
     * @var CreativeTemplateAssetRef[]
     */
    public $imageRefs;

    // 参考音频列表
    /**
     * @example undefined
     * @var CreativeTemplateAssetRef[]
     */
    public $voiceRefs;

    // 参考视频列表
    /**
     * @example undefined
     * @var CreativeTemplateAssetRef[]
     */
    public $videoRefs;

}
