<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SecurityGroup extends Model
{
    // 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为：yyyy-MM-ddThh:mmZ。
    /**
     * @example 2017-12-05T22:40:00Z
     *
     * @var string
     */
    public $creationTime;

    // 安全组的描述信息。
    /**
     * @example 描述信息
     *
     * @var string
     */
    public $description;

    // region_id
    /**
     * @example region_id
     *
     * @var string
     */
    public $regionId;

    // 安全组ID。
    /**
     * @example sg-bp67acfmxazb4ph***
     *
     * @var string
     */
    public $securityGroupId;

    // 安全组名称。
    /**
     * @example sgName
     *
     * @var string
     */
    public $securityGroupName;

    // 安全组所属的专有网络。
    /**
     * @example vpc-bp67acfmxazb4ph***
     *
     * @var string
     */
    public $vpcId;

    // 安全组入方向规则
    /**
     * @example
     *
     * @var SecurityGroupRule[]
     */
    public $ingressRules;

    // 安全组出方向规则
    /**
     * @example
     *
     * @var SecurityGroupRule[]
     */
    public $egressRules;
    protected $_name = [
        'creationTime'      => 'creation_time',
        'description'       => 'description',
        'regionId'          => 'region_id',
        'securityGroupId'   => 'security_group_id',
        'securityGroupName' => 'security_group_name',
        'vpcId'             => 'vpc_id',
        'ingressRules'      => 'ingress_rules',
        'egressRules'       => 'egress_rules',
    ];

    public function validate()
    {
        Model::validateRequired('creationTime', $this->creationTime, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('securityGroupId', $this->securityGroupId, true);
        Model::validateRequired('securityGroupName', $this->securityGroupName, true);
        Model::validateRequired('vpcId', $this->vpcId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->securityGroupId) {
            $res['security_group_id'] = $this->securityGroupId;
        }
        if (null !== $this->securityGroupName) {
            $res['security_group_name'] = $this->securityGroupName;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->ingressRules) {
            $res['ingress_rules'] = [];
            if (null !== $this->ingressRules && \is_array($this->ingressRules)) {
                $n = 0;
                foreach ($this->ingressRules as $item) {
                    $res['ingress_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->egressRules) {
            $res['egress_rules'] = [];
            if (null !== $this->egressRules && \is_array($this->egressRules)) {
                $n = 0;
                foreach ($this->egressRules as $item) {
                    $res['egress_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['security_group_id'])) {
            $model->securityGroupId = $map['security_group_id'];
        }
        if (isset($map['security_group_name'])) {
            $model->securityGroupName = $map['security_group_name'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['ingress_rules'])) {
            if (!empty($map['ingress_rules'])) {
                $model->ingressRules = [];
                $n                   = 0;
                foreach ($map['ingress_rules'] as $item) {
                    $model->ingressRules[$n++] = null !== $item ? SecurityGroupRule::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['egress_rules'])) {
            if (!empty($map['egress_rules'])) {
                $model->egressRules = [];
                $n                  = 0;
                foreach ($map['egress_rules'] as $item) {
                    $model->egressRules[$n++] = null !== $item ? SecurityGroupRule::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
