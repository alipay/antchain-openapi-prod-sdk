<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppReleaseConfig extends Model
{
    // 名称
    /**
     * @example huanyu
     *
     * @var string
     */
    public $name;

    // 应用镜像
    /**
     * @example acs-reg.alipay.com/aloud/app:tag
     *
     * @var string
     */
    public $image;

    // commitID
    /**
     * @example aad2121sa
     *
     * @var string
     */
    public $commitId;

    // 代码分支
    /**
     * @example master
     *
     * @var string
     */
    public $commitBranch;

    // diff基准版本，上一次最新发布的版本
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $lastRevisionId;

    // 应用服务版本id
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $revisionId;

    // 应用服务版本diff摘要信息
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $revisionDiff;
    protected $_name = [
        'name'           => 'name',
        'image'          => 'image',
        'commitId'       => 'commit_id',
        'commitBranch'   => 'commit_branch',
        'lastRevisionId' => 'last_revision_id',
        'revisionId'     => 'revision_id',
        'revisionDiff'   => 'revision_diff',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('commitId', $this->commitId, true);
        Model::validateRequired('commitBranch', $this->commitBranch, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->commitId) {
            $res['commit_id'] = $this->commitId;
        }
        if (null !== $this->commitBranch) {
            $res['commit_branch'] = $this->commitBranch;
        }
        if (null !== $this->lastRevisionId) {
            $res['last_revision_id'] = $this->lastRevisionId;
        }
        if (null !== $this->revisionId) {
            $res['revision_id'] = $this->revisionId;
        }
        if (null !== $this->revisionDiff) {
            $res['revision_diff'] = $this->revisionDiff;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppReleaseConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['commit_id'])) {
            $model->commitId = $map['commit_id'];
        }
        if (isset($map['commit_branch'])) {
            $model->commitBranch = $map['commit_branch'];
        }
        if (isset($map['last_revision_id'])) {
            $model->lastRevisionId = $map['last_revision_id'];
        }
        if (isset($map['revision_id'])) {
            $model->revisionId = $map['revision_id'];
        }
        if (isset($map['revision_diff'])) {
            $model->revisionDiff = $map['revision_diff'];
        }

        return $model;
    }
}
