<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryIpGoodsinterestRequest extends Model
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

    // 基础参数
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

    // ip等级
    /**
     * @var int[]
     */
    public $ipLevel;

    // ip类型
    /**
     * @var string[]
     */
    public $ipType;

    // 受众人群
    /**
     * @var string[]
     */
    public $audienceGroup;

    // 是否需要按照创建时间倒序排序
    /**
     * @var bool
     */
    public $isCreateTimeSortDesc;

    // 是否需要按照pv排序（0:不需要，1:正序，2:倒序），默认选1
    /**
     * @var int
     */
    public $isSortByPv;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'baseRequest'          => 'base_request',
        'ipId'                 => 'ip_id',
        'ipName'               => 'ip_name',
        'channelName'          => 'channel_name',
        'pageSize'             => 'page_size',
        'pageIndex'            => 'page_index',
        'ipLevel'              => 'ip_level',
        'ipType'               => 'ip_type',
        'audienceGroup'        => 'audience_group',
        'isCreateTimeSortDesc' => 'is_create_time_sort_desc',
        'isSortByPv'           => 'is_sort_by_pv',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('ipLevel', $this->ipLevel, true);
        Model::validateRequired('ipType', $this->ipType, true);
        Model::validateRequired('audienceGroup', $this->audienceGroup, true);
        Model::validateRequired('isCreateTimeSortDesc', $this->isCreateTimeSortDesc, true);
        Model::validateRequired('isSortByPv', $this->isSortByPv, true);
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
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->ipLevel) {
            $res['ip_level'] = $this->ipLevel;
        }
        if (null !== $this->ipType) {
            $res['ip_type'] = $this->ipType;
        }
        if (null !== $this->audienceGroup) {
            $res['audience_group'] = $this->audienceGroup;
        }
        if (null !== $this->isCreateTimeSortDesc) {
            $res['is_create_time_sort_desc'] = $this->isCreateTimeSortDesc;
        }
        if (null !== $this->isSortByPv) {
            $res['is_sort_by_pv'] = $this->isSortByPv;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryIpGoodsinterestRequest
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
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['ip_level'])) {
            if (!empty($map['ip_level'])) {
                $model->ipLevel = $map['ip_level'];
            }
        }
        if (isset($map['ip_type'])) {
            if (!empty($map['ip_type'])) {
                $model->ipType = $map['ip_type'];
            }
        }
        if (isset($map['audience_group'])) {
            if (!empty($map['audience_group'])) {
                $model->audienceGroup = $map['audience_group'];
            }
        }
        if (isset($map['is_create_time_sort_desc'])) {
            $model->isCreateTimeSortDesc = $map['is_create_time_sort_desc'];
        }
        if (isset($map['is_sort_by_pv'])) {
            $model->isSortByPv = $map['is_sort_by_pv'];
        }

        return $model;
    }
}
