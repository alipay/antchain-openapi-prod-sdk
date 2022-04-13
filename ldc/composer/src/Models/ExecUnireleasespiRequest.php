<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ExecUnireleasespiRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求方法
    /**
     * @var string
     */
    public $requestMethod;

    // 请求参数的 JSON 字符串
    /**
     * @var string
     */
    public $requestParam;
    protected $_name = [
        'authToken'     => 'auth_token',
        'requestMethod' => 'request_method',
        'requestParam'  => 'request_param',
    ];

    public function validate()
    {
        Model::validateRequired('requestMethod', $this->requestMethod, true);
        Model::validateRequired('requestParam', $this->requestParam, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestMethod) {
            $res['request_method'] = $this->requestMethod;
        }
        if (null !== $this->requestParam) {
            $res['request_param'] = $this->requestParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecUnireleasespiRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_method'])) {
            $model->requestMethod = $map['request_method'];
        }
        if (isset($map['request_param'])) {
            $model->requestParam = $map['request_param'];
        }

        return $model;
    }
}
