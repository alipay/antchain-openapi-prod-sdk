<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OpsContainerServiceGroup extends Model
{
    // 运维容器服务列表
    /**
     * @example [{"namespace": "default", "name": "CSA"}]
     *
     * @var OpsContainerService[]
     */
    public $containerServices;
    protected $_name = [
        'containerServices' => 'container_services',
    ];

    public function validate()
    {
        Model::validateRequired('containerServices', $this->containerServices, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerServices) {
            $res['container_services'] = [];
            if (null !== $this->containerServices && \is_array($this->containerServices)) {
                $n = 0;
                foreach ($this->containerServices as $item) {
                    $res['container_services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsContainerServiceGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_services'])) {
            if (!empty($map['container_services'])) {
                $model->containerServices = [];
                $n                        = 0;
                foreach ($map['container_services'] as $item) {
                    $model->containerServices[$n++] = null !== $item ? OpsContainerService::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
