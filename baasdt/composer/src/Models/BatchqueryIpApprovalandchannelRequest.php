<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryIpApprovalandchannelRequest extends Model
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

    // ip的名字
    /**
     * @var string
     */
    public $ipName;

    // ip的id
    /**
     * @var string
     */
    public $ipId;

    // 审批状态
    /**
     * @var int
     */
    public $approvalStatus;

    // ip类型
    /**
     * @var string
     */
    public $ipType;

    // 受众人群
    /**
     * @var string
     */
    public $audienceGroup;

    // 归属账户
    /**
     * @var string
     */
    public $accountId;

    // 版权方别名
    /**
     * @var string
     */
    public $accountExternalName;

    // 是否需要按照创建时间倒序排序
    //
    /**
     * @var bool
     */
    public $isCreateTimeSortDesc;

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

    // 开始时间
    /**
     * @var string
     */
    public $createBeginTime;

    // 结束时间
    /**
     * @var string
     */
    public $createEndTime;

    // 渠道名称
    /**
     * @var string
     */
    public $channelName;

    // 上架渠道，SelfEmployed为上架到自营的渠道，NONLINE为未上架任何渠道
    /**
     * @var string
     */
    public $onlineChannel;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'baseRequest'          => 'base_request',
        'ipName'               => 'ip_name',
        'ipId'                 => 'ip_id',
        'approvalStatus'       => 'approval_status',
        'ipType'               => 'ip_type',
        'audienceGroup'        => 'audience_group',
        'accountId'            => 'account_id',
        'accountExternalName'  => 'account_external_name',
        'isCreateTimeSortDesc' => 'is_create_time_sort_desc',
        'pageSize'             => 'page_size',
        'pageIndex'            => 'page_index',
        'createBeginTime'      => 'create_begin_time',
        'createEndTime'        => 'create_end_time',
        'channelName'          => 'channel_name',
        'onlineChannel'        => 'online_channel',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('isCreateTimeSortDesc', $this->isCreateTimeSortDesc, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('createBeginTime', $this->createBeginTime, true);
        Model::validateRequired('createEndTime', $this->createEndTime, true);
        Model::validatePattern('createBeginTime', $this->createBeginTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('createEndTime', $this->createEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->ipName) {
            $res['ip_name'] = $this->ipName;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->approvalStatus) {
            $res['approval_status'] = $this->approvalStatus;
        }
        if (null !== $this->ipType) {
            $res['ip_type'] = $this->ipType;
        }
        if (null !== $this->audienceGroup) {
            $res['audience_group'] = $this->audienceGroup;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->accountExternalName) {
            $res['account_external_name'] = $this->accountExternalName;
        }
        if (null !== $this->isCreateTimeSortDesc) {
            $res['is_create_time_sort_desc'] = $this->isCreateTimeSortDesc;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->createBeginTime) {
            $res['create_begin_time'] = $this->createBeginTime;
        }
        if (null !== $this->createEndTime) {
            $res['create_end_time'] = $this->createEndTime;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->onlineChannel) {
            $res['online_channel'] = $this->onlineChannel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryIpApprovalandchannelRequest
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
        if (isset($map['ip_name'])) {
            $model->ipName = $map['ip_name'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['approval_status'])) {
            $model->approvalStatus = $map['approval_status'];
        }
        if (isset($map['ip_type'])) {
            $model->ipType = $map['ip_type'];
        }
        if (isset($map['audience_group'])) {
            $model->audienceGroup = $map['audience_group'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['account_external_name'])) {
            $model->accountExternalName = $map['account_external_name'];
        }
        if (isset($map['is_create_time_sort_desc'])) {
            $model->isCreateTimeSortDesc = $map['is_create_time_sort_desc'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['create_begin_time'])) {
            $model->createBeginTime = $map['create_begin_time'];
        }
        if (isset($map['create_end_time'])) {
            $model->createEndTime = $map['create_end_time'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['online_channel'])) {
            $model->onlineChannel = $map['online_channel'];
        }

        return $model;
    }
}
