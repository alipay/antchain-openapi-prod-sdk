<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DeviceGroup extends Model
{
    // 设备组id
    /**
     * @example groupId
     *
     * @var string
     */
    public $groupId;

    // 设备组名称
    /**
     * @example groupName
     *
     * @var string
     */
    public $groupName;

    // 设备id
    /**
     * @example thingsDid
     *
     * @var string[]
     */
    public $thingsDidList;

    // 设备其他信息
    /**
     * @example 1
     *
     * @var DeviceInfoNoGroup[]
     */
    public $thingsInfoList;
    protected $_name = [
        'groupId'        => 'group_id',
        'groupName'      => 'group_name',
        'thingsDidList'  => 'things_did_list',
        'thingsInfoList' => 'things_info_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }
        if (null !== $this->thingsDidList) {
            $res['things_did_list'] = $this->thingsDidList;
        }
        if (null !== $this->thingsInfoList) {
            $res['things_info_list'] = [];
            if (null !== $this->thingsInfoList && \is_array($this->thingsInfoList)) {
                $n = 0;
                foreach ($this->thingsInfoList as $item) {
                    $res['things_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }
        if (isset($map['things_did_list'])) {
            if (!empty($map['things_did_list'])) {
                $model->thingsDidList = $map['things_did_list'];
            }
        }
        if (isset($map['things_info_list'])) {
            if (!empty($map['things_info_list'])) {
                $model->thingsInfoList = [];
                $n                     = 0;
                foreach ($map['things_info_list'] as $item) {
                    $model->thingsInfoList[$n++] = null !== $item ? DeviceInfoNoGroup::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
