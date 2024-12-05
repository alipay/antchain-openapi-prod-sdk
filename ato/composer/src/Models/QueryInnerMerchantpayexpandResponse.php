<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerMerchantpayexpandResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 公司信息
    /**
     * @var CompanyInfo
     */
    public $companyInfo;

    // 法人信息
    /**
     * @var LegalInfo
     */
    public $legalInfo;

    // 应用信息
    /**
     * @var ApplicationInfo
     */
    public $applicationInfo;

    // 审核列表
    /**
     * @var AuditInfo[]
     */
    public $auditInfos;

    // 进件流水号
    /**
     * @var string
     */
    public $payExpandId;

    // 进件模式 DIRECT(直连进件) AGENT(代理进件)
    /**
     * @var string
     */
    public $expandMode;

    // INIT:草稿态 SUB_MERCHANT_CREDIT:二级户商户签约中 AUDIT:审核中 AUDIT_PASSED:进件成功 AUDIT_NOT_PASSED:进件失败 MERCHANT_CONFIRM:待商户确认
    /**
     * @var string
     */
    public $expandStatus;

    // 进件失败描述
    /**
     * @var string
     */
    public $expandFailReason;

    // 是否展示客服信息登记入口
    /**
     * @var bool
     */
    public $showCustomerServiceBanner;
    protected $_name = [
        'reqMsgId'                  => 'req_msg_id',
        'resultCode'                => 'result_code',
        'resultMsg'                 => 'result_msg',
        'companyInfo'               => 'company_info',
        'legalInfo'                 => 'legal_info',
        'applicationInfo'           => 'application_info',
        'auditInfos'                => 'audit_infos',
        'payExpandId'               => 'pay_expand_id',
        'expandMode'                => 'expand_mode',
        'expandStatus'              => 'expand_status',
        'expandFailReason'          => 'expand_fail_reason',
        'showCustomerServiceBanner' => 'show_customer_service_banner',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->companyInfo) {
            $res['company_info'] = null !== $this->companyInfo ? $this->companyInfo->toMap() : null;
        }
        if (null !== $this->legalInfo) {
            $res['legal_info'] = null !== $this->legalInfo ? $this->legalInfo->toMap() : null;
        }
        if (null !== $this->applicationInfo) {
            $res['application_info'] = null !== $this->applicationInfo ? $this->applicationInfo->toMap() : null;
        }
        if (null !== $this->auditInfos) {
            $res['audit_infos'] = [];
            if (null !== $this->auditInfos && \is_array($this->auditInfos)) {
                $n = 0;
                foreach ($this->auditInfos as $item) {
                    $res['audit_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->payExpandId) {
            $res['pay_expand_id'] = $this->payExpandId;
        }
        if (null !== $this->expandMode) {
            $res['expand_mode'] = $this->expandMode;
        }
        if (null !== $this->expandStatus) {
            $res['expand_status'] = $this->expandStatus;
        }
        if (null !== $this->expandFailReason) {
            $res['expand_fail_reason'] = $this->expandFailReason;
        }
        if (null !== $this->showCustomerServiceBanner) {
            $res['show_customer_service_banner'] = $this->showCustomerServiceBanner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerMerchantpayexpandResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['company_info'])) {
            $model->companyInfo = CompanyInfo::fromMap($map['company_info']);
        }
        if (isset($map['legal_info'])) {
            $model->legalInfo = LegalInfo::fromMap($map['legal_info']);
        }
        if (isset($map['application_info'])) {
            $model->applicationInfo = ApplicationInfo::fromMap($map['application_info']);
        }
        if (isset($map['audit_infos'])) {
            if (!empty($map['audit_infos'])) {
                $model->auditInfos = [];
                $n                 = 0;
                foreach ($map['audit_infos'] as $item) {
                    $model->auditInfos[$n++] = null !== $item ? AuditInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pay_expand_id'])) {
            $model->payExpandId = $map['pay_expand_id'];
        }
        if (isset($map['expand_mode'])) {
            $model->expandMode = $map['expand_mode'];
        }
        if (isset($map['expand_status'])) {
            $model->expandStatus = $map['expand_status'];
        }
        if (isset($map['expand_fail_reason'])) {
            $model->expandFailReason = $map['expand_fail_reason'];
        }
        if (isset($map['show_customer_service_banner'])) {
            $model->showCustomerServiceBanner = $map['show_customer_service_banner'];
        }

        return $model;
    }
}
