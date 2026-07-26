<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class OrderA extends Model {
    protected $_name = [
        'aaa' => 'aaa',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->aaa) {
            $res['aaa'] = $this->aaa;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OrderA
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['aaa'])){
            $model->aaa = $map['aaa'];
        }
        return $model;
    }
    // aa
    /**
     * @example a
     * @var string
     */
    public $aaa;

}
