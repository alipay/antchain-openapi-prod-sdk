<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class Policy extends Model
{
    // 政策id
    /**
     * @example 202103240P00072593
     *
     * @var string
     */
    public $policyId;

    // 政策名称
    /**
     * @example 酒店saas
     *
     * @var string
     */
    public $policyName;

    // 政策类型
    /**
     * @example REBATE
     *
     * @var string
     */
    public $policyType;

    // 政策生效时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 政策失效时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 下架时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $offlineTime;

    // 政策状态
    /**
     * @example VALID
     *
     * @var string
     */
    public $policyStatus;

    // 创建者
    /**
     * @example carroll.wk
     *
     * @var string
     */
    public $creator;

    // 修改者
    /**
     * @example carroll.wk
     *
     * @var string
     */
    public $modifier;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'policyId'     => 'policy_id',
        'policyName'   => 'policy_name',
        'policyType'   => 'policy_type',
        'startTime'    => 'start_time',
        'endTime'      => 'end_time',
        'offlineTime'  => 'offline_time',
        'policyStatus' => 'policy_status',
        'creator'      => 'creator',
        'modifier'     => 'modifier',
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('policyId', $this->policyId, true);
        Model::validateRequired('policyName', $this->policyName, true);
        Model::validateRequired('policyType', $this->policyType, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('policyStatus', $this->policyStatus, true);
        Model::validateRequired('creator', $this->creator, true);
        Model::validateRequired('modifier', $this->modifier, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('offlineTime', $this->offlineTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->policyId) {
            $res['policy_id'] = $this->policyId;
        }
        if (null !== $this->policyName) {
            $res['policy_name'] = $this->policyName;
        }
        if (null !== $this->policyType) {
            $res['policy_type'] = $this->policyType;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->offlineTime) {
            $res['offline_time'] = $this->offlineTime;
        }
        if (null !== $this->policyStatus) {
            $res['policy_status'] = $this->policyStatus;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Policy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['policy_id'])) {
            $model->policyId = $map['policy_id'];
        }
        if (isset($map['policy_name'])) {
            $model->policyName = $map['policy_name'];
        }
        if (isset($map['policy_type'])) {
            $model->policyType = $map['policy_type'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['offline_time'])) {
            $model->offlineTime = $map['offline_time'];
        }
        if (isset($map['policy_status'])) {
            $model->policyStatus = $map['policy_status'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
