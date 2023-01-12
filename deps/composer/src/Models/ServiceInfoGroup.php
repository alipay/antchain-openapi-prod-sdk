<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ServiceInfoGroup extends Model
{
    // 发布应用列表
    /**
     * @example
     *
     * @var ServiceInfo[]
     */
    public $serviceInfoList;
    protected $_name = [
        'serviceInfoList' => 'service_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('serviceInfoList', $this->serviceInfoList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serviceInfoList) {
            $res['service_info_list'] = [];
            if (null !== $this->serviceInfoList && \is_array($this->serviceInfoList)) {
                $n = 0;
                foreach ($this->serviceInfoList as $item) {
                    $res['service_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceInfoGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['service_info_list'])) {
            if (!empty($map['service_info_list'])) {
                $model->serviceInfoList = [];
                $n                      = 0;
                foreach ($map['service_info_list'] as $item) {
                    $model->serviceInfoList[$n++] = null !== $item ? ServiceInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
