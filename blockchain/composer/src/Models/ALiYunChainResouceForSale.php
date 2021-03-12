<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainResouceForSale extends Model
{
    // region_id
    /**
     * @example region_id
     *
     * @var string
     */
    public $regionId;

    // type_list
    /**
     * @example type_list
     *
     * @var string[]
     */
    public $typeList;
    protected $_name = [
        'regionId' => 'region_id',
        'typeList' => 'type_list',
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
        if (null !== $this->typeList) {
            $res['type_list'] = $this->typeList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainResouceForSale
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['type_list'])) {
            if (!empty($map['type_list'])) {
                $model->typeList = $map['type_list'];
            }
        }

        return $model;
    }
}
