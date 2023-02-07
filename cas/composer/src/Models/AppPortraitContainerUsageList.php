<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitContainerUsageList extends Model
{
    // namespace
    /**
     * @example dev
     *
     * @var string
     */
    public $namespace;

    // request_cpu
    /**
     * @example 200m
     *
     * @var string
     */
    public $requestCpu;

    // request_mem
    /**
     * @example 200Gi
     *
     * @var string
     */
    public $requestMem;

    // limit_cpu
    /**
     * @example 200m
     *
     * @var string
     */
    public $limitCpu;

    // limit_mem
    /**
     * @example 200Gi
     *
     * @var string
     */
    public $limitMem;

    // average_cpu
    /**
     * @example 0.1
     *
     * @var string
     */
    public $averageCpu;

    // average_mem
    /**
     * @example 0.7
     *
     * @var string
     */
    public $averageMem;

    // 建议1：xxxxx
    /**
     * @example 建议1：xxxxx
     *
     * @var string
     */
    public $tips;
    protected $_name = [
        'namespace'  => 'namespace',
        'requestCpu' => 'request_cpu',
        'requestMem' => 'request_mem',
        'limitCpu'   => 'limit_cpu',
        'limitMem'   => 'limit_mem',
        'averageCpu' => 'average_cpu',
        'averageMem' => 'average_mem',
        'tips'       => 'tips',
    ];

    public function validate()
    {
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('requestCpu', $this->requestCpu, true);
        Model::validateRequired('requestMem', $this->requestMem, true);
        Model::validateRequired('limitCpu', $this->limitCpu, true);
        Model::validateRequired('limitMem', $this->limitMem, true);
        Model::validateRequired('averageCpu', $this->averageCpu, true);
        Model::validateRequired('averageMem', $this->averageMem, true);
        Model::validateRequired('tips', $this->tips, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->requestCpu) {
            $res['request_cpu'] = $this->requestCpu;
        }
        if (null !== $this->requestMem) {
            $res['request_mem'] = $this->requestMem;
        }
        if (null !== $this->limitCpu) {
            $res['limit_cpu'] = $this->limitCpu;
        }
        if (null !== $this->limitMem) {
            $res['limit_mem'] = $this->limitMem;
        }
        if (null !== $this->averageCpu) {
            $res['average_cpu'] = $this->averageCpu;
        }
        if (null !== $this->averageMem) {
            $res['average_mem'] = $this->averageMem;
        }
        if (null !== $this->tips) {
            $res['tips'] = $this->tips;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitContainerUsageList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['request_cpu'])) {
            $model->requestCpu = $map['request_cpu'];
        }
        if (isset($map['request_mem'])) {
            $model->requestMem = $map['request_mem'];
        }
        if (isset($map['limit_cpu'])) {
            $model->limitCpu = $map['limit_cpu'];
        }
        if (isset($map['limit_mem'])) {
            $model->limitMem = $map['limit_mem'];
        }
        if (isset($map['average_cpu'])) {
            $model->averageCpu = $map['average_cpu'];
        }
        if (isset($map['average_mem'])) {
            $model->averageMem = $map['average_mem'];
        }
        if (isset($map['tips'])) {
            $model->tips = $map['tips'];
        }

        return $model;
    }
}
