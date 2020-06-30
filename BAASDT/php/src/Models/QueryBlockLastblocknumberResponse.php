<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockLastblocknumberResponse extends Model {
    protected $_name = [
        'lastBlockNumber' => 'last_block_number',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->lastBlockNumber) {
            $res['last_block_number'] = $this->lastBlockNumber;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockLastblocknumberResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['last_block_number'])){
            $model->lastBlockNumber = $map['last_block_number'];
        }
        return $model;
    }
    /**
     * @description 最新区块高度
     * @example 1234
     * @var integer
     */
    public $lastBlockNumber;

}
