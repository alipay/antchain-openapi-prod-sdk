<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class CreateStructA extends Model {
    protected $_name = [
        'timeouta' => 'timeouta',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->timeouta) {
            $res['timeouta'] = $this->timeouta;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateStructA
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['timeouta'])){
            $model->timeouta = $map['timeouta'];
        }
        return $model;
    }
    // 超时时间
    /**
     * @example 3000
     * @var string
     */
    public $timeouta;

}
