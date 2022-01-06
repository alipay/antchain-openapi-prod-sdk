<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class SidecarInjectConfigModel extends Model
{
    // sidecar类型 支持inject_all，clusters，namespaces，labels，annotations
    /**
     * @example clusters
     *
     * @var string
     */
    public $type;

    // 字符串数组
    /**
     * @example ["k8s"]
     *
     * @var string[]
     */
    public $strs;

    // kv键值对数组
    /**
     * @example [{"key": "k1", "value": "v1"}]
     *
     * @var KV[]
     */
    public $kvs;
    protected $_name = [
        'type' => 'type',
        'strs' => 'strs',
        'kvs'  => 'kvs',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->strs) {
            $res['strs'] = $this->strs;
        }
        if (null !== $this->kvs) {
            $res['kvs'] = [];
            if (null !== $this->kvs && \is_array($this->kvs)) {
                $n = 0;
                foreach ($this->kvs as $item) {
                    $res['kvs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SidecarInjectConfigModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['strs'])) {
            if (!empty($map['strs'])) {
                $model->strs = $map['strs'];
            }
        }
        if (isset($map['kvs'])) {
            if (!empty($map['kvs'])) {
                $model->kvs = [];
                $n          = 0;
                foreach ($map['kvs'] as $item) {
                    $model->kvs[$n++] = null !== $item ? KV::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
