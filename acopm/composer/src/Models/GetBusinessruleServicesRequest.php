<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class GetBusinessruleServicesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // api名称
    /**
     * @var string
     */
    public $apiName;

    // 版本号（可不填）
    /**
     * @var string
     */
    public $apiVersion;
    protected $_name = [
        'authToken'  => 'auth_token',
        'apiName'    => 'api_name',
        'apiVersion' => 'api_version',
    ];

    public function validate()
    {
        Model::validateRequired('apiName', $this->apiName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetBusinessruleServicesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['api_version'])) {
            $model->apiVersion = $map['api_version'];
        }

        return $model;
    }
}
