<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class MeiyouAuditInfo extends Model
{
    // 主键id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

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
     * @example 内容文本
     *
     * @var string
     */
    public $content;

    // 发布时间戳
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
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
     * @example 1
     *
     * @var string
     */
    public $primaryBusiness;

    // 二级业务
    /**
     * @example 2
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
     * @example test
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

    // 审核结果
    /**
     * @example OK
     *
     * @var string
     */
    public $auditResult;

    // 审核原因
    /**
     * @example 30
     *
     * @var string
     */
    public $auditReason;

    // 审核原因
    /**
     * @example test
     *
     * @var string
     */
    public $auditReasonMsg;

    // 操作人
    /**
     * @example 小蜜
     *
     * @var string
     */
    public $auditOperator;

    // 操作时间戳
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $auditTime;

    // oss 转存后的图像地址
    /**
     * @example {}
     *
     * @var string
     */
    public $ossImages;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'id'                => 'id',
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
        'auditResult'       => 'audit_result',
        'auditReason'       => 'audit_reason',
        'auditReasonMsg'    => 'audit_reason_msg',
        'auditOperator'     => 'audit_operator',
        'auditTime'         => 'audit_time',
        'ossImages'         => 'oss_images',
        'gmtCreate'         => 'gmt_create',
        'gmtModified'       => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('auditId', $this->auditId, true);
        Model::validatePattern('publishTime', $this->publishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('auditTime', $this->auditTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
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
        if (null !== $this->auditResult) {
            $res['audit_result'] = $this->auditResult;
        }
        if (null !== $this->auditReason) {
            $res['audit_reason'] = $this->auditReason;
        }
        if (null !== $this->auditReasonMsg) {
            $res['audit_reason_msg'] = $this->auditReasonMsg;
        }
        if (null !== $this->auditOperator) {
            $res['audit_operator'] = $this->auditOperator;
        }
        if (null !== $this->auditTime) {
            $res['audit_time'] = $this->auditTime;
        }
        if (null !== $this->ossImages) {
            $res['oss_images'] = $this->ossImages;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MeiyouAuditInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
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
        if (isset($map['audit_result'])) {
            $model->auditResult = $map['audit_result'];
        }
        if (isset($map['audit_reason'])) {
            $model->auditReason = $map['audit_reason'];
        }
        if (isset($map['audit_reason_msg'])) {
            $model->auditReasonMsg = $map['audit_reason_msg'];
        }
        if (isset($map['audit_operator'])) {
            $model->auditOperator = $map['audit_operator'];
        }
        if (isset($map['audit_time'])) {
            $model->auditTime = $map['audit_time'];
        }
        if (isset($map['oss_images'])) {
            $model->ossImages = $map['oss_images'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
