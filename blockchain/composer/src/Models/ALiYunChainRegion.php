<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainRegion extends Model
{
    // region_id
    /**
     * @example region_id
     *
     * @var string
     */
    public $regionId;

    // region_name
    /**
     * @example region_name
     *
     * @var string
     */
    public $regionName;
    protected $_name = [
        'regionId'   => 'region_id',
        'regionName' => 'region_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainRegion
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['region_name'])) {
            $model->regionName = $map['region_name'];
        }

        return $model;
    }
}
