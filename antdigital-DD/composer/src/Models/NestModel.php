<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class NestModel extends Model {
    protected $_name = [
        'a' => 'a',
    ];
    public function validate() {
        Model::validateRequired('a', $this->a, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->a) {
            $res['a'] = $this->a;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NestModel
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['a'])){
            $model->a = $map['a'];
        }
        return $model;
    }
    // aaaa
    /**
     * @example aaa
     * @var string
     */
    public $a;

}
