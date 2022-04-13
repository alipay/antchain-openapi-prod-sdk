<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class EntrySettings extends Model
{
    // 是否自定义uai entry
    /**
     * @example true, false
     *
     * @var bool
     */
    public $customized;

    // 统一接入实例每个datacenter的用户自定义入口负载均衡实例id列表
    /**
     * @example ["dc-1": "lb-id-1", "dc-2": "lb-id-3"]
     *
     * @var MapStringToString[]
     */
    public $entryIds;

    // 统一接入实例每个datacenter用户自定义入口负载均衡实例的vip
    /**
     * @example ["dc-1": "202.120.37.116", "dc-2": "202.120.3.31"]
     *
     * @var MapStringToString[]
     */
    public $entryVips;
    protected $_name = [
        'customized' => 'customized',
        'entryIds'   => 'entry_ids',
        'entryVips'  => 'entry_vips',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customized) {
            $res['customized'] = $this->customized;
        }
        if (null !== $this->entryIds) {
            $res['entry_ids'] = [];
            if (null !== $this->entryIds && \is_array($this->entryIds)) {
                $n = 0;
                foreach ($this->entryIds as $item) {
                    $res['entry_ids'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->entryVips) {
            $res['entry_vips'] = [];
            if (null !== $this->entryVips && \is_array($this->entryVips)) {
                $n = 0;
                foreach ($this->entryVips as $item) {
                    $res['entry_vips'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EntrySettings
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['customized'])) {
            $model->customized = $map['customized'];
        }
        if (isset($map['entry_ids'])) {
            if (!empty($map['entry_ids'])) {
                $model->entryIds = [];
                $n               = 0;
                foreach ($map['entry_ids'] as $item) {
                    $model->entryIds[$n++] = null !== $item ? MapStringToString::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['entry_vips'])) {
            if (!empty($map['entry_vips'])) {
                $model->entryVips = [];
                $n                = 0;
                foreach ($map['entry_vips'] as $item) {
                    $model->entryVips[$n++] = null !== $item ? MapStringToString::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
