<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class StagesDetailVO extends Model
{
    // 分期id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 计划开始时间
    /**
     * @example 1661926245540
     *
     * @var int
     */
    public $startTime;

    // 计划结束时间
    /**
     * @example 1662013142106
     *
     * @var int
     */
    public $endTime;

    // 目标捐赠金额
    /**
     * @example 100
     *
     * @var int
     */
    public $targetMoney;

    // 目标捐赠人数
    /**
     * @example
     *
     * @var int
     */
    public $targetNum;

    // 说明
    /**
     * @example 说明
     *
     * @var string
     */
    public $note;

    // 公开募捐编号
    /**
     * @example 24345sdw2423
     *
     * @var string
     */
    public $publicFundraisingNo;

    // 静态文件地址‘,’分割
    /**
     * @example http://xxxxx.jpg
     *
     * @var string
     */
    public $coverUrl;

    // 管理费用金额(单位：分)
    /**
     * @example
     *
     * @var int
     */
    public $administrativeRate;

    // 项目状态，0进行中（默认），1已结项
    /**
     * @example
     *
     * @var int
     */
    public $state;

    // 签约id,关联签约表
    /**
     * @example 1
     *
     * @var string
     */
    public $signId;
    protected $_name = [
        'id'                  => 'id',
        'startTime'           => 'start_time',
        'endTime'             => 'end_time',
        'targetMoney'         => 'target_money',
        'targetNum'           => 'target_num',
        'note'                => 'note',
        'publicFundraisingNo' => 'public_fundraising_no',
        'coverUrl'            => 'cover_url',
        'administrativeRate'  => 'administrative_rate',
        'state'               => 'state',
        'signId'              => 'sign_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->targetMoney) {
            $res['target_money'] = $this->targetMoney;
        }
        if (null !== $this->targetNum) {
            $res['target_num'] = $this->targetNum;
        }
        if (null !== $this->note) {
            $res['note'] = $this->note;
        }
        if (null !== $this->publicFundraisingNo) {
            $res['public_fundraising_no'] = $this->publicFundraisingNo;
        }
        if (null !== $this->coverUrl) {
            $res['cover_url'] = $this->coverUrl;
        }
        if (null !== $this->administrativeRate) {
            $res['administrative_rate'] = $this->administrativeRate;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->signId) {
            $res['sign_id'] = $this->signId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StagesDetailVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['target_money'])) {
            $model->targetMoney = $map['target_money'];
        }
        if (isset($map['target_num'])) {
            $model->targetNum = $map['target_num'];
        }
        if (isset($map['note'])) {
            $model->note = $map['note'];
        }
        if (isset($map['public_fundraising_no'])) {
            $model->publicFundraisingNo = $map['public_fundraising_no'];
        }
        if (isset($map['cover_url'])) {
            $model->coverUrl = $map['cover_url'];
        }
        if (isset($map['administrative_rate'])) {
            $model->administrativeRate = $map['administrative_rate'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['sign_id'])) {
            $model->signId = $map['sign_id'];
        }

        return $model;
    }
}
