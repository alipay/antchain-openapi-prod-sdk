<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ATest extends Model {
    protected $_name = [
        'datay' => 'datay',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->datay) {
            $res['datay'] = $this->datay;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ATest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['datay'])){
            $model->datay = $map['datay'];
        }
        return $model;
    }
    // cc
    /**
     * @example aaa
     * @var string
     */
    public $datay;

}
