<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class NativeServiceView extends Model
{
    // 服务名称。
    /**
     * @example test-svc
     *
     * @var string
     */
    public $name;

    // 服务类型。
    /**
     * @example ClusterIP
     *
     * @var string
     */
    public $type;

    // 负载均衡实例id。
    /**
     * @example lb-12345678
     *
     * @var string
     */
    public $loadBalancerId;

    // VIP地址信息。
    /**
     * @example [""]
     *
     * @var string[]
     */
    public $vipAddresses;

    // VIP地址信息类型。
    /**
     * @example INTERNET
     *
     * @var string
     */
    public $vipAddressType;

    // ClusterIP信息。
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $clusterIp;

    // 创建时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTimestamp;

    // 修改时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTimestamp;
    protected $_name = [
        'name'              => 'name',
        'type'              => 'type',
        'loadBalancerId'    => 'load_balancer_id',
        'vipAddresses'      => 'vip_addresses',
        'vipAddressType'    => 'vip_address_type',
        'clusterIp'         => 'cluster_ip',
        'createdTimestamp'  => 'created_timestamp',
        'modifiedTimestamp' => 'modified_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('createdTimestamp', $this->createdTimestamp, true);
        Model::validateRequired('modifiedTimestamp', $this->modifiedTimestamp, true);
        Model::validatePattern('createdTimestamp', $this->createdTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifiedTimestamp', $this->modifiedTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->loadBalancerId) {
            $res['load_balancer_id'] = $this->loadBalancerId;
        }
        if (null !== $this->vipAddresses) {
            $res['vip_addresses'] = $this->vipAddresses;
        }
        if (null !== $this->vipAddressType) {
            $res['vip_address_type'] = $this->vipAddressType;
        }
        if (null !== $this->clusterIp) {
            $res['cluster_ip'] = $this->clusterIp;
        }
        if (null !== $this->createdTimestamp) {
            $res['created_timestamp'] = $this->createdTimestamp;
        }
        if (null !== $this->modifiedTimestamp) {
            $res['modified_timestamp'] = $this->modifiedTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NativeServiceView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['load_balancer_id'])) {
            $model->loadBalancerId = $map['load_balancer_id'];
        }
        if (isset($map['vip_addresses'])) {
            if (!empty($map['vip_addresses'])) {
                $model->vipAddresses = $map['vip_addresses'];
            }
        }
        if (isset($map['vip_address_type'])) {
            $model->vipAddressType = $map['vip_address_type'];
        }
        if (isset($map['cluster_ip'])) {
            $model->clusterIp = $map['cluster_ip'];
        }
        if (isset($map['created_timestamp'])) {
            $model->createdTimestamp = $map['created_timestamp'];
        }
        if (isset($map['modified_timestamp'])) {
            $model->modifiedTimestamp = $map['modified_timestamp'];
        }

        return $model;
    }
}
