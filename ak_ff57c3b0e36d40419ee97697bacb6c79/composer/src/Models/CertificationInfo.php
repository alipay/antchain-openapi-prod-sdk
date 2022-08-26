<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff57c3b0e36d40419ee97697bacb6c79\Models;

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

    // 实人认证唯一标识
    /**
     * @example 11410000005184603J
     *
     * @var string
     */
    public $certifyId;
    protected $_name = [
        'certificationFlag' => 'certification_flag',
        'certifyId'         => 'certify_id',
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
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
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
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }

        return $model;
    }
}
