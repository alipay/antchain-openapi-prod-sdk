<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateMerchantUserRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'did' => 'did',
        'localId' => 'local_id',
        'outTxId' => 'out_tx_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->localId) {
            $res['local_id'] = $this->localId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateMerchantUserRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['did'])){
            $model->did = $map['did'];
        }
        if(isset($map['local_id'])){
            $model->localId = $map['local_id'];
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
     * @description 用户的did信息
     * @example mychain::did::bac56fde5237645
     * @var string
     */
    public $did;

    /**
     * @description 用户外部ID
     * @example "user01"
     * @var string
     */
    public $localId;

    /**
     * @description 外部交易ID
     * @example 5126546354836
     * @var string
     */
    public $outTxId;

}
