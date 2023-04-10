<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class NetworkStatusInfo extends Model
{
    // 协作网络状态枚举类型
    /**
     * @example "UN_INITIALIZED"
     *
     * @var string
     */
    public $networkStatus;
    protected $_name = [
        'networkStatus' => 'network_status',
    ];

    public function validate()
    {
        Model::validateRequired('networkStatus', $this->networkStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->networkStatus) {
            $res['network_status'] = $this->networkStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NetworkStatusInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['network_status'])) {
            $model->networkStatus = $map['network_status'];
        }

        return $model;
    }
}
