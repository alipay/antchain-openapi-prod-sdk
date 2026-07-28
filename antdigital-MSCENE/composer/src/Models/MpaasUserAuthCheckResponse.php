<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MSCENE\Models;

use AlibabaCloud\Tea\Model;

class MpaasUserAuthCheckResponse extends Model {
    protected $_name = [
        'matched' => 'matched',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->matched) {
            $res['matched'] = $this->matched;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MpaasUserAuthCheckResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['matched'])){
            $model->matched = $map['matched'];
        }
        return $model;
    }
    // 用户身份是否匹配
    /**
     * @example true
     * @var bool
     */
    public $matched;

}
