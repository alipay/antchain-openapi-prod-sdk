<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LeaseNotaryRecord extends Model {
    protected $_name = [
        'phase' => 'phase',
        'txHash' => 'tx_hash',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return LeaseNotaryRecord
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['phase'])){
            $model->phase = $map['phase'];
        }
        if(isset($map['tx_hash'])){
            $model->txHash = $map['tx_hash'];
        }
        return $model;
    }
    // 存证阶段
    /**
     * @example PLACE_ORDER
     * @var string
     */
    public $phase;

    // 交易哈希，存证记录唯一标识
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269
     * @var string
     */
    public $txHash;

}
