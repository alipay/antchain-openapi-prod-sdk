<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiCacheVO extends Model
{
    // 是否需要缓存
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needCache;

    // TTL
    /**
     * @example 10000
     *
     * @var int
     */
    public $ttl;

    // cacheKeys
    /**
     * @example
     *
     * @var ApiCacheKeyVO[]
     */
    public $cacheKeys;
    protected $_name = [
        'needCache' => 'need_cache',
        'ttl'       => 'ttl',
        'cacheKeys' => 'cache_keys',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->needCache) {
            $res['need_cache'] = $this->needCache;
        }
        if (null !== $this->ttl) {
            $res['ttl'] = $this->ttl;
        }
        if (null !== $this->cacheKeys) {
            $res['cache_keys'] = [];
            if (null !== $this->cacheKeys && \is_array($this->cacheKeys)) {
                $n = 0;
                foreach ($this->cacheKeys as $item) {
                    $res['cache_keys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiCacheVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['need_cache'])) {
            $model->needCache = $map['need_cache'];
        }
        if (isset($map['ttl'])) {
            $model->ttl = $map['ttl'];
        }
        if (isset($map['cache_keys'])) {
            if (!empty($map['cache_keys'])) {
                $model->cacheKeys = [];
                $n                = 0;
                foreach ($map['cache_keys'] as $item) {
                    $model->cacheKeys[$n++] = null !== $item ? ApiCacheKeyVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
