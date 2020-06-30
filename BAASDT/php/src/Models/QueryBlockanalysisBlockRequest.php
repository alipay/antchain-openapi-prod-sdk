<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockanalysisBlockRequest extends Model {
    protected $_name = [
        'blockNumber' => 'block_number',
        'chainId' => 'chain_id',
        'delegatedTenantIds' => 'delegated_tenant_ids',
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
        if (null !== $this->delegatedTenantIds) {
            $res['delegated_tenant_ids'] = [];
            if(null !== $this->delegatedTenantIds){
                $res['delegated_tenant_ids'] = $this->delegatedTenantIds;
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockanalysisBlockRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['block_number'])){
            $model->blockNumber = $map['block_number'];
        }
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['delegated_tenant_ids'])){
            if(!empty($map['delegated_tenant_ids'])){
                $model->delegatedTenantIds = [];
                $model->delegatedTenantIds = $map['delegated_tenant_ids'];
            }
        }
        return $model;
    }
    /**
     * @description 区块高度
     * @example 123
     * @var integer
     */
    public $blockNumber;

    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 代理查询区块信息，传入代理租户需有代理权限。接口会返回调用者和被代理租户能查看的所有交易信息。
     * @example 
     * @var array
     */
    public $delegatedTenantIds;

}
