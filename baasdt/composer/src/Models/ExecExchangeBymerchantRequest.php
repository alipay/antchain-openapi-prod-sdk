<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecExchangeBymerchantRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 资产ID
    /**
     * @var string
     */
    public $assetId;

    // 当前希望按照上述比例扣减用户资产
    /**
     * @var string
     */
    public $assetRate;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 权益商品ID，例：7f1be9108651f97513b5b59030f5b059e58a59d263ab426cbf26337f91642caa
    /**
     * @var string
     */
    public $equityId;

    // 用户兑换价格接口设置的价格（单位：元）
    /**
     * @var string
     */
    public $equityPrice;

    // 兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    // 比如在兑换手机直充商品时，需要对{"countryCode": "86", "phone": "13900000000"} 使用供应商的公钥进行加密。
    /**
     * @var string
     */
    public $memo;

    // 权益商品兑换外部流水ID，调用方自定义流水ID
    /**
     * @var string
     */
    public $outTxId;

    // 采购商如果绑定了附加的公私钥对。在兑换商品时需要对SHA256(out_tx_id+tenant_id+asset_id+equity_id+equity_price+asset_rate+user_id+memo)使用ECC K1私钥签名（算法ECDSAWithSHA256，曲线Secp256K1），并转换为Hex。
    /**
     * @var string
     */
    public $txSig;

    // 受益用户名
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'assetId'           => 'asset_id',
        'assetRate'         => 'asset_rate',
        'chainId'           => 'chain_id',
        'equityId'          => 'equity_id',
        'equityPrice'       => 'equity_price',
        'memo'              => 'memo',
        'outTxId'           => 'out_tx_id',
        'txSig'             => 'tx_sig',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('assetRate', $this->assetRate, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('equityId', $this->equityId, true);
        Model::validateRequired('equityPrice', $this->equityPrice, true);
        Model::validateRequired('outTxId', $this->outTxId, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->assetRate) {
            $res['asset_rate'] = $this->assetRate;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        if (null !== $this->equityPrice) {
            $res['equity_price'] = $this->equityPrice;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->txSig) {
            $res['tx_sig'] = $this->txSig;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecExchangeBymerchantRequest
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
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['asset_rate'])) {
            $model->assetRate = $map['asset_rate'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['equity_id'])) {
            $model->equityId = $map['equity_id'];
        }
        if (isset($map['equity_price'])) {
            $model->equityPrice = $map['equity_price'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }
        if (isset($map['tx_sig'])) {
            $model->txSig = $map['tx_sig'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
