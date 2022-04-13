<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AntvipDomain extends Model
{
    // 应用名称
    /**
     * @example supergw
     *
     * @var string
     */
    public $application;

    // 部署单元cell名称
    /**
     * @example RZ01A
     *
     * @var string
     */
    public $cell;

    // 健康检查端口，非必填项
    /**
     * @example 12200
     *
     * @var int
     */
    public $healthCheckDefaultPort;

    // 健康检查类型，默认为TCP
    /**
     * @example "TCP"
     *
     * @var string
     */
    public $healthCheckType;
    protected $_name = [
        'application'            => 'application',
        'cell'                   => 'cell',
        'healthCheckDefaultPort' => 'health_check_default_port',
        'healthCheckType'        => 'health_check_type',
    ];

    public function validate()
    {
        Model::validateRequired('application', $this->application, true);
        Model::validateRequired('cell', $this->cell, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->application) {
            $res['application'] = $this->application;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->healthCheckDefaultPort) {
            $res['health_check_default_port'] = $this->healthCheckDefaultPort;
        }
        if (null !== $this->healthCheckType) {
            $res['health_check_type'] = $this->healthCheckType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntvipDomain
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['application'])) {
            $model->application = $map['application'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['health_check_default_port'])) {
            $model->healthCheckDefaultPort = $map['health_check_default_port'];
        }
        if (isset($map['health_check_type'])) {
            $model->healthCheckType = $map['health_check_type'];
        }

        return $model;
    }
}
