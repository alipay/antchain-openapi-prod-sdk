<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryIpGoodsRequest extends Model
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

    // 商品id
    /**
     * @var string
     */
    public $ipId;

    // ip名称，支持模糊匹配
    /**
     * @var string
     */
    public $ipName;

    // 商品状态（0:待上架，1:上架，2:下架）
    /**
     * @var int
     */
    public $status;

    // ip的上架渠道
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

    // ip商品归属方的链上id
    /**
     * @var string
     */
    public $accountId;

    // Ip类型
    /**
     * @var string
     */
    public $ipType;

    // 受众人群
    /**
     * @var string
     */
    public $audienceGroup;

    // 上架日期开始时间
    /**
     * @var string
     */
    public $createBeginTime;

    // 创建的结束日期
    /**
     * @var string
     */
    public $createEndTime;

    // 是否需要按照创建时间倒序排序
    /**
     * @var bool
     */
    public $isCreateTimeSortDesc;

    // 是否需要按照pv排序（0:不需要，1:正序，2:倒序），默认按照pv倒序
    /**
     * @var int
     */
    public $isSortByPv;

    // 是否需要按照最近上下架时间排序（0:不需要，1:正序，2:倒序），默认按照倒序
    /**
     * @var int
     */
    public $isSortByStatusChange;

    // 是否需要返回创建渠道，为空默认不返回
    /**
     * @var bool
     */
    public $queryCreaterChannel;

    // 保底金区间，0：0；1：10万以下；2:10-30万；3:30-50万；4:50万以上
    /**
     * @var int
     */
    public $guaranteeRange;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'baseRequest'          => 'base_request',
        'ipId'                 => 'ip_id',
        'ipName'               => 'ip_name',
        'status'               => 'status',
        'channelName'          => 'channel_name',
        'pageSize'             => 'page_size',
        'pageIndex'            => 'page_index',
        'accountId'            => 'account_id',
        'ipType'               => 'ip_type',
        'audienceGroup'        => 'audience_group',
        'createBeginTime'      => 'create_begin_time',
        'createEndTime'        => 'create_end_time',
        'isCreateTimeSortDesc' => 'is_create_time_sort_desc',
        'isSortByPv'           => 'is_sort_by_pv',
        'isSortByStatusChange' => 'is_sort_by_status_change',
        'queryCreaterChannel'  => 'query_creater_channel',
        'guaranteeRange'       => 'guarantee_range',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('createBeginTime', $this->createBeginTime, true);
        Model::validateRequired('createEndTime', $this->createEndTime, true);
        Model::validateRequired('isCreateTimeSortDesc', $this->isCreateTimeSortDesc, true);
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
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->ipName) {
            $res['ip_name'] = $this->ipName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
        if (null !== $this->ipType) {
            $res['ip_type'] = $this->ipType;
        }
        if (null !== $this->audienceGroup) {
            $res['audience_group'] = $this->audienceGroup;
        }
        if (null !== $this->createBeginTime) {
            $res['create_begin_time'] = $this->createBeginTime;
        }
        if (null !== $this->createEndTime) {
            $res['create_end_time'] = $this->createEndTime;
        }
        if (null !== $this->isCreateTimeSortDesc) {
            $res['is_create_time_sort_desc'] = $this->isCreateTimeSortDesc;
        }
        if (null !== $this->isSortByPv) {
            $res['is_sort_by_pv'] = $this->isSortByPv;
        }
        if (null !== $this->isSortByStatusChange) {
            $res['is_sort_by_status_change'] = $this->isSortByStatusChange;
        }
        if (null !== $this->queryCreaterChannel) {
            $res['query_creater_channel'] = $this->queryCreaterChannel;
        }
        if (null !== $this->guaranteeRange) {
            $res['guarantee_range'] = $this->guaranteeRange;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryIpGoodsRequest
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
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['ip_name'])) {
            $model->ipName = $map['ip_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
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
        if (isset($map['ip_type'])) {
            $model->ipType = $map['ip_type'];
        }
        if (isset($map['audience_group'])) {
            $model->audienceGroup = $map['audience_group'];
        }
        if (isset($map['create_begin_time'])) {
            $model->createBeginTime = $map['create_begin_time'];
        }
        if (isset($map['create_end_time'])) {
            $model->createEndTime = $map['create_end_time'];
        }
        if (isset($map['is_create_time_sort_desc'])) {
            $model->isCreateTimeSortDesc = $map['is_create_time_sort_desc'];
        }
        if (isset($map['is_sort_by_pv'])) {
            $model->isSortByPv = $map['is_sort_by_pv'];
        }
        if (isset($map['is_sort_by_status_change'])) {
            $model->isSortByStatusChange = $map['is_sort_by_status_change'];
        }
        if (isset($map['query_creater_channel'])) {
            $model->queryCreaterChannel = $map['query_creater_channel'];
        }
        if (isset($map['guarantee_range'])) {
            $model->guaranteeRange = $map['guarantee_range'];
        }

        return $model;
    }
}
