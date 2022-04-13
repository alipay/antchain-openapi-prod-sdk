<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateFlowSiteRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 站点 ID
    /**
     * @var int
     */
    public $id;

    // 站点名
    /**
     * @var string
     */
    public $name;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 站点类型，可选值（MAIN， ISOMERISM）
    /**
     * @var string
     */
    public $siteType;

    // 接口类型（RPC，REST）
    /**
     * @var string
     */
    public $interfaceType;

    // 推送接口url
    /**
     * @var string[]
     */
    public $interfaceUrls;

    // opssla uniqueId
    /**
     * @var string
     */
    public $uniqueId;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceGroup' => 'workspace_group',
        'operator'       => 'operator',
        'id'             => 'id',
        'name'           => 'name',
        'description'    => 'description',
        'siteType'       => 'site_type',
        'interfaceType'  => 'interface_type',
        'interfaceUrls'  => 'interface_urls',
        'uniqueId'       => 'unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('siteType', $this->siteType, true);
        Model::validateRequired('interfaceType', $this->interfaceType, true);
        Model::validateRequired('interfaceUrls', $this->interfaceUrls, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->siteType) {
            $res['site_type'] = $this->siteType;
        }
        if (null !== $this->interfaceType) {
            $res['interface_type'] = $this->interfaceType;
        }
        if (null !== $this->interfaceUrls) {
            $res['interface_urls'] = $this->interfaceUrls;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFlowSiteRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['site_type'])) {
            $model->siteType = $map['site_type'];
        }
        if (isset($map['interface_type'])) {
            $model->interfaceType = $map['interface_type'];
        }
        if (isset($map['interface_urls'])) {
            if (!empty($map['interface_urls'])) {
                $model->interfaceUrls = $map['interface_urls'];
            }
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }

        return $model;
    }
}
