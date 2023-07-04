<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ProductInstanceMeta extends Model
{
    // 命名空间
    /**
     * @example ant-iam
     *
     * @var string
     */
    public $namespace;

    // 产品Code
    /**
     * @example IAM
     *
     * @var string
     */
    public $prodCode;

    // 实例名称，同一个ns下不可重复
    /**
     * @example ant-iam
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'namespace' => 'namespace',
        'prodCode'  => 'prod_code',
        'name'      => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductInstanceMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
