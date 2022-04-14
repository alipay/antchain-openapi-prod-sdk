<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class SaveProductOpenRequest extends Model
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

    // 业务号
    /**
     * @var string
     */
    public $bizNo;

    // 租户 ID
    /**
     * @var string
     */
    public $tenantId;

    // 实例 ID，兼容老模型的 tntInstId
    /**
     * @var string
     */
    public $instanceId;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;

    // 模块唯一标识
    /**
     * @var string
     */
    public $moduleKey;

    // 操作类型
    /**
     * @var string
     */
    public $operate;

    // 操作来源渠道
    /**
     * @var string
     */
    public $channel;

    // 规格
    /**
     * @var CommoditySpec[]
     */
    public $commoditySpecs;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizNo'             => 'biz_no',
        'tenantId'          => 'tenant_id',
        'instanceId'        => 'instance_id',
        'productCode'       => 'product_code',
        'moduleKey'         => 'module_key',
        'operate'           => 'operate',
        'channel'           => 'channel',
        'commoditySpecs'    => 'commodity_specs',
    ];

    public function validate()
    {
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
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->moduleKey) {
            $res['module_key'] = $this->moduleKey;
        }
        if (null !== $this->operate) {
            $res['operate'] = $this->operate;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->commoditySpecs) {
            $res['commodity_specs'] = [];
            if (null !== $this->commoditySpecs && \is_array($this->commoditySpecs)) {
                $n = 0;
                foreach ($this->commoditySpecs as $item) {
                    $res['commodity_specs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveProductOpenRequest
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
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['module_key'])) {
            $model->moduleKey = $map['module_key'];
        }
        if (isset($map['operate'])) {
            $model->operate = $map['operate'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['commodity_specs'])) {
            if (!empty($map['commodity_specs'])) {
                $model->commoditySpecs = [];
                $n                     = 0;
                foreach ($map['commodity_specs'] as $item) {
                    $model->commoditySpecs[$n++] = null !== $item ? CommoditySpec::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
