<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SecurityGroupRule extends Model
{
    // 规则描述信息
    /**
     * @example 规则描述信息
     *
     * @var string
     */
    public $description;

    // 目的端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。
    /**
     * @example 10.0.0.0/8
     *
     * @var string
     */
    public $destCidrIp;

    // 传输层协议。不区分大小写。取值范围：
    //
    // icmp
    // gre
    // tcp
    // udp
    // all：支持所有协议
    /**
     * @example all
     *
     * @var string
     */
    public $ipProtocol;

    // 经典网络类型安全组规则的网卡类型。取值范围：
    //
    // internet：公网。
    // intranet：内网。
    // 默认值：internet。
    //
    // 在以下情况中，参数NicType取值只能为intranet：
    //
    // 安全组规则的网络类型为专有网络VPC时，您无需设置NicType参数，默认并且只能为intranet。
    // 当设置安全组之间互相访问时，即指定了DestGroupId且没有指定DestCidrIp时。
    /**
     * @example intranet
     *
     * @var string
     */
    public $nicType;

    // 访问权限。取值范围：
    //
    // accept：接受访问。
    // drop：拒绝访问，不返回拒绝信息。
    // 默认值：accept。
    /**
     * @example accept
     *
     * @var string
     */
    public $policy;

    // 目的端安全组开放的传输层协议相关的端口范围。取值范围：
    //
    // TCP/UDP协议：取值范围为1~65535。使用斜线（/）隔开起始端口和终止端口。正确示范：1/200；错误示范：200/1。
    // ICMP协议：-1/-1。
    // GRE协议：-1/-1。
    // all：-1/-1。
    /**
     * @example  80/80
     *
     * @var string
     */
    public $portRange;

    // 安全组规则优先级。取值范围：1~100
    //
    // 默认值：1。
    /**
     * @example 1
     *
     * @var string
     */
    public $priority;

    // 源端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。
    //
    // 默认值：0.0.0.0/0。
    /**
     * @example 10.0.0.0/8
     *
     * @var string
     */
    public $sourceCidrIp;
    protected $_name = [
        'description'  => 'description',
        'destCidrIp'   => 'dest_cidr_ip',
        'ipProtocol'   => 'ip_protocol',
        'nicType'      => 'nic_type',
        'policy'       => 'policy',
        'portRange'    => 'port_range',
        'priority'     => 'priority',
        'sourceCidrIp' => 'source_cidr_ip',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->destCidrIp) {
            $res['dest_cidr_ip'] = $this->destCidrIp;
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
        if (null !== $this->portRange) {
            $res['port_range'] = $this->portRange;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->sourceCidrIp) {
            $res['source_cidr_ip'] = $this->sourceCidrIp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityGroupRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['dest_cidr_ip'])) {
            $model->destCidrIp = $map['dest_cidr_ip'];
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
        if (isset($map['port_range'])) {
            $model->portRange = $map['port_range'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['source_cidr_ip'])) {
            $model->sourceCidrIp = $map['source_cidr_ip'];
        }

        return $model;
    }
}
