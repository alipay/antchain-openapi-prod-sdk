<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ResourceLabelsDTO extends Model
{
    // 实例 ID（命名空间）
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 资源类型：TOPIC、GROUP
    /**
     * @example GROUP
     *
     * @var string
     */
    public $resourceType;

    // 资源名字
    /**
     * @example GID_XXX
     *
     * @var string
     */
    public $resourceName;

    // 标签
    /**
     * @example ["labelkey:labelvalue"]
     *
     * @var string[]
     */
    public $labels;
    protected $_name = [
        'instanceId'   => 'instance_id',
        'resourceType' => 'resource_type',
        'resourceName' => 'resource_name',
        'labels'       => 'labels',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('resourceName', $this->resourceName, true);
        Model::validateRequired('labels', $this->labels, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->resourceName) {
            $res['resource_name'] = $this->resourceName;
        }
        if (null !== $this->labels) {
            $res['labels'] = $this->labels;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResourceLabelsDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['resource_name'])) {
            $model->resourceName = $map['resource_name'];
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = $map['labels'];
            }
        }

        return $model;
    }
}
