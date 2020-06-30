<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateEquityResponse extends Model {
    protected $_name = [
        'createEquityRequestId' => 'create_equity_request_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->createEquityRequestId) {
            $res['create_equity_request_id'] = $this->createEquityRequestId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateEquityResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['create_equity_request_id'])){
            $model->createEquityRequestId = $map['create_equity_request_id'];
        }
        return $model;
    }
    /**
     * @description 请求ID，用于查询异步发布权益结果
     * @example e7100d1d0d169bfa2cf6d8b66e57a16dd9d633e207e4775c7a392...
     * @var string
     */
    public $createEquityRequestId;

}
