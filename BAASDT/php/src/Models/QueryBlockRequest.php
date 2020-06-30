<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockRequest extends Model {
    protected $_name = [
        'blockNumber' => 'block_number',
        'chainId' => 'chain_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['block_number'])){
            $model->blockNumber = $map['block_number'];
        }
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        return $model;
    }
    /**
     * @description 区块链高度
     * @example 1234
     * @var integer
     */
    public $blockNumber;

    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

}
