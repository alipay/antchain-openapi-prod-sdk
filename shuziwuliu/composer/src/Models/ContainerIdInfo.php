<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ContainerIdInfo extends Model
{
    // 箱子唯一标识
    /**
     * @example 暂无
     *
     * @var string
     */
    public $containerId;

    // 箱号
    /**
     * @example 暂无
     *
     * @var string
     */
    public $containerNo;
    protected $_name = [
        'containerId' => 'container_id',
        'containerNo' => 'container_no',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }
        if (null !== $this->containerNo) {
            $res['container_no'] = $this->containerNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerIdInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_id'])) {
            $model->containerId = $map['container_id'];
        }
        if (isset($map['container_no'])) {
            $model->containerNo = $map['container_no'];
        }

        return $model;
    }
}
