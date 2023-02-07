<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SingleDimGroup extends Model
{
    // 维度标识, 如: WORKSPACE
    /**
     * @example WORKSPACE
     *
     * @var string
     */
    public $dimIdentity;

    // 维度实例的值, 如: 0000000001
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $dimInsValue;

    // resource_identity
    /**
     * @example CPU
     *
     * @var string
     */
    public $resourceIdentity;

    // 申请的数量，要注意quota_factor，比如当quota_factor=0.1时，申请实际为1的资源时，这里要填10
    /**
     * @example
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'dimIdentity'      => 'dim_identity',
        'dimInsValue'      => 'dim_ins_value',
        'resourceIdentity' => 'resource_identity',
        'count'            => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('dimIdentity', $this->dimIdentity, true);
        Model::validateRequired('dimInsValue', $this->dimInsValue, true);
        Model::validateRequired('resourceIdentity', $this->resourceIdentity, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dimIdentity) {
            $res['dim_identity'] = $this->dimIdentity;
        }
        if (null !== $this->dimInsValue) {
            $res['dim_ins_value'] = $this->dimInsValue;
        }
        if (null !== $this->resourceIdentity) {
            $res['resource_identity'] = $this->resourceIdentity;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SingleDimGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dim_identity'])) {
            $model->dimIdentity = $map['dim_identity'];
        }
        if (isset($map['dim_ins_value'])) {
            $model->dimInsValue = $map['dim_ins_value'];
        }
        if (isset($map['resource_identity'])) {
            $model->resourceIdentity = $map['resource_identity'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}
