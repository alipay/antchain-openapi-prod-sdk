<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASDT\Models\MultiURL;

class QueryImageResponse extends Model {
    protected $_name = [
        'urls' => 'urls',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->urls) {
            $res['urls'] = [];
            if(null !== $this->urls && is_array($this->urls)){
                $n = 0;
                foreach($this->urls as $item){
                    $res['urls'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryImageResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['urls'])){
            if(!empty($map['urls'])){
                $model->urls = [];
                $n = 0;
                foreach($map['urls'] as $item) {
                    $model->urls[$n++] = null !== $item ? MultiURL::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description 临时可访问的oss图片链接，每张图片会返回四个url，对应原图和不同的比例缩小，每一张图片的四个url用;隔开。
     * @example 
     * @var array
     */
    public $urls;

}
