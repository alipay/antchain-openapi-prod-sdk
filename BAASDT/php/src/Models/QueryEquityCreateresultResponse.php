<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryEquityCreateresultResponse extends Model {
    protected $_name = [
        'equityId' => 'equity_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryEquityCreateresultResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['equity_id'])){
            $model->equityId = $map['equity_id'];
        }
        return $model;
    }
    /**
     * @description 权益商品创建成功，返回权益ID
     * @example 2cb1221624c5c5fc56f6d82a103d76cc368f575729a...
     * @var string
     */
    public $equityId;

}
