<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryExchangeInstructionResponse extends Model {
    protected $_name = [
        'instruction' => 'instruction',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->instruction) {
            $res['instruction'] = null !== $this->instruction ? $this->instruction->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryExchangeInstructionResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['instruction'])){
            $model->instruction = EInstruction::fromMap($map['instruction']);
        }
        return $model;
    }
    /**
     * @description 权益兑换流水完整信息
     * @example 
     * @var EInstruction
     */
    public $instruction;

}
