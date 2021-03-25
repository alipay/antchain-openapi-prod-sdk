<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAasAntdaoBlockanalysisBlockRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'blockNumber' => 'block_number',
        'chainId' => 'chain_id',
        'delegatedTenantIds' => 'delegated_tenant_ids',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
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
     * @return QueryAasAntdaoBlockanalysisBlockRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
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
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 区块高度
    /**
     * @var integer
     */
    public $blockNumber;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 代理查询区块信息，传入代理租户需有代理权限。接口会返回调用者和被代理租户能查看的所有交易信息。
    /**
     * @var array
     */
    public $delegatedTenantIds;

}
