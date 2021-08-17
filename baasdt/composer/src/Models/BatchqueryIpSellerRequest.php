<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryIpSellerRequest extends Model
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

    // 基础信息
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 不同的平台标识
    /**
     * @var string
     */
    public $channelName;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // 分页索引
    /**
     * @var int
     */
    public $pageIndex;

    // 账户链上ID
    /**
     * @var string
     */
    public $accountId;

    // 1 版权方，2 商户
    /**
     * @var int
     */
    public $role;

    // 联系人名称
    /**
     * @var string
     */
    public $contactName;

    // 联系人电话
    /**
     * @var string
     */
    public $contactMobile;

    // 账户状态列表
    /**
     * @var int[]
     */
    public $statusList;

    // 排序
    /**
     * @var string
     */
    public $sortOrder;

    // 筛选更新时间范围，开始区间
    /**
     * @var int
     */
    public $createStartTime;

    // 筛选更新时间范围，结束区间
    /**
     * @var int
     */
    public $createEndTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'channelName'       => 'channel_name',
        'pageSize'          => 'page_size',
        'pageIndex'         => 'page_index',
        'accountId'         => 'account_id',
        'role'              => 'role',
        'contactName'       => 'contact_name',
        'contactMobile'     => 'contact_mobile',
        'statusList'        => 'status_list',
        'sortOrder'         => 'sort_order',
        'createStartTime'   => 'create_start_time',
        'createEndTime'     => 'create_end_time',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactMobile) {
            $res['contact_mobile'] = $this->contactMobile;
        }
        if (null !== $this->statusList) {
            $res['status_list'] = $this->statusList;
        }
        if (null !== $this->sortOrder) {
            $res['sort_order'] = $this->sortOrder;
        }
        if (null !== $this->createStartTime) {
            $res['create_start_time'] = $this->createStartTime;
        }
        if (null !== $this->createEndTime) {
            $res['create_end_time'] = $this->createEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryIpSellerRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['contact_name'])) {
            $model->contactName = $map['contact_name'];
        }
        if (isset($map['contact_mobile'])) {
            $model->contactMobile = $map['contact_mobile'];
        }
        if (isset($map['status_list'])) {
            if (!empty($map['status_list'])) {
                $model->statusList = $map['status_list'];
            }
        }
        if (isset($map['sort_order'])) {
            $model->sortOrder = $map['sort_order'];
        }
        if (isset($map['create_start_time'])) {
            $model->createStartTime = $map['create_start_time'];
        }
        if (isset($map['create_end_time'])) {
            $model->createEndTime = $map['create_end_time'];
        }

        return $model;
    }
}
