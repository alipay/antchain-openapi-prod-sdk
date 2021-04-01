<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateDigitalassetExchangeAccountmapRequest extends Model
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

    // 业务方需映射的账户列表
    /**
     * @var ExchangeAccountMap[]
     */
    public $accountMapParams;

    // 交易所代码
    /**
     * @var string
     */
    public $exchangeCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountMapParams'  => 'account_map_params',
        'exchangeCode'      => 'exchange_code',
    ];

    public function validate()
    {
        Model::validateRequired('accountMapParams', $this->accountMapParams, true);
        Model::validateRequired('exchangeCode', $this->exchangeCode, true);
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
        if (null !== $this->accountMapParams) {
            $res['account_map_params'] = [];
            if (null !== $this->accountMapParams && \is_array($this->accountMapParams)) {
                $n = 0;
                foreach ($this->accountMapParams as $item) {
                    $res['account_map_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->exchangeCode) {
            $res['exchange_code'] = $this->exchangeCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateDigitalassetExchangeAccountmapRequest
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
        if (isset($map['account_map_params'])) {
            if (!empty($map['account_map_params'])) {
                $model->accountMapParams = [];
                $n                       = 0;
                foreach ($map['account_map_params'] as $item) {
                    $model->accountMapParams[$n++] = null !== $item ? ExchangeAccountMap::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['exchange_code'])) {
            $model->exchangeCode = $map['exchange_code'];
        }

        return $model;
    }
}
