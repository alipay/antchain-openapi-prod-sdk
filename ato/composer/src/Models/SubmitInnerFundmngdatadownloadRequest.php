<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SubmitInnerFundmngdatadownloadRequest extends Model
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

    // 开始时间
    /**
     * @var string
     */
    public $startTime;

    // 结束时间
    /**
     * @var string
     */
    public $endTime;

    // 任务类型
    // DATAPHIN_FUND_MNG_DOWNLOAD_USER_PROIMSE：融资订单用户履约信息
    // DATAPHIN_FUND_MNG_DOWNLOAD_FINANCE_ORDER：融资订单交易履约明细
    // DATAPHIN_FUND_MNG_DOWNLOAD_FINANCE:融资订单放款信息
    //
    /**
     * @var string
     */
    public $type;

    // 商户社会统一信用代码，多个逗号分隔
    /**
     * @var string
     */
    public $merchantId;

    // 融资类型
    // SUPPLY_CHAIN_FINANCE:供应链金融
    /**
     * @var string
     */
    public $fundMode;

    // 放款渠道（根据枚举返回对应的excel模版，不作为数据筛选项）
    // ALIPAY；
    // BANK；
    /**
     * @var string
     */
    public $loanChannel;

    // traceid
    /**
     * @var string
     */
    public $traceId;

    // 租户角色
    //
    // ROLE_MERCHANT(0, "商户"),
    // ROLE_FINANCIER(1, "资金方"),
    // ROLE_MIX(2, "商户资金方"),
    // DATA_PROVIDER(3, "数据提供者"),
    // ROLE_GUARANTOR(4, "担保方"),
    /**
     * @var int
     */
    public $tenantRole;

    // 资方社会统一信用代码，多个逗号分隔
    /**
     * @var string
     */
    public $fundId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundTenantId'      => 'fund_tenant_id',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
        'type'              => 'type',
        'merchantId'        => 'merchant_id',
        'fundMode'          => 'fund_mode',
        'loanChannel'       => 'loan_channel',
        'traceId'           => 'trace_id',
        'tenantRole'        => 'tenant_role',
        'fundId'            => 'fund_id',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('traceId', $this->traceId, true);
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
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }
        if (null !== $this->loanChannel) {
            $res['loan_channel'] = $this->loanChannel;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->tenantRole) {
            $res['tenant_role'] = $this->tenantRole;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitInnerFundmngdatadownloadRequest
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
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }
        if (isset($map['loan_channel'])) {
            $model->loanChannel = $map['loan_channel'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['tenant_role'])) {
            $model->tenantRole = $map['tenant_role'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }

        return $model;
    }
}
