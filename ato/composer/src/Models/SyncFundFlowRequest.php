<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncFundFlowRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 商户统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 资方统一社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 电子签署流程ID, 业务方唯一id，每一个签署流程唯一确定一个flowId
    /**
     * @var string
     */
    public $flowId;

    // 合同待签署url
    /**
     * @var string
     */
    public $signUrl;

    // 合同类型
    // TRANSFER(传授信合同)、AUTHORIZATION(授权函)、CREDIT_UTILIZATION(用信合同)、OTHER(其他)
    /**
     * @var string
     */
    public $contractType;

    // 合同名称，资方可自行命名，传授信合同/征信授权函/保理合同/其他
    /**
     * @var string
     */
    public $contractName;

    // json格式 拓展信息 由资方自行推送补充内容，例如签署最晚时间、签署要求等
    /**
     * @var string
     */
    public $extendInfo;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'merchantId'        => 'merchant_id',
        'fundId'            => 'fund_id',
        'flowId'            => 'flow_id',
        'signUrl'           => 'sign_url',
        'contractType'      => 'contract_type',
        'contractName'      => 'contract_name',
        'extendInfo'        => 'extend_info',
        'tenantId'          => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('signUrl', $this->signUrl, true);
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('extendInfo', $this->extendInfo, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->signUrl) {
            $res['sign_url'] = $this->signUrl;
        }
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncFundFlowRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['sign_url'])) {
            $model->signUrl = $map['sign_url'];
        }
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['extend_info'])) {
            $model->extendInfo = $map['extend_info'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
