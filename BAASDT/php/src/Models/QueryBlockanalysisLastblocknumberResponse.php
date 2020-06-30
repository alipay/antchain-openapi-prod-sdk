<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockanalysisLastblocknumberResponse extends Model {
    protected $_name = [
        'blockNumber' => 'block_number',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockanalysisLastblocknumberResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['block_number'])){
            $model->blockNumber = $map['block_number'];
        }
        return $model;
    }
    /**
     * @description 区块链最高区块高度
     * @example 123456453
     * @var integer
     */
    public $blockNumber;

}
