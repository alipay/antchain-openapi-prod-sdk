<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ConfirmExchangeAftersaleRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'equityId' => 'equity_id',
        'memo' => 'memo',
        'originTxId' => 'origin_tx_id',
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
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->originTxId) {
            $res['origin_tx_id'] = $this->originTxId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ConfirmExchangeAftersaleRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['equity_id'])){
            $model->equityId = $map['equity_id'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['origin_tx_id'])){
            $model->originTxId = $map['origin_tx_id'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        return $model;
    }
    /**
     * @description 链id
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 商品id
     * @example xxxx
     * @var string
     */
    public $equityId;

    /**
     * @description 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
     * @example 商户确认售后并收货
     * @var string
     */
    public $memo;

    /**
     * @description 关联交易id
     * @example xxxx
     * @var string
     */
    public $originTxId;

    /**
     * @description 外部交易id
     * @example x x x
     * @var string
     */
    public $outTxId;

}
