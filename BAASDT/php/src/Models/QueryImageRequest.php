<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryImageRequest extends Model {
    protected $_name = [
        'urls' => 'urls',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->urls) {
            $res['urls'] = [];
            if(null !== $this->urls){
                $res['urls'] = $this->urls;
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryImageRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['urls'])){
            if(!empty($map['urls'])){
                $model->urls = [];
                $model->urls = $map['urls'];
            }
        }
        return $model;
    }
    /**
     * @description 要查询的图片数组，填入不可访问的url
     * @example [url1,url2,url3]
     * @var array
     */
    public $urls;

}
