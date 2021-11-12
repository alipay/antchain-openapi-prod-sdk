<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class SolutionInstance extends Model
{
    // 解决方案id
    /**
     * @example 123456
     *
     * @var string
     */
    public $solutionId;

    // 环境ID
    /**
     * @example 123456
     *
     * @var string
     */
    public $envId;

    // 解决方案的名字
    /**
     * @example 网商生产GZone
     *
     * @var string
     */
    public $name;

    // 解决方案的状态
    /**
     * @example EXECUTING
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'solutionId' => 'solution_id',
        'envId'      => 'env_id',
        'name'       => 'name',
        'status'     => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('solutionId', $this->solutionId, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->solutionId) {
            $res['solution_id'] = $this->solutionId;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SolutionInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['solution_id'])) {
            $model->solutionId = $map['solution_id'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
