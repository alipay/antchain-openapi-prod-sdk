<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class MiniAppBrowserAuthType extends Model
{
    // 授权类型
    /**
     * @example DISABLED, ALL_USER, SPECIFIC_USER
     *
     * @var string
     */
    public $authType;
    protected $_name = [
        'authType' => 'auth_type',
    ];

    public function validate()
    {
        Model::validateRequired('authType', $this->authType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MiniAppBrowserAuthType
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }

        return $model;
    }
}
