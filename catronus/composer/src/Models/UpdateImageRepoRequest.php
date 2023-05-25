<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateImageRepoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 仓库ID
    /**
     * @var string
     */
    public $repoId;

    // 用户名
    /**
     * @var string
     */
    public $userName;

    // 密码
    /**
     * @var string
     */
    public $password;

    // 仓库名称
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken' => 'auth_token',
        'repoId'    => 'repo_id',
        'userName'  => 'user_name',
        'password'  => 'password',
        'name'      => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('repoId', $this->repoId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->repoId) {
            $res['repo_id'] = $this->repoId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateImageRepoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['repo_id'])) {
            $model->repoId = $map['repo_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
