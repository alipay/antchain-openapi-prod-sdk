<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class FeeChangeFactorVO extends Model {
    protected $_name = [
        'key' => 'key',
        'changeType' => 'change_type',
    ];
    public function validate() {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('changeType', $this->changeType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->changeType) {
            $res['change_type'] = $this->changeType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FeeChangeFactorVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['change_type'])){
            $model->changeType = $map['change_type'];
        }
        return $model;
    }
    // 哪个字段变更
    /**
     * @example newFeeEntity.field
     * @var string
     */
    public $key;

    // 改变类型
    /**
     * @example UPDATE,ADD,DELETE
     * @var string
     */
    public $changeType;

}
