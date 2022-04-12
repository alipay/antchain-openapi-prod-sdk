<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class SaveAoneNeedsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品线
    /**
     * @var string
     */
    public $productLine;

    // 产品名称
    /**
     * @var string
     */
    public $productName;

    // 问题类型
    /**
     * @var string
     */
    public $issueType;

    // 期望日期
    /**
     * @var string
     */
    public $expectedAt;

    // 创建者的工号
    /**
     * @var string
     */
    public $author;

    // 解决者/指派者的工号
    /**
     * @var string
     */
    public $assignedTo;

    // 标题
    /**
     * @var string
     */
    public $subject;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 跟踪者的工号
    /**
     * @var string[]
     */
    public $watcherUsers;

    // 优先级
    /**
     * @var int
     */
    public $priorityId;

    // 上传文件集合
    /**
     * @var UploadRequestArray
     */
    public $uploadlist;
    protected $_name = [
        'authToken'    => 'auth_token',
        'productLine'  => 'product_line',
        'productName'  => 'product_name',
        'issueType'    => 'issue_type',
        'expectedAt'   => 'expected_at',
        'author'       => 'author',
        'assignedTo'   => 'assigned_to',
        'subject'      => 'subject',
        'description'  => 'description',
        'watcherUsers' => 'watcher_users',
        'priorityId'   => 'priority_id',
        'uploadlist'   => 'uploadlist',
    ];

    public function validate()
    {
        Model::validateRequired('productLine', $this->productLine, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('issueType', $this->issueType, true);
        Model::validateRequired('author', $this->author, true);
        Model::validateRequired('assignedTo', $this->assignedTo, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('watcherUsers', $this->watcherUsers, true);
        Model::validateRequired('priorityId', $this->priorityId, true);
        Model::validatePattern('expectedAt', $this->expectedAt, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productLine) {
            $res['product_line'] = $this->productLine;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->issueType) {
            $res['issue_type'] = $this->issueType;
        }
        if (null !== $this->expectedAt) {
            $res['expected_at'] = $this->expectedAt;
        }
        if (null !== $this->author) {
            $res['author'] = $this->author;
        }
        if (null !== $this->assignedTo) {
            $res['assigned_to'] = $this->assignedTo;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->watcherUsers) {
            $res['watcher_users'] = $this->watcherUsers;
        }
        if (null !== $this->priorityId) {
            $res['priority_id'] = $this->priorityId;
        }
        if (null !== $this->uploadlist) {
            $res['uploadlist'] = null !== $this->uploadlist ? $this->uploadlist->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveAoneNeedsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_line'])) {
            $model->productLine = $map['product_line'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['issue_type'])) {
            $model->issueType = $map['issue_type'];
        }
        if (isset($map['expected_at'])) {
            $model->expectedAt = $map['expected_at'];
        }
        if (isset($map['author'])) {
            $model->author = $map['author'];
        }
        if (isset($map['assigned_to'])) {
            $model->assignedTo = $map['assigned_to'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['watcher_users'])) {
            if (!empty($map['watcher_users'])) {
                $model->watcherUsers = $map['watcher_users'];
            }
        }
        if (isset($map['priority_id'])) {
            $model->priorityId = $map['priority_id'];
        }
        if (isset($map['uploadlist'])) {
            $model->uploadlist = UploadRequestArray::fromMap($map['uploadlist']);
        }

        return $model;
    }
}
