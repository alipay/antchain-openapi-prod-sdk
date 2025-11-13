<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RenderInnerFundmngmerchantpromiseRequest extends Model
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

    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;

    // 商户履约计划excel文件
    /**
     * @var FileInfo
     */
    public $fileInfo;

    // traceid
    /**
     * @var string
     */
    public $traceId;

    // 资方社会统一信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商户社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 商户履约起始期数
    /**
     * @var int
     */
    public $payStartTermIndex;

    // 融资模式
    // 供应链金融: SUPPLY_CHAIN_FINANCE
    // 自定义还款: DEFAULT
    /**
     * @var string
     */
    public $fundMode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundTenantId'      => 'fund_tenant_id',
        'fileInfo'          => 'file_info',
        'traceId'           => 'trace_id',
        'fundId'            => 'fund_id',
        'tenantId'          => 'tenant_id',
        'merchantId'        => 'merchant_id',
        'orderId'           => 'order_id',
        'payStartTermIndex' => 'pay_start_term_index',
        'fundMode'          => 'fund_mode',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('fileInfo', $this->fileInfo, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('payStartTermIndex', $this->payStartTermIndex, true);
        Model::validateRequired('fundMode', $this->fundMode, true);
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
        if (null !== $this->fundTenantId) {
            $res['fund_tenant_id'] = $this->fundTenantId;
        }
        if (null !== $this->fileInfo) {
            $res['file_info'] = null !== $this->fileInfo ? $this->fileInfo->toMap() : null;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->payStartTermIndex) {
            $res['pay_start_term_index'] = $this->payStartTermIndex;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RenderInnerFundmngmerchantpromiseRequest
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
        if (isset($map['fund_tenant_id'])) {
            $model->fundTenantId = $map['fund_tenant_id'];
        }
        if (isset($map['file_info'])) {
            $model->fileInfo = FileInfo::fromMap($map['file_info']);
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['pay_start_term_index'])) {
            $model->payStartTermIndex = $map['pay_start_term_index'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }

        return $model;
    }
}
