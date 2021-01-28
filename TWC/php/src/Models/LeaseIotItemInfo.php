<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LeaseIotItemInfo extends Model {
    protected $_name = [
        'date' => 'date',
        'txHash' => 'tx_hash',
        'rawData' => 'raw_data',
    ];
    public function validate() {
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('rawData', $this->rawData, true);
        Model::validatePattern('date', $this->date, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->rawData) {
            $res['raw_data'] = $this->rawData;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return LeaseIotItemInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['date'])){
            $model->date = $map['date'];
        }
        if(isset($map['tx_hash'])){
            $model->txHash = $map['tx_hash'];
        }
        if(isset($map['raw_data'])){
            $model->rawData = $map['raw_data'];
        }
        return $model;
    }
    // 证据的时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $date;

    // 证据的txHash
    /**
     * @example 0xaaaaabbbbbcccc
     * @var string
     */
    public $txHash;

    // 证据的原始数据，默认为空或加密状态，除非调用方为授权用户（如出资方等
    /**
     * @example ""
     * @var string
     */
    public $rawData;

}
