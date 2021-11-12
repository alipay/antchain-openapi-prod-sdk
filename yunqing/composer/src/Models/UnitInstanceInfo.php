<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class UnitInstanceInfo extends Model
{
    // 部署单元内服务实例列表
    /**
     * @example
     *
     * @var AppServiceInfo[]
     */
    public $appServices;
    protected $_name = [
        'appServices' => 'app_services',
    ];

    public function validate()
    {
        Model::validateRequired('appServices', $this->appServices, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appServices) {
            $res['app_services'] = [];
            if (null !== $this->appServices && \is_array($this->appServices)) {
                $n = 0;
                foreach ($this->appServices as $item) {
                    $res['app_services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnitInstanceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_services'])) {
            if (!empty($map['app_services'])) {
                $model->appServices = [];
                $n                  = 0;
                foreach ($map['app_services'] as $item) {
                    $model->appServices[$n++] = null !== $item ? AppServiceInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
