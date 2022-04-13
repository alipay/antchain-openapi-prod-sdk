<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateFlowSiteRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 推送接口类型，可选值（RPC，REST）
    /**
     * @var string
     */
    public $interfaceType;

    // 推送接口 url
    /**
     * @var string[]
     */
    public $interfaceUrls;

    // 站点名
    /**
     * @var string
     */
    public $name;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 站点类型，可选值 MAIN（主站点）， ISOMERISM（异构机房）
    /**
     * @var string
     */
    public $siteType;

    // opssla uniqueId
    /**
     * @var string
     */
    public $uniqueId;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'      => 'auth_token',
        'description'    => 'description',
        'interfaceType'  => 'interface_type',
        'interfaceUrls'  => 'interface_urls',
        'name'           => 'name',
        'operator'       => 'operator',
        'siteType'       => 'site_type',
        'uniqueId'       => 'unique_id',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('interfaceType', $this->interfaceType, true);
        Model::validateRequired('interfaceUrls', $this->interfaceUrls, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('siteType', $this->siteType, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->interfaceType) {
            $res['interface_type'] = $this->interfaceType;
        }
        if (null !== $this->interfaceUrls) {
            $res['interface_urls'] = $this->interfaceUrls;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->siteType) {
            $res['site_type'] = $this->siteType;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFlowSiteRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['interface_type'])) {
            $model->interfaceType = $map['interface_type'];
        }
        if (isset($map['interface_urls'])) {
            if (!empty($map['interface_urls'])) {
                $model->interfaceUrls = $map['interface_urls'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['site_type'])) {
            $model->siteType = $map['site_type'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
