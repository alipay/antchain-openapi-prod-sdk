<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CertificationInfo extends Model
{
    // 是否授权
    /**
     * @example true, false
     *
     * @var bool
     */
    public $certificationFlag;
    protected $_name = [
        'certificationFlag' => 'certification_flag',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certificationFlag) {
            $res['certification_flag'] = $this->certificationFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertificationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['certification_flag'])) {
            $model->certificationFlag = $map['certification_flag'];
        }

        return $model;
    }
}
