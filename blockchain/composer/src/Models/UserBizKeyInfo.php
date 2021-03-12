<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UserBizKeyInfo extends Model
{
    // 拥有该密钥的用户列表
    /**
     * @example CZKZJVCN
     *
     * @var string[]
     */
    public $grantedUser;

    // 密钥名称
    /**
     * @example subunion_a_key
     *
     * @var string
     */
    public $keyName;
    protected $_name = [
        'grantedUser' => 'granted_user',
        'keyName'     => 'key_name',
    ];

    public function validate()
    {
        Model::validateRequired('grantedUser', $this->grantedUser, true);
        Model::validateRequired('keyName', $this->keyName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->grantedUser) {
            $res['granted_user'] = $this->grantedUser;
        }
        if (null !== $this->keyName) {
            $res['key_name'] = $this->keyName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserBizKeyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['granted_user'])) {
            if (!empty($map['granted_user'])) {
                $model->grantedUser = $map['granted_user'];
            }
        }
        if (isset($map['key_name'])) {
            $model->keyName = $map['key_name'];
        }

        return $model;
    }
}
