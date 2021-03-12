<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDidServiceList extends Model
{
    // 待更新did之前的版本号
    /**
     * @example
     *
     * @var int
     */
    public $previousVersion;

    // 服务信息列表
    /**
     * @example
     *
     * @var DisServicesInfo[]
     */
    public $serviceList;
    protected $_name = [
        'previousVersion' => 'previous_version',
        'serviceList'     => 'service_list',
    ];

    public function validate()
    {
        Model::validateRequired('previousVersion', $this->previousVersion, true);
        Model::validateRequired('serviceList', $this->serviceList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->previousVersion) {
            $res['previous_version'] = $this->previousVersion;
        }
        if (null !== $this->serviceList) {
            $res['service_list'] = [];
            if (null !== $this->serviceList && \is_array($this->serviceList)) {
                $n = 0;
                foreach ($this->serviceList as $item) {
                    $res['service_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDidServiceList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['previous_version'])) {
            $model->previousVersion = $map['previous_version'];
        }
        if (isset($map['service_list'])) {
            if (!empty($map['service_list'])) {
                $model->serviceList = [];
                $n                  = 0;
                foreach ($map['service_list'] as $item) {
                    $model->serviceList[$n++] = null !== $item ? DisServicesInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
