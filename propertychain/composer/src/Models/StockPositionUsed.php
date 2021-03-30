<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StockPositionUsed extends Model
{
    // 库位ID
    /**
     * @example positionId
     *
     * @var string
     */
    public $positionId;

    // 已用容量，百分比的数值，如50%，则为50
    /**
     * @example 50
     *
     * @var int
     */
    public $usedCapacity;
    protected $_name = [
        'positionId'   => 'position_id',
        'usedCapacity' => 'used_capacity',
    ];

    public function validate()
    {
        Model::validateRequired('positionId', $this->positionId, true);
        Model::validateRequired('usedCapacity', $this->usedCapacity, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->positionId) {
            $res['position_id'] = $this->positionId;
        }
        if (null !== $this->usedCapacity) {
            $res['used_capacity'] = $this->usedCapacity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StockPositionUsed
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['position_id'])) {
            $model->positionId = $map['position_id'];
        }
        if (isset($map['used_capacity'])) {
            $model->usedCapacity = $map['used_capacity'];
        }

        return $model;
    }
}
