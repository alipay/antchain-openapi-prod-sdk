<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyUmktRealtimemarketingRequest extends Model
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

    // 营销盾内部租户下的子租户
    /**
     * @var string
     */
    public $subTenantId;

    //
    // 场景策略id
    /**
     * @var int
     */
    public $sceneStrategyId;

    // 外部流水号
    /**
     * @var string
     */
    public $outSerialNo;

    //
    // 用户参数类型
    /**
     * @var string
     */
    public $paramType;

    // 触达渠道配置
    /**
     * @var string
     */
    public $channelParams;

    // 扩展字段
    /**
     * @var string
     */
    public $extInfo;

    // 手机号/手机号md5
    /**
     * @var string
     */
    public $customerKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'subTenantId'       => 'sub_tenant_id',
        'sceneStrategyId'   => 'scene_strategy_id',
        'outSerialNo'       => 'out_serial_no',
        'paramType'         => 'param_type',
        'channelParams'     => 'channel_params',
        'extInfo'           => 'ext_info',
        'customerKey'       => 'customer_key',
    ];

    public function validate()
    {
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
        Model::validateRequired('outSerialNo', $this->outSerialNo, true);
        Model::validateRequired('paramType', $this->paramType, true);
        Model::validateRequired('customerKey', $this->customerKey, true);
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
        if (null !== $this->subTenantId) {
            $res['sub_tenant_id'] = $this->subTenantId;
        }
        if (null !== $this->sceneStrategyId) {
            $res['scene_strategy_id'] = $this->sceneStrategyId;
        }
        if (null !== $this->outSerialNo) {
            $res['out_serial_no'] = $this->outSerialNo;
        }
        if (null !== $this->paramType) {
            $res['param_type'] = $this->paramType;
        }
        if (null !== $this->channelParams) {
            $res['channel_params'] = $this->channelParams;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->customerKey) {
            $res['customer_key'] = $this->customerKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyUmktRealtimemarketingRequest
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
        if (isset($map['sub_tenant_id'])) {
            $model->subTenantId = $map['sub_tenant_id'];
        }
        if (isset($map['scene_strategy_id'])) {
            $model->sceneStrategyId = $map['scene_strategy_id'];
        }
        if (isset($map['out_serial_no'])) {
            $model->outSerialNo = $map['out_serial_no'];
        }
        if (isset($map['param_type'])) {
            $model->paramType = $map['param_type'];
        }
        if (isset($map['channel_params'])) {
            $model->channelParams = $map['channel_params'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }

        return $model;
    }
}
