<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class OpsGroupBy extends Model
{
    // 是否按环境分组
    /**
     * @example true, false
     *
     * @var bool
     */
    public $env;

    // 是否按部署单元分组
    /**
     * @example true, false
     *
     * @var bool
     */
    public $deployUnit;

    // 是否按应用分组
    /**
     * @example true, false
     *
     * @var bool
     */
    public $app;

    // 是否按idc分组
    /**
     * @example true, false
     *
     * @var bool
     */
    public $idc;

    // 是否按ldc分组
    /**
     * @example true, false
     *
     * @var bool
     */
    public $ldc;

    // 是否按server分组
    /**
     * @example true, false
     *
     * @var bool
     */
    public $server;

    // 附加信息
    /**
     * @example 附加信息example
     *
     * @var string
     */
    public $extra;
    protected $_name = [
        'env'        => 'env',
        'deployUnit' => 'deploy_unit',
        'app'        => 'app',
        'idc'        => 'idc',
        'ldc'        => 'ldc',
        'server'     => 'server',
        'extra'      => 'extra',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->deployUnit) {
            $res['deploy_unit'] = $this->deployUnit;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->idc) {
            $res['idc'] = $this->idc;
        }
        if (null !== $this->ldc) {
            $res['ldc'] = $this->ldc;
        }
        if (null !== $this->server) {
            $res['server'] = $this->server;
        }
        if (null !== $this->extra) {
            $res['extra'] = $this->extra;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsGroupBy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['deploy_unit'])) {
            $model->deployUnit = $map['deploy_unit'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['idc'])) {
            $model->idc = $map['idc'];
        }
        if (isset($map['ldc'])) {
            $model->ldc = $map['ldc'];
        }
        if (isset($map['server'])) {
            $model->server = $map['server'];
        }
        if (isset($map['extra'])) {
            $model->extra = $map['extra'];
        }

        return $model;
    }
}
