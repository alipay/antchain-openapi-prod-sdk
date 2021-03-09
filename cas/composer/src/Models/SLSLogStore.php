<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SLSLogStore extends Model
{
    // 日志库名称
    /**
     * @example testLogStore
     *
     * @var string
     */
    public $name;

    // Shard个数，单位为个，范围为1~100。
    /**
     * @example 10
     *
     * @var int
     */
    public $shardCount;

    // 数据的保存时间，单位为天，范围1~3600。
    /**
     * @example 30
     *
     * @var int
     */
    public $ttl;
    protected $_name = [
        'name'       => 'name',
        'shardCount' => 'shard_count',
        'ttl'        => 'ttl',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('shardCount', $this->shardCount, true);
        Model::validateRequired('ttl', $this->ttl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->shardCount) {
            $res['shard_count'] = $this->shardCount;
        }
        if (null !== $this->ttl) {
            $res['ttl'] = $this->ttl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SLSLogStore
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['shard_count'])) {
            $model->shardCount = $map['shard_count'];
        }
        if (isset($map['ttl'])) {
            $model->ttl = $map['ttl'];
        }

        return $model;
    }
}
