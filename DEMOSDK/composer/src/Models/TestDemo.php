<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class TestDemo extends Model {
    protected $_name = [
        'timeout' => 'timeout',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TestDemo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['timeout'])){
            $model->timeout = $map['timeout'];
        }
        return $model;
    }
    // a
    /**
     * @example a
     * @var string
     */
    public $timeout;

}
