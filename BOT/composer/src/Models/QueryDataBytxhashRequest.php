<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryDataBytxhashRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 链上交易hash
    /**
     * @var string
     */
    public $txHash;

    // 上链类型枚举：
    // REGISTER_DEVICE	设备注册
    // DISTRIBUTE_DEVICE	设备发行
    // LABEL_DATA	标签流转数据收集
    // COLLECT_DATA	设备数据收集
    // DEVICE_BIZ_DATA	设备业务订单数据收集
    // REGISTER_PERIPHERAL_DEVICE	外围设备注册
    /**
     * @var string
     */
    public $contractMethod;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'txHash'            => 'tx_hash',
        'contractMethod'    => 'contract_method',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('contractMethod', $this->contractMethod, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->contractMethod) {
            $res['contract_method'] = $this->contractMethod;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDataBytxhashRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['contract_method'])) {
            $model->contractMethod = $map['contract_method'];
        }

        return $model;
    }
}
