<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryResourceComputerRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // iaas id
    /**
     * @var string
     */
    public $iaasId;

    // 逗号分隔的实例ID，最多支持100个
    /**
     * @var string[]
     */
    public $instanceIds;

    // 实例名称，支持使用通配符*进行模糊搜索。
    /**
     * @var string
     */
    public $instanceName;

    // 实例的规格
    /**
     * @var string
     */
    public $instanceType;

    // 主机的内网ip，取值可以由多个IP组成一个JSON数组，最多支持100个IP，IP之间用半角逗号（,）隔开。
    /**
     * @var string[]
     */
    public $privateIpAddresses;

    // 供应商id
    /**
     * @var string
     */
    public $providerId;

    // 实例所属的地域ID
    /**
     * @var string
     */
    public $regionId;

    // 实例所在的企业资源组ID。
    /**
     * @var string
     */
    public $resourceGroupId;

    // 实例状态。取值范围：
    //
    // Running：运行中
    // Starting：启动中
    // Stopping：停止中
    // Stopped：已停止
    /**
     * @var string
     */
    public $status;

    // 主机所在工作空间
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'          => 'auth_token',
        'iaasId'             => 'iaas_id',
        'instanceIds'        => 'instance_ids',
        'instanceName'       => 'instance_name',
        'instanceType'       => 'instance_type',
        'privateIpAddresses' => 'private_ip_addresses',
        'providerId'         => 'provider_id',
        'regionId'           => 'region_id',
        'resourceGroupId'    => 'resource_group_id',
        'status'             => 'status',
        'workspace'          => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('regionId', $this->regionId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->instanceIds) {
            $res['instance_ids'] = $this->instanceIds;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->instanceType) {
            $res['instance_type'] = $this->instanceType;
        }
        if (null !== $this->privateIpAddresses) {
            $res['private_ip_addresses'] = $this->privateIpAddresses;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->resourceGroupId) {
            $res['resource_group_id'] = $this->resourceGroupId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryResourceComputerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['instance_ids'])) {
            if (!empty($map['instance_ids'])) {
                $model->instanceIds = $map['instance_ids'];
            }
        }
        if (isset($map['instance_name'])) {
            $model->instanceName = $map['instance_name'];
        }
        if (isset($map['instance_type'])) {
            $model->instanceType = $map['instance_type'];
        }
        if (isset($map['private_ip_addresses'])) {
            if (!empty($map['private_ip_addresses'])) {
                $model->privateIpAddresses = $map['private_ip_addresses'];
            }
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['resource_group_id'])) {
            $model->resourceGroupId = $map['resource_group_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
