<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class CreateGatewayStaticrouterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码
    /**
     * @var string
     */
    public $provider;

    // 套件版本
    /**
     * @var string
     */
    public $suitVersion;

    // 分组名称
    /**
     * @var string
     */
    public $groupName;

    // accessKey
    /**
     * @var string
     */
    public $accesskey;

    // 后端地址
    /**
     * @var string
     */
    public $host;
    protected $_name = [
        'authToken'   => 'auth_token',
        'provider'    => 'provider',
        'suitVersion' => 'suit_version',
        'groupName'   => 'group_name',
        'accesskey'   => 'accesskey',
        'host'        => 'host',
    ];

    public function validate()
    {
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('suitVersion', $this->suitVersion, true);
        Model::validateRequired('groupName', $this->groupName, true);
        Model::validateRequired('accesskey', $this->accesskey, true);
        Model::validateRequired('host', $this->host, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->suitVersion) {
            $res['suit_version'] = $this->suitVersion;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }
        if (null !== $this->accesskey) {
            $res['accesskey'] = $this->accesskey;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateGatewayStaticrouterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['provider'])) {
            $model->provider = $map['provider'];
        }
        if (isset($map['suit_version'])) {
            $model->suitVersion = $map['suit_version'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }
        if (isset($map['accesskey'])) {
            $model->accesskey = $map['accesskey'];
        }
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }

        return $model;
    }
}
