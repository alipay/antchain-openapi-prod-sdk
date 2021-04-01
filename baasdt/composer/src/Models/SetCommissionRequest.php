<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetCommissionRequest extends Model
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

    // 手续费列表，可传入多个
    /**
     * @var Commission[]
     */
    public $commissions;

    // 商品类型。可按照如下文档查询商品对应的类型，及数据格式 https://tech.antfin.com/docs/2/163896
    /**
     * @var int
     */
    public $equityType;

    // 是否设置全局手续费。若是false，需传入optTenantId
    /**
     * @var bool
     */
    public $ifGlobal;

    // 要设置手续费的租户对象，如果为空表示设置全局手续费（IfGlobal需设置为true）
    /**
     * @var string
     */
    public $optTenantId;

    // 交易幂等ID
    /**
     * @var string
     */
    public $outTxId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'commissions'       => 'commissions',
        'equityType'        => 'equity_type',
        'ifGlobal'          => 'if_global',
        'optTenantId'       => 'opt_tenant_id',
        'outTxId'           => 'out_tx_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('commissions', $this->commissions, true);
        Model::validateRequired('equityType', $this->equityType, true);
        Model::validateRequired('outTxId', $this->outTxId, true);
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
        if (null !== $this->commissions) {
            $res['commissions'] = [];
            if (null !== $this->commissions && \is_array($this->commissions)) {
                $n = 0;
                foreach ($this->commissions as $item) {
                    $res['commissions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->equityType) {
            $res['equity_type'] = $this->equityType;
        }
        if (null !== $this->ifGlobal) {
            $res['if_global'] = $this->ifGlobal;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetCommissionRequest
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
        if (isset($map['commissions'])) {
            if (!empty($map['commissions'])) {
                $model->commissions = [];
                $n                  = 0;
                foreach ($map['commissions'] as $item) {
                    $model->commissions[$n++] = null !== $item ? Commission::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['equity_type'])) {
            $model->equityType = $map['equity_type'];
        }
        if (isset($map['if_global'])) {
            $model->ifGlobal = $map['if_global'];
        }
        if (isset($map['opt_tenant_id'])) {
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }

        return $model;
    }
}
