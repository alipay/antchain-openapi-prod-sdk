<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CloudConfigEntity extends Model
{
    // 配置详情
    /**
     * @example  {"A":"B"}
     *
     * @var string
     */
    public $cloudConfig;

    // 操作时间
    /**
     * @example  2020-04-02 22:40:41
     *
     * @var string
     */
    public $gmtCreate;

    // 操作类型
    /**
     * @example UPDATE
     *
     * @var string
     */
    public $operation;

    // admin
    /**
     * @example admin
     *
     * @var string
     */
    public $operator;
    protected $_name = [
        'cloudConfig' => 'cloud_config',
        'gmtCreate'   => 'gmt_create',
        'operation'   => 'operation',
        'operator'    => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('cloudConfig', $this->cloudConfig, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('operation', $this->operation, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cloudConfig) {
            $res['cloud_config'] = $this->cloudConfig;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CloudConfigEntity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cloud_config'])) {
            $model->cloudConfig = $map['cloud_config'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
