<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class VideoUrl extends Model {
    protected $_name = [
        'videoUrl' => 'video_url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return VideoUrl
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['video_url'])){
            $model->videoUrl = $map['video_url'];
        }
        return $model;
    }
    // 视频 URL（成功时返回）
    /**
     * @example https://example.com/output.mp4
     * @var string
     */
    public $videoUrl;

}
