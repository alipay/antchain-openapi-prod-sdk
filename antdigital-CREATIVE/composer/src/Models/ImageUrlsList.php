<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class ImageUrlsList extends Model {
    protected $_name = [
        'imageUrls' => 'image_urls',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->imageUrls) {
            $res['image_urls'] = $this->imageUrls;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImageUrlsList
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['image_urls'])){
            if(!empty($map['image_urls'])){
                $model->imageUrls = $map['image_urls'];
            }
        }
        return $model;
    }
    // 图片 URL 列表
    /**
     * @example 
     * @var string[]
     */
    public $imageUrls;

}
