<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class UserAssetDetail extends Model
{
    // 粉丝粒变化数量，带符号整数，单位分个。
    /**
     * @example 100
     *
     * @var int
     */
    public $asset;

    // 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
    /**
     * @example PRE_ALLOCATION | RELEASED | CANCELLED | REDEEMING | REDEEMED
     *
     * @var string
     */
    public $assetType;

    // 业务单号
    /**
     * @example 24435254363465
     *
     * @var string
     */
    public $bizNo;

    // 事件时间，时区GMT+8，精确到毫秒。
    /**
     * @example
     *
     * @var string
     */
    public $eventTime;

    // 备注信息
    /**
     * @example 备注
     *
     * @var string
     */
    public $memo;

    // 项目名称
    /**
     * @example 玩具总动员
     *
     * @var string
     */
    public $projectName;

    // 收益变化额度，单位为分。
    /**
     * @example 200
     *
     * @var Revenue
     */
    public $revenue;
    protected $_name = [
        'asset'       => 'asset',
        'assetType'   => 'asset_type',
        'bizNo'       => 'biz_no',
        'eventTime'   => 'event_time',
        'memo'        => 'memo',
        'projectName' => 'project_name',
        'revenue'     => 'revenue',
    ];

    public function validate()
    {
        Model::validateRequired('asset', $this->asset, true);
        Model::validateRequired('assetType', $this->assetType, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('revenue', $this->revenue, true);
        Model::validatePattern('eventTime', $this->eventTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->asset) {
            $res['asset'] = $this->asset;
        }
        if (null !== $this->assetType) {
            $res['asset_type'] = $this->assetType;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->revenue) {
            $res['revenue'] = null !== $this->revenue ? $this->revenue->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserAssetDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asset'])) {
            $model->asset = $map['asset'];
        }
        if (isset($map['asset_type'])) {
            $model->assetType = $map['asset_type'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['event_time'])) {
            $model->eventTime = $map['event_time'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['revenue'])) {
            $model->revenue = Revenue::fromMap($map['revenue']);
        }

        return $model;
    }
}
