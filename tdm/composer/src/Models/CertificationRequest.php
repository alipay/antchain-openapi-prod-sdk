<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CertificationRequest extends Model
{
    // 认证模式
    /**
     * @example CLOUD_FACE_SDK
     *
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'bizCode' => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('bizCode', $this->bizCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertificationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
