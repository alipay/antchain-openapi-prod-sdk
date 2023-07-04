<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ProductDeployInitOption extends Model
{
    // 命名空间
    /**
     * @example ant
     *
     * @var string
     */
    public $namespace;

    // 产品实例名称
    /**
     * @example ant-iam
     *
     * @var string
     */
    public $name;

    // 产品code
    /**
     * @example IAM
     *
     * @var string
     */
    public $prodCode;

    // 站点code
    /**
     * @example ant
     *
     * @var string
     */
    public $siteCode;

    // 多个产品实例时，本产品的发布顺序
    /**
     * @example 1
     *
     * @var int
     */
    public $releaseOrder;

    // 产品内应用分部署配置
    /**
     * @example
     *
     * @var AppDeployInitOption[]
     */
    public $apps;
    protected $_name = [
        'namespace'    => 'namespace',
        'name'         => 'name',
        'prodCode'     => 'prod_code',
        'siteCode'     => 'site_code',
        'releaseOrder' => 'release_order',
        'apps'         => 'apps',
    ];

    public function validate()
    {
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('siteCode', $this->siteCode, true);
        Model::validateRequired('releaseOrder', $this->releaseOrder, true);
        Model::validateRequired('apps', $this->apps, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->siteCode) {
            $res['site_code'] = $this->siteCode;
        }
        if (null !== $this->releaseOrder) {
            $res['release_order'] = $this->releaseOrder;
        }
        if (null !== $this->apps) {
            $res['apps'] = [];
            if (null !== $this->apps && \is_array($this->apps)) {
                $n = 0;
                foreach ($this->apps as $item) {
                    $res['apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductDeployInitOption
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['site_code'])) {
            $model->siteCode = $map['site_code'];
        }
        if (isset($map['release_order'])) {
            $model->releaseOrder = $map['release_order'];
        }
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = [];
                $n           = 0;
                foreach ($map['apps'] as $item) {
                    $model->apps[$n++] = null !== $item ? AppDeployInitOption::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
