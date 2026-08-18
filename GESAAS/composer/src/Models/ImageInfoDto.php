<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class ImageInfoDto extends Model {
    protected $_name = [
        'url' => 'url',
        'role' => 'role',
    ];
    public function validate() {
        Model::validateRequired('url', $this->url, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImageInfoDto
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['role'])){
            $model->role = $map['role'];
        }
        return $model;
    }
    // 图片url
    /**
     * @example https://xxx.alipay.com/paths/xx.png
     * @var string
     */
    public $url;

    // 角色/用途   首帧:first_frame、尾帧:last_frame 、参考图：reference_image
    /**
     * @example first_frame
     * @var string
     */
    public $role;

}
