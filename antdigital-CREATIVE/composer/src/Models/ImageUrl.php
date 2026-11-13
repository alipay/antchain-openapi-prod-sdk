<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\ContentUrl;

class ImageUrl extends Model {
    protected $_name = [
        'imageUrl' => 'image_url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->imageUrl) {
            $res['image_url'] = null !== $this->imageUrl ? $this->imageUrl->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImageUrl
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['image_url'])){
            $model->imageUrl = ContentUrl::fromMap($map['image_url']);
        }
        return $model;
    }
    // test
    /**
     * @example undefined
     * @var ContentUrl
     */
    public $imageUrl;

}
