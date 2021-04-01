<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IpBasicInfo extends Model
{
    // ip名字
    /**
     * @example aaaa
     *
     * @var string
     */
    public $ipName;

    // ip的链上id
    /**
     * @example 160
     *
     * @var string
     */
    public $ipId;

    // ip类型，多个用;隔开
    /**
     * @example ip类型
     *
     * @var string
     */
    public $ipType;

    // 受众群体，多个用;隔开
    /**
     * @example 受众群体
     *
     * @var string
     */
    public $audienceGroup;

    // ip主图,存放oss图片链接;隔开
    /**
     * @example oss://xxxx;oss://xxx2
     *
     * @var string
     */
    public $image;

    // 商品详情图 存放OSS图片链接 用;隔开
    /**
     * @example oss://1;oss://2
     *
     * @var string
     */
    public $imageDetail;

    // ip 描述
    /**
     * @example aaaa
     *
     * @var string
     */
    public $description;

    // 对接人信息，json列表
    // [{
    // "name":"123", //联系人名字，必填
    // "mobilePhone":"123",// 联系人手机号,必填
    // "email":"456",// 联系人邮箱,选填
    // "dingDing":"999",// 联系人钉钉号,选填
    // "telePhone":"8888",// 联系人座机,选填
    // "position":"aaa"// 联系人职务,必填
    // }]
    /**
     * @example [{"name":"123","mobilePhone":"123","email":"456","dingDing":"999","telePhone":"8888","position":"aaa"}]
     *
     * @var DockingPeopleInfo[]
     */
    public $dockingPeopleInfo;

    // 资质信息
    /**
     * @example aaaaa
     *
     * @var string
     */
    public $copyRight;

    // 合作案例，图片存放oss链接，多张用,隔开
    /**
     * @example oss://1,oss://2
     *
     * @var string
     */
    public $cooperationCase;

    // 合作事项
    /**
     * @example xxxx
     *
     * @var string
     */
    public $cooperationNote;

    // 查询渠道
    /**
     * @example tianmao
     *
     * @var string
     */
    public $channelName;

    // ip的外部创建时间，毫秒时间戳
    /**
     * @example
     *
     * @var int
     */
    public $ipCreateTime;

    // 未来大事件
    /**
     * @example qwqq
     *
     * @var string
     */
    public $futureMilestones;

    // 推广渠道
    /**
     * @example aaaa
     *
     * @var string
     */
    public $promotionChannels;

    // 系统中创建时间
    /**
     * @example
     *
     * @var int
     */
    public $systemCreateTime;

    // ip别名，多个用;隔开
    /**
     * @example ip别名
     *
     * @var string
     */
    public $ipOtherName;

    // ip的状态 0 待审批， 1 审批通过 2 审批拒绝
    /**
     * @example 1
     *
     * @var int
     */
    public $approvalStatus;

    // 审批意见
    /**
     * @example 审批意见
     *
     * @var string
     */
    public $approvalComments;

    // 备注信息
    /**
     * @example 1111
     *
     * @var string
     */
    public $memo;

    // 资质生效时间，毫秒时间戳
    /**
     * @example
     *
     * @var int
     */
    public $copyRightBeginTime;

    // 创建ip的版权方的链上账户
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $accountId;

    // 资质生效的结束时间
    /**
     * @example
     *
     * @var int
     */
    public $copyRightEndTime;

    // 账户名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $accountName;
    protected $_name = [
        'ipName'             => 'ip_name',
        'ipId'               => 'ip_id',
        'ipType'             => 'ip_type',
        'audienceGroup'      => 'audience_group',
        'image'              => 'image',
        'imageDetail'        => 'image_detail',
        'description'        => 'description',
        'dockingPeopleInfo'  => 'docking_people_info',
        'copyRight'          => 'copy_right',
        'cooperationCase'    => 'cooperation_case',
        'cooperationNote'    => 'cooperation_note',
        'channelName'        => 'channel_name',
        'ipCreateTime'       => 'ip_create_time',
        'futureMilestones'   => 'future_milestones',
        'promotionChannels'  => 'promotion_channels',
        'systemCreateTime'   => 'system_create_time',
        'ipOtherName'        => 'ip_other_name',
        'approvalStatus'     => 'approval_status',
        'approvalComments'   => 'approval_comments',
        'memo'               => 'memo',
        'copyRightBeginTime' => 'copy_right_begin_time',
        'accountId'          => 'account_id',
        'copyRightEndTime'   => 'copy_right_end_time',
        'accountName'        => 'account_name',
    ];

    public function validate()
    {
        Model::validateRequired('ipName', $this->ipName, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('ipType', $this->ipType, true);
        Model::validateRequired('audienceGroup', $this->audienceGroup, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('imageDetail', $this->imageDetail, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('dockingPeopleInfo', $this->dockingPeopleInfo, true);
        Model::validateRequired('copyRight', $this->copyRight, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('systemCreateTime', $this->systemCreateTime, true);
        Model::validateRequired('ipOtherName', $this->ipOtherName, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('copyRightBeginTime', $this->copyRightBeginTime, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('copyRightEndTime', $this->copyRightEndTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipName) {
            $res['ip_name'] = $this->ipName;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->ipType) {
            $res['ip_type'] = $this->ipType;
        }
        if (null !== $this->audienceGroup) {
            $res['audience_group'] = $this->audienceGroup;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->imageDetail) {
            $res['image_detail'] = $this->imageDetail;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->dockingPeopleInfo) {
            $res['docking_people_info'] = [];
            if (null !== $this->dockingPeopleInfo && \is_array($this->dockingPeopleInfo)) {
                $n = 0;
                foreach ($this->dockingPeopleInfo as $item) {
                    $res['docking_people_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->copyRight) {
            $res['copy_right'] = $this->copyRight;
        }
        if (null !== $this->cooperationCase) {
            $res['cooperation_case'] = $this->cooperationCase;
        }
        if (null !== $this->cooperationNote) {
            $res['cooperation_note'] = $this->cooperationNote;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->ipCreateTime) {
            $res['ip_create_time'] = $this->ipCreateTime;
        }
        if (null !== $this->futureMilestones) {
            $res['future_milestones'] = $this->futureMilestones;
        }
        if (null !== $this->promotionChannels) {
            $res['promotion_channels'] = $this->promotionChannels;
        }
        if (null !== $this->systemCreateTime) {
            $res['system_create_time'] = $this->systemCreateTime;
        }
        if (null !== $this->ipOtherName) {
            $res['ip_other_name'] = $this->ipOtherName;
        }
        if (null !== $this->approvalStatus) {
            $res['approval_status'] = $this->approvalStatus;
        }
        if (null !== $this->approvalComments) {
            $res['approval_comments'] = $this->approvalComments;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->copyRightBeginTime) {
            $res['copy_right_begin_time'] = $this->copyRightBeginTime;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->copyRightEndTime) {
            $res['copy_right_end_time'] = $this->copyRightEndTime;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IpBasicInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_name'])) {
            $model->ipName = $map['ip_name'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['ip_type'])) {
            $model->ipType = $map['ip_type'];
        }
        if (isset($map['audience_group'])) {
            $model->audienceGroup = $map['audience_group'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['image_detail'])) {
            $model->imageDetail = $map['image_detail'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['docking_people_info'])) {
            if (!empty($map['docking_people_info'])) {
                $model->dockingPeopleInfo = [];
                $n                        = 0;
                foreach ($map['docking_people_info'] as $item) {
                    $model->dockingPeopleInfo[$n++] = null !== $item ? DockingPeopleInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['copy_right'])) {
            $model->copyRight = $map['copy_right'];
        }
        if (isset($map['cooperation_case'])) {
            $model->cooperationCase = $map['cooperation_case'];
        }
        if (isset($map['cooperation_note'])) {
            $model->cooperationNote = $map['cooperation_note'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['ip_create_time'])) {
            $model->ipCreateTime = $map['ip_create_time'];
        }
        if (isset($map['future_milestones'])) {
            $model->futureMilestones = $map['future_milestones'];
        }
        if (isset($map['promotion_channels'])) {
            $model->promotionChannels = $map['promotion_channels'];
        }
        if (isset($map['system_create_time'])) {
            $model->systemCreateTime = $map['system_create_time'];
        }
        if (isset($map['ip_other_name'])) {
            $model->ipOtherName = $map['ip_other_name'];
        }
        if (isset($map['approval_status'])) {
            $model->approvalStatus = $map['approval_status'];
        }
        if (isset($map['approval_comments'])) {
            $model->approvalComments = $map['approval_comments'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['copy_right_begin_time'])) {
            $model->copyRightBeginTime = $map['copy_right_begin_time'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['copy_right_end_time'])) {
            $model->copyRightEndTime = $map['copy_right_end_time'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }

        return $model;
    }
}
