<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VPC extends Model
{
    // VPC的IPv4网段
    /**
     * @example 10.0.0.0/24
     *
     * @var string
     */
    public $cidrBlock;

    // VPC的创建时间
    /**
     * @example 2018-04-18T15:02:37Z
     *
     * @var string
     */
    public $creationTime;

    // VPC的描述信息
    /**
     * @example This is my VPC
     *
     * @var string
     */
    public $description;

    // VPC所在的地域
    /**
     * @example cn-hangzhou
     *
     * @var string
     */
    public $regionId;

    // 路由表ID
    /**
     * @example [vtb-bp1krxxzp0c29fmon****]
     *
     * @var string[]
     */
    public $routerTableIds;

    // VPC的状态，取值：
    //
    // Pending：配置中。
    // Available：可用。
    /**
     * @example Available
     *
     * @var string
     */
    public $status;

    // 用户侧网段的列表
    /**
     * @example 10.0.0.0/8
     *
     * @var string
     */
    public $userCidrs;

    // VPC的id
    /**
     * @example vpc-bp1qpo0kug3a20qqe****
     *
     * @var string
     */
    public $vpcId;

    // VPC的名称
    /**
     * @example vpc1
     *
     * @var string
     */
    public $vpcName;

    // VPC路由器的ID
    /**
     * @example vrt-bp1jcg5cmxjbl9xgc****
     *
     * @var string
     */
    public $vRouterId;

    // 关联的workspace id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $workspaceId;

    // vpc是否已导入workspace
    /**
     * @example
     *
     * @var ImportInfo
     */
    public $importInfo;

    // vpc在CAFE测的唯一ID
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $vpcPaasId;
    protected $_name = [
        'cidrBlock'      => 'cidr_block',
        'creationTime'   => 'creation_time',
        'description'    => 'description',
        'regionId'       => 'region_id',
        'routerTableIds' => 'router_table_ids',
        'status'         => 'status',
        'userCidrs'      => 'user_cidrs',
        'vpcId'          => 'vpc_id',
        'vpcName'        => 'vpc_name',
        'vRouterId'      => 'v_router_id',
        'workspaceId'    => 'workspace_id',
        'importInfo'     => 'import_info',
        'vpcPaasId'      => 'vpc_paas_id',
    ];

    public function validate()
    {
        Model::validateRequired('cidrBlock', $this->cidrBlock, true);
        Model::validateRequired('creationTime', $this->creationTime, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('routerTableIds', $this->routerTableIds, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('vpcId', $this->vpcId, true);
        Model::validateRequired('vpcName', $this->vpcName, true);
        Model::validateRequired('vRouterId', $this->vRouterId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cidrBlock) {
            $res['cidr_block'] = $this->cidrBlock;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->routerTableIds) {
            $res['router_table_ids'] = $this->routerTableIds;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->userCidrs) {
            $res['user_cidrs'] = $this->userCidrs;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->vpcName) {
            $res['vpc_name'] = $this->vpcName;
        }
        if (null !== $this->vRouterId) {
            $res['v_router_id'] = $this->vRouterId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->importInfo) {
            $res['import_info'] = null !== $this->importInfo ? $this->importInfo->toMap() : null;
        }
        if (null !== $this->vpcPaasId) {
            $res['vpc_paas_id'] = $this->vpcPaasId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VPC
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cidr_block'])) {
            $model->cidrBlock = $map['cidr_block'];
        }
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['router_table_ids'])) {
            if (!empty($map['router_table_ids'])) {
                $model->routerTableIds = $map['router_table_ids'];
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['user_cidrs'])) {
            $model->userCidrs = $map['user_cidrs'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['vpc_name'])) {
            $model->vpcName = $map['vpc_name'];
        }
        if (isset($map['v_router_id'])) {
            $model->vRouterId = $map['v_router_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['import_info'])) {
            $model->importInfo = ImportInfo::fromMap($map['import_info']);
        }
        if (isset($map['vpc_paas_id'])) {
            $model->vpcPaasId = $map['vpc_paas_id'];
        }

        return $model;
    }
}
