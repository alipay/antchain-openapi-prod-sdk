<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class InitInfo extends Model
{
    // auth_url
    /**
     * @example auth_url
     *
     * @var string
     */
    public $authUrl;

    // user
    /**
     * @example user
     *
     * @var MonitorUser
     */
    public $user;

    // nav_head
    /**
     * @example nav_head
     *
     * @var NavContent
     */
    public $navHead;
    protected $_name = [
        'authUrl' => 'auth_url',
        'user'    => 'user',
        'navHead' => 'nav_head',
    ];

    public function validate()
    {
        Model::validateRequired('authUrl', $this->authUrl, true);
        Model::validateRequired('user', $this->user, true);
        Model::validateRequired('navHead', $this->navHead, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authUrl) {
            $res['auth_url'] = $this->authUrl;
        }
        if (null !== $this->user) {
            $res['user'] = null !== $this->user ? $this->user->toMap() : null;
        }
        if (null !== $this->navHead) {
            $res['nav_head'] = null !== $this->navHead ? $this->navHead->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_url'])) {
            $model->authUrl = $map['auth_url'];
        }
        if (isset($map['user'])) {
            $model->user = MonitorUser::fromMap($map['user']);
        }
        if (isset($map['nav_head'])) {
            $model->navHead = NavContent::fromMap($map['nav_head']);
        }

        return $model;
    }
}
