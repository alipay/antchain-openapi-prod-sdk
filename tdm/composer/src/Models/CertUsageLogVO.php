<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CertUsageLogVO extends Model
{
    // 使用方名称
    /**
     * @example 招商银行
     *
     * @var string
     */
    public $userName;

    // 使用时间
    /**
     * @example 2021-05-06 20:54:29
     *
     * @var string
     */
    public $usageTime;

    // 证明类型
    /**
     * @example JCZM
     *
     * @var string
     */
    public $issueCertType;

    // 证明类型描述
    /**
     * @example 缴存证明
     *
     * @var string
     */
    public $issueCertTypeDesc;

    // 证明开具时间
    /**
     * @example 2021-05-06 20:54:29
     *
     * @var string
     */
    public $issueTime;

    // 用途
    /**
     * @example 住房贷款
     *
     * @var string
     */
    public $purpose;

    // 业务流水号
    /**
     * @example 20201125010000RD831500012865
     *
     * @var string
     */
    public $bizId;
    protected $_name = [
        'userName'          => 'user_name',
        'usageTime'         => 'usage_time',
        'issueCertType'     => 'issue_cert_type',
        'issueCertTypeDesc' => 'issue_cert_type_desc',
        'issueTime'         => 'issue_time',
        'purpose'           => 'purpose',
        'bizId'             => 'biz_id',
    ];

    public function validate()
    {
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('usageTime', $this->usageTime, true);
        Model::validateRequired('issueCertType', $this->issueCertType, true);
        Model::validateRequired('issueCertTypeDesc', $this->issueCertTypeDesc, true);
        Model::validateRequired('issueTime', $this->issueTime, true);
        Model::validateRequired('purpose', $this->purpose, true);
        Model::validateRequired('bizId', $this->bizId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->usageTime) {
            $res['usage_time'] = $this->usageTime;
        }
        if (null !== $this->issueCertType) {
            $res['issue_cert_type'] = $this->issueCertType;
        }
        if (null !== $this->issueCertTypeDesc) {
            $res['issue_cert_type_desc'] = $this->issueCertTypeDesc;
        }
        if (null !== $this->issueTime) {
            $res['issue_time'] = $this->issueTime;
        }
        if (null !== $this->purpose) {
            $res['purpose'] = $this->purpose;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertUsageLogVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['usage_time'])) {
            $model->usageTime = $map['usage_time'];
        }
        if (isset($map['issue_cert_type'])) {
            $model->issueCertType = $map['issue_cert_type'];
        }
        if (isset($map['issue_cert_type_desc'])) {
            $model->issueCertTypeDesc = $map['issue_cert_type_desc'];
        }
        if (isset($map['issue_time'])) {
            $model->issueTime = $map['issue_time'];
        }
        if (isset($map['purpose'])) {
            $model->purpose = $map['purpose'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }

        return $model;
    }
}
