<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAssetInstructionRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'originTxId' => 'origin_tx_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->originTxId) {
            $res['origin_tx_id'] = $this->originTxId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAssetInstructionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['origin_tx_id'])){
            $model->originTxId = $map['origin_tx_id'];
        }
        return $model;
    }
    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 资产流水ID
     * @example 6858578725348
     * @var string
     */
    public $originTxId;

}
