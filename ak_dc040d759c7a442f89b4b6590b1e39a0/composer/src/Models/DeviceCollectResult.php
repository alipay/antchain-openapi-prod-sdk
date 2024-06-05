<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class DeviceCollectResult extends Model
{
    // 上链数据采集ID
    /**
     * @example j8o12u38
     *
     * @var string
     */
    public $collectId;

    // 上链id
    /**
     * @example auit98
     *
     * @var string
     */
    public $antchainId;
    protected $_name = [
        'collectId'  => 'collect_id',
        'antchainId' => 'antchain_id',
    ];

    public function validate()
    {
        Model::validateRequired('collectId', $this->collectId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->collectId) {
            $res['collect_id'] = $this->collectId;
        }
        if (null !== $this->antchainId) {
            $res['antchain_id'] = $this->antchainId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceCollectResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['collect_id'])) {
            $model->collectId = $map['collect_id'];
        }
        if (isset($map['antchain_id'])) {
            $model->antchainId = $map['antchain_id'];
        }

        return $model;
    }
}
