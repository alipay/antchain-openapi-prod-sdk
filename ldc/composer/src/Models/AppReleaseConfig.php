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
    protected $_name = [
        'name'         => 'name',
        'image'        => 'image',
        'commitId'     => 'commit_id',
        'commitBranch' => 'commit_branch',
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

        return $model;
    }
}
