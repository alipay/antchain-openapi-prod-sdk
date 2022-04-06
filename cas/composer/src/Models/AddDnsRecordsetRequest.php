<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AddDnsRecordsetRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // name
    /**
     * @var string
     */
    public $name;

    // description
    /**
     * @var string
     */
    public $description;

    // type: 记录类型，默认为A, 仅支持 A, CName, 见DnsRecordSetType
    /**
     * @var string
     */
    public $type;

    // type: 类型, PUBLIC(外部域名) 或者 PRIVATE (域名) 见DnsNetworkType
    /**
     * @var string
     */
    public $dnsNetworkType;

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;

    // dns_records
    /**
     * @var DnsRecordParam[]
     */
    public $dnsRecords;
    protected $_name = [
        'authToken'      => 'auth_token',
        'name'           => 'name',
        'description'    => 'description',
        'type'           => 'type',
        'dnsNetworkType' => 'dns_network_type',
        'tenantId'       => 'tenant_id',
        'dnsRecords'     => 'dns_records',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('dnsRecords', $this->dnsRecords, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->dnsNetworkType) {
            $res['dns_network_type'] = $this->dnsNetworkType;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->dnsRecords) {
            $res['dns_records'] = [];
            if (null !== $this->dnsRecords && \is_array($this->dnsRecords)) {
                $n = 0;
                foreach ($this->dnsRecords as $item) {
                    $res['dns_records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddDnsRecordsetRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['dns_network_type'])) {
            $model->dnsNetworkType = $map['dns_network_type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['dns_records'])) {
            if (!empty($map['dns_records'])) {
                $model->dnsRecords = [];
                $n                 = 0;
                foreach ($map['dns_records'] as $item) {
                    $model->dnsRecords[$n++] = null !== $item ? DnsRecordParam::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
