<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class Tag extends Model {
    protected $_name = [
        'code' => 'code',
        'value' => 'value',
    ];
    public function validate() {
        Model::validateRequired('code', $this->code, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Tag
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // 编码
    /**
     * @example IS_OK
     * @var string
     */
    public $code;

    // 值
    /**
     * @example N
     * @var string
     */
    public $value;

}
