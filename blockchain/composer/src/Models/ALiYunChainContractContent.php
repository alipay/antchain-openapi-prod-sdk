<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainContractContent extends Model
{
    // content
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // content_id
    /**
     * @example content_id
     *
     * @var string
     */
    public $contentId;

    // content_name
    /**
     * @example content_name
     *
     * @var string
     */
    public $contentName;

    // create_time
    /**
     * @example create_time
     *
     * @var int
     */
    public $createTime;

    // is_directory
    /**
     * @example true
     *
     * @var bool
     */
    public $isDirectory;

    // parent_content_id
    /**
     * @example parent_content_id
     *
     * @var string
     */
    public $parentContentId;

    // project_id
    /**
     * @example project_id
     *
     * @var string
     */
    public $projectId;

    // update_time
    /**
     * @example update_time
     *
     * @var int
     */
    public $updateTime;
    protected $_name = [
        'content'         => 'content',
        'contentId'       => 'content_id',
        'contentName'     => 'content_name',
        'createTime'      => 'create_time',
        'isDirectory'     => 'is_directory',
        'parentContentId' => 'parent_content_id',
        'projectId'       => 'project_id',
        'updateTime'      => 'update_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }
        if (null !== $this->contentName) {
            $res['content_name'] = $this->contentName;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->isDirectory) {
            $res['is_directory'] = $this->isDirectory;
        }
        if (null !== $this->parentContentId) {
            $res['parent_content_id'] = $this->parentContentId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainContractContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['content_id'])) {
            $model->contentId = $map['content_id'];
        }
        if (isset($map['content_name'])) {
            $model->contentName = $map['content_name'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['is_directory'])) {
            $model->isDirectory = $map['is_directory'];
        }
        if (isset($map['parent_content_id'])) {
            $model->parentContentId = $map['parent_content_id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
