<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CreateOrderWorkflowRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 待开通类商品列表
    /**
     * @var string[]
     */
    public $productList;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 下单交易流水号，唯一
    /**
     * @var string
     */
    public $bizNo;

    // 标签对象
    /**
     * @var InstanceLabel[]
     */
    public $instanceLabels;
    protected $_name = [
        'authToken'      => 'auth_token',
        'productList'    => 'product_list',
        'tenantId'       => 'tenant_id',
        'bizNo'          => 'biz_no',
        'instanceLabels' => 'instance_labels',
    ];

    public function validate()
    {
        Model::validateRequired('productList', $this->productList, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('instanceLabels', $this->instanceLabels, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productList) {
            $res['product_list'] = $this->productList;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->instanceLabels) {
            $res['instance_labels'] = [];
            if (null !== $this->instanceLabels && \is_array($this->instanceLabels)) {
                $n = 0;
                foreach ($this->instanceLabels as $item) {
                    $res['instance_labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateOrderWorkflowRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_list'])) {
            if (!empty($map['product_list'])) {
                $model->productList = $map['product_list'];
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['instance_labels'])) {
            if (!empty($map['instance_labels'])) {
                $model->instanceLabels = [];
                $n                     = 0;
                foreach ($map['instance_labels'] as $item) {
                    $model->instanceLabels[$n++] = null !== $item ? InstanceLabel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
