<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class FreezeEquityRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'equityId' => 'equity_id',
        'outTxId' => 'out_tx_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FreezeEquityRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['equity_id'])){
            $model->equityId = $map['equity_id'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
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
     * @description 权益商品ID
     * @example 000c7312bf8ba777ccbbfb0df8e965cd5fa67a72bb6f142136b96dc0b2364f19
     * @var string
     */
    public $equityId;

    /**
     * @description 外部交易ID
     * @example 2368453876
     * @var string
     */
    public $outTxId;

}
