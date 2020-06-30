<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryEquityInstructionResponse extends Model {
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
     * @return QueryEquityInstructionResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['instruction'])){
            $model->instruction = EInstruction::fromMap($map['instruction']);
        }
        return $model;
    }
    /**
     * @description 权益流水json
type 兑换类型：0商户身份，1用户身份。
status 流水状态：0创建，1接单，3发货，4确认收货，5缺货，6核销
     * @example 
     * @var EInstruction
     */
    public $instruction;

}
