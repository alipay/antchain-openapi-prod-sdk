<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecCardCreateResponse extends Model {
    protected $_name = [
        'cardId' => 'card_id',
        'txHash' => 'tx_hash',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->cardId) {
            $res['card_id'] = $this->cardId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecCardCreateResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['card_id'])){
            $model->cardId = $map['card_id'];
        }
        if(isset($map['tx_hash'])){
            $model->txHash = $map['tx_hash'];
        }
        return $model;
    }
    /**
     * @description 卡密ID
     * @example cardID
     * @var string
     */
    public $cardId;

    /**
     * @description 创建卡密的交易hash
     * @example abc...def
     * @var string
     */
    public $txHash;

}
