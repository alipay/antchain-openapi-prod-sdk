<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

class CommercialImage extends Model {
    protected $_name = [
        'picUrl' => 'pic_url',
        'picIndex' => 'pic_index',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->picUrl) {
            $res['pic_url'] = $this->picUrl;
        }
        if (null !== $this->picIndex) {
            $res['pic_index'] = $this->picIndex;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CommercialImage
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['pic_url'])){
            $model->picUrl = $map['pic_url'];
        }
        if(isset($map['pic_index'])){
            $model->picIndex = $map['pic_index'];
        }
        return $model;
    }
    // 图片url
    /**
     * @example -
     * @var string
     */
    public $picUrl;

    // 图片index
    /**
     * @example -
     * @var string
     */
    public $picIndex;

}
