<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class ProjectResource extends Model
{
    // 资源ID
    /**
     * @example 36519d8bd56e40ddaef399ba267662c2
     *
     * @var string
     */
    public $id;

    // 项目ID
    /**
     * @example cbc8b820bbc7492b8fec0f0228428e6f
     *
     * @var string
     */
    public $projectId;

    // 资源类型（目前只有PROJECT_REPORT）
    /**
     * @example PROJECT_REPORT
     *
     * @var string
     */
    public $resourceType;

    // 资源名称
    /**
     * @example 投资报告
     *
     * @var string
     */
    public $resourceName;

    // 文件ID
    /**
     * @example 8c044f0c56564d418c0b49993605f9d4
     *
     * @var string
     */
    public $fileId;

    // 创建时间戳
    /**
     * @example 1726024364000
     *
     * @var int
     */
    public $gmtCreated;
    protected $_name = [
        'id'           => 'id',
        'projectId'    => 'project_id',
        'resourceType' => 'resource_type',
        'resourceName' => 'resource_name',
        'fileId'       => 'file_id',
        'gmtCreated'   => 'gmt_created',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('resourceName', $this->resourceName, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->resourceName) {
            $res['resource_name'] = $this->resourceName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProjectResource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['resource_name'])) {
            $model->resourceName = $map['resource_name'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }

        return $model;
    }
}
