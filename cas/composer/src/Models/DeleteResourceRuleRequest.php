<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteResourceRuleRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 传输层协议。参数值大小写敏感。取值范围：
    //
    // icmp
    // gre
    // tcp
    // udp
    // all：支持所有协议
    /**
     * @var string
     */
    public $ipProtocol;

    // 目的端安全组开放的传输层协议相关的端口范围。取值范围：
    //
    // TCP/UDP协议：取值范围为1~65535。使用斜线（/）隔开起始端口和终止端口。例如：1/200
    // ICMP协议：-1/-1
    // GRE协议：-1/-1
    // all：-1/-1
    /**
     * @var string
     */
    public $portRange;

    // CN-HANGZHOU_FINANCE
    /**
     * @var string
     */
    public $region;

    // 枚举值：
    // ingress：入口规则
    // egress：出口规则
    /**
     * @var string
     */
    public $ruleType;

    // 目的端安全组ID。
    /**
     * @var string
     */
    public $securityGroupId;

    // 源端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。默认值：0.0.0.0/0
    /**
     * @var string
     */
    public $sourceCidrIp;

    // 目的端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。默认值：0.0.0.0/0
    /**
     * @var string
     */
    public $destCidrIp;
    protected $_name = [
        'authToken'       => 'auth_token',
        'ipProtocol'      => 'ip_protocol',
        'portRange'       => 'port_range',
        'region'          => 'region',
        'ruleType'        => 'rule_type',
        'securityGroupId' => 'security_group_id',
        'sourceCidrIp'    => 'source_cidr_ip',
        'destCidrIp'      => 'dest_cidr_ip',
    ];

    public function validate()
    {
        Model::validateRequired('ipProtocol', $this->ipProtocol, true);
        Model::validateRequired('portRange', $this->portRange, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('ruleType', $this->ruleType, true);
        Model::validateRequired('securityGroupId', $this->securityGroupId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->ipProtocol) {
            $res['ip_protocol'] = $this->ipProtocol;
        }
        if (null !== $this->portRange) {
            $res['port_range'] = $this->portRange;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->securityGroupId) {
            $res['security_group_id'] = $this->securityGroupId;
        }
        if (null !== $this->sourceCidrIp) {
            $res['source_cidr_ip'] = $this->sourceCidrIp;
        }
        if (null !== $this->destCidrIp) {
            $res['dest_cidr_ip'] = $this->destCidrIp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteResourceRuleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['ip_protocol'])) {
            $model->ipProtocol = $map['ip_protocol'];
        }
        if (isset($map['port_range'])) {
            $model->portRange = $map['port_range'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }
        if (isset($map['security_group_id'])) {
            $model->securityGroupId = $map['security_group_id'];
        }
        if (isset($map['source_cidr_ip'])) {
            $model->sourceCidrIp = $map['source_cidr_ip'];
        }
        if (isset($map['dest_cidr_ip'])) {
            $model->destCidrIp = $map['dest_cidr_ip'];
        }

        return $model;
    }
}
