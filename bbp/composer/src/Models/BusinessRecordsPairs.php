<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class BusinessRecordsPairs extends Model
{
    // 业务编码
    /**
     * @example TIANMAO_CHONGWU
     *
     * @var string
     */
    public $businessCode;

    // 业务公钥
    /**
     * @example klj;lsdkjfaf
     *
     * @var string
     */
    public $publicKey;
    protected $_name = [
        'businessCode' => 'business_code',
        'publicKey'    => 'public_key',
    ];

    public function validate()
    {
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BusinessRecordsPairs
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }

        return $model;
    }
}
