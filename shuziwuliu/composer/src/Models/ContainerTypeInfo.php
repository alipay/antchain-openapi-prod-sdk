<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ContainerTypeInfo extends Model
{
    // 箱型
    /**
     * @example 暂无
     *
     * @var string
     */
    public $containerType;

    // 箱量
    /**
     * @example 暂无
     *
     * @var string
     */
    public $containerVolume;
    protected $_name = [
        'containerType'   => 'container_type',
        'containerVolume' => 'container_volume',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerType) {
            $res['container_type'] = $this->containerType;
        }
        if (null !== $this->containerVolume) {
            $res['container_volume'] = $this->containerVolume;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerTypeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_type'])) {
            $model->containerType = $map['container_type'];
        }
        if (isset($map['container_volume'])) {
            $model->containerVolume = $map['container_volume'];
        }

        return $model;
    }
}
