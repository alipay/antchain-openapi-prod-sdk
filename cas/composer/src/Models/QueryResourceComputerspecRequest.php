<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryResourceComputerspecRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 机器规格族
    /**
     * @var string
     */
    public $instanceTypeGroups;

    // CPU最大值
    /**
     * @var int
     */
    public $maxCpu;

    // 最大内存
    /**
     * @var int
     */
    public $maxMem;

    // CPU最小值
    /**
     * @var int
     */
    public $minCpu;

    // 最小内存
    /**
     * @var int
     */
    public $minMem;
    protected $_name = [
        'authToken'          => 'auth_token',
        'instanceTypeGroups' => 'instance_type_groups',
        'maxCpu'             => 'max_cpu',
        'maxMem'             => 'max_mem',
        'minCpu'             => 'min_cpu',
        'minMem'             => 'min_mem',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->instanceTypeGroups) {
            $res['instance_type_groups'] = $this->instanceTypeGroups;
        }
        if (null !== $this->maxCpu) {
            $res['max_cpu'] = $this->maxCpu;
        }
        if (null !== $this->maxMem) {
            $res['max_mem'] = $this->maxMem;
        }
        if (null !== $this->minCpu) {
            $res['min_cpu'] = $this->minCpu;
        }
        if (null !== $this->minMem) {
            $res['min_mem'] = $this->minMem;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryResourceComputerspecRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['instance_type_groups'])) {
            $model->instanceTypeGroups = $map['instance_type_groups'];
        }
        if (isset($map['max_cpu'])) {
            $model->maxCpu = $map['max_cpu'];
        }
        if (isset($map['max_mem'])) {
            $model->maxMem = $map['max_mem'];
        }
        if (isset($map['min_cpu'])) {
            $model->minCpu = $map['min_cpu'];
        }
        if (isset($map['min_mem'])) {
            $model->minMem = $map['min_mem'];
        }

        return $model;
    }
}
