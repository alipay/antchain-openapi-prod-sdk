<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class TransactionInfo extends Model
{
    // Saga模式返回3, tcc-local 返回 1， tcc-remote 返回2
    /**
     * @example 3
     *
     * @var int
     */
    public $actionMode;

    // 业务码
    /**
     * @example 01040P
     *
     * @var string
     */
    public $bizType;

    // 业务id
    /**
     * @example aaa11113333
     *
     * @var string
     */
    public $businessId;

    // 结束时间
    /**
     * @example 2019-11-05 16:50:27
     *
     * @var string
     */
    public $endTime;

    // 发起方ip
    /**
     * @example 10.253.175.18
     *
     * @var string
     */
    public $initiatorIp;

    // 发起方名称
    /**
     * @example ant-cloud-quality-dtxtest
     *
     * @var string
     */
    public $initiatorName;

    // 最近修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifyTime;

    // 参与者id列表
    /**
     * @example [100, 101]
     *
     * @var string[]
     */
    public $participatorIds;

    // 开始时间
    /**
     * @example 2019-11-05 16:49:00
     *
     * @var string
     */
    public $startTime;

    // 事务状态
    /**
     * @example Success
     *
     * @var string
     */
    public $status;

    // 事务id
    /**
     * @example b3f0f17e45d54d56967a5bd6dd1a28c501-0000000000
     *
     * @var string
     */
    public $txId;
    protected $_name = [
        'actionMode'      => 'action_mode',
        'bizType'         => 'biz_type',
        'businessId'      => 'business_id',
        'endTime'         => 'end_time',
        'initiatorIp'     => 'initiator_ip',
        'initiatorName'   => 'initiator_name',
        'modifyTime'      => 'modify_time',
        'participatorIds' => 'participator_ids',
        'startTime'       => 'start_time',
        'status'          => 'status',
        'txId'            => 'tx_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('businessId', $this->businessId, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('initiatorIp', $this->initiatorIp, true);
        Model::validateRequired('initiatorName', $this->initiatorName, true);
        Model::validateRequired('modifyTime', $this->modifyTime, true);
        Model::validateRequired('participatorIds', $this->participatorIds, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('txId', $this->txId, true);
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifyTime', $this->modifyTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionMode) {
            $res['action_mode'] = $this->actionMode;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->initiatorIp) {
            $res['initiator_ip'] = $this->initiatorIp;
        }
        if (null !== $this->initiatorName) {
            $res['initiator_name'] = $this->initiatorName;
        }
        if (null !== $this->modifyTime) {
            $res['modify_time'] = $this->modifyTime;
        }
        if (null !== $this->participatorIds) {
            $res['participator_ids'] = $this->participatorIds;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->txId) {
            $res['tx_id'] = $this->txId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_mode'])) {
            $model->actionMode = $map['action_mode'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['initiator_ip'])) {
            $model->initiatorIp = $map['initiator_ip'];
        }
        if (isset($map['initiator_name'])) {
            $model->initiatorName = $map['initiator_name'];
        }
        if (isset($map['modify_time'])) {
            $model->modifyTime = $map['modify_time'];
        }
        if (isset($map['participator_ids'])) {
            if (!empty($map['participator_ids'])) {
                $model->participatorIds = $map['participator_ids'];
            }
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tx_id'])) {
            $model->txId = $map['tx_id'];
        }

        return $model;
    }
}
