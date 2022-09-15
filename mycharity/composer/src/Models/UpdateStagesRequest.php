<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class UpdateStagesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 分期id
    /**
     * @var string
     */
    public $id;

    // 计划开始时间
    /**
     * @var int
     */
    public $startTime;

    // 计划结束时间
    /**
     * @var int
     */
    public $endTime;

    // 目标捐赠金额
    /**
     * @var int
     */
    public $targetMoney;

    // 目标捐赠人数
    /**
     * @var int
     */
    public $targetNum;

    // 说明
    /**
     * @var string
     */
    public $note;

    // 公开募捐编号
    /**
     * @var string
     */
    public $publicFundraisingNo;

    // 静态文件地址‘,’分割
    /**
     * @var string
     */
    public $coverUrl;

    // 管理费用金额(单位：分)
    /**
     * @var int
     */
    public $administrativeRate;

    // 项目状态，0进行中（默认），1已结项
    /**
     * @var int
     */
    public $state;

    // 签约id,关联签约表
    /**
     * @var string
     */
    public $signId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
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
        Model::validateMaxLength('id', $this->id, 50);
        Model::validateMaxLength('note', $this->note, 1000);
        Model::validateMaxLength('publicFundraisingNo', $this->publicFundraisingNo, 50);
        Model::validateMaxLength('coverUrl', $this->coverUrl, 450);
        Model::validateMaxLength('signId', $this->signId, 50);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
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
     * @return UpdateStagesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
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
