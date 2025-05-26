<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class InsuranceTaskDetailInfo extends Model
{
    // 用户备注
    /**
     * @example ""
     *
     * @var string
     */
    public $userMemo;

    // 上门人员姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $doorToDoorWorkerName;

    // 电池包装码
    /**
     * @example ABC
     *
     * @var string
     */
    public $batteryPackagingCode;

    // 电池码
    /**
     * @example ABC
     *
     * @var string
     */
    public $batteryCode;

    // 图片列表
    /**
     * @example ["image1", "image2"]
     *
     * @var string[]
     */
    public $installImages;

    // 任务id
    /**
     * @example 12
     *
     * @var string
     */
    public $taskId;

    // 任务状态
    /**
     * @example "doorToDoorFinsh" (已完成)
     *
     * @var string
     */
    public $taskStatus;

    // 电池型号
    /**
     * @example 123
     *
     * @var string
     */
    public $batteryType;

    // 上门地址
    /**
     * @example 杭州市西湖区某小区
     *
     * @var string
     */
    public $serviceAddress;

    // 租赁人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $batteryRenterName;

    // 租赁人电话
    /**
     * @example 15666666666
     *
     * @var string
     */
    public $batteryRenterPhone;

    // 上门时间
    /**
     * @example 2025-05-16 11:00:00
     *
     * @var string
     */
    public $serviceTime;

    // 任务所属服务商账号id
    /**
     * @example AC000100000000011000
     *
     * @var string
     */
    public $isvAccountId;
    protected $_name = [
        'userMemo'             => 'user_memo',
        'doorToDoorWorkerName' => 'door_to_door_worker_name',
        'batteryPackagingCode' => 'battery_packaging_code',
        'batteryCode'          => 'battery_code',
        'installImages'        => 'install_images',
        'taskId'               => 'task_id',
        'taskStatus'           => 'task_status',
        'batteryType'          => 'battery_type',
        'serviceAddress'       => 'service_address',
        'batteryRenterName'    => 'battery_renter_name',
        'batteryRenterPhone'   => 'battery_renter_phone',
        'serviceTime'          => 'service_time',
        'isvAccountId'         => 'isv_account_id',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('taskStatus', $this->taskStatus, true);
        Model::validateRequired('batteryType', $this->batteryType, true);
        Model::validateRequired('serviceAddress', $this->serviceAddress, true);
        Model::validateRequired('batteryRenterName', $this->batteryRenterName, true);
        Model::validateRequired('batteryRenterPhone', $this->batteryRenterPhone, true);
        Model::validateRequired('serviceTime', $this->serviceTime, true);
        Model::validateRequired('isvAccountId', $this->isvAccountId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userMemo) {
            $res['user_memo'] = $this->userMemo;
        }
        if (null !== $this->doorToDoorWorkerName) {
            $res['door_to_door_worker_name'] = $this->doorToDoorWorkerName;
        }
        if (null !== $this->batteryPackagingCode) {
            $res['battery_packaging_code'] = $this->batteryPackagingCode;
        }
        if (null !== $this->batteryCode) {
            $res['battery_code'] = $this->batteryCode;
        }
        if (null !== $this->installImages) {
            $res['install_images'] = $this->installImages;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->batteryType) {
            $res['battery_type'] = $this->batteryType;
        }
        if (null !== $this->serviceAddress) {
            $res['service_address'] = $this->serviceAddress;
        }
        if (null !== $this->batteryRenterName) {
            $res['battery_renter_name'] = $this->batteryRenterName;
        }
        if (null !== $this->batteryRenterPhone) {
            $res['battery_renter_phone'] = $this->batteryRenterPhone;
        }
        if (null !== $this->serviceTime) {
            $res['service_time'] = $this->serviceTime;
        }
        if (null !== $this->isvAccountId) {
            $res['isv_account_id'] = $this->isvAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsuranceTaskDetailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_memo'])) {
            $model->userMemo = $map['user_memo'];
        }
        if (isset($map['door_to_door_worker_name'])) {
            $model->doorToDoorWorkerName = $map['door_to_door_worker_name'];
        }
        if (isset($map['battery_packaging_code'])) {
            $model->batteryPackagingCode = $map['battery_packaging_code'];
        }
        if (isset($map['battery_code'])) {
            $model->batteryCode = $map['battery_code'];
        }
        if (isset($map['install_images'])) {
            if (!empty($map['install_images'])) {
                $model->installImages = $map['install_images'];
            }
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }
        if (isset($map['battery_type'])) {
            $model->batteryType = $map['battery_type'];
        }
        if (isset($map['service_address'])) {
            $model->serviceAddress = $map['service_address'];
        }
        if (isset($map['battery_renter_name'])) {
            $model->batteryRenterName = $map['battery_renter_name'];
        }
        if (isset($map['battery_renter_phone'])) {
            $model->batteryRenterPhone = $map['battery_renter_phone'];
        }
        if (isset($map['service_time'])) {
            $model->serviceTime = $map['service_time'];
        }
        if (isset($map['isv_account_id'])) {
            $model->isvAccountId = $map['isv_account_id'];
        }

        return $model;
    }
}
