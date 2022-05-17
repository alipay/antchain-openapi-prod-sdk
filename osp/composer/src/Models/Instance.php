<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class Instance extends Model
{
    // 实例id
    /**
     * @example
     *
     * @var string
     */
    public $instanceId;

    // 租户
    /**
     * @example CPJVTBCN
     *
     * @var string
     */
    public $tenant;

    // 工作空间
    /**
     * @example dev
     *
     * @var string
     */
    public $workspace;
    protected $_name = [
        'instanceId' => 'instance_id',
        'tenant'     => 'tenant',
        'workspace'  => 'workspace',
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
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Instance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
