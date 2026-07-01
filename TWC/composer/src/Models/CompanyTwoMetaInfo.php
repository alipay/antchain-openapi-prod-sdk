<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CompanyTwoMetaInfo extends Model
{
    // 企业证件名称
    /**
     * @example XX公司
     *
     * @var string
     */
    public $certName;

    // 企业证件号码
    /**
     * @example 9111011421316034XK
     *
     * @var string
     */
    public $certNo;

    // 证件类型, 默认社会统一信用代码  NATIONAL_LEGAL_MERGE:统一社会信用代码，NATIONAL_LEGAL：营业执照号码
    /**
     * @example NATIONAL_LEGAL_MERGE
     *
     * @var string
     */
    public $certType;
    protected $_name = [
        'certName' => 'cert_name',
        'certNo'   => 'cert_no',
        'certType' => 'cert_type',
    ];

    public function validate()
    {
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CompanyTwoMetaInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }

        return $model;
    }
}
