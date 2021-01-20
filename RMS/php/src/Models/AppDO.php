<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AppDO extends Model {
    protected $_name = [
        'name' => 'name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppDO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        return $model;
    }
    // 应用名称
    /**
     * @example ZOOKEEPER-zookeeper
     * @var string
     */
    public $name;

}
