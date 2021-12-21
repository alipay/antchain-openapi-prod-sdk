<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateIpGoodsRequest extends Model
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

    // 基础字段
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // ip的名字
    /**
     * @var string
     */
    public $ipName;

    // ip类型，多个用;隔开
    /**
     * @var string
     */
    public $ipType;

    // 受众人群，多个用;隔开
    /**
     * @var string
     */
    public $audienceGroup;

    // ip链上id
    /**
     * @var string
     */
    public $ipId;

    // ip主图,存放oss图片链接 多个用;隔开
    /**
     * @var string
     */
    public $image;

    // 商品详情图  存放OSS图片链接 多个用;隔开
    /**
     * @var string
     */
    public $imageDetail;

    // ip描述
    /**
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
     * @var DockingPeopleInfo[]
     */
    public $dockingPeopleInfo;

    // 资质证书类型，0为用户上传，1申请
    /**
     * @var string
     */
    public $copyRightType;

    // 资质
    /**
     * @var string
     */
    public $copyRight;

    // 合作事项
    /**
     * @var string
     */
    public $cooperationNote;

    // 传入的渠道信息，不是更新项
    /**
     * @var string
     */
    public $channelName;

    // 合作案例，图片存放oss链接，多张用;隔开
    /**
     * @var string
     */
    public $cooperationCase;

    // ip创建时间,毫秒时间戳
    /**
     * @var int
     */
    public $ipCreateTime;

    // 未来大事件
    /**
     * @var string
     */
    public $futureMilestones;

    // 推广渠道
    /**
     * @var string
     */
    public $promotionChannels;

    // ip别名，多个通过;隔开
    /**
     * @var string
     */
    public $ipOtherName;

    // 备注信息
    /**
     * @var string
     */
    public $memo;

    // 资质生效时间 毫秒时间戳
    /**
     * @var int
     */
    public $copyRightBeginTime;

    // 资质生效的结束时间
    /**
     * @var int
     */
    public $copyRightEndTime;

    // 如果商品是审批通过状态，是否需要审批，默认false。该字段提供给运营使用，慎用！！！
    /**
     * @var bool
     */
    public $needApproval;

    // 授权信息
    /**
     * @var IPAuthorizationInfo
     */
    public $authorizationInfo;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'baseRequest'        => 'base_request',
        'ipName'             => 'ip_name',
        'ipType'             => 'ip_type',
        'audienceGroup'      => 'audience_group',
        'ipId'               => 'ip_id',
        'image'              => 'image',
        'imageDetail'        => 'image_detail',
        'description'        => 'description',
        'dockingPeopleInfo'  => 'docking_people_info',
        'copyRightType'      => 'copy_right_type',
        'copyRight'          => 'copy_right',
        'cooperationNote'    => 'cooperation_note',
        'channelName'        => 'channel_name',
        'cooperationCase'    => 'cooperation_case',
        'ipCreateTime'       => 'ip_create_time',
        'futureMilestones'   => 'future_milestones',
        'promotionChannels'  => 'promotion_channels',
        'ipOtherName'        => 'ip_other_name',
        'memo'               => 'memo',
        'copyRightBeginTime' => 'copy_right_begin_time',
        'copyRightEndTime'   => 'copy_right_end_time',
        'needApproval'       => 'need_approval',
        'authorizationInfo'  => 'authorization_info',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('ipName', $this->ipName, true);
        Model::validateRequired('ipType', $this->ipType, true);
        Model::validateRequired('audienceGroup', $this->audienceGroup, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('imageDetail', $this->imageDetail, true);
        Model::validateRequired('dockingPeopleInfo', $this->dockingPeopleInfo, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('copyRightBeginTime', $this->copyRightBeginTime, true);
        Model::validateRequired('copyRightEndTime', $this->copyRightEndTime, true);
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
        if (null !== $this->ipType) {
            $res['ip_type'] = $this->ipType;
        }
        if (null !== $this->audienceGroup) {
            $res['audience_group'] = $this->audienceGroup;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
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
        if (null !== $this->copyRightType) {
            $res['copy_right_type'] = $this->copyRightType;
        }
        if (null !== $this->copyRight) {
            $res['copy_right'] = $this->copyRight;
        }
        if (null !== $this->cooperationNote) {
            $res['cooperation_note'] = $this->cooperationNote;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->cooperationCase) {
            $res['cooperation_case'] = $this->cooperationCase;
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
        if (null !== $this->ipOtherName) {
            $res['ip_other_name'] = $this->ipOtherName;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->copyRightBeginTime) {
            $res['copy_right_begin_time'] = $this->copyRightBeginTime;
        }
        if (null !== $this->copyRightEndTime) {
            $res['copy_right_end_time'] = $this->copyRightEndTime;
        }
        if (null !== $this->needApproval) {
            $res['need_approval'] = $this->needApproval;
        }
        if (null !== $this->authorizationInfo) {
            $res['authorization_info'] = null !== $this->authorizationInfo ? $this->authorizationInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateIpGoodsRequest
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
        if (isset($map['ip_type'])) {
            $model->ipType = $map['ip_type'];
        }
        if (isset($map['audience_group'])) {
            $model->audienceGroup = $map['audience_group'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
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
        if (isset($map['copy_right_type'])) {
            $model->copyRightType = $map['copy_right_type'];
        }
        if (isset($map['copy_right'])) {
            $model->copyRight = $map['copy_right'];
        }
        if (isset($map['cooperation_note'])) {
            $model->cooperationNote = $map['cooperation_note'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['cooperation_case'])) {
            $model->cooperationCase = $map['cooperation_case'];
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
        if (isset($map['ip_other_name'])) {
            $model->ipOtherName = $map['ip_other_name'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['copy_right_begin_time'])) {
            $model->copyRightBeginTime = $map['copy_right_begin_time'];
        }
        if (isset($map['copy_right_end_time'])) {
            $model->copyRightEndTime = $map['copy_right_end_time'];
        }
        if (isset($map['need_approval'])) {
            $model->needApproval = $map['need_approval'];
        }
        if (isset($map['authorization_info'])) {
            $model->authorizationInfo = IPAuthorizationInfo::fromMap($map['authorization_info']);
        }

        return $model;
    }
}
