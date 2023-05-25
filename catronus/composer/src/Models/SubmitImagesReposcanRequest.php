<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class SubmitImagesReposcanRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 镜像仓库ID
    /**
     * @var string
     */
    public $repoId;

    // 项目列表
    /**
     * @var string[]
     */
    public $projects;

    // 仓库列表
    /**
     * @var string[]
     */
    public $repositories;

    // 镜像起始时间
    /**
     * @var string
     */
    public $imageBeginTime;

    // 并发扫描数
    /**
     * @var int
     */
    public $concurrentCount;

    // 扫描轮询间隔，单位s
    /**
     * @var int
     */
    public $pollInterval;
    protected $_name = [
        'authToken'       => 'auth_token',
        'repoId'          => 'repo_id',
        'projects'        => 'projects',
        'repositories'    => 'repositories',
        'imageBeginTime'  => 'image_begin_time',
        'concurrentCount' => 'concurrent_count',
        'pollInterval'    => 'poll_interval',
    ];

    public function validate()
    {
        Model::validateRequired('repoId', $this->repoId, true);
        Model::validatePattern('imageBeginTime', $this->imageBeginTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->repoId) {
            $res['repo_id'] = $this->repoId;
        }
        if (null !== $this->projects) {
            $res['projects'] = $this->projects;
        }
        if (null !== $this->repositories) {
            $res['repositories'] = $this->repositories;
        }
        if (null !== $this->imageBeginTime) {
            $res['image_begin_time'] = $this->imageBeginTime;
        }
        if (null !== $this->concurrentCount) {
            $res['concurrent_count'] = $this->concurrentCount;
        }
        if (null !== $this->pollInterval) {
            $res['poll_interval'] = $this->pollInterval;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitImagesReposcanRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['repo_id'])) {
            $model->repoId = $map['repo_id'];
        }
        if (isset($map['projects'])) {
            if (!empty($map['projects'])) {
                $model->projects = $map['projects'];
            }
        }
        if (isset($map['repositories'])) {
            if (!empty($map['repositories'])) {
                $model->repositories = $map['repositories'];
            }
        }
        if (isset($map['image_begin_time'])) {
            $model->imageBeginTime = $map['image_begin_time'];
        }
        if (isset($map['concurrent_count'])) {
            $model->concurrentCount = $map['concurrent_count'];
        }
        if (isset($map['poll_interval'])) {
            $model->pollInterval = $map['poll_interval'];
        }

        return $model;
    }
}
