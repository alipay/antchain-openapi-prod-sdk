<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecDataDepositResponse extends Model {
    protected $_name = [
        'txHash' => 'tx_hash',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecDataDepositResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tx_hash'])){
            $model->txHash = $map['tx_hash'];
        }
        return $model;
    }
    /**
     * @description 存证交易哈希
     * @example 01953ef5996a12f58f093f3ca7e10...59f6ac2bdc01a69e9445e7a19db3f27e
     * @var string
     */
    public $txHash;

}
