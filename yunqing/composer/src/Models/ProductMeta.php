<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ProductMeta extends Model
{
    // 产品code
    /**
     * @example YANFA
     *
     * @var string
     */
    public $code;

    // 产品名称
    /**
     * @example yanfa
     *
     * @var string
     */
    public $name;

    // 产品标签
    /**
     * @example
     *
     * @var string[]
     */
    public $labels;

    // 产品版本
    /**
     * @example 1.1.1
     *
     * @var string
     */
    public $version;

    // 所属产品集
    /**
     * @example PAAS
     *
     * @var string
     */
    public $group;
    protected $_name = [
        'code'    => 'code',
        'name'    => 'name',
        'labels'  => 'labels',
        'version' => 'version',
        'group'   => 'group',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->labels) {
            $res['labels'] = $this->labels;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = $map['labels'];
            }
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }

        return $model;
    }
}
