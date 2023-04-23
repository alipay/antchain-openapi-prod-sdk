<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class CreateExpenditureProjectRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户来源-用于租户间功能和数据隔离
    /**
     * @var string
     */
    public $source;

    // 合作计划id
    /**
     * @var int
     */
    public $cooperationPlanId;

    // 业务单据号-用于幂等
    /**
     * @var string
     */
    public $businessNo;

    // 合作方-用户id
    /**
     * @var string
     */
    public $tenantId;

    // 参与人列表
    /**
     * @var Participant[]
     */
    public $participants;

    // 支出配置单请求信息
    /**
     * @var ExpenditureQuotationRequest
     */
    public $expenditureQuotationRequest;

    // 签约请求
    /**
     * @var SignRequest
     */
    public $signRequest;

    // 结算请求
    /**
     * @var SettlementRequest
     */
    public $settlementRequest;

    // 生效时间
    /**
     * @var string
     */
    public $validTime;

    // 失效时间
    /**
     * @var string
     */
    public $invalidTime;

    // 扩展信息
    /**
     * @var string
     */
    public $extendInfo;
    protected $_name = [
        'authToken'                   => 'auth_token',
        'source'                      => 'source',
        'cooperationPlanId'           => 'cooperation_plan_id',
        'businessNo'                  => 'business_no',
        'tenantId'                    => 'tenant_id',
        'participants'                => 'participants',
        'expenditureQuotationRequest' => 'expenditure_quotation_request',
        'signRequest'                 => 'sign_request',
        'settlementRequest'           => 'settlement_request',
        'validTime'                   => 'valid_time',
        'invalidTime'                 => 'invalid_time',
        'extendInfo'                  => 'extend_info',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('cooperationPlanId', $this->cooperationPlanId, true);
        Model::validateRequired('businessNo', $this->businessNo, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('participants', $this->participants, true);
        Model::validateRequired('expenditureQuotationRequest', $this->expenditureQuotationRequest, true);
        Model::validateRequired('signRequest', $this->signRequest, true);
        Model::validateRequired('settlementRequest', $this->settlementRequest, true);
        Model::validateRequired('invalidTime', $this->invalidTime, true);
        Model::validateRequired('extendInfo', $this->extendInfo, true);
        Model::validatePattern('validTime', $this->validTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('invalidTime', $this->invalidTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->cooperationPlanId) {
            $res['cooperation_plan_id'] = $this->cooperationPlanId;
        }
        if (null !== $this->businessNo) {
            $res['business_no'] = $this->businessNo;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->participants) {
            $res['participants'] = [];
            if (null !== $this->participants && \is_array($this->participants)) {
                $n = 0;
                foreach ($this->participants as $item) {
                    $res['participants'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->expenditureQuotationRequest) {
            $res['expenditure_quotation_request'] = null !== $this->expenditureQuotationRequest ? $this->expenditureQuotationRequest->toMap() : null;
        }
        if (null !== $this->signRequest) {
            $res['sign_request'] = null !== $this->signRequest ? $this->signRequest->toMap() : null;
        }
        if (null !== $this->settlementRequest) {
            $res['settlement_request'] = null !== $this->settlementRequest ? $this->settlementRequest->toMap() : null;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->invalidTime) {
            $res['invalid_time'] = $this->invalidTime;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateExpenditureProjectRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['cooperation_plan_id'])) {
            $model->cooperationPlanId = $map['cooperation_plan_id'];
        }
        if (isset($map['business_no'])) {
            $model->businessNo = $map['business_no'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['participants'])) {
            if (!empty($map['participants'])) {
                $model->participants = [];
                $n                   = 0;
                foreach ($map['participants'] as $item) {
                    $model->participants[$n++] = null !== $item ? Participant::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['expenditure_quotation_request'])) {
            $model->expenditureQuotationRequest = ExpenditureQuotationRequest::fromMap($map['expenditure_quotation_request']);
        }
        if (isset($map['sign_request'])) {
            $model->signRequest = SignRequest::fromMap($map['sign_request']);
        }
        if (isset($map['settlement_request'])) {
            $model->settlementRequest = SettlementRequest::fromMap($map['settlement_request']);
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['invalid_time'])) {
            $model->invalidTime = $map['invalid_time'];
        }
        if (isset($map['extend_info'])) {
            $model->extendInfo = $map['extend_info'];
        }

        return $model;
    }
}
