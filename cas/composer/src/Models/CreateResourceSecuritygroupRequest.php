<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateResourceSecuritygroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 安全组描述信息。长度为2~256个英文或中文字符，不能以http://和https://开头。
    //
    // 默认值：空。
    /**
     * @var string
     */
    public $description;

    // 安全组入方向规则
    /**
     * @var SecurityGroupRule[]
     */
    public $ingressRules;

    // 安全组出方向规则
    /**
     * @var SecurityGroupRule[]
     */
    public $egressRules;

    // 安全组名称。长度为2~128个英文或中文字符。必须以大小字母或中文开头，不能以 http://和https://开头。可以包含数字、半角冒号（:）、下划线（_）或者连字符（-）。默认值：空。
    /**
     * @var string
     */
    public $name;

    // 安全组所属地域identity
    /**
     * @var string
     */
    public $region;

    // 安全组所属VPC ID。
    /**
     * @var string
     */
    public $vpcId;

    // workspace name
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'    => 'auth_token',
        'description'  => 'description',
        'ingressRules' => 'ingress_rules',
        'egressRules'  => 'egress_rules',
        'name'         => 'name',
        'region'       => 'region',
        'vpcId'        => 'vpc_id',
        'workspace'    => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('vpcId', $this->vpcId, true);
        Model::validateRequired('workspace', $this->workspace, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateResourceSecuritygroupRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
