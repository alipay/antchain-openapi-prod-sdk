<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class PermissionVO extends Model
{
    // authorizedCidrIp
    /**
     * @example 0.0.0.0
     *
     * @var string
     */
    public $authorizedCidrIp;

    // authorize_type
    /**
     * @example CIDR_IP
     *
     * @var string
     */
    public $authorizeType;

    // direction
    /**
     * @example in
     *
     * @var string
     */
    public $direction;

    // endPort
    /**
     * @example -1
     *
     * @var int
     */
    public $endPort;

    // ipProtocol
    /**
     * @example ALL
     *
     * @var string
     */
    public $ipProtocol;

    // nicType
    /**
     * @example INTRANET
     *
     * @var string
     */
    public $nicType;

    // policy
    /**
     * @example ACCEPT
     *
     * @var string
     */
    public $policy;

    // priority
    /**
     * @example
     *
     * @var int
     */
    public $priority;

    // securityGroupId
    /**
     * @example 0304856523
     *
     * @var string
     */
    public $securityGroupId;

    // startPort
    /**
     * @example -1
     *
     * @var int
     */
    public $startPort;

    // id
    /**
     * @example asfd8suf998sdf8sf9sd8
     *
     * @var string
     */
    public $id;
    protected $_name = [
        'authorizedCidrIp' => 'authorized_cidr_ip',
        'authorizeType'    => 'authorize_type',
        'direction'        => 'direction',
        'endPort'          => 'end_port',
        'ipProtocol'       => 'ip_protocol',
        'nicType'          => 'nic_type',
        'policy'           => 'policy',
        'priority'         => 'priority',
        'securityGroupId'  => 'security_group_id',
        'startPort'        => 'start_port',
        'id'               => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authorizedCidrIp) {
            $res['authorized_cidr_ip'] = $this->authorizedCidrIp;
        }
        if (null !== $this->authorizeType) {
            $res['authorize_type'] = $this->authorizeType;
        }
        if (null !== $this->direction) {
            $res['direction'] = $this->direction;
        }
        if (null !== $this->endPort) {
            $res['end_port'] = $this->endPort;
        }
        if (null !== $this->ipProtocol) {
            $res['ip_protocol'] = $this->ipProtocol;
        }
        if (null !== $this->nicType) {
            $res['nic_type'] = $this->nicType;
        }
        if (null !== $this->policy) {
            $res['policy'] = $this->policy;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->securityGroupId) {
            $res['security_group_id'] = $this->securityGroupId;
        }
        if (null !== $this->startPort) {
            $res['start_port'] = $this->startPort;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PermissionVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['authorized_cidr_ip'])) {
            $model->authorizedCidrIp = $map['authorized_cidr_ip'];
        }
        if (isset($map['authorize_type'])) {
            $model->authorizeType = $map['authorize_type'];
        }
        if (isset($map['direction'])) {
            $model->direction = $map['direction'];
        }
        if (isset($map['end_port'])) {
            $model->endPort = $map['end_port'];
        }
        if (isset($map['ip_protocol'])) {
            $model->ipProtocol = $map['ip_protocol'];
        }
        if (isset($map['nic_type'])) {
            $model->nicType = $map['nic_type'];
        }
        if (isset($map['policy'])) {
            $model->policy = $map['policy'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['security_group_id'])) {
            $model->securityGroupId = $map['security_group_id'];
        }
        if (isset($map['start_port'])) {
            $model->startPort = $map['start_port'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
