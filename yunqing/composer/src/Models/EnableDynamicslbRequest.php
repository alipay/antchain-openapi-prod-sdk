<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class EnableDynamicslbRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // envid
    /**
     * @var string
     */
    public $envid;

    // 部署单元id
    /**
     * @var string
     */
    public $unitinstanceid;

    // prodCode
    /**
     * @var string
     */
    public $prodcode;

    // appname
    /**
     * @var string
     */
    public $appname;

    // protocol
    /**
     * @var string
     */
    public $protocol;

    // 端口号
    /**
     * @var int
     */
    public $port;

    // 目标端口号
    /**
     * @var int
     */
    public $targetport;

    // 区间[-1 , 5120]
    /**
     * @var int
     */
    public $bandwidth;

    // SLB名称
    /**
     * @var string
     */
    public $loadbalancername;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'envid'             => 'envid',
        'unitinstanceid'    => 'unitinstanceid',
        'prodcode'          => 'prodcode',
        'appname'           => 'appname',
        'protocol'          => 'protocol',
        'port'              => 'port',
        'targetport'        => 'targetport',
        'bandwidth'         => 'bandwidth',
        'loadbalancername'  => 'loadbalancername',
    ];

    public function validate()
    {
        Model::validateRequired('envid', $this->envid, true);
        Model::validateRequired('unitinstanceid', $this->unitinstanceid, true);
        Model::validateRequired('prodcode', $this->prodcode, true);
        Model::validateRequired('appname', $this->appname, true);
        Model::validateRequired('protocol', $this->protocol, true);
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('targetport', $this->targetport, true);
        Model::validateRequired('bandwidth', $this->bandwidth, true);
        Model::validateRequired('loadbalancername', $this->loadbalancername, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->envid) {
            $res['envid'] = $this->envid;
        }
        if (null !== $this->unitinstanceid) {
            $res['unitinstanceid'] = $this->unitinstanceid;
        }
        if (null !== $this->prodcode) {
            $res['prodcode'] = $this->prodcode;
        }
        if (null !== $this->appname) {
            $res['appname'] = $this->appname;
        }
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->targetport) {
            $res['targetport'] = $this->targetport;
        }
        if (null !== $this->bandwidth) {
            $res['bandwidth'] = $this->bandwidth;
        }
        if (null !== $this->loadbalancername) {
            $res['loadbalancername'] = $this->loadbalancername;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnableDynamicslbRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['envid'])) {
            $model->envid = $map['envid'];
        }
        if (isset($map['unitinstanceid'])) {
            $model->unitinstanceid = $map['unitinstanceid'];
        }
        if (isset($map['prodcode'])) {
            $model->prodcode = $map['prodcode'];
        }
        if (isset($map['appname'])) {
            $model->appname = $map['appname'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['targetport'])) {
            $model->targetport = $map['targetport'];
        }
        if (isset($map['bandwidth'])) {
            $model->bandwidth = $map['bandwidth'];
        }
        if (isset($map['loadbalancername'])) {
            $model->loadbalancername = $map['loadbalancername'];
        }

        return $model;
    }
}
