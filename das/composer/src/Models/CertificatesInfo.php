<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class CertificatesInfo extends Model
{
    // 证书名称
    /**
     * @example 证书名称
     *
     * @var string
     */
    public $certificateName;
    protected $_name = [
        'certificateName' => 'certificate_name',
    ];

    public function validate()
    {
        Model::validateMaxLength('certificateName', $this->certificateName, 128);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certificateName) {
            $res['certificate_name'] = $this->certificateName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertificatesInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['certificate_name'])) {
            $model->certificateName = $map['certificate_name'];
        }

        return $model;
    }
}
