<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\GESAAS\Models\TextInfoDto;
use AntChain\GESAAS\Models\ImageInfoDto;
use AntChain\GESAAS\Models\FileInfoDto;

class MaterialContentDto extends Model {
    protected $_name = [
        'textInfoDtos' => 'text_info_dtos',
        'imageInfoDtos' => 'image_info_dtos',
        'videoInfoDtos' => 'video_info_dtos',
        'audioInfoDtos' => 'audio_info_dtos',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->textInfoDtos) {
            $res['text_info_dtos'] = [];
            if(null !== $this->textInfoDtos && is_array($this->textInfoDtos)){
                $n = 0;
                foreach($this->textInfoDtos as $item){
                    $res['text_info_dtos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->imageInfoDtos) {
            $res['image_info_dtos'] = [];
            if(null !== $this->imageInfoDtos && is_array($this->imageInfoDtos)){
                $n = 0;
                foreach($this->imageInfoDtos as $item){
                    $res['image_info_dtos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->videoInfoDtos) {
            $res['video_info_dtos'] = [];
            if(null !== $this->videoInfoDtos && is_array($this->videoInfoDtos)){
                $n = 0;
                foreach($this->videoInfoDtos as $item){
                    $res['video_info_dtos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->audioInfoDtos) {
            $res['audio_info_dtos'] = [];
            if(null !== $this->audioInfoDtos && is_array($this->audioInfoDtos)){
                $n = 0;
                foreach($this->audioInfoDtos as $item){
                    $res['audio_info_dtos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaterialContentDto
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['text_info_dtos'])){
            if(!empty($map['text_info_dtos'])){
                $model->textInfoDtos = [];
                $n = 0;
                foreach($map['text_info_dtos'] as $item) {
                    $model->textInfoDtos[$n++] = null !== $item ? TextInfoDto::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['image_info_dtos'])){
            if(!empty($map['image_info_dtos'])){
                $model->imageInfoDtos = [];
                $n = 0;
                foreach($map['image_info_dtos'] as $item) {
                    $model->imageInfoDtos[$n++] = null !== $item ? ImageInfoDto::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['video_info_dtos'])){
            if(!empty($map['video_info_dtos'])){
                $model->videoInfoDtos = [];
                $n = 0;
                foreach($map['video_info_dtos'] as $item) {
                    $model->videoInfoDtos[$n++] = null !== $item ? FileInfoDto::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['audio_info_dtos'])){
            if(!empty($map['audio_info_dtos'])){
                $model->audioInfoDtos = [];
                $n = 0;
                foreach($map['audio_info_dtos'] as $item) {
                    $model->audioInfoDtos[$n++] = null !== $item ? FileInfoDto::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 文本素材信息列表
    /**
     * @example undefined
     * @var TextInfoDto[]
     */
    public $textInfoDtos;

    // 图片素材列表
    /**
     * @example undefined
     * @var ImageInfoDto[]
     */
    public $imageInfoDtos;

    // 视频素材内容列表
    /**
     * @example undefined
     * @var FileInfoDto[]
     */
    public $videoInfoDtos;

    // 音频素材内容列表
    /**
     * @example undefined
     * @var FileInfoDto[]
     */
    public $audioInfoDtos;

}
