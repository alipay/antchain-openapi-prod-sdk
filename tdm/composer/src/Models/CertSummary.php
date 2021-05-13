<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CertSummary extends Model
{
    // 证明文件ID
    /**
     * @example 20201125010000RD831500012865
     *
     * @var string
     */
    public $issueId;

    // 证明文件类型
    /**
     * @example JCZM
     *
     * @var string
     */
    public $issueCertType;

    // 证明文件描述
    /**
     * @example xx公积金中心xx证明
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

    // 证明图标（未使用）
    /**
     * @example 证明图标
     *
     * @var string
     */
    public $issueIcon;
    protected $_name = [
        'issueId'           => 'issue_id',
        'issueCertType'     => 'issue_cert_type',
        'issueCertTypeDesc' => 'issue_cert_type_desc',
        'issueTime'         => 'issue_time',
        'issueIcon'         => 'issue_icon',
    ];

    public function validate()
    {
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validateRequired('issueCertType', $this->issueCertType, true);
        Model::validateRequired('issueCertTypeDesc', $this->issueCertTypeDesc, true);
        Model::validateRequired('issueTime', $this->issueTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
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
        if (null !== $this->issueIcon) {
            $res['issue_icon'] = $this->issueIcon;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertSummary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
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
        if (isset($map['issue_icon'])) {
            $model->issueIcon = $map['issue_icon'];
        }

        return $model;
    }
}
