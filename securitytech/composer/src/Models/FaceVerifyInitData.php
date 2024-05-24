<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class FaceVerifyInitData extends Model
{
    // 请求唯一标识Id
    /**
     * @example 111111111111111
     *
     * @var string
     */
    public $requestId;

    // 可信实人认证的唯一标识
    /**
     * @example cwek23dw24geor89230hf2rw
     *
     * @var string
     */
    public $certifyId;

    // 认证流程入口 URL
    /**
     * @example https://picker...
     *
     * @var string
     */
    public $certifyUrl;
    protected $_name = [
        'requestId'  => 'request_id',
        'certifyId'  => 'certify_id',
        'certifyUrl' => 'certify_url',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('certifyId', $this->certifyId, true);
        Model::validateRequired('certifyUrl', $this->certifyUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->certifyUrl) {
            $res['certify_url'] = $this->certifyUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaceVerifyInitData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['certify_url'])) {
            $model->certifyUrl = $map['certify_url'];
        }

        return $model;
    }
}
