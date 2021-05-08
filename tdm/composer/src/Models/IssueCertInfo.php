<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class IssueCertInfo extends Model
{
    // 证明文件ID
    /**
     * @example 20201125010000RD831500012865
     *
     * @var string
     */
    public $issueId;

    // 证明开具时间
    /**
     * @example 2021-05-06 20:54:29
     *
     * @var string
     */
    public $issueTime;

    // 证明开具单位
    /**
     * @example xx公积金中心
     *
     * @var string
     */
    public $providerName;

    // 证明类型
    /**
     * @example JCZM: 缴存证明  DKJQZM ：贷款结清证明
     *
     * @var string
     */
    public $issueCertType;

    // 证明抬头
    /**
     * @example xx公积金中心xx证明
     *
     * @var string
     */
    public $depositCertTag;

    // 证明文件png图片存储地址
    /**
     * @example https://mdgwdev.alipay.net/gov_dataprod/afts/file/A*zDYwTIKrebkAAAAAAAAAAAAAJ2N3AA?t=dvWzYDIu5BQn49_cmtLjpAAAAABkd2MAAAAA
     *
     * @var string
     */
    public $depositCert;

    // 证明文件pdf获取地址(不带二维码)
    /**
     * @example https://mdgwdev.alipay.net/gov_dataprod/afts/file/A*zDYwTIKrebkAAAAAAAAAAAAAJ2N3AA?t=dvWzYDIu5BQn49_cmtLjpAAAAABkd2MAAAAA
     *
     * @var string
     */
    public $depositCertPdf;

    // 证明文件pdf获取地址(带验真码)
    /**
     * @example https://mdgwdev.alipay.net/gov_dataprod/afts/file/A*zDYwTIKrebkAAAAAAAAAAAAAJ2N3AA?t=dvWzYDIu5BQn49_cmtLjpAAAAABkd2MAAAAA
     *
     * @var string
     */
    public $depositCertPdfQr;
    protected $_name = [
        'issueId'          => 'issue_id',
        'issueTime'        => 'issue_time',
        'providerName'     => 'provider_name',
        'issueCertType'    => 'issue_cert_type',
        'depositCertTag'   => 'deposit_cert_tag',
        'depositCert'      => 'deposit_cert',
        'depositCertPdf'   => 'deposit_cert_pdf',
        'depositCertPdfQr' => 'deposit_cert_pdf_qr',
    ];

    public function validate()
    {
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validateRequired('issueTime', $this->issueTime, true);
        Model::validateRequired('issueCertType', $this->issueCertType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->issueTime) {
            $res['issue_time'] = $this->issueTime;
        }
        if (null !== $this->providerName) {
            $res['provider_name'] = $this->providerName;
        }
        if (null !== $this->issueCertType) {
            $res['issue_cert_type'] = $this->issueCertType;
        }
        if (null !== $this->depositCertTag) {
            $res['deposit_cert_tag'] = $this->depositCertTag;
        }
        if (null !== $this->depositCert) {
            $res['deposit_cert'] = $this->depositCert;
        }
        if (null !== $this->depositCertPdf) {
            $res['deposit_cert_pdf'] = $this->depositCertPdf;
        }
        if (null !== $this->depositCertPdfQr) {
            $res['deposit_cert_pdf_qr'] = $this->depositCertPdfQr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IssueCertInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['issue_time'])) {
            $model->issueTime = $map['issue_time'];
        }
        if (isset($map['provider_name'])) {
            $model->providerName = $map['provider_name'];
        }
        if (isset($map['issue_cert_type'])) {
            $model->issueCertType = $map['issue_cert_type'];
        }
        if (isset($map['deposit_cert_tag'])) {
            $model->depositCertTag = $map['deposit_cert_tag'];
        }
        if (isset($map['deposit_cert'])) {
            $model->depositCert = $map['deposit_cert'];
        }
        if (isset($map['deposit_cert_pdf'])) {
            $model->depositCertPdf = $map['deposit_cert_pdf'];
        }
        if (isset($map['deposit_cert_pdf_qr'])) {
            $model->depositCertPdfQr = $map['deposit_cert_pdf_qr'];
        }

        return $model;
    }
}
