<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class AbcCreateStructB extends Model {
    protected $_name = [
        'info' => 'info',
        'region' => 'region',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->info) {
            $res['info'] = $this->info;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AbcCreateStructB
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['info'])){
            $model->info = $map['info'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        return $model;
    }
    // 【信息描述】
    /**
     * @example 这是关于xxx的资料信息
     * @var string
     */
    public $info;

    // 【地区】
    /**
     * @example 浙江省杭州市
     * @var string
     */
    public $region;

}
