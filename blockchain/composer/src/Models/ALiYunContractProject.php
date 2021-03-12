<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunContractProject extends Model
{
    // consortium_id
    /**
     * @example consortium_id
     *
     * @var string
     */
    public $consortiumId;

    // create_time
    /**
     * @example 123123123
     *
     * @var int
     */
    public $createTime;

    // project_description
    /**
     * @example project_description
     *
     * @var string
     */
    public $projectDescription;

    // project_id
    /**
     * @example project_id
     *
     * @var string
     */
    public $projectId;

    // project_name
    /**
     * @example project_name
     *
     * @var string
     */
    public $projectName;

    // project_version
    /**
     * @example project_version
     *
     * @var string
     */
    public $projectVersion;

    // update_time
    /**
     * @example update_time
     *
     * @var int
     */
    public $updateTime;
    protected $_name = [
        'consortiumId'       => 'consortium_id',
        'createTime'         => 'create_time',
        'projectDescription' => 'project_description',
        'projectId'          => 'project_id',
        'projectName'        => 'project_name',
        'projectVersion'     => 'project_version',
        'updateTime'         => 'update_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->projectDescription) {
            $res['project_description'] = $this->projectDescription;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->projectVersion) {
            $res['project_version'] = $this->projectVersion;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunContractProject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['project_description'])) {
            $model->projectDescription = $map['project_description'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['project_version'])) {
            $model->projectVersion = $map['project_version'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
