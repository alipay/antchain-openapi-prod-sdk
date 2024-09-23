<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerFunddividerelationResponse extends Model
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

    // 分账公司名称
    /**
     * @var string
     */
    public $companyName;

    // 分账主体企业统一社会信用代码
    /**
     * @var string
     */
    public $subjectMerchantId;

    // 分账主体公司名称
    /**
     * @var string
     */
    public $subjectCompanyName;

    // 分账对象统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 分账合同或协议
    /**
     * @var FileInfo[]
     */
    public $contractFiles;

    // 分账关系说明
    /**
     * @var string
     */
    public $desc;

    // 分账方企业pid
    /**
     * @var string
     */
    public $alipayPid;

    // 分账方企业支付宝账号
    /**
     * @var string
     */
    public $alipayAccount;

    // 审核列表
    /**
     * @var AuditInfo[]
     */
    public $auditInfos;

    // INIT:待提交 AUDIT:审批中 AUDIT_PASSED:审批通过 AUDIT_NOT_PASSED:审批不通过
    /**
     * @var string
     */
    public $relationStatus;

    // 分账关系绑定失败原因
    /**
     * @var string
     */
    public $relationFailReason;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'companyName'        => 'company_name',
        'subjectMerchantId'  => 'subject_merchant_id',
        'subjectCompanyName' => 'subject_company_name',
        'merchantId'         => 'merchant_id',
        'contractFiles'      => 'contract_files',
        'desc'               => 'desc',
        'alipayPid'          => 'alipay_pid',
        'alipayAccount'      => 'alipay_account',
        'auditInfos'         => 'audit_infos',
        'relationStatus'     => 'relation_status',
        'relationFailReason' => 'relation_fail_reason',
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
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->subjectMerchantId) {
            $res['subject_merchant_id'] = $this->subjectMerchantId;
        }
        if (null !== $this->subjectCompanyName) {
            $res['subject_company_name'] = $this->subjectCompanyName;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->contractFiles) {
            $res['contract_files'] = [];
            if (null !== $this->contractFiles && \is_array($this->contractFiles)) {
                $n = 0;
                foreach ($this->contractFiles as $item) {
                    $res['contract_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->alipayPid) {
            $res['alipay_pid'] = $this->alipayPid;
        }
        if (null !== $this->alipayAccount) {
            $res['alipay_account'] = $this->alipayAccount;
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
        if (null !== $this->relationStatus) {
            $res['relation_status'] = $this->relationStatus;
        }
        if (null !== $this->relationFailReason) {
            $res['relation_fail_reason'] = $this->relationFailReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerFunddividerelationResponse
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
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['subject_merchant_id'])) {
            $model->subjectMerchantId = $map['subject_merchant_id'];
        }
        if (isset($map['subject_company_name'])) {
            $model->subjectCompanyName = $map['subject_company_name'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['contract_files'])) {
            if (!empty($map['contract_files'])) {
                $model->contractFiles = [];
                $n                    = 0;
                foreach ($map['contract_files'] as $item) {
                    $model->contractFiles[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['alipay_pid'])) {
            $model->alipayPid = $map['alipay_pid'];
        }
        if (isset($map['alipay_account'])) {
            $model->alipayAccount = $map['alipay_account'];
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
        if (isset($map['relation_status'])) {
            $model->relationStatus = $map['relation_status'];
        }
        if (isset($map['relation_fail_reason'])) {
            $model->relationFailReason = $map['relation_fail_reason'];
        }

        return $model;
    }
}
