<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\ContentUrl;

class ContentInfo extends Model {
    protected $_name = [
        'type' => 'type',
        'text' => 'text',
        'imageUrl' => 'image_url',
        'audioUrl' => 'audio_url',
        'videoUrl' => 'video_url',
        'role' => 'role',
    ];
    public function validate() {
        Model::validateRequired('type', $this->type, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->imageUrl) {
            $res['image_url'] = null !== $this->imageUrl ? $this->imageUrl->toMap() : null;
        }
        if (null !== $this->audioUrl) {
            $res['audio_url'] = null !== $this->audioUrl ? $this->audioUrl->toMap() : null;
        }
        if (null !== $this->videoUrl) {
            $res['video_url'] = null !== $this->videoUrl ? $this->videoUrl->toMap() : null;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContentInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['text'])){
            $model->text = $map['text'];
        }
        if(isset($map['image_url'])){
            $model->imageUrl = ContentUrl::fromMap($map['image_url']);
        }
        if(isset($map['audio_url'])){
            $model->audioUrl = ContentUrl::fromMap($map['audio_url']);
        }
        if(isset($map['video_url'])){
            $model->videoUrl = ContentUrl::fromMap($map['video_url']);
        }
        if(isset($map['role'])){
            $model->role = $map['role'];
        }
        return $model;
    }
    // 类型
    /**
     * @example text
     * @var string
     */
    public $type;

    // type=text 时提供，文本
    /**
     * @example 生成一只猫
     * @var string
     */
    public $text;

    // type=image_url 时提供
    /**
     * @example www.test.com/123
     * @var ContentUrl
     */
    public $imageUrl;

    // type=audio_url 时提供
    /**
     * @example www.test.com/123
     * @var ContentUrl
     */
    public $audioUrl;

    // type=video_url 时提供
    /**
     * @example www.test.com/123
     * @var ContentUrl
     */
    public $videoUrl;

    // 角色
    /**
     * @example reference_image
     * @var string
     */
    public $role;

}
