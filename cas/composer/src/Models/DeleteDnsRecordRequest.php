<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteDnsRecordRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // dns_recordset_id
    /**
     * @var string
     */
    public $dnsRecordsetId;

    // dns_record_ip
    /**
     * @var string
     */
    public $dnsRecordIp;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'authToken'      => 'auth_token',
        'dnsRecordsetId' => 'dns_recordset_id',
        'dnsRecordIp'    => 'dns_record_ip',
        'workspaceId'    => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('dnsRecordsetId', $this->dnsRecordsetId, true);
        Model::validateRequired('dnsRecordIp', $this->dnsRecordIp, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->dnsRecordsetId) {
            $res['dns_recordset_id'] = $this->dnsRecordsetId;
        }
        if (null !== $this->dnsRecordIp) {
            $res['dns_record_ip'] = $this->dnsRecordIp;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteDnsRecordRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['dns_recordset_id'])) {
            $model->dnsRecordsetId = $map['dns_recordset_id'];
        }
        if (isset($map['dns_record_ip'])) {
            $model->dnsRecordIp = $map['dns_record_ip'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
