<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryCommissionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 商品类型。可按照如下文档查询商品对应的类型，及数据格式https://tech.antfin.com/docs/2/163896
    /**
     * @var int
     */
    public $equityType;

    // 是否查询当前生效的手续费信息。如为false，则查询该商品的全部手续费信息
    /**
     * @var bool
     */
    public $ifCurrent;

    // 是否查询全局的手续费信息
    /**
     * @var bool
     */
    public $ifGlobal;

    // 查询该租户的手续费信息
    /**
     * @var string
     */
    public $delegatedTenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'equityType'        => 'equity_type',
        'ifCurrent'         => 'if_current',
        'ifGlobal'          => 'if_global',
        'delegatedTenantId' => 'delegated_tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('equityType', $this->equityType, true);
        Model::validateRequired('ifCurrent', $this->ifCurrent, true);
        Model::validateRequired('ifGlobal', $this->ifGlobal, true);
        Model::validateRequired('delegatedTenantId', $this->delegatedTenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->equityType) {
            $res['equity_type'] = $this->equityType;
        }
        if (null !== $this->ifCurrent) {
            $res['if_current'] = $this->ifCurrent;
        }
        if (null !== $this->ifGlobal) {
            $res['if_global'] = $this->ifGlobal;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCommissionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['equity_type'])) {
            $model->equityType = $map['equity_type'];
        }
        if (isset($map['if_current'])) {
            $model->ifCurrent = $map['if_current'];
        }
        if (isset($map['if_global'])) {
            $model->ifGlobal = $map['if_global'];
        }
        if (isset($map['delegated_tenant_id'])) {
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }

        return $model;
    }
}
