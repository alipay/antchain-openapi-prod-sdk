<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ExtendData extends Model
{
    // user_id
    /**
     * @example user_id
     *
     * @var string
     */
    public $userId;

    // cert_name
    /**
     * @example cert_name
     *
     * @var string
     */
    public $certName;
    protected $_name = [
        'userId'   => 'user_id',
        'certName' => 'cert_name',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('certName', $this->certName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExtendData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }

        return $model;
    }
}
