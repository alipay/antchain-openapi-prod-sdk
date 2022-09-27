<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainBbpCustomerRequest extends Model
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

    // 查询内容
    /**
     * @var QueryMap[]
     */
    public $conditionMap;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'conditionMap'      => 'condition_map',
    ];

    public function validate()
    {
        Model::validateRequired('conditionMap', $this->conditionMap, true);
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
        if (null !== $this->conditionMap) {
            $res['condition_map'] = [];
            if (null !== $this->conditionMap && \is_array($this->conditionMap)) {
                $n = 0;
                foreach ($this->conditionMap as $item) {
                    $res['condition_map'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainBbpCustomerRequest
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
        if (isset($map['condition_map'])) {
            if (!empty($map['condition_map'])) {
                $model->conditionMap = [];
                $n                   = 0;
                foreach ($map['condition_map'] as $item) {
                    $model->conditionMap[$n++] = null !== $item ? QueryMap::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
