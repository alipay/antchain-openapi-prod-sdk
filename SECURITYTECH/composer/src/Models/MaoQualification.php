<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class MaoQualification extends Model {
    protected $_name = [
        'key' => 'key',
        'url' => 'url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaoQualification
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        return $model;
    }
    // 资质类型码
    /**
     * @example 资质类型码
     * @var string
     */
    public $key;

    // 资质图片地址
    /**
     * @example 资质图片地址
     * @var string
     */
    public $url;

}
