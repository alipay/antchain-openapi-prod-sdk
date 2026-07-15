<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class Data extends Model {
    protected $_name = [
        'provisionData' => 'provision_data',
        'remaining' => 'remaining',
    ];
    public function validate() {
        Model::validateRequired('provisionData', $this->provisionData, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->provisionData) {
            $res['provision_data'] = $this->provisionData;
        }
        if (null !== $this->remaining) {
            $res['remaining'] = $this->remaining;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Data
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['provision_data'])){
            $model->provisionData = $map['provision_data'];
        }
        if(isset($map['remaining'])){
            $model->remaining = $map['remaining'];
        }
        return $model;
    }
    // provision数据
    /**
     * @example 123XXX
     * @var string
     */
    public $provisionData;

    // 余量
    /**
     * @example 0
     * @var int
     */
    public $remaining;

}
