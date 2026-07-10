<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseLegalPersonInfo extends Model
{
    // 法人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $legalPersonCertName;

    // 法人证件类型
    /**
     * @example IDENTITY_CARD
     *
     * @var string
     */
    public $legalPersonCertType;

    // 法人证件号
    /**
     * @example 341227199711226752
     *
     * @var string
     */
    public $legalPersonCertNo;
    protected $_name = [
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertType' => 'legal_person_cert_type',
        'legalPersonCertNo'   => 'legal_person_cert_no',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertType) {
            $res['legal_person_cert_type'] = $this->legalPersonCertType;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseLegalPersonInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_type'])) {
            $model->legalPersonCertType = $map['legal_person_cert_type'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }

        return $model;
    }
}
