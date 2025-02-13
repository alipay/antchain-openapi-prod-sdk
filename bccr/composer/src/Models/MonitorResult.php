<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class MonitorResult extends Model
{
    // 监测任务ID
    //
    /**
     * @example 111111111111111111
     *
     * @var string
     */
    public $monitorTaskId;

    // 监测结果ID
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $monitorResultId;

    // 侵权网址
    //
    //
    /**
     * @example http://a.b.c
     *
     * @var string
     */
    public $infrUrl;

    // 侵权主体
    //
    //
    /**
     * @example hhh
     *
     * @var string
     */
    public $infrHost;

    // 侵权标题
    //
    //
    /**
     * @example biaoti
     *
     * @var string
     */
    public $infrTitle;

    // 侵权内容上传时间
    //
    //
    /**
     * @example 1592807928
     *
     * @var int
     */
    public $infrTime;

    // 侵权详情
    //
    /**
     * @example details
     *
     * @var string
     */
    public $detail;

    // 发布者
    /**
     * @example 111111
     *
     * @var string
     */
    public $poster;

    // 侵权内容发布时间
    /**
     * @example 1626614711096
     *
     * @var int
     */
    public $postDate;

    // 侵权内容发现时间
    /**
     * @example 1626614711096
     *
     * @var int
     */
    public $findDate;

    // 观看数
    /**
     * @example 1
     *
     * @var int
     */
    public $viewCount;

    // 点赞数
    /**
     * @example 1
     *
     * @var int
     */
    public $likeCount;

    // 评论数
    /**
     * @example 1
     *
     * @var int
     */
    public $commentCount;

    // 转发数
    /**
     * @example 1
     *
     * @var int
     */
    public $repostCount;

    // 侵权文件下载链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $downloadUrl;

    // 疑似侵权反馈时间
    /**
     * @example 1592807928
     *
     * @var int
     */
    public $infrFeedbackTime;

    // 个人主页链接
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $posterIdUrl;
    protected $_name = [
        'monitorTaskId'    => 'monitor_task_id',
        'monitorResultId'  => 'monitor_result_id',
        'infrUrl'          => 'infr_url',
        'infrHost'         => 'infr_host',
        'infrTitle'        => 'infr_title',
        'infrTime'         => 'infr_time',
        'detail'           => 'detail',
        'poster'           => 'poster',
        'postDate'         => 'post_date',
        'findDate'         => 'find_date',
        'viewCount'        => 'view_count',
        'likeCount'        => 'like_count',
        'commentCount'     => 'comment_count',
        'repostCount'      => 'repost_count',
        'downloadUrl'      => 'download_url',
        'infrFeedbackTime' => 'infr_feedback_time',
        'posterIdUrl'      => 'poster_id_url',
    ];

    public function validate()
    {
        Model::validateRequired('monitorTaskId', $this->monitorTaskId, true);
        Model::validateRequired('monitorResultId', $this->monitorResultId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->monitorTaskId) {
            $res['monitor_task_id'] = $this->monitorTaskId;
        }
        if (null !== $this->monitorResultId) {
            $res['monitor_result_id'] = $this->monitorResultId;
        }
        if (null !== $this->infrUrl) {
            $res['infr_url'] = $this->infrUrl;
        }
        if (null !== $this->infrHost) {
            $res['infr_host'] = $this->infrHost;
        }
        if (null !== $this->infrTitle) {
            $res['infr_title'] = $this->infrTitle;
        }
        if (null !== $this->infrTime) {
            $res['infr_time'] = $this->infrTime;
        }
        if (null !== $this->detail) {
            $res['detail'] = $this->detail;
        }
        if (null !== $this->poster) {
            $res['poster'] = $this->poster;
        }
        if (null !== $this->postDate) {
            $res['post_date'] = $this->postDate;
        }
        if (null !== $this->findDate) {
            $res['find_date'] = $this->findDate;
        }
        if (null !== $this->viewCount) {
            $res['view_count'] = $this->viewCount;
        }
        if (null !== $this->likeCount) {
            $res['like_count'] = $this->likeCount;
        }
        if (null !== $this->commentCount) {
            $res['comment_count'] = $this->commentCount;
        }
        if (null !== $this->repostCount) {
            $res['repost_count'] = $this->repostCount;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->infrFeedbackTime) {
            $res['infr_feedback_time'] = $this->infrFeedbackTime;
        }
        if (null !== $this->posterIdUrl) {
            $res['poster_id_url'] = $this->posterIdUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MonitorResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['monitor_task_id'])) {
            $model->monitorTaskId = $map['monitor_task_id'];
        }
        if (isset($map['monitor_result_id'])) {
            $model->monitorResultId = $map['monitor_result_id'];
        }
        if (isset($map['infr_url'])) {
            $model->infrUrl = $map['infr_url'];
        }
        if (isset($map['infr_host'])) {
            $model->infrHost = $map['infr_host'];
        }
        if (isset($map['infr_title'])) {
            $model->infrTitle = $map['infr_title'];
        }
        if (isset($map['infr_time'])) {
            $model->infrTime = $map['infr_time'];
        }
        if (isset($map['detail'])) {
            $model->detail = $map['detail'];
        }
        if (isset($map['poster'])) {
            $model->poster = $map['poster'];
        }
        if (isset($map['post_date'])) {
            $model->postDate = $map['post_date'];
        }
        if (isset($map['find_date'])) {
            $model->findDate = $map['find_date'];
        }
        if (isset($map['view_count'])) {
            $model->viewCount = $map['view_count'];
        }
        if (isset($map['like_count'])) {
            $model->likeCount = $map['like_count'];
        }
        if (isset($map['comment_count'])) {
            $model->commentCount = $map['comment_count'];
        }
        if (isset($map['repost_count'])) {
            $model->repostCount = $map['repost_count'];
        }
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }
        if (isset($map['infr_feedback_time'])) {
            $model->infrFeedbackTime = $map['infr_feedback_time'];
        }
        if (isset($map['poster_id_url'])) {
            $model->posterIdUrl = $map['poster_id_url'];
        }

        return $model;
    }
}
