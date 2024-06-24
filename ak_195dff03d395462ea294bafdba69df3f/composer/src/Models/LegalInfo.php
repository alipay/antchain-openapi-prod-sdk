<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class LegalInfo extends Model
{
    // 法人名称
    /**
     * @example 法人名称
     *
     * @var string
     */
    public $legalName;

    // 法人证件号
    /**
     * @example 法人证件号
     *
     * @var string
     */
    public $legalCertNo;

    // 法人证件正面
    /**
     * @example
     *
     * @var FileInfo
     */
    public $legalCertFrontFile;

    // 法人证件反面
    /**
     * @example
     *
     * @var FileInfo
     */
    public $legalCertBackFile;
    protected $_name = [
        'legalName'          => 'legal_name',
        'legalCertNo'        => 'legal_cert_no',
        'legalCertFrontFile' => 'legal_cert_front_file',
        'legalCertBackFile'  => 'legal_cert_back_file',
    ];

    public function validate()
    {
        Model::validateRequired('legalName', $this->legalName, true);
        Model::validateRequired('legalCertNo', $this->legalCertNo, true);
        Model::validateRequired('legalCertFrontFile', $this->legalCertFrontFile, true);
        Model::validateRequired('legalCertBackFile', $this->legalCertBackFile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->legalCertNo) {
            $res['legal_cert_no'] = $this->legalCertNo;
        }
        if (null !== $this->legalCertFrontFile) {
            $res['legal_cert_front_file'] = null !== $this->legalCertFrontFile ? $this->legalCertFrontFile->toMap() : null;
        }
        if (null !== $this->legalCertBackFile) {
            $res['legal_cert_back_file'] = null !== $this->legalCertBackFile ? $this->legalCertBackFile->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LegalInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['legal_cert_no'])) {
            $model->legalCertNo = $map['legal_cert_no'];
        }
        if (isset($map['legal_cert_front_file'])) {
            $model->legalCertFrontFile = FileInfo::fromMap($map['legal_cert_front_file']);
        }
        if (isset($map['legal_cert_back_file'])) {
            $model->legalCertBackFile = FileInfo::fromMap($map['legal_cert_back_file']);
        }

        return $model;
    }
}
