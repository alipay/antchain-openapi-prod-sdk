<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMypointsSkuRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'env' => 'env',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMypointsSkuRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['env'])){
            $model->env = $map['env'];
        }
        return $model;
    }
    /**
     * @description 区块链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 环境标识
     * @example prod
     * @var string
     */
    public $env;

}
