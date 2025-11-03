<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class MeiyouAuditSaveWebRequest extends Model
{
    // 审核记录ID
    /**
     * @example 1
     *
     * @var int
     */
    public $auditId;

    // 主题ID
    /**
     * @example 1
     *
     * @var int
     */
    public $topicId;

    // 内容文本
    /**
     * @example test
     *
     * @var string
     */
    public $content;

    // 发布时间戳(毫秒)
    /**
     * @example 1
     *
     * @var int
     */
    public $publishTime;

    // 图片URL数组(JSON字符串)
    /**
     * @example {}
     *
     * @var string
     */
    public $images;

    // 一级业务
    /**
     * @example test
     *
     * @var string
     */
    public $primaryBusiness;

    // 二级业务
    /**
     * @example 1
     *
     * @var string
     */
    public $secondaryBusiness;

    // 用户昵称
    /**
     * @example 小蜜
     *
     * @var string
     */
    public $userNickname;

    // 用户ID
    /**
     * @example 1
     *
     * @var string
     */
    public $userId;

    // 用户类型
    /**
     * @example INIT
     *
     * @var string
     */
    public $userType;

    // 用户头像URL
    /**
     * @example http://test
     *
     * @var string
     */
    public $userAvatar;

    // 操作人
    /**
     * @example 小蜜
     *
     * @var string
     */
    public $auditOperator;

    // 审核楼
    /**
     * @example 1
     *
     * @var int
     */
    public $auditFloor;

    // 版本
    /**
     * @example 1
     *
     * @var string
     */
    public $version;

    // 主题信息
    /**
     * @example {}
     *
     * @var MeiyouTopicWebInfo[]
     */
    public $topicInfos;
    protected $_name = [
        'auditId'           => 'audit_id',
        'topicId'           => 'topic_id',
        'content'           => 'content',
        'publishTime'       => 'publish_time',
        'images'            => 'images',
        'primaryBusiness'   => 'primary_business',
        'secondaryBusiness' => 'secondary_business',
        'userNickname'      => 'user_nickname',
        'userId'            => 'user_id',
        'userType'          => 'user_type',
        'userAvatar'        => 'user_avatar',
        'auditOperator'     => 'audit_operator',
        'auditFloor'        => 'audit_floor',
        'version'           => 'version',
        'topicInfos'        => 'topic_infos',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->auditId) {
            $res['audit_id'] = $this->auditId;
        }
        if (null !== $this->topicId) {
            $res['topic_id'] = $this->topicId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->publishTime) {
            $res['publish_time'] = $this->publishTime;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
        }
        if (null !== $this->primaryBusiness) {
            $res['primary_business'] = $this->primaryBusiness;
        }
        if (null !== $this->secondaryBusiness) {
            $res['secondary_business'] = $this->secondaryBusiness;
        }
        if (null !== $this->userNickname) {
            $res['user_nickname'] = $this->userNickname;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->userAvatar) {
            $res['user_avatar'] = $this->userAvatar;
        }
        if (null !== $this->auditOperator) {
            $res['audit_operator'] = $this->auditOperator;
        }
        if (null !== $this->auditFloor) {
            $res['audit_floor'] = $this->auditFloor;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->topicInfos) {
            $res['topic_infos'] = [];
            if (null !== $this->topicInfos && \is_array($this->topicInfos)) {
                $n = 0;
                foreach ($this->topicInfos as $item) {
                    $res['topic_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MeiyouAuditSaveWebRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['audit_id'])) {
            $model->auditId = $map['audit_id'];
        }
        if (isset($map['topic_id'])) {
            $model->topicId = $map['topic_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['publish_time'])) {
            $model->publishTime = $map['publish_time'];
        }
        if (isset($map['images'])) {
            $model->images = $map['images'];
        }
        if (isset($map['primary_business'])) {
            $model->primaryBusiness = $map['primary_business'];
        }
        if (isset($map['secondary_business'])) {
            $model->secondaryBusiness = $map['secondary_business'];
        }
        if (isset($map['user_nickname'])) {
            $model->userNickname = $map['user_nickname'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['user_avatar'])) {
            $model->userAvatar = $map['user_avatar'];
        }
        if (isset($map['audit_operator'])) {
            $model->auditOperator = $map['audit_operator'];
        }
        if (isset($map['audit_floor'])) {
            $model->auditFloor = $map['audit_floor'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['topic_infos'])) {
            if (!empty($map['topic_infos'])) {
                $model->topicInfos = [];
                $n                 = 0;
                foreach ($map['topic_infos'] as $item) {
                    $model->topicInfos[$n++] = null !== $item ? MeiyouTopicWebInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
