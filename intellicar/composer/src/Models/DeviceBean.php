<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class DeviceBean extends Model
{
    // 选填其中一个：imeiMd5、macMd5、adid、adidMd5、did、idfa、idfaMd5、caid、caidMd5、oaid、oaidMd5、aaid、aaidMd5、gtcid、mb、pnSha256、cid、gid
    /**
     * @example -
     *
     * @var string
     */
    public $deviceIdType;

    // 设备ID列表（最多200个，不要重复）
    /**
     * @example undefined
     *
     * @var string[]
     */
    public $deviceIdList;
    protected $_name = [
        'deviceIdType' => 'device_id_type',
        'deviceIdList' => 'device_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('deviceIdType', $this->deviceIdType, true);
        Model::validateRequired('deviceIdList', $this->deviceIdList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceIdType) {
            $res['device_id_type'] = $this->deviceIdType;
        }
        if (null !== $this->deviceIdList) {
            $res['device_id_list'] = $this->deviceIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceBean
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_id_type'])) {
            $model->deviceIdType = $map['device_id_type'];
        }
        if (isset($map['device_id_list'])) {
            if (!empty($map['device_id_list'])) {
                $model->deviceIdList = $map['device_id_list'];
            }
        }

        return $model;
    }
}
