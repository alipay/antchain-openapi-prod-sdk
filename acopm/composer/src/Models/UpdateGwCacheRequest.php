<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class UpdateGwCacheRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 刷新缓存的key
    /**
     * @var string
     */
    public $cacheKey;
    protected $_name = [
        'authToken' => 'auth_token',
        'cacheKey'  => 'cache_key',
    ];

    public function validate()
    {
        Model::validateRequired('cacheKey', $this->cacheKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cacheKey) {
            $res['cache_key'] = $this->cacheKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateGwCacheRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cache_key'])) {
            $model->cacheKey = $map['cache_key'];
        }

        return $model;
    }
}
