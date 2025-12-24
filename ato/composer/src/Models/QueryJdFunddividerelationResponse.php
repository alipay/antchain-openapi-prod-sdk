<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryJdFunddividerelationResponse extends Model
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

    // 商户公司名称
    /**
     * @var string
     */
    public $subjectCompanyName;

    // 分账方租户8位id
    /**
     * @var string
     */
    public $divideTenantId;

    // 分账公司社会信用代码
    /**
     * @var string
     */
    public $divideMerchantId;

    // 分账方公司名称
    /**
     * @var string
     */
    public $divideCompanyName;

    // AUDIT:审批中
    // AUDIT_PASSED:审批通过
    // AUDIT_NOT_PASSED:审批不通过
    /**
     * @var string
     */
    public $relationStatus;

    // 京东商户号
    /**
     * @var string
     */
    public $divideJdMerchantNo;

    // 分账关系说明
    /**
     * @var string
     */
    public $desc;

    // 失败原因
    /**
     * @var string
     */
    public $failReason;

    // 分账协议文件
    /**
     * @var FileInfo[]
     */
    public $contractFiles;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'subjectCompanyName' => 'subject_company_name',
        'divideTenantId'     => 'divide_tenant_id',
        'divideMerchantId'   => 'divide_merchant_id',
        'divideCompanyName'  => 'divide_company_name',
        'relationStatus'     => 'relation_status',
        'divideJdMerchantNo' => 'divide_jd_merchant_no',
        'desc'               => 'desc',
        'failReason'         => 'fail_reason',
        'contractFiles'      => 'contract_files',
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
        if (null !== $this->subjectCompanyName) {
            $res['subject_company_name'] = $this->subjectCompanyName;
        }
        if (null !== $this->divideTenantId) {
            $res['divide_tenant_id'] = $this->divideTenantId;
        }
        if (null !== $this->divideMerchantId) {
            $res['divide_merchant_id'] = $this->divideMerchantId;
        }
        if (null !== $this->divideCompanyName) {
            $res['divide_company_name'] = $this->divideCompanyName;
        }
        if (null !== $this->relationStatus) {
            $res['relation_status'] = $this->relationStatus;
        }
        if (null !== $this->divideJdMerchantNo) {
            $res['divide_jd_merchant_no'] = $this->divideJdMerchantNo;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJdFunddividerelationResponse
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
        if (isset($map['subject_company_name'])) {
            $model->subjectCompanyName = $map['subject_company_name'];
        }
        if (isset($map['divide_tenant_id'])) {
            $model->divideTenantId = $map['divide_tenant_id'];
        }
        if (isset($map['divide_merchant_id'])) {
            $model->divideMerchantId = $map['divide_merchant_id'];
        }
        if (isset($map['divide_company_name'])) {
            $model->divideCompanyName = $map['divide_company_name'];
        }
        if (isset($map['relation_status'])) {
            $model->relationStatus = $map['relation_status'];
        }
        if (isset($map['divide_jd_merchant_no'])) {
            $model->divideJdMerchantNo = $map['divide_jd_merchant_no'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
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

        return $model;
    }
}
