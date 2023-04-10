<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class GetNetworkStatusInput extends Model
{
    // 网络的networkId
    /**
     * @example ""
     *
     * @var string
     */
    public $networkId;
    protected $_name = [
        'networkId' => 'network_id',
    ];

    public function validate()
    {
        Model::validateRequired('networkId', $this->networkId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->networkId) {
            $res['network_id'] = $this->networkId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetNetworkStatusInput
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['network_id'])) {
            $model->networkId = $map['network_id'];
        }

        return $model;
    }
}
