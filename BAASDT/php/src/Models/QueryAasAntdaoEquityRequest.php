<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAasAntdaoEquityRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'chainId' => 'chain_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'equityId' => 'equity_id',
        'optTenantId' => 'opt_tenant_id',
        'targetDate' => 'target_date',
        'userId' => 'user_id',
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
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->targetDate) {
            $res['target_date'] = $this->targetDate;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAasAntdaoEquityRequest
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
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if(isset($map['equity_id'])){
            $model->equityId = $map['equity_id'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if(isset($map['target_date'])){
            $model->targetDate = $map['target_date'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
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

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 要代理操作的租户ID
    /**
     * @var string
     */
    public $delegatedTenantId;

    // 权益商品ID
    /**
     * @var string
     */
    public $equityId;

    // 被检索商户ID
    /**
     * @var string
     */
    public $optTenantId;

    // 交易限制日期(yyyyMMdd或yyyyMM)(可选)
    /**
     * @var string
     */
    public $targetDate;

    // 被检索用户ID
    /**
     * @var string
     */
    public $userId;

}
