<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class GetSdkRequest extends Model
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
    public $prodCode;

    // 版本号
    /**
     * @var string
     */
    public $apiVersion;
    protected $_name = [
        'authToken'  => 'auth_token',
        'prodCode'   => 'prod_code',
        'apiVersion' => 'api_version',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('apiVersion', $this->apiVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetSdkRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['api_version'])) {
            $model->apiVersion = $map['api_version'];
        }

        return $model;
    }
}
