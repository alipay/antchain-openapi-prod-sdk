<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CreateAutotestopsRequest extends Model
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

    // 环境id
    /**
     * @var string
     */
    public $envId;

    // 测试单名字
    /**
     * @var string
     */
    public $name;

    // 需要测试的产品
    /**
     * @var AutoTestProduct[]
     */
    public $products;

    // 单元的id
    /**
     * @var string
     */
    public $cellId;

    // 如果未设置，默认返回NORMAL_JOB，NORMAL_JOB：通用一次任务；HAS_JOB：巡检一次任务
    //
    //
    /**
     * @var string
     */
    public $autoTestType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'envId'             => 'env_id',
        'name'              => 'name',
        'products'          => 'products',
        'cellId'            => 'cell_id',
        'autoTestType'      => 'auto_test_type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('products', $this->products, true);
        Model::validateRequired('cellId', $this->cellId, true);
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
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->products) {
            $res['products'] = [];
            if (null !== $this->products && \is_array($this->products)) {
                $n = 0;
                foreach ($this->products as $item) {
                    $res['products'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->autoTestType) {
            $res['auto_test_type'] = $this->autoTestType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAutotestopsRequest
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
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['products'])) {
            if (!empty($map['products'])) {
                $model->products = [];
                $n               = 0;
                foreach ($map['products'] as $item) {
                    $model->products[$n++] = null !== $item ? AutoTestProduct::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }
        if (isset($map['auto_test_type'])) {
            $model->autoTestType = $map['auto_test_type'];
        }

        return $model;
    }
}
