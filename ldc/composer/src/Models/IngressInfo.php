<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class IngressInfo extends Model
{
    // 元信息
    /**
     * @example
     *
     * @var ContainerServiceObjectMeta
     */
    public $meta;

    // 所属统一接入实例名称
    /**
     * @example abc-123
     *
     * @var string
     */
    public $unifiedAccessInstanceName;
    protected $_name = [
        'meta'                      => 'meta',
        'unifiedAccessInstanceName' => 'unified_access_instance_name',
    ];

    public function validate()
    {
        Model::validateRequired('meta', $this->meta, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->meta) {
            $res['meta'] = null !== $this->meta ? $this->meta->toMap() : null;
        }
        if (null !== $this->unifiedAccessInstanceName) {
            $res['unified_access_instance_name'] = $this->unifiedAccessInstanceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IngressInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['meta'])) {
            $model->meta = ContainerServiceObjectMeta::fromMap($map['meta']);
        }
        if (isset($map['unified_access_instance_name'])) {
            $model->unifiedAccessInstanceName = $map['unified_access_instance_name'];
        }

        return $model;
    }
}
