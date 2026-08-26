<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class StructL extends Model {
    protected $_name = [
        'paramb' => 'paramb',
    ];
    public function validate() {
        Model::validateRequired('paramb', $this->paramb, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->paramb) {
            $res['paramb'] = $this->paramb;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StructL
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['paramb'])){
            $model->paramb = $map['paramb'];
        }
        return $model;
    }
    // paramb
    /**
     * @example paramb
     * @var string
     */
    public $paramb;

}
