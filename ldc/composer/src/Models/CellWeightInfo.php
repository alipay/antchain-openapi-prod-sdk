<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CellWeightInfo extends Model
{
    // 部署单元所属工作空间
    /**
     * @example 工作空间
     *
     * @var string
     */
    public $workspace;

    // 部署单元名称
    /**
     * @example CellA
     *
     * @var string
     */
    public $name;

    // 部署单元所占单元组流量比重
    /**
     * @example 100
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'workspace' => 'workspace',
        'name'      => 'name',
        'weight'    => 'weight',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('weight', $this->weight, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellWeightInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
