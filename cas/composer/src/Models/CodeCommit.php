<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CodeCommit extends Model
{
    // 作者
    /**
     * @example author
     *
     * @var string
     */
    public $author;

    // 分支
    /**
     * @example branch
     *
     * @var string
     */
    public $branch;

    // 代码版本
    /**
     * @example code_version
     *
     * @var string
     */
    public $codeVersion;

    // 时间
    /**
     * @example date
     *
     * @var string
     */
    public $date;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // 消息
    /**
     * @example msg
     *
     * @var string
     */
    public $msg;

    // 仓库名称
    /**
     * @example repo_name
     *
     * @var string
     */
    public $repoName;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;
    protected $_name = [
        'author'      => 'author',
        'branch'      => 'branch',
        'codeVersion' => 'code_version',
        'date'        => 'date',
        'id'          => 'id',
        'msg'         => 'msg',
        'repoName'    => 'repo_name',
        'utcCreate'   => 'utc_create',
        'utcModified' => 'utc_modified',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->author) {
            $res['author'] = $this->author;
        }
        if (null !== $this->branch) {
            $res['branch'] = $this->branch;
        }
        if (null !== $this->codeVersion) {
            $res['code_version'] = $this->codeVersion;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->repoName) {
            $res['repo_name'] = $this->repoName;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CodeCommit
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['author'])) {
            $model->author = $map['author'];
        }
        if (isset($map['branch'])) {
            $model->branch = $map['branch'];
        }
        if (isset($map['code_version'])) {
            $model->codeVersion = $map['code_version'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['repo_name'])) {
            $model->repoName = $map['repo_name'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
