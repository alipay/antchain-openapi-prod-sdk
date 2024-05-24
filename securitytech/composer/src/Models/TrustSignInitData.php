<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class TrustSignInitData extends Model
{
    // 请求唯一标识Id
    /**
     * @example 111111111111111
     *
     * @var string
     */
    public $requestId;

    // 签约秘钥
    /**
     * @example g9y47yjs
     *
     * @var string
     */
    public $signUniqueId;
    protected $_name = [
        'requestId'    => 'request_id',
        'signUniqueId' => 'sign_unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('signUniqueId', $this->signUniqueId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->signUniqueId) {
            $res['sign_unique_id'] = $this->signUniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TrustSignInitData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['sign_unique_id'])) {
            $model->signUniqueId = $map['sign_unique_id'];
        }

        return $model;
    }
}
