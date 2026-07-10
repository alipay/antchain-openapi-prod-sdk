<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CopyrightCertInfo extends Model
{
    // 证件号码
    /**
     * @example 111111
     *
     * @var string
     */
    public $certNo;

    // 证件名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $certName;

    // 证件类型
    /**
     * @example IDENTITY_CARD
     *
     * @var string
     */
    public $certType;
    protected $_name = [
        'certNo'   => 'cert_no',
        'certName' => 'cert_name',
        'certType' => 'cert_type',
    ];

    public function validate()
    {
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certType', $this->certType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CopyrightCertInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }

        return $model;
    }
}
