<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class AbcDemoStruct extends Model {
    protected $_name = [
        'someString' => 'some_string',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->someString) {
            $res['some_string'] = $this->someString;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AbcDemoStruct
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['some_string'])){
            $model->someString = $map['some_string'];
        }
        return $model;
    }
    // 字符串属性
    /**
     * @example str
     * @var string
     */
    public $someString;

}
