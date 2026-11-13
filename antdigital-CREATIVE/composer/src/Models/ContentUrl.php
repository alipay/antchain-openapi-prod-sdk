<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class ContentUrl extends Model {
    protected $_name = [
        'url' => 'url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContentUrl
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        return $model;
    }
    // url
    /**
     * @example www.test.com/123
     * @var string
     */
    public $url;

}
