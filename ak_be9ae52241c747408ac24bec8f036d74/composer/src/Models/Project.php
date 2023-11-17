<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class Project extends Model
{
    // 项目ID
    /**
     * @example "PROJ_test001"
     *
     * @var string
     */
    public $projectId;

    // 创建者ID
    /**
     * @example "testTenantId"
     *
     * @var string
     */
    public $tenantId;

    // 项目名称
    /**
     * @example "测试项目"
     *
     * @var string
     */
    public $name;

    // 项目状态:CREATING为创建中，FAILED为创建失败，FINISHED为创建完成。仅状态为FINISHED的项目才允许创建任务
    /**
     * @example "CREATING"
     *
     * @var string
     */
    public $status;

    // 创建时间（毫秒）
    /**
     * @example 1698047214000
     *
     * @var int
     */
    public $gmtCreate;

    // 更新时间（毫秒）
    /**
     * @example 1698047214000
     *
     * @var int
     */
    public $gmtModified;

    // 参与方列表
    /**
     * @example
     *
     * @var Party[]
     */
    public $partyList;
    protected $_name = [
        'projectId'   => 'project_id',
        'tenantId'    => 'tenant_id',
        'name'        => 'name',
        'status'      => 'status',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'partyList'   => 'party_list',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('partyList', $this->partyList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->partyList) {
            $res['party_list'] = [];
            if (null !== $this->partyList && \is_array($this->partyList)) {
                $n = 0;
                foreach ($this->partyList as $item) {
                    $res['party_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Project
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['party_list'])) {
            if (!empty($map['party_list'])) {
                $model->partyList = [];
                $n                = 0;
                foreach ($map['party_list'] as $item) {
                    $model->partyList[$n++] = null !== $item ? Party::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
