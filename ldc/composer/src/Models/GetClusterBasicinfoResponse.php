<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetClusterBasicinfoResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // cell infos
    /**
     * @var CellInfo[]
     */
    public $cellInfos;

    // created time
    /**
     * @var string
     */
    public $createdTime;

    // cluster display name
    /**
     * @var string
     */
    public $displayName;

    // network info
    /**
     * @var NetworkInfo
     */
    public $networkInfo;

    // region info
    /**
     * @var RegionInfo
     */
    public $regionInfo;

    // secured group infos
    /**
     * @var SecuredGroupInfo[]
     */
    public $securedGroupInfos;

    // cluster status
    //
    /**
     * @var string
     */
    public $status;

    // zone info
    /**
     * @var ZoneInfo
     */
    public $zoneInfo;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'cellInfos'         => 'cell_infos',
        'createdTime'       => 'created_time',
        'displayName'       => 'display_name',
        'networkInfo'       => 'network_info',
        'regionInfo'        => 'region_info',
        'securedGroupInfos' => 'secured_group_infos',
        'status'            => 'status',
        'zoneInfo'          => 'zone_info',
    ];

    public function validate()
    {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->cellInfos) {
            $res['cell_infos'] = [];
            if (null !== $this->cellInfos && \is_array($this->cellInfos)) {
                $n = 0;
                foreach ($this->cellInfos as $item) {
                    $res['cell_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->networkInfo) {
            $res['network_info'] = null !== $this->networkInfo ? $this->networkInfo->toMap() : null;
        }
        if (null !== $this->regionInfo) {
            $res['region_info'] = null !== $this->regionInfo ? $this->regionInfo->toMap() : null;
        }
        if (null !== $this->securedGroupInfos) {
            $res['secured_group_infos'] = [];
            if (null !== $this->securedGroupInfos && \is_array($this->securedGroupInfos)) {
                $n = 0;
                foreach ($this->securedGroupInfos as $item) {
                    $res['secured_group_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->zoneInfo) {
            $res['zone_info'] = null !== $this->zoneInfo ? $this->zoneInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetClusterBasicinfoResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['cell_infos'])) {
            if (!empty($map['cell_infos'])) {
                $model->cellInfos = [];
                $n                = 0;
                foreach ($map['cell_infos'] as $item) {
                    $model->cellInfos[$n++] = null !== $item ? CellInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['network_info'])) {
            $model->networkInfo = NetworkInfo::fromMap($map['network_info']);
        }
        if (isset($map['region_info'])) {
            $model->regionInfo = RegionInfo::fromMap($map['region_info']);
        }
        if (isset($map['secured_group_infos'])) {
            if (!empty($map['secured_group_infos'])) {
                $model->securedGroupInfos = [];
                $n                        = 0;
                foreach ($map['secured_group_infos'] as $item) {
                    $model->securedGroupInfos[$n++] = null !== $item ? SecuredGroupInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['zone_info'])) {
            $model->zoneInfo = ZoneInfo::fromMap($map['zone_info']);
        }

        return $model;
    }
}
