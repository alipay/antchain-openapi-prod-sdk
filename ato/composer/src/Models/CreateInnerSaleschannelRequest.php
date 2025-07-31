<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateInnerSaleschannelRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 投放类型
    /**
     * @var string
     */
    public $deliveryType;

    // 父级级别的渠道code
    /**
     * @var string
     */
    public $parentChannelCode;

    // 渠道名称，30个字以内
    /**
     * @var string
     */
    public $channelName;

    // 操作人域账号
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'deliveryType'      => 'delivery_type',
        'parentChannelCode' => 'parent_channel_code',
        'channelName'       => 'channel_name',
        'operator'          => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('deliveryType', $this->deliveryType, true);
        Model::validateRequired('channelName', $this->channelName, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->deliveryType) {
            $res['delivery_type'] = $this->deliveryType;
        }
        if (null !== $this->parentChannelCode) {
            $res['parent_channel_code'] = $this->parentChannelCode;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInnerSaleschannelRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['delivery_type'])) {
            $model->deliveryType = $map['delivery_type'];
        }
        if (isset($map['parent_channel_code'])) {
            $model->parentChannelCode = $map['parent_channel_code'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
