<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SLSProject extends Model
{
    // 项目描述
    /**
     * @example 项目描述
     *
     * @var string
     */
    public $description;

    // 项目名称
    /**
     * @example k8s-log-custom-pbyyzncn-aks1128test-test
     *
     * @var string
     */
    public $name;

    // 阿里云返回的regionName，仅作展示用
    /**
     * @example region
     *
     * @var string
     */
    public $region;
    protected $_name = [
        'description' => 'description',
        'name'        => 'name',
        'region'      => 'region',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SLSProject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }

        return $model;
    }
}
