<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class ContentInfoDto extends Model {
    protected $_name = [
        'videoUrl' => 'video_url',
        'lastFrameUrl' => 'last_frame_url',
    ];
    public function validate() {
        Model::validateRequired('videoUrl', $this->videoUrl, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
        }
        if (null !== $this->lastFrameUrl) {
            $res['last_frame_url'] = $this->lastFrameUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContentInfoDto
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['video_url'])){
            $model->videoUrl = $map['video_url'];
        }
        if(isset($map['last_frame_url'])){
            $model->lastFrameUrl = $map['last_frame_url'];
        }
        return $model;
    }
    // 视频地址 有效期为 24 小时
    /**
     * @example https://xxx.alipay.com/paths/xx.png
     * @var string
     */
    public $videoUrl;

    // 尾帧图像 URL 有效期为 24 小时
    // 任务创建 returnLastFrame=true时返回
    /**
     * @example https://xxx.alipay.com/paths/xx.png
     * @var string
     */
    public $lastFrameUrl;

}
