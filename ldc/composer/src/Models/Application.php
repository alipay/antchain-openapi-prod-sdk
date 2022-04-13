<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class Application extends Model
{
    // 应用部署时指定的自定义参数
    /**
     * @example
     *
     * @var OpsParam[]
     */
    public $customParams;

    // 应用部署时依赖的应用名称，只允许取此次调用参数中列出的应用。不允许形成循环依赖。
    /**
     * @example
     *
     * @var string[]
     */
    public $depends;

    // 应用名称
    /**
     * @example
     *
     * @var string
     */
    public $name;

    // 指定应用下的应用服务实例
    /**
     * @example
     *
     * @var AppService[]
     */
    public $services;

    // 应用包版本
    /**
     * @example
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'customParams' => 'custom_params',
        'depends'      => 'depends',
        'name'         => 'name',
        'services'     => 'services',
        'version'      => 'version',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customParams) {
            $res['custom_params'] = [];
            if (null !== $this->customParams && \is_array($this->customParams)) {
                $n = 0;
                foreach ($this->customParams as $item) {
                    $res['custom_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->depends) {
            $res['depends'] = $this->depends;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->services) {
            $res['services'] = [];
            if (null !== $this->services && \is_array($this->services)) {
                $n = 0;
                foreach ($this->services as $item) {
                    $res['services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Application
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['custom_params'])) {
            if (!empty($map['custom_params'])) {
                $model->customParams = [];
                $n                   = 0;
                foreach ($map['custom_params'] as $item) {
                    $model->customParams[$n++] = null !== $item ? OpsParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['depends'])) {
            if (!empty($map['depends'])) {
                $model->depends = $map['depends'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['services'])) {
            if (!empty($map['services'])) {
                $model->services = [];
                $n               = 0;
                foreach ($map['services'] as $item) {
                    $model->services[$n++] = null !== $item ? AppService::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
