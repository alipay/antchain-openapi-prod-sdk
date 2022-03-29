<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class QueryApiserviceRequest extends Model
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

    // 套件
    /**
     * @var string
     */
    public $suite;

    // api名字
    /**
     * @var string
     */
    public $apiName;
    protected $_name = [
        'authToken' => 'auth_token',
        'provider'  => 'provider',
        'suite'     => 'suite',
        'apiName'   => 'api_name',
    ];

    public function validate()
    {
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('suite', $this->suite, true);
        Model::validateRequired('apiName', $this->apiName, true);
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
        if (null !== $this->suite) {
            $res['suite'] = $this->suite;
        }
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiserviceRequest
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
        if (isset($map['suite'])) {
            $model->suite = $map['suite'];
        }
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }

        return $model;
    }
}
