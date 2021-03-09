<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ScmSofaArchetype extends Model
{
    // 用户创建archetype必须要的参数
    /**
     * @example true, false
     *
     * @var bool
     */
    public $generateCode;

    // Maven代码框架使用 groupId
    /**
     * @example 123
     *
     * @var string
     */
    public $groupId;

    // Maven代码框架使用 artifactId
    /**
     * @example 123
     *
     * @var string
     */
    public $artifactId;

    // Maven代码框架使用 codePackage
    /**
     * @example test
     *
     * @var string
     */
    public $codePackage;

    // Sofa代码框架使用 projectType
    /**
     * @example test
     *
     * @var string
     */
    public $projectType;

    // Sofa代码框架使用 版本号
    /**
     * @example 123
     *
     * @var string
     */
    public $version;

    // Sofa代码框架使用 编码方式
    /**
     * @example utf-8
     *
     * @var string
     */
    public $encoding;

    // 是否使用私有maven
    /**
     * @example true, false
     *
     * @var bool
     */
    public $usePrivateRepo;

    // 提供给快速研发平台使用，格式为JSON字符串
    /**
     * @example "{}"
     *
     * @var string
     */
    public $metaData;
    protected $_name = [
        'generateCode'   => 'generate_code',
        'groupId'        => 'group_id',
        'artifactId'     => 'artifact_id',
        'codePackage'    => 'code_package',
        'projectType'    => 'project_type',
        'version'        => 'version',
        'encoding'       => 'encoding',
        'usePrivateRepo' => 'use_private_repo',
        'metaData'       => 'meta_data',
    ];

    public function validate()
    {
        Model::validateRequired('artifactId', $this->artifactId, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->generateCode) {
            $res['generate_code'] = $this->generateCode;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->artifactId) {
            $res['artifact_id'] = $this->artifactId;
        }
        if (null !== $this->codePackage) {
            $res['code_package'] = $this->codePackage;
        }
        if (null !== $this->projectType) {
            $res['project_type'] = $this->projectType;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->encoding) {
            $res['encoding'] = $this->encoding;
        }
        if (null !== $this->usePrivateRepo) {
            $res['use_private_repo'] = $this->usePrivateRepo;
        }
        if (null !== $this->metaData) {
            $res['meta_data'] = $this->metaData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScmSofaArchetype
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['generate_code'])) {
            $model->generateCode = $map['generate_code'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['artifact_id'])) {
            $model->artifactId = $map['artifact_id'];
        }
        if (isset($map['code_package'])) {
            $model->codePackage = $map['code_package'];
        }
        if (isset($map['project_type'])) {
            $model->projectType = $map['project_type'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['encoding'])) {
            $model->encoding = $map['encoding'];
        }
        if (isset($map['use_private_repo'])) {
            $model->usePrivateRepo = $map['use_private_repo'];
        }
        if (isset($map['meta_data'])) {
            $model->metaData = $map['meta_data'];
        }

        return $model;
    }
}
