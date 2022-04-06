<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDnsRecordsetRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // resource_type
    /**
     * @var string
     */
    public $resourceType;

    // ip
    //
    /**
     * @var string
     */
    public $ip;

    // dns_recordset_name
    /**
     * @var string
     */
    public $dnsRecordsetName;

    // resource_name
    /**
     * @var string
     */
    public $resourceName;

    // resource_iaas_ids
    /**
     * @var string[]
     */
    public $resourceIaasIds;

    // dns_recordset_ids
    /**
     * @var string[]
     */
    public $dnsRecordsetIds;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // current_page
    /**
     * @var int
     */
    public $currentPage;
    protected $_name = [
        'authToken'        => 'auth_token',
        'workspaceId'      => 'workspace_id',
        'resourceType'     => 'resource_type',
        'ip'               => 'ip',
        'dnsRecordsetName' => 'dns_recordset_name',
        'resourceName'     => 'resource_name',
        'resourceIaasIds'  => 'resource_iaas_ids',
        'dnsRecordsetIds'  => 'dns_recordset_ids',
        'pageSize'         => 'page_size',
        'currentPage'      => 'current_page',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->dnsRecordsetName) {
            $res['dns_recordset_name'] = $this->dnsRecordsetName;
        }
        if (null !== $this->resourceName) {
            $res['resource_name'] = $this->resourceName;
        }
        if (null !== $this->resourceIaasIds) {
            $res['resource_iaas_ids'] = $this->resourceIaasIds;
        }
        if (null !== $this->dnsRecordsetIds) {
            $res['dns_recordset_ids'] = $this->dnsRecordsetIds;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDnsRecordsetRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['dns_recordset_name'])) {
            $model->dnsRecordsetName = $map['dns_recordset_name'];
        }
        if (isset($map['resource_name'])) {
            $model->resourceName = $map['resource_name'];
        }
        if (isset($map['resource_iaas_ids'])) {
            if (!empty($map['resource_iaas_ids'])) {
                $model->resourceIaasIds = $map['resource_iaas_ids'];
            }
        }
        if (isset($map['dns_recordset_ids'])) {
            if (!empty($map['dns_recordset_ids'])) {
                $model->dnsRecordsetIds = $map['dns_recordset_ids'];
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }

        return $model;
    }
}
