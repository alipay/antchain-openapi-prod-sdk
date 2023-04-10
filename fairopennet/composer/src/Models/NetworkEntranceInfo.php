<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class NetworkEntranceInfo extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $networkId;

    /**
     * @example
     *
     * @var string
     */
    public $entranceInfo;
    protected $_name = [
        'networkId'    => 'network_id',
        'entranceInfo' => 'entrance_info',
    ];

    public function validate()
    {
        Model::validateRequired('networkId', $this->networkId, true);
        Model::validateRequired('entranceInfo', $this->entranceInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->networkId) {
            $res['network_id'] = $this->networkId;
        }
        if (null !== $this->entranceInfo) {
            $res['entrance_info'] = $this->entranceInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NetworkEntranceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['network_id'])) {
            $model->networkId = $map['network_id'];
        }
        if (isset($map['entrance_info'])) {
            $model->entranceInfo = $map['entrance_info'];
        }

        return $model;
    }
}
