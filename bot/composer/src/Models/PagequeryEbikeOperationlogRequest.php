<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryEbikeOperationlogRequest extends Model
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

    // 第几页
    /**
     * @var int
     */
    public $pageIndex;

    // 单页记录数
    /**
     * @var int
     */
    public $pageSize;

    // 开始时间（日志记录的时间）
    /**
     * @var string
     */
    public $startDate;

    // 结束时间（日志记录的时间）
    /**
     * @var string
     */
    public $endDate;

    // 小程序AppId
    /**
     * @var string
     */
    public $appId;

    // 用户Id
    /**
     * @var string
     */
    public $userId;

    // 用户手机号，当user_id不为空时，该值无效
    /**
     * @var string
     */
    public $userPhone;

    // 设备Id
    /**
     * @var string
     */
    public $deviceId;

    // 操作描述
    /**
     * @var string
     */
    public $operateDesc;

    // 操作是否成功
    /**
     * @var bool
     */
    public $success;

    // 日志等级（info、warn、error）
    /**
     * @var string
     */
    public $level;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageIndex'         => 'page_index',
        'pageSize'          => 'page_size',
        'startDate'         => 'start_date',
        'endDate'           => 'end_date',
        'appId'             => 'app_id',
        'userId'            => 'user_id',
        'userPhone'         => 'user_phone',
        'deviceId'          => 'device_id',
        'operateDesc'       => 'operate_desc',
        'success'           => 'success',
        'level'             => 'level',
    ];

    public function validate()
    {
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('endDate', $this->endDate, true);
        Model::validateMinimum('pageIndex', $this->pageIndex, 1);
        Model::validateMinimum('pageSize', $this->pageSize, 1);
        Model::validateMaximum('pageSize', $this->pageSize, 100);
        Model::validatePattern('startDate', $this->startDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endDate', $this->endDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userPhone) {
            $res['user_phone'] = $this->userPhone;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->operateDesc) {
            $res['operate_desc'] = $this->operateDesc;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryEbikeOperationlogRequest
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
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_phone'])) {
            $model->userPhone = $map['user_phone'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['operate_desc'])) {
            $model->operateDesc = $map['operate_desc'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }

        return $model;
    }
}
