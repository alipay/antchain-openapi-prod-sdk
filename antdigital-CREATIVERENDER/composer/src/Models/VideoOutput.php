<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class VideoOutput extends Model {
    protected $_name = [
        'type' => 'type',
        'url' => 'url',
        'id' => 'id',
        'duration' => 'duration',
        'expireTime' => 'expire_time',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return VideoOutput
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['duration'])){
            $model->duration = $map['duration'];
        }
        if(isset($map['expire_time'])){
            $model->expireTime = $map['expire_time'];
        }
        return $model;
    }
    // 产物类型
    /**
     * @example video
     * @var string
     */
    public $type;

    // 可下载的视频地址
    /**
     * @example https://example.com/result.mp4
     * @var string
     */
    public $url;

    // 产物 ID
    /**
     * @example video-001
     * @var string
     */
    public $id;

    // 实际视频时长，单位秒
    /**
     * @example 15
     * @var int
     */
    public $duration;

    // URL 过期时间，毫秒时间戳；能确定时返回
    /**
     * @example 1790000000000
     * @var int
     */
    public $expireTime;

}
