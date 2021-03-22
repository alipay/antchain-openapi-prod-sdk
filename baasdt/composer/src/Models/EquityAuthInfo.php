<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class EquityAuthInfo extends Model
{
    // 链ID
    /**
     * @example antdao
     *
     * @var string
     */
    public $chainId;

    // 商品ID
    /**
     * @example 188d87015a17465e0d3f61b7afe9e66cd2c070ca7f3bca142f53a8c5238a848a
     *
     * @var string
     */
    public $equityId;

    // 授权租户
    /**
     * @example OREDKOCA
     *
     * @var string
     */
    public $openToTenantId;

    // 租户价格（自定义价格）
    /**
     * @example 10.09
     *
     * @var string
     */
    public $tenantPrice;

    // 区块高度
    /**
     * @example 17337250
     *
     * @var string
     */
    public $blockNumber;

    // 交易hash
    /**
     * @example cf4a96419ca8ed21c84b6ba428babb7b75009927f8225d44f2974453028812eb
     *
     * @var string
     */
    public $txHash;

    // 区块时间戳
    /**
     * @example 1594896477580
     *
     * @var int
     */
    public $blockTime;
    protected $_name = [
        'chainId'        => 'chain_id',
        'equityId'       => 'equity_id',
        'openToTenantId' => 'open_to_tenant_id',
        'tenantPrice'    => 'tenant_price',
        'blockNumber'    => 'block_number',
        'txHash'         => 'tx_hash',
        'blockTime'      => 'block_time',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('equityId', $this->equityId, true);
        Model::validateRequired('openToTenantId', $this->openToTenantId, true);
        Model::validateRequired('tenantPrice', $this->tenantPrice, true);
        Model::validateRequired('blockNumber', $this->blockNumber, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('blockTime', $this->blockTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        if (null !== $this->openToTenantId) {
            $res['open_to_tenant_id'] = $this->openToTenantId;
        }
        if (null !== $this->tenantPrice) {
            $res['tenant_price'] = $this->tenantPrice;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->blockTime) {
            $res['block_time'] = $this->blockTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EquityAuthInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['equity_id'])) {
            $model->equityId = $map['equity_id'];
        }
        if (isset($map['open_to_tenant_id'])) {
            $model->openToTenantId = $map['open_to_tenant_id'];
        }
        if (isset($map['tenant_price'])) {
            $model->tenantPrice = $map['tenant_price'];
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['block_time'])) {
            $model->blockTime = $map['block_time'];
        }

        return $model;
    }
}
