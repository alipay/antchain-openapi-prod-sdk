<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class CreateImageRepoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 镜像仓库名称
    /**
     * @var string
     */
    public $name;

    // 镜像仓库类型
    /**
     * @var string
     */
    public $repoType;

    // hub域名
    /**
     * @var string
     */
    public $domain;

    // API endpoint
    /**
     * @var string
     */
    public $endpoint;

    // 用户名
    /**
     * @var string
     */
    public $userName;

    // 仓库密码
    /**
     * @var string
     */
    public $password;
    protected $_name = [
        'authToken' => 'auth_token',
        'name'      => 'name',
        'repoType'  => 'repo_type',
        'domain'    => 'domain',
        'endpoint'  => 'endpoint',
        'userName'  => 'user_name',
        'password'  => 'password',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('repoType', $this->repoType, true);
        Model::validateRequired('domain', $this->domain, true);
        Model::validateRequired('endpoint', $this->endpoint, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('password', $this->password, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->repoType) {
            $res['repo_type'] = $this->repoType;
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateImageRepoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['repo_type'])) {
            $model->repoType = $map['repo_type'];
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['endpoint'])) {
            $model->endpoint = $map['endpoint'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }

        return $model;
    }
}
