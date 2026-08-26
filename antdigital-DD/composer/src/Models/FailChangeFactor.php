<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class FailChangeFactor extends Model {
    protected $_name = [
        'failKey' => 'fail_key',
        'failReason' => 'fail_reason',
    ];
    public function validate() {
        Model::validateRequired('failKey', $this->failKey, true);
        Model::validateRequired('failReason', $this->failReason, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->failKey) {
            $res['fail_key'] = $this->failKey;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FailChangeFactor
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['fail_key'])){
            $model->failKey = $map['fail_key'];
        }
        if(isset($map['fail_reason'])){
            $model->failReason = $map['fail_reason'];
        }
        return $model;
    }
    // 失败的路径值
    /**
     * @example base.domainCode
     * @var string
     */
    public $failKey;

    // 失败原因
    /**
     * @example 失败原因
     * @var string
     */
    public $failReason;

}
