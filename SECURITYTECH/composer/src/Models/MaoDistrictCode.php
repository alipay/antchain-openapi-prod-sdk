<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class MaoDistrictCode extends Model {
    protected $_name = [
        'code' => 'code',
        'name' => 'name',
    ];
    public function validate() {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaoDistrictCode
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        return $model;
    }
    // 行政区划编码
    /**
     * @example 行政区划编码
     * @var string
     */
    public $code;

    // 行政区划名称
    /**
     * @example 行政区划名称
     * @var string
     */
    public $name;

}
