<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ConfigSnapshotModel extends Model
{
    // 实例id
    /**
     * @example 0000001
     *
     * @var string
     */
    public $instanceId;

    // 配置的key，例如在服务鉴权里是dataId
    /**
     * @example com.alipay.sofa.rpc.test.HelloService:1.0@DEFAULT@WHITELIST
     *
     * @var string
     */
    public $key;

    // 配置类型：例如 auth、lb 等
    /**
     * @example AuthRule
     *
     * @var string
     */
    public $type;

    // 配置值
    /**
     * @example json：{}
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'instanceId' => 'instance_id',
        'key'        => 'key',
        'type'       => 'type',
        'value'      => 'value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfigSnapshotModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
